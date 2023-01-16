import { Injectable } from '@angular/core';
import { AppConfigService } from '../app-config.service';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Robe } from '../model';

@Injectable({
  providedIn: 'root'
})

export class HttpRobeService {

  serviceUrl: string;
  robes: Array<Robe> = new Array<Robe>();

  constructor(private http: HttpClient, private appConfig: AppConfigService) {
    this.serviceUrl = appConfig.backEndUrl + "robes/";
  
   }


  create(prix: number, nom: string, taille: string): Observable<Robe> {
    let robeDTO = {"nom": nom, "taille": taille, "prix": prix };

    return this.http.post<Robe>(this.serviceUrl, robeDTO);
  }

}
