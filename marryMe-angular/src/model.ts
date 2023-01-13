export class Connexion {
    id: number;
    mail: string;
    mdp: string;
    type:string;
   

    constructor(id?: number, mail?: string,  mdp?: string ,type?:string) {
        this.id = id;
        this.mail = mail;
        this.mdp = mdp;
        this.type=type;
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