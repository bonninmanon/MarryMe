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
    this.serviceUrl = this.appConfig.backEndUrl + "mariages/"+id+"/detail";
  
   }

  findDTOById(id: number): Observable <MariageDTO> {
  
    return this.http.get<MariageDTO>(this.serviceUrl);

  }


  
}
