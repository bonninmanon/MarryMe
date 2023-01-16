import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Robe } from '../model';
import { HttpRobeService } from './http-robe.service';

@Component({
  selector: 'robe,[robe]',
  templateUrl: './robe.component.html',
  styleUrls: ['./robe.component.scss']
})

export class RobeComponent {
  prix: number;
  model: string;
  tailleElsa: string;
  tailleEsmeralda: string;
  tailleBeaute: string;
  tailleDona: string;
  tailleDeborah: string;
  tailleDelta: string;
  tailleAriella: string;
  tailleBijoux: string;
  taille: string;

  connecte: Robe= new Robe();
  idMariage: number;
  constructor(private rS: HttpRobeService, private router: Router, private route: ActivatedRoute){
    this.route.params.subscribe(params => { 
        console.log(params);
        this.idMariage = params['idMariage'];
        console.log(this.idMariage);
    });
  }

  elsa(){
    
      this.prix= 2000 ;
      this.model="Elsa";
      this.taille = this.tailleElsa;
      console.log("prix:" +this.prix + " model:" +this.model + " taille:" + this.taille)
    
      this.rS.create(this.prix, this.model, this.taille).subscribe(resp => {this.connecte = resp;})

  }

  esmeralda(){
      this.prix= 3500 ;
      this.model="Esmeralda";
      this.taille = this.tailleEsmeralda;
      console.log("prix:" +this.prix + " model:" +this.model + " taille:" + this.taille)
    
      this.rS.create(this.prix, this.model, this.taille).subscribe(resp => {this.connecte = resp;})
  }

  beaute(){
      this.prix= 3500 ;
      this.model="Beaute";
      this.taille = this.tailleBeaute;
      console.log("prix:" +this.prix + " model:" +this.model + " taille:" + this.taille)
    
      this.rS.create(this.prix, this.model, this.taille).subscribe(resp => {this.connecte = resp;})
  }

  dona(){
      this.prix= 1500 ;
      this.model="Dona";
      this.taille = this.tailleDona;
      console.log("prix:" +this.prix + " model:" +this.model + " taille:" + this.taille)
    
      this.rS.create(this.prix, this.model, this.taille).subscribe(resp => {this.connecte = resp;})
  }

  deborah(){
      this.prix= 3456 ;
      this.model="Deborah";
      this.taille = this.tailleDeborah;
      console.log("prix:" +this.prix + " model:" +this.model + " taille:" + this.taille)
    
      this.rS.create(this.prix, this.model, this.taille).subscribe(resp => {this.connecte = resp;})
  }

  delta(){
      this.prix= 1234 ;
      this.model="Delta";
      this.taille = this.tailleDelta;
      console.log("prix:" +this.prix + " model:" +this.model + " taille:" + this.taille)
    
      this.rS.create(this.prix, this.model, this.taille).subscribe(resp => {this.connecte = resp;})
  }

  ariella(){
      this.prix= 4567 ;
      this.model="Delta";
      this.taille = this.tailleAriella;
      console.log("prix:" +this.prix + " model:" +this.model + " taille:" + this.taille)
    
      this.rS.create(this.prix, this.model, this.taille).subscribe(resp => {this.connecte = resp;})
  }

  bijoux(){
    this.prix= 4567 ;
      this.model="Bijoux";
      this.taille = this.tailleBijoux;
      console.log("prix:" +this.prix + " model:" +this.model + " taille:" + this.taille)
    
      this.rS.create(this.prix, this.model, this.taille).subscribe(resp => {this.connecte = resp;})
  }
}
