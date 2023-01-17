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
    //this.serviceUrl = appConfig.backEndUrl + "cakes/";
 } 

   setMariageId(id: number){
    this.serviceUrl = this.appConfig.backEndUrl + "mariages/"+id+"/cake";
  
   }


   create(prix: number,design: string,cremes: string,genoise: string,ganaches: string , nombreInvite: string, alcoolisee:boolean): Observable<Cake> {
    let cakeDTO = {"prix": prix,"design": design, "cremes": cremes, "genoise": genoise, "ganaches": ganaches  , "nombreInvite": nombreInvite,"alcoolisee": alcoolisee};

    return this.http.post<Cake>(this.serviceUrl, cakeDTO);
  }
}
