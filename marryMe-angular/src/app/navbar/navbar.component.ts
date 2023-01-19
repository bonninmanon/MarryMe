import { Component, Renderer2 } from '@angular/core';
import { Router } from '@angular/router';
import { UtilisateurService } from '../connexion/utilisateur.service';
import { Connexion } from '../model';

@Component({
  selector: 'navbar,[navbar]',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent {

 utilisateurc:Connexion;


  constructor(private utilisateurservice:UtilisateurService,private router: Router,private renderer: Renderer2){}

  
  ngOnInit() {

    this.utilisateurc =this.utilisateurservice.getUtilisateur();


  }

  passagecake(){

   this.utilisateurc =this.utilisateurservice.getUtilisateur();

    console.log(this.utilisateurc);
    this.router.navigate(["mariages/"+this.utilisateurc.mariage.id+"/cake"]);

  }
  passagerobe(){

    this.utilisateurc =this.utilisateurservice.getUtilisateur();
 
     console.log(this.utilisateurc);
     this.router.navigate(["mariages/"+this.utilisateurc.mariage.id+"/robe"]);
 
   }
   passagesalle(){

    this.utilisateurc =this.utilisateurservice.getUtilisateur();
 
     console.log(this.utilisateurc);
     this.router.navigate(["mariages/"+this.utilisateurc.mariage.id+"/salle"]);
 
   }
   
   passagetraiteur(){

    this.utilisateurc =this.utilisateurservice.getUtilisateur();
 
     console.log(this.utilisateurc);
     this.router.navigate(["mariages/"+this.utilisateurc.mariage.id+"/traiteur"]);
 
   }

   passagepanier(){

    this.utilisateurc =this.utilisateurservice.getUtilisateur();
 
     console.log(this.utilisateurc);
     this.router.navigate(["mariages/"+this.utilisateurc.mariage.id+"/detail"]);
 
   }

   passageaccueil(){

    this.utilisateurc =this.utilisateurservice.getUtilisateur();
 
     console.log(this.utilisateurc);
     this.router.navigate(["connexion"]);
 
   }

   
   passageconnexion(){

    this.utilisateurc =this.utilisateurservice.getUtilisateur();
 
     console.log(this.utilisateurc);

    
     if(!this.utilisateurc){
      console.log(this.utilisateurc);
this.router.navigate(["/connexion"]);
     }
 
   }

   passage(){

    this.utilisateurc =this.utilisateurservice.getUtilisateur();
 
     console.log(this.utilisateurc);
     this.router.navigate([""]);
 
   }




}
