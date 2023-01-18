import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccueilComponent } from './accueil/accueil.component';
import { CakeComponent } from './cake/cake.component';
import { ConnexionComponent } from './connexion/connexion.component';
import { DecouvrirComponent } from './decouvrir/decouvrir.component';
import { InscriptionComponent } from './inscription/inscription.component';
import { MariageComponent } from './mariage/mariage.component';
import { PrestationComponent } from './prestation/prestation.component';
import { RobeComponent } from './robe/robe.component';
import { SalleComponent } from './salle/salle.component';

const routes: Routes = [
  {path: "connexion", component: ConnexionComponent, pathMatch: 'full'},
  {path: "inscription", component: InscriptionComponent},
  {path: "", component: AccueilComponent},
  {path: "mariages/:id/cake", component: CakeComponent},
  {path: "mariages/:id/robe", component: RobeComponent},
  {path: "mariages/:id/detail", component: PrestationComponent},
  {path: "mariages/:id/salle", component: SalleComponent},
  {path: "mariage/:id", component: MariageComponent},
  {path: "decouvrir", component: DecouvrirComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
