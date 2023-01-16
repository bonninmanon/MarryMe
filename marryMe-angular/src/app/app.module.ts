import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ConnexionComponent } from './connexion/connexion.component';
import { InscriptionComponent } from './inscription/inscription.component';
import { AccueilComponent } from './accueil/accueil.component';
import { RobeComponent } from './robe/robe.component';
import { CakeComponent } from './cake/cake.component';
import { PanierComponent } from './panier/panier.component';
import { FormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { SalleComponent } from './salle/salle.component';
import { HttpSalleService } from './salle/salle-http.service';

@NgModule({
  declarations: [
    AppComponent,
    ConnexionComponent,
    InscriptionComponent,
    AccueilComponent,
    RobeComponent,
    CakeComponent,
    PanierComponent,
    SalleComponent,
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [HttpSalleService],
  bootstrap: [AppComponent]
})
export class AppModule { }
