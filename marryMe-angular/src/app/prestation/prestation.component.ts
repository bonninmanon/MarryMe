import { Component } from '@angular/core';
import { NonNullableFormBuilder } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { MariageDTO, Prestation, Robe } from '../model';
import { HttpPrestationService } from './http-prestation.service';


@Component({
  selector: 'prestation,[prestation]',
  templateUrl: './prestation.component.html',
  styleUrls: ['./prestation.component.scss']
})
export class PrestationComponent {

  connecte: Prestation = new Prestation();
  idMariage: number;

  prestationService: any;
  prestations: Array<any> = new Array<any>();
  mariageDto: MariageDTO = new MariageDTO();


  constructor(private pS: HttpPrestationService, private router: Router, private route: ActivatedRoute){
    this.route.params.subscribe(params => { 
        console.log(params);
        this.idMariage = params['id'];
        console.log(this.idMariage);
        this.pS.setMariageId(this.idMariage);

        this.list();
    });
  }

  list() {
    this.pS.findDTOById(this.idMariage).subscribe(mariageDto => {
      this.prestations = new Array<any>();
      this.mariageDto = mariageDto;

      for (const robe of mariageDto.robes) {
        this.prestations.push(robe);
      }

      for (const cake of mariageDto.cakes) {
        this.prestations.push(cake);
      }

      for (const salle of mariageDto.salles) {
        this.prestations.push(salle);
      }

      for (const traiteur of mariageDto.traiteurs) {
        this.prestations.push(traiteur);
      }
    })

  }

  removeRobe(robe: any) {
    let idx: number = this.mariageDto.robes.indexOf(robe);

    this.mariageDto.robes.splice(idx, 1);
    this.pS.removeRobe(robe.idRobe).subscribe();
  }
    
  removeCake(cake: any) {
    let idx: number = this.mariageDto.cakes.indexOf(cake);

    this.mariageDto.cakes.splice(idx, 1);
    this.pS.removeCake(cake.idCake).subscribe();
  }

  removeSalle(salle: any) {
    let idx: number = this.mariageDto.salles.indexOf(salle);

    this.mariageDto.salles.splice(idx, 1);
    this.pS.removeSalle(salle.idSalle).subscribe();
  }
    
    
}

