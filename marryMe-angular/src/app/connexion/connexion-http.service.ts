import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { AppConfigService } from '../app-config.service';
import { Connexion } from '../model';

@Injectable({
  providedIn: 'root'
})
export class ConnexionHttpService {
a
  serviceUrl: string;
  connexions: Connexion = new Connexion;

  constructor(private http: HttpClient, private appConfig: AppConfigService) {
    this.serviceUrl = appConfig.backEndUrl + "comptes/";
  
   }


  findByMailAndPassword(mail: String, password:string): Observable<Connexion> {
  
    return this.http.post<Connexion>(this.serviceUrl + "auth", {
      "mdp": mdp,
      "password": password
    });
  }

 
  }

