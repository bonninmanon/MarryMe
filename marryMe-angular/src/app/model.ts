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
   mariage:Mariage;

    constructor(id?: number, mail?: string,  mdp?: string ,type?:string,nom?:string,prenom?:string,mariage?:Mariage) {
        this.id = id;
        this.nom=nom;
        this.prenom=prenom;
        this.mail = mail;
        this.mdp = mdp;
        this.type=type;
        this.mariage=mariage || new Mariage();
    }
}
export class Mariage {
    id: number;
    date: Date;
    theme:string;
    today = new Date().toISOString().split('T')[0];
    constructor(id?: number, date?: Date,theme?: string){
        
        this.id = id;
        this.date = date ;
        this.theme=theme || "Clown";
    }
}

export class Robe {
    idRobe: number;
    prixRobe: number;
    model: string;
    taille: string;

    constructor(idRobe?: number, prixRobe?: number, model?: string,  taille?: string){
        this.idRobe = idRobe;
        this.prixRobe = prixRobe;
        this.model = model;
        this.taille = taille;
    }
}

export class Salle {
    idSalle: number;
    prixSalle:number;
    nom: string;
    capacite: number;
   
    constructor(idSalle?: number, prixSalle?: number,  nom?: string ,capacite?:number) {
        this.idSalle = idSalle;
        this.prixSalle = prixSalle;
        this.nom = nom;
        this.capacite=capacite;

    }
}


export class Cake{
    idCake: number;
    prixCake: number;
    design: string;
    cremes: string;
    genoise: string;
    ganaches: string;
    nombreInvite:String;
    alcoolisee:boolean;
    message:string;

    

    constructor(idCake?: number, prixCake?: number, design?: string,  cremes?: string, genoise?: string,  ganaches?: string, nombreInvite?: String,  alcoolisee?: boolean, message?:string){
        this.idCake= idCake;
        this.prixCake = prixCake;
        this.design=design;
        this.cremes= cremes;
        this.genoise= genoise;
        this.ganaches= ganaches || "Chocolat Noir";
        this.nombreInvite= nombreInvite;
        this.alcoolisee=alcoolisee;
        this.message=message;
        
    }
}

export class Traiteur {
    id: number;
    prix:number;
    vinDHonneur: boolean;
    cuisine: string;
    nombreInvite:String;
    
   

    constructor(id?: number, prix?: number, vinDHonneur?:boolean,  cuisine?: string,  nombreInvite?: String ) {
        this.id = id;
        this.prix = prix;
        this.vinDHonneur = vinDHonneur;
        this.cuisine=cuisine;
        this.nombreInvite= nombreInvite;


    }
}

export class MariageDTO {
    robes: Array<Robe>;
    cakes: Array<Cake>;
    salles: Array<Salle>;
    traiteurs: Array<Traiteur>;
    constructor() { }
}