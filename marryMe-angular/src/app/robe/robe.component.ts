import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Robe } from '../model';
import { HttpRobeService } from './http-robe.service';

@Component({
  selector: 'robe,[robe]',
  templateUrl: './robe.component.html',
  styleUrls: ['./robe.component.scss']
})

export class RobeComponent {
  prix: number;
  nom: string;
  tailleElsa: string;
  taille: string;

  connecte: Robe= new Robe();

  constructor(private rS: HttpRobeService, private router: Router){
    
  }

  elsa(){
    
      this.prix= 2000 ;
      this.nom="Elsa";
      this.taille = this.tailleElsa;
      console.log("prix:" +this.prix + " nom:" +this.nom + " taille:" + this.taille)
    
      this.rS.create(this.prix, this.nom, this.taille).subscribe(resp => {this.connecte = resp;})

  }

  esmeralda(){
    
  }
  beaute(){
    
  }
  dona(){
    
  }
  deborah(){
    
  }
  delta(){
    
  }
  ariella(){
    
  }
  bijoux(){
    
  }
}
