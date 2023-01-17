import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { HttpDecouvrirService } from './http-decouvrir.service';

@Component({
  selector: 'decouvrir,[decouvrir]',
  templateUrl: './decouvrir.component.html',
  styleUrls: ['./decouvrir.component.scss']
})
export class DecouvrirComponent {

  constructor(private dS: HttpDecouvrirService, private router: Router){
    
  }


}
