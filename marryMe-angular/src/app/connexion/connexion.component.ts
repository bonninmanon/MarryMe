import { HttpClient } from '@angular/common/http';
import { Component, ElementRef, Renderer2 } from '@angular/core';

import { Router } from '@angular/router';
import gsap from 'gsap';
import { MariageHttpService } from '../mariage/mariage-http.service';
import { Connexion, Mariage } from '../model';

import { ConnexionHttpService } from './connexion-http.service';
import { UtilisateurService } from './utilisateur.service';

declare var $: any;

@Component({
  selector: 'connexion,[connexion]',
  templateUrl: './connexion.component.html',
  styleUrls: ['./connexion.component.scss']
})
export class ConnexionComponent {


  isShowInfo: boolean;
  formConnexion: Connexion = new Connexion();
  media: any;
  container: any;
  today = new Date().toISOString().split('T')[0];
  selectedDate = new Date().toISOString().substring(0, 10);
  constructor(private utilisateurService: UtilisateurService,private connexionService: ConnexionHttpService,private  mariageService: MariageHttpService, private router: Router,private renderer: Renderer2, private el: ElementRef) {
  }

  


  inscription(nom :string,prenom:string, mail: String, mdp:string,date:Date,theme:string): void {
    this.connexionService.creationCompte(nom,prenom,mail,mdp,date + "",theme).subscribe (resp => {
 
      this.el.nativeElement.querySelector('#forLogin').click();
    })
};


  verif(mail: string,mdp:string): void {
    this.connexionService.findByMailAndPassword(mail,mdp).subscribe(resp => {
      this.formConnexion = resp;
      this.utilisateurService.setUtilisateur(resp);
      
       
        if(resp.type=='client') {
          
        this.router.navigate(["mariages/"+resp.mariage.id+"/robe"]);
        }
      
      
    });
  }

  listMariage(): Array<Mariage> {
    return this.mariageService.findAll();
  }

  save(): void {
    this.connexionService.create(this.formConnexion);
    }




 
//l'animation de debut
  



 







//pour glisser la page de connexion vers l'inscription 
ngAfterViewInit() {
  const forlogin = this.el.nativeElement.querySelector('#forLogin');
  const forRegister = this.el.nativeElement.querySelector('#forRegister');
  const loginForm = this.el.nativeElement.querySelector('#loginForm');
  const registerForm = this.el.nativeElement.querySelector('#registerForm');
  const formContainer = this.el.nativeElement.querySelector('#formContainer');


  this.renderer.listen(forRegister, 'click', (e) => {
    e.preventDefault();
    this.renderer.removeClass(forlogin, 'active');
    this.renderer.addClass(forRegister, 'active');
    if (registerForm.classList.contains('toggleForm')) {
      this.renderer.setStyle(formContainer, 'transform', 'translate(-100%)');
      this.renderer.setStyle(formContainer, 'transition', 'transform .5s');
      this.renderer.removeClass(registerForm, 'toggleForm');
      this.renderer.addClass(loginForm, 'toggleForm');
    }
  });

  this.renderer.listen(forlogin, 'click', (e) => {
    e.preventDefault();
    this.renderer.removeClass(forRegister, 'active');
    this.renderer.addClass(forlogin, 'active');
    if (loginForm.classList.contains('toggleForm')) {
      this.renderer.setStyle(formContainer, 'transform', 'translate(0%)');
      this.renderer.setStyle(formContainer, 'transition', 'transform .5s');
      this.renderer.removeClass(loginForm, 'toggleForm');
      this.renderer.addClass(registerForm, 'toggleForm');
    }
  });

}

}