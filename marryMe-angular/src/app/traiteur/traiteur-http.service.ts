import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { AppConfigService } from '../app-config.service';
import { Traiteur } from '../model';

@Injectable({
  providedIn: 'root'
})
export class TraiteurHttpService {



  
      serviceUrl: string;
      traiteurs: Array<Traiteur> = new Array<Traiteur>();
    
      constructor(private http: HttpClient, private appConfig: AppConfigService) {
        this.serviceUrl = appConfig.backEndUrl + "traiteur";
       }
       setMariageId(id: number){
        this.serviceUrl = this.appConfig.backEndUrl + "mariages/"+id+"/traiteur";
      
       }


   /* load() {
      throw new Error('Method not implemented.');
    }this.prix, this.vinDHonneur, this.cuisine,this.nombreInvite,(this.vinDHonneur == "oui" ? true : false);
  }*/
    create(prix: number,vinDHonneur: boolean,cuisine: string,nombreInvite: string): Observable<Traiteur> {
      let traiteurDTO = {"prix": prix,"vinDHonneur": vinDHonneur, "cuisine": cuisine, "nombreInvite": nombreInvite};
  
      return this.http.post<Traiteur>(this.serviceUrl, traiteurDTO);
    }
  }
    
   