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

  idRobe: number;  
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
  isShowInfo: boolean = false;
  isSizeError: boolean = false;
  isShowInfo2: boolean= false;
  isShowInfo3: boolean= false;
  isShowInfo4: boolean= false;
  isShowInfo5: boolean= false;
  isShowInfo6: boolean= false;
  isShowInfo7: boolean= false;
  isShowInfo8: boolean= false;
  isSizeError2: boolean = false;
  isSizeError3: boolean = false;
  isSizeError4: boolean = false;
  isSizeError5: boolean = false;
  isSizeError6: boolean = false;
  isSizeError7: boolean = false;
  isSizeError8: boolean = false;

  connecte: Robe= new Robe();
  idMariage: number;
  constructor(private rS: HttpRobeService, private router: Router, private route: ActivatedRoute){
    this.route.params.subscribe(params => { 
        console.log(params);
        this.idMariage = params['id'];
        console.log(this.idMariage);
        this.rS.setMariageId(this.idMariage);
    });
  }

  elsa(){
    
      this.prix= 2000 ;
      this.model="Elsa";
      this.taille = this.tailleElsa;

      if (!this.taille) {
        this.isSizeError = true;
        return;
      }

      console.log("prix:" +this.prix + " model:" +this.model + " taille:" + this.taille)
      
      this.isShowInfo = true;
      this.rS.create(this.prix, this.model, this.taille).subscribe(resp => {this.connecte = resp;}) 

  }

  esmeralda(){
      this.prix= 3500 ;
      this.model="Esmeralda";
      this.taille = this.tailleEsmeralda;

      if (!this.taille) {
        this.isSizeError2 = true;
        return;
      }

      console.log("prix:" +this.prix + " model:" +this.model + " taille:" + this.taille)
      this.isShowInfo2 = true;
      this.rS.create(this.prix, this.model, this.taille).subscribe(resp => {this.connecte = resp;})
  }

  beaute(){
      this.prix= 3500 ;
      this.model="Beaute";
      this.taille = this.tailleBeaute;

      if (!this.taille) {
        this.isSizeError3 = true;
        return;
      }

      console.log("prix:" +this.prix + " model:" +this.model + " taille:" + this.taille)
      this.isShowInfo3 = true;
      this.rS.create(this.prix, this.model, this.taille).subscribe(resp => {this.connecte = resp;})
  }

  dona(){
      this.prix= 1500 ;
      this.model="Dona";
      this.taille = this.tailleDona;

      if (!this.taille) {
        this.isSizeError4 = true;
        return;
      }

      console.log("prix:" +this.prix + " model:" +this.model + " taille:" + this.taille)
      this.isShowInfo4 = true;
      this.rS.create(this.prix, this.model, this.taille).subscribe(resp => {this.connecte = resp;})
  }

  deborah(){
      this.prix= 3456 ;
      this.model="Deborah";
      this.taille = this.tailleDeborah;

      if (!this.taille) {
        this.isSizeError5 = true;
        return;
      }

      console.log("prix:" +this.prix + " model:" +this.model + " taille:" + this.taille)
      this.isShowInfo5 = true;
      this.rS.create(this.prix, this.model, this.taille).subscribe(resp => {this.connecte = resp;})
  }

  delta(){
      this.prix= 1234 ;
      this.model="Delta";
      this.taille = this.tailleDelta;

      if (!this.taille) {
        this.isSizeError6 = true;
        return;
      }

      console.log("prix:" +this.prix + " model:" +this.model + " taille:" + this.taille)
      this.isShowInfo6 = true;
      this.rS.create(this.prix, this.model, this.taille).subscribe(resp => {this.connecte = resp;})
  }

  ariella(){
      this.prix= 2567 ;
      this.model="Delta";
      this.taille = this.tailleAriella;

      if (!this.taille) {
        this.isSizeError7 = true;
        return;
      }

      console.log("prix:" +this.prix + " model:" +this.model + " taille:" + this.taille)
      this.isShowInfo7 = true;
      this.rS.create(this.prix, this.model, this.taille).subscribe(resp => {this.connecte = resp;})
  }

  bijoux(){
    this.prix= 1200;
      this.model="Bijoux";
      this.taille = this.tailleBijoux;

      if (!this.taille) {
        this.isSizeError8 = true;
        return;
      }

      console.log("prix:" +this.prix + " model:" +this.model + " taille:" + this.taille)
      this.isShowInfo8 = true;
      this.rS.create(this.prix, this.model, this.taille).subscribe(resp => {this.connecte = resp;})
  }
}
