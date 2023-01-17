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
prixRobe: any;

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


export class Cake extends Prestation{
    design: string;
    cremes: string;
    genoise: string;
    ganaches: string;
    nombreInvite:String;
    alcoolisee:boolean;
    message:string;
    

    constructor(id?: number, prix?: number, design?: string,  cremes?: string, genoise?: string,  ganaches?: string, nombreInvite?: String,  alcoolisee?: boolean, message?:string){
        super(id,prix);
        this.design=design;
        this.cremes= cremes;
        this.genoise= genoise;
        this.ganaches= ganaches;
        this.nombreInvite= nombreInvite;
        this.alcoolisee=alcoolisee;
        this.message=message;
        
    }
}


export class MariageDTO {
    robes: Array<Robe>;
    cakes: Array<Cake>;

    constructor() { }
}