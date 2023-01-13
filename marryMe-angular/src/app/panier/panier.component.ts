import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ConnexionHttpService } from '../connexion/connexion-http.service';

@Component({
  selector: 'panier,[panier]',
  templateUrl: './panier.component.html',
  styleUrls: ['./panier.component.scss']
})
export class PanierComponent {
  constructor(private cS: ConnexionHttpService, private router: Router){
    
  }
}
