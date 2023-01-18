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
  load() {
    throw new Error('Method not implemented.');
  }
  
    findAll(): Array<Salle> {
      return this.salles;
    }
  
    findById(id: number): Observable<Salle> {
      return this.http.get<Salle>(this.serviceUrl + id);
    }
  
    create(prix: number, nom: string, capacite: number): Observable<Salle> {
      let salleDTO = {"prix": prix, "nom": nom, "capacite": capacite };
  
      return this.http.post<Salle>(this.serviceUrl, salleDTO);
    }


    /*create(salle: Salle): void {
      this.http.post<Salle>(this.serviceUrl, salle).subscribe(resp => {
        this.load();
      });
    }*/
  
    update(salle: Salle): void {
      this.http.put<Salle>(this.serviceUrl + salle.idSalle, salle).subscribe(resp => {
        this.load();
      });
    }
  
    remove(id: number): void {
      this.http.delete<void>(this.serviceUrl + id).subscribe(resp => {
        this.load();
      });
  
    }
  }