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

  create(connexion: Connexion): void {
    this.http.post<Connexion>(this.serviceUrl,connexion).subscribe(resp => {
      this.load();
    });
  }
 

  private load(): void {
    this.http.get<Connexion>(this.serviceUrl).subscribe(response => {
      this.connexions = response;
    });
  }

  }

