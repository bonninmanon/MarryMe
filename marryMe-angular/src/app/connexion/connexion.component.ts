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
  
  ngOnInit() {
  gsap.timeline({paused: true})
  .staggerFrom(document.querySelectorAll('h1 span'), 1, {top: -50, opacity: 0, ease: "power2.out"}, 0.3)
  .staggerFrom(document.querySelectorAll('.btn-first'), 1, {opacity: 0, ease: "power2.out"}, 0.3)
  .from(document.querySelector('.l1'), 1, {width: 0, ease: "power2.out"}, '-=2')
  .from(document.querySelector('.l2'), 1, {width: 0, ease: "power2.out"}, '-=2')
  .from(document.querySelector('.logo'), 0.4, {transform: "scale(0)", ease: "power2.out"}, '-=2')
 
  
  .play();
  $('.medias').fadeIn(3000)
}


//affichhage du tableau connexion et désactivé les elements de la page
showForm() {
  const card = this.el.nativeElement.querySelector('#card');
  const navigationItems = this.el.nativeElement.querySelector('#navigationItems');
  const btn1 = this.el.nativeElement.querySelector('#btn1');
  const btn2 = this.el.nativeElement.querySelector('#btn2');
  const medias = this.el.nativeElement.querySelector('#medias');
  const phrase = this.el.nativeElement.querySelector('#phrase');
  const phrase1 = this.el.nativeElement.querySelector('#phrase1');
  const phrase2 = this.el.nativeElement.querySelector('#phrase2');
  const phrase3 = this.el.nativeElement.querySelector('#phrase3');
  this.renderer.listen(btn2, 'click', (e) => {
    e.preventDefault();
    this.renderer.addClass(card, 'show');
    this.renderer.setStyle(card, 'z-index', '6');
    
    this.renderer.setStyle(navigationItems, 'display', 'none');
    this.renderer.setStyle(btn1, 'display', 'none');
    this.renderer.setStyle(btn2, 'display', 'none');
    this.renderer.setStyle(medias, 'display', 'none');
   
    this.renderer.setStyle(phrase, 'display', 'none');
    this.renderer.setStyle(phrase1, 'display', 'none');
    this.renderer.setStyle(phrase2, 'display', 'none');
    this.renderer.setStyle(phrase3, 'display', 'none');
    

    console.log("dddddddddddddddddd")
  });
 



}




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