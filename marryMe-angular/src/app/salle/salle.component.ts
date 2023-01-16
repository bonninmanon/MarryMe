import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Observable } from 'rxjs';
import { Salle } from '../model';
import { HttpSalleService } from './salle-http.service';


@Component({
  selector: 'salle,[salle]',
  templateUrl: './salle.component.html',
  styleUrls: ['./salle.component.scss']
})
export class SalleComponent {
  myimages: string = "assets/images"


  formSalle: Salle = new Salle;

  constructor(private salleService: HttpSalleService) {
  }

  list(): Array<Salle> {
    return this.salleService.findAll();
  }

  add():void {
    this.formSalle = new Salle();
  }

  edit(id: number): void {
    this.salleService.findById(id).subscribe((resp: Salle) => {
      this.formSalle= resp;
    });
  }

  save(): void {
    if(this.formSalle.id) { // UPDATE
      this.salleService.update(this.formSalle);
    } else { // CREATE
      this.salleService.create(this.formSalle);
    }

    this.cancel();
  }

  cancel(): void {
    this.formSalle = null;
  }

  remove(id: number): void {
    this.salleService.remove(id);
  }

}
