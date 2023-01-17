import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AccueilComponent } from './accueil/accueil.component';
import { CakeComponent } from './cake/cake.component';
import { ConnexionComponent } from './connexion/connexion.component';
import { InscriptionComponent } from './inscription/inscription.component';
import { MariageComponent } from './mariage/mariage.component';
import { PanierComponent } from './panier/panier.component';
import { RobeComponent } from './robe/robe.component';
import { SalleComponent } from './salle/salle.component';

const routes: Routes = [
  {path: "connexion", component: ConnexionComponent, pathMatch: 'full'},
  {path: "inscription", component: InscriptionComponent},
  {path: "accueil", component: AccueilComponent},
  {path: "cake", component: CakeComponent},
  {path: "mariages/:id/robe", component: RobeComponent},
  {path: "panier", component: PanierComponent},
  {path: "salle", component: SalleComponent},
  {path: "mariage/:id", component: MariageComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
