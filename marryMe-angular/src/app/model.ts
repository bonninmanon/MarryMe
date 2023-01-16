export class Prestation {
    id: number;
    prix: number;

    constructor(id?: number,  prix?: number){
   
        this.id = id;
        this.prix = prix;
    }
}

export class Connexion {
    id: number;
    nom:string;
    prenom:string;
    mail: string;
    mdp: string;
    type:string;
   

    constructor(id?: number, mail?: string,  mdp?: string ,type?:string,nom?:string,prenom?:string) {
        this.id = id;
        this.nom=nom;
        this.prenom=prenom;
        this.mail = mail;
        this.mdp = mdp;
        this.type=type;
    }
}

export class Robe extends Prestation{
    model: string;
    taille: string;

    constructor(id?: number, prix?: number, model?: string,  taille?: string){
        super(id,prix);
        this.model = model;
        this.taille = taille;
    }
}

export class Salle {
    id: number;
    prix:number;
    nom: string;
    capacite: number;
    debout: string;
   

    constructor(id?: number, prix?: number,  nom?: string ,capacite?:number, debout?:string) {
        this.id = id;
        this.prix = prix;
        this.nom = nom;
        this.capacite=capacite;
        this.debout=debout;

    }
}
