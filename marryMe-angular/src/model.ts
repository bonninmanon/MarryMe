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