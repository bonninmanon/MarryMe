import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
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
  alcoolisee:string;
  message:string;
  idMariage: number;

  connecte: Cake= new Cake();
  isShowInfo: boolean;

  constructor(private cakeService: HttpCakeService, private router: Router, private route: ActivatedRoute){
    this.route.params.subscribe(params => { 
        console.log(params);
        this.idMariage = params['id'];
        console.log(this.idMariage);
        this.cakeService.setMariageId(this.idMariage);
    });
  }
  reservercake()
  {
    console.log(this.nombreInvite);
    if(this.nombreInvite=="10-30"){this.prix = 250}
    else if (this.nombreInvite=="31-60"){this.prix = 320}
    else if (this.nombreInvite=="61-100"){this.prix = 500}
    else if (this.nombreInvite==" >100 "){this.prix = 750}
    //this.prix = (this.nombreInvite=="petit")? 250 : 400 ;
 
    
    console.log("prix:" +this.prix + " design:" +this.design + " cremes:" + this.cremes + " genoise:" + this.genoise  + " ganaches:" + this.ganaches    + " alcoolisee:" + this.alcoolisee+ " nombreInvite:" + this.nombreInvite  )
  
    this.cakeService.create(this.prix, this.design, this.cremes, this.genoise, this.ganaches,this.nombreInvite,(this.alcoolisee == "oui" ? true : false)).subscribe(resp => {this.connecte = resp;})
  }

  choixCake(designImgClic : string) {
       this.design=designImgClic;
  }
  choixGenoise(genoiseImgClic : string) {
    this.genoise=genoiseImgClic;
  }

}
