package marryMe.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthDTO {
	@JsonProperty("mail")
	private String mail;
	@JsonProperty("mdp")
	private String mdp;
	public AuthDTO() {
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
	
	
	
	}
	
	
	
