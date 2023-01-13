import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { HttpPanierService } from './http-panier.service';


@Component({
  selector: 'panier,[panier]',
  templateUrl: './panier.component.html',
  styleUrls: ['./panier.component.scss']
})
export class PanierComponent {
  constructor(private cS: HttpPanierService, private router: Router){
    
  }
}
