package marryMe.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table(name="compte")
public abstract class Compte {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonView(Views.ViewBase.class)
	protected Integer id;
	@Column(length = 25, nullable = false)
	@Size(min = 2, max = 25, message = "Le nom doit comporter entre 2 et 25 caractères")
	@JsonView(Views.ViewBase.class)
	protected String nom ;
	@Column(length = 25)
	@JsonView(Views.ViewBase.class)
	protected String prenom ;
	@Column(length = 25)
	@JsonView(Views.ViewBase.class)
	protected String mail ; 
	@JsonView(Views.ViewBase.class)
	protected String mdp ;
	

	public Compte(String nom, String prenom, String mail, String mdp) {
		super();

		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.mdp = mdp;
	}


	public Compte() {
		// TODO Auto-generated constructor stub
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getMdp() {
		return mdp;
	}


	public void setMdp(String mdp) {
		this.mdp = mdp;
	}


	@Override
	public String toString() {
		return "Compte [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", mdp=" + mdp + "]";
	}
	
	
	
	
}
