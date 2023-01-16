package marryMe.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InfoDTO {
	
	@JsonProperty("nom")
	private String nom;
	@JsonProperty("prenom")
	private String prenom;
	@JsonProperty("mail")
	private String mail;
	@JsonProperty("mdp")
	private String mdp;
	public InfoDTO() {
		super();
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return mdp;
	}
	public void setPassword(String mdp) {
		this.mdp = mdp;
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
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	
	
	}
	
	
	
