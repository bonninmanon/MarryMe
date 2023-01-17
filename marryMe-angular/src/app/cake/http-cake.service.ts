import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { AppConfigService } from '../app-config.service';
import { Cake } from '../model';

@Injectable({
  providedIn: 'root'
})
export class HttpCakeService {

  serviceUrl: string;
  cakes: Array<Cake> = new Array<Cake>();


  constructor(private http: HttpClient, private appConfig: AppConfigService) {
    this.serviceUrl = appConfig.backEndUrl + "cakes/";
   }

   create(prix: number,design: string,cremes: string,genoise: string,ganaches: string , nombreInvite: string, alcoolisée:boolean): Observable<Cake> {
    let cakeDTO = {"prix": prix,"design": design, "cremes": cremes, "genoise": genoise, "ganaches": ganaches  , "nombreInvite": nombreInvite,"alcoolisée": alcoolisée};

    return this.http.post<Cake>(this.serviceUrl, cakeDTO);
  }
}
