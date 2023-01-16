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

export class Robe extends Prestation{
    model: string;
    taille: string;

    constructor(id?: number, prix?: number, model?: string,  taille?: string){
        super(id,prix);
        this.model = model;
        this.taille = taille;
    }
}

