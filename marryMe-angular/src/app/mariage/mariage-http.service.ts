import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { AppConfigService } from '../app-config.service';
import { Mariage } from '../model';

@Injectable({
  providedIn: 'root'
})
export class MariageHttpService {

  serviceUrl: string;
  mariages: Array<Mariage> = new Array<Mariage>();

  constructor(private http: HttpClient, private appConfig: AppConfigService) {
    this.serviceUrl = appConfig.backEndUrl + "comptes/";
    this.load();
   }

  findAll(): Array<Mariage> {
    return this.mariages;
  }

  findById(id: number): Observable<Mariage> {
    return this.http.get<Mariage>(this.serviceUrl + id);
  }


  private load(): void {
    this.http.get<Array<Mariage>>(this.serviceUrl).subscribe(response => {
      this.mariages = response;
    });

    
   }

}
