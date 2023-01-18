import { Injectable } from '@angular/core';
import { Connexion } from '../model';

@Injectable({
  providedIn: 'root'
})
export class UtilisateurService {

  private utilisateur:Connexion

  constructor() {  }

  setUtilisateur(utilisateur:Connexion){

this.utilisateur=utilisateur;


  }

  getUtilisateur(){

    return this.utilisateur;

  }

}
