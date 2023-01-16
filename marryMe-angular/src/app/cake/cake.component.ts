import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Cake } from '../model';
import { HttpCakeService } from './http-cake.service';

@Component({
  selector: 'cake,[cake]',
  templateUrl: './cake.component.html',
  styleUrls: ['./cake.component.scss']
})
export class CakeComponent {
  prix: number;
  design: string;
  cremes: string;
  genoise: string;
  ganaches: string;
  nombreInvite:string;
  alcoolisée:boolean;


  formCake: Cake = null;
  connecte: Cake= new Cake();

  constructor(private cakeService: HttpCakeService, private router: Router) {
  }

  reservercake()
  {
    console.log(this.nombreInvite);
    if(this.nombreInvite=="petit"){this.prix = 250}
    else if (this.nombreInvite=="big"){this.prix = 250}
    else if (this.nombreInvite=="very big"){this.prix = 30000}
    //this.prix = (this.nombreInvite=="petit")? 250 : 400 ;
 
    
    console.log("prix:" +this.prix + " design:" +this.design + " cremes:" + this.cremes + " genoise:" + this.genoise  + " ganaches:" + this.ganaches    + " alcoolisée:" + this.alcoolisée+ " nombreInvite:" + this.nombreInvite  )
  
    this.cakeService.create(this.prix, this.design, this.cremes, this.genoise, this.ganaches,this.nombreInvite,this.alcoolisée).subscribe(resp => {this.connecte = resp;})
  }


}
