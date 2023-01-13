import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';

import { Router } from '@angular/router';
import { Connexion } from 'src/model';

import { ConnexionHttpService } from './connexion-http.service';

@Component({
  selector: 'connexion',
  templateUrl: './connexion.component.html',
  styleUrls: ['./connexion.component.scss']
})
export class ConnexionComponent {

  formConnexion: Connexion = new Connexion();
  

  constructor(private connexionService: ConnexionHttpService, private router: Router) {
  }

  
  verif(mail: string,password:string): void {
    this.connexionService.findByMailAndPassword(mail,password).subscribe(resp => {
      this.formConnexion = resp;
      if(resp.type){
       
        if(resp.type=='medecin') {
          console.log('gggggggggggggggggg');
        this.router.navigate(["/medecin"]);
        }
      }
      
    });
  }



}
