import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Salle } from '../model';
import { HttpSalleService } from './salle-http.service';


@Component({
  selector: 'salle,[salle]',
  templateUrl: './salle.component.html',
  styleUrls: ['./salle.component.scss']
})
export class SalleComponent {
  [x: string]: any;
  myimages: string = "assets/images"


  formSalle: Salle = new Salle;
  idMariage: number;
  prix: number;
  nom: string;
  capacite: number;
  CapaciteLapalmeraie: number;
  capaciteDomainedelaGrave: number;
  capaciteDomaineLeSauvage: number;
  capaciteLaCroiseedesPossibles: number;
  capaciteDomainedeVavril: number;
  capaciteLePavillondelaSoie: number;
  taille: number;

  connecte: Salle= new Salle();


  constructor(private sS: HttpSalleService, private router: Router, private route: ActivatedRoute) {
    this.route.params.subscribe(params => { 
      console.log(params);
      this.idMariage = params['idMariage'];
      console.log(this.idMariage);
  });
}

Lapalmeraie(){
  
    this.prix= 6000 ;
    this.nom="Lapalmeraie";
    this.capacite = 1200;
    console.log("prix:" +this.prix + " nom:" +this.nom + " capacite:" + this.capacite)
  
    this.sS.create(this.prix, this.nom, this.capacite).subscribe(resp => {this.connecte = resp;})

}

DomainedelaGrave (){
    this.prix= 3500 ;
    this.nom="DomainedelaGrave";
    this.capacite = 2000;
    console.log("prix:" +this.prix + " nom:" +this.nom + " capacite:" + this.capacite)
  
    this.sS.create(this.prix, this.nom, this.capacite).subscribe(resp => {this.connecte = resp;})

}

DomaineLeSauvage(){
    this.prix= 4500 ;
    this.nom="DomaineLeSauvage";
    this.capacite = 1600;
    console.log("prix:" +this.prix + " nom:" +this.nom + " capacite:" + this.capacite)
  
    this.sS.create(this.prix, this.nom, this.capacite).subscribe(resp => {this.connecte = resp;})
}

LaCroiseedesPossibles(){
    this.prix= 3000 ;
    this.nom="LaCroiseedesPossibles";
    this.capacite = 1200;
    console.log("prix:" +this.prix + " nom:" +this.nom + " capacite:" + this.capacite)
  
    this.sS.create(this.prix, this.nom, this.capacite).subscribe(resp => {this.connecte = resp;})
}

DomainedeVavril(){
    this.prix= 4000 ;
    this.nom="DomainedeVavril";
    this.capacite = 450;
    console.log("prix:" +this.prix + " nom:" +this.nom + " capacite:" + this.capacite)
  
    this.sS.create(this.prix, this.nom, this.capacite).subscribe(resp => {this.connecte = resp;})
}

LePavillondelaSoie(){
    this.prix= 5000 ;
    this.nom="LePavillondelaSoie";
    this.capacite = 690;
    console.log("prix:" +this.prix + " nom:" +this.nom + " capacite:" + this.capacite)
  
    this.sS.create(this.prix, this.nom, this.capacite).subscribe(resp => {this.connecte = resp;})
}

}







  /*list(): Array<Salle> {
    return this.salleService.findAll();
  }

  add():void {
    this.formSalle = new Salle();
  }

  edit(id: number): void {
    this.salleService.findById(id).subscribe((resp: Salle) => {
      this.formSalle= resp;
    });
  }

  save(): void {
    if(this.formSalle.id) { // UPDATE
      this.salleService.update(this.formSalle);
    } else { // CREATE
      this.salleService.create(this.formSalle);
    }

    this.cancel();
  }

  cancel(): void {
    this.formSalle = null;
  }

  remove(id: number): void {
    this.salleService.remove(id);
  }
*/
