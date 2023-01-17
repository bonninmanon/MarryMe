import { Injectable } from '@angular/core';
import { AppConfigService } from '../app-config.service';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Robe } from '../model';
import { MariageComponent } from '../mariage/mariage.component';

@Injectable({
  providedIn: 'root'
})

export class HttpRobeService {

  serviceUrl: string;
  robes: Array<Robe> = new Array<Robe>();

  constructor(private http: HttpClient, private appConfig: AppConfigService) {
  
   }

   setMariageId(id: number){
    this.serviceUrl = this.appConfig.backEndUrl + "mariages/"+id+"/robe";
  
   }

  create(prix: number, model: string, taille: string): Observable<Robe> {
    let robeDTO = {"model": model, "taille": taille, "prix": prix };

    return this.http.post<Robe>(this.serviceUrl, robeDTO);
  }

}
