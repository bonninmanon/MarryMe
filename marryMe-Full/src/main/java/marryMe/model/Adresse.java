package marryMe.model;

import javax.persistence.Embeddable;

import com.fasterxml.jackson.annotation.JsonView;

@Embeddable
public class Adresse {
	
	@JsonView({Views.ViewBase.class, Views.ViewClient.class})
	private String numero ;
	@JsonView({Views.ViewBase.class, Views.ViewClient.class})
	private String  voie ;
	@JsonView({Views.ViewBase.class, Views.ViewClient.class})
	private String  ville ;
	@JsonView({Views.ViewBase.class, Views.ViewClient.class})
	private String  cp ;
	
	public Adresse() {}
	
	public Adresse(String numero, String voie, String ville, String cp) {
		this.numero = numero;
		this.voie = voie;
		this.ville = ville;
		this.cp = cp;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getVoie() {
		return voie;
	}


	public void setVoie(String voie) {
		this.voie = voie;
	}


	public String getVille() {
		return ville;
	}


	public void setVille(String ville) {
		this.ville = ville;
	}


	public String getCp() {
		return cp;
	}


	public void setCp(String cp) {
		this.cp = cp;
	}

	


	@Override
	public String toString() {
		return "Adresse [ numero=" + numero + ", voie=" + voie + ", ville=" + ville + ", cp=" + cp + "]";
	}



	
	

}
