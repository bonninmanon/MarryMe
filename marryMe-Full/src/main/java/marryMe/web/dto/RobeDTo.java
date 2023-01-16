package marryMe.web.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RobeDTo {

	@JsonProperty("model")
	private String model;
	
	
	@JsonProperty("taille")
	private int taille ;
	
	public RobeDTo() {
		// TODO Auto-generated constructor stub
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getTaille() {
		return taille;
	}

	public void setTaille(int taille) {
		this.taille = taille;
	}
	
	

	
}