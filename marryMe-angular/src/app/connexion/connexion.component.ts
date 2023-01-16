import { HttpClient } from '@angular/common/http';
import { Component, ElementRef, Renderer2 } from '@angular/core';

import { Router } from '@angular/router';
import gsap from 'gsap';
import { Connexion } from '../model';

import { ConnexionHttpService } from './connexion-http.service';

declare var $: any;

@Component({
  selector: 'connexion,[connexion]',
  templateUrl: './connexion.component.html',
  styleUrls: ['./connexion.component.scss']
})
export class ConnexionComponent {

  formConnexion: Connexion = new Connexion();
  media: any;
  container: any;
  

  constructor(private connexionService: ConnexionHttpService, private router: Router,private renderer: Renderer2, private el: ElementRef) {
  }

  
  verif(mail: string,mdp:string): void {
    this.connexionService.findByMailAndPassword(mail,mdp).subscribe(resp => {
      this.formConnexion = resp;
      if(resp.type){
       
        if(resp.type=='medecin') {
          console.log('gggggggggggggggggg');
        this.router.navigate(["/medecin"]);
        }
      }
      
    });
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

}


//pour glisser la page de inscription vers l'connexion 
ngBeforeViewInit() {
  const forlogin = this.el.nativeElement.querySelector('#forLogin');
  const forRegister = this.el.nativeElement.querySelector('#forRegister');
  const loginForm = this.el.nativeElement.querySelector('#loginForm');
  const registerForm = this.el.nativeElement.querySelector('#registerForm');
  const formContainer = this.el.nativeElement.querySelector('#formContainer');

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