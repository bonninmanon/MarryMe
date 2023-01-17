package marryMe.web.dto;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CompteDTO {

	@JsonProperty("nom")
	private String nom;
	
	@JsonProperty("prenom")
	private String prenom;
	
	@JsonProperty("mail")
	private String mail;
	
	@JsonProperty("mdp")
	private String mdp;
	
	@JsonProperty("date")
	private LocalDate date;
	
	@JsonProperty("theme")
	private String theme;
	
	

	
	public CompteDTO() {}

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

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}
	
	
	
	
	
}
