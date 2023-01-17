import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Observable } from 'rxjs';
import { AppConfigService } from '../app-config.service';
import { Mariage } from '../model';
import { MariageHttpService } from './mariage-http.service';

@Component({
  selector: 'mariage,[mariage]',
  templateUrl: './mariage.component.html',
  styleUrls: ['./mariage.component.scss']
})
export class MariageComponent {


 
    formMariage: Mariage = new Mariage();
  
    constructor(private mariageService: MariageHttpService) {
    }
  
    list(): Array<Mariage> {
      return this.mariageService.findAll();
    }
  }