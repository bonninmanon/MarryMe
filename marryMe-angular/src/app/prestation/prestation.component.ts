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
    })


    
  }


 
}

