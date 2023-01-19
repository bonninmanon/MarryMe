import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Traiteur } from '../model';
import { TraiteurHttpService } from './traiteur-http.service';

declare function greet():void;
@Component({
  selector: 'app-traiteur',
  templateUrl: './traiteur.component.html',
  styleUrls: ['./traiteur.component.scss']
})
export class TraiteurComponent {


  myimages: string = "assets/images"


  formTraiteur: Traiteur = new Traiteur;
  myScriptElement: HTMLScriptElement;

  connecte: Traiteur= new Traiteur();
  idMariage: number;
  prix: number;
  nombreInvite:string;
  vinDHonneur: string;
  cuisine: string;
  cuisineLovely: string;
  cuisinejoliesnoces: string;
  cuisinechichampete: string;
  cuisinegardenparty: string;
  cuisinevinDHonneur: string;
  cuisineinspiration: string;
  cuisinedecontract: string;
  design: string;
  isShowInfo: boolean;
  isShowInfo110: boolean;
  isShowInfo111: boolean;
  isShowInfo112: boolean;
  isShowInfo113: boolean;
  isShowInfo114: boolean;
  isShowInfo115: boolean;
 

  isSizeError110: boolean;
  isSizeError111: boolean;
  isSizeError112: boolean;
  isSizeError113: boolean;
  isSizeError114: boolean;
  isSizeError115: boolean;


  constructor(private tS: TraiteurHttpService, private router: Router, private route: ActivatedRoute){
    this.route.params.subscribe(params => { 
        console.log(params);
        this.idMariage = params['id'];
        console.log(this.idMariage);
        this.tS.setMariageId(this.idMariage);
    });
  }

  //reservertraiteur()
 // {
    //console.log(this.nombreInvite);
  //  if(this.nombreInvite=="10-30"){this.prix = 2500}
   // else if (this.nombreInvite=="31-60"){this.prix = 3200}
   //* else if (this.nombreInvite=="61-100"){this.prix = 5000}
    //else if (this.nombreInvite==" >100 "){this.prix = 7500}
   // //this.prix = (this.nombreInvite=="petit")? 250 : 400;
 
    
  // console.log("prix:" +this.prix  + " vinDHonneur:" + this.vinDHonneur+ " nombreInvite:" + " design:" +this.cuisine + this.nombreInvite  )
  
  //  this.tS.create(this.prix, (this.vinDHonneur == "oui" ? true : false), this.cuisine,this.nombreInvite).subscribe(resp => {this.connecte = resp;})
 // }
 
 // choixTraiteur(designImgClic : string) {
 //   this.design=designImgClic;
//}


  Lovely(){
    
      this.prix= 2000 ;
      this.vinDHonneur="vinDHonneur";
      this.cuisine = this.cuisineLovely;

      if (!this.cuisine) {
        this.isSizeError110 = true;
        return;
      }

      console.log("prix:" +this.prix  + " vinDHonneur:" + this.vinDHonneur+ " nombreInvite:" +  this.nombreInvite  + "cuisine:"   +this.cuisine )
      this.isShowInfo110 = true;
      this.tS.create(this.prix, (this.vinDHonneur == "oui" ? true : false), this.cuisine,this.nombreInvite).subscribe(resp => {this.connecte = resp;})

  }

  joliesnoces(){
      this.prix= 3500 ;
      this.vinDHonneur="vinDHonneur";
      this.cuisine = this.cuisinejoliesnoces;

      if (!this.cuisine) {
        this.isSizeError111 = true;
        return;
      }
    
      console.log("prix:" +this.prix  + " vinDHonneur:" + this.vinDHonneur+ " nombreInvite:" +  this.nombreInvite  + "cuisine:"   +this.cuisine )
      this.isShowInfo111 = true;
      this.tS.create(this.prix, (this.vinDHonneur == "oui" ? true : false), this.cuisine,this.nombreInvite).subscribe(resp => {this.connecte = resp;})
  }

  inspiration(){
      this.prix= 5500 ;
      this.vinDHonneur="vinDHonneur";
      this.cuisine = this.cuisineinspiration;
    
      if (!this.cuisine) {
        this.isSizeError112 = true;
        return;
      }

      console.log("prix:" +this.prix  + " vinDHonneur:" + this.vinDHonneur+ " nombreInvite:" + " design:" +this.cuisine + this.nombreInvite  )
      this.isShowInfo112 = true;
      this.tS.create(this.prix, (this.vinDHonneur == "oui" ? true : false), this.cuisine,this.nombreInvite).subscribe(resp => {this.connecte = resp;})
  }

  decontract(){
      this.prix= 1500 ;
      this.vinDHonneur="vinDHonneur";
      this.cuisine = this.cuisinedecontract;

      if (!this.cuisine) {
        this.isSizeError113 = true;
        return;
      }

      console.log("prix:" +this.prix  + " vinDHonneur:" + this.vinDHonneur+ " nombreInvite:" + " design:" +this.cuisine + this.nombreInvite  )
      this.isShowInfo113 = true;
      this.tS.create(this.prix, (this.vinDHonneur == "oui" ? true : false), this.cuisine,this.nombreInvite).subscribe(resp => {this.connecte = resp;})
  }

  gardenparty(){
      this.prix= 3456 ;
      this.vinDHonneur="vinDHonneur";
      this.cuisine = this.cuisinegardenparty;

      if (!this.cuisine) {
        this.isSizeError114 = true;
        return;
      }
    
      console.log("prix:" +this.prix  + " vinDHonneur:" + this.vinDHonneur+ " nombreInvite:" + " design:" +this.cuisine + this.nombreInvite  )
      this.isShowInfo114 = true;
      this.tS.create(this.prix, (this.vinDHonneur == "oui" ? true : false), this.cuisine,this.nombreInvite).subscribe(resp => {this.connecte = resp;})
  }

  chichampete(){
      this.prix= 6300 ;
      this.vinDHonneur="vinDHonneur";
      this.cuisine = this.cuisinechichampete;

      if (!this.cuisine) {
        this.isSizeError115 = true;
        return;
      }

      console.log("prix:" +this.prix  + " vinDHonneur:" + this.vinDHonneur+ " nombreInvite:" + " design:" +this.cuisine + this.nombreInvite  )
      this.isShowInfo115 = true;
      this.tS.create(this.prix, (this.vinDHonneur == "oui" ? true : false), this.cuisine,this.nombreInvite).subscribe(resp => {this.connecte = resp;})
  }
}
