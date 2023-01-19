import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Salle } from '../model';
import { AppConfigService } from '../app-config.service';


@Injectable({
  providedIn: 'root'
})
export class HttpSalleService {

    serviceUrl: string;
    salles: Array<Salle> = new Array<Salle>();


    setMariageId(id: number){
      this.serviceUrl = this.appConfig.backEndUrl + "mariages/"+id+"/salle";
    
     }
  
    constructor(private http: HttpClient, private appConfig: AppConfigService) {
      this.serviceUrl = appConfig.backEndUrl + "salles";
     }
 
  
    create(prix: number, nom: string, capacite: number): Observable<Salle> {
      let salleDTO = {"prix": prix, "nom": nom, "capacite": capacite };
  
      return this.http.post<Salle>(this.serviceUrl, salleDTO);
    }
  
   
  }