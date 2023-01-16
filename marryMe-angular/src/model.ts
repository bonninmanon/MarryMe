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