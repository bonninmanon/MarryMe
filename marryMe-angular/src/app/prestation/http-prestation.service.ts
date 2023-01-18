import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { AppConfigService } from '../app-config.service';
import { MariageDTO, Prestation } from '../model';

@Injectable({
  providedIn: 'root'
})
export class HttpPrestationService {
 
  serviceUrl: string;
  prestations: Array<Prestation> = new Array<Prestation>();
  constructor(private http: HttpClient, private appConfig: AppConfigService) {
  
  }

  setMariageId(id: number){
    this.serviceUrl = this.appConfig.backEndUrl + "mariages/"+id;
  
   }

  findDTOById(id: number): Observable <MariageDTO> {
  
    return this.http.get<MariageDTO>(this.serviceUrl+"/detail");

  }

 removeRobe(id: Number): Observable<void>{

    return this.http.delete<void>(this.serviceUrl + "/robe/" + id);
  }


  
}
