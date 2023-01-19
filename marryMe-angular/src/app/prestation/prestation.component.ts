import { Component } from '@angular/core';

import { ActivatedRoute, Router } from '@angular/router';
import { UtilisateurService } from '../connexion/utilisateur.service';
import { Connexion, MariageDTO, Prestation, Robe } from '../model';
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
  total: number = 0;
  client:Connexion;
  nom:string;
  theme: string;

  constructor(private utilisateurservice: UtilisateurService,private pS: HttpPrestationService, private router: Router, private route: ActivatedRoute){
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
      this.total = 0;

      for (const robe of mariageDto.robes) {
        this.prestations.push(robe);
        this.total += robe.prixRobe;
      }

      for (const cake of mariageDto.cakes) {
        this.prestations.push(cake);
        this.total += cake.prixCake;
      }

      for (const salle of mariageDto.salles) {
        this.prestations.push(salle);
        this.total += salle.prixSalle;
      }

      for (const traiteur of mariageDto.traiteurs) {
        this.prestations.push(traiteur);
        this.total += traiteur.prixTraiteur;

      }

        this.client=this.utilisateurservice.getUtilisateur();
        this.nom=this.client.nom;
        this.theme=this.client.mariage.theme;
      
    })

  }

  removeRobe(robe: any) {
    let idx: number = this.mariageDto.robes.indexOf(robe);
    this.mariageDto.robes.splice(idx, 1);
    this.pS.removeRobe(robe.idRobe).subscribe();
    this.total -= robe.prixRobe;
    

    
  }
    
  removeCake(cake: any) {
    let idx: number = this.mariageDto.cakes.indexOf(cake);

    this.mariageDto.cakes.splice(idx, 1);
    this.pS.removeCake(cake.idCake).subscribe();
    this.total -= cake.prixCake;
   
    
  }

  removeSalle(salle: any) {
    let idx: number = this.mariageDto.salles.indexOf(salle);

    this.mariageDto.salles.splice(idx, 1);
    this.pS.removeSalle(salle.idSalle).subscribe();
    this.total -= salle.prixSalle;
      }
    
      removeTraiteur(traiteur: any) {
        let idx: number = this.mariageDto.traiteurs.indexOf(traiteur);
    
        this.mariageDto.traiteurs.splice(idx, 1);
        this.pS.removeTraiteur(traiteur.idTraiteur).subscribe();
        this.total -= traiteur.prixTraiteur;
          }
        
    



      
  }

 




  


