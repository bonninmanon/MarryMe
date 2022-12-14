package marryMe.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="adresse")
public class Adresse {
	
	private Integer id;
	private String numero ;
	private String  voie ;
	private String  ville ;
	private String  cp ;
	
	@OneToOne(mappedBy = "adresse")
	private Client client;
	
	@OneToOne
	private Beaute beaute;
	
	@OneToOne
	private Invite invite;
	
	@OneToOne(mappedBy = "adresse")
	private Salle salle;
	
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

	

	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "Adresse [id=" + id + ", numero=" + numero + ", voie=" + voie + ", ville=" + ville + ", cp=" + cp + "]";
	}



	
	

}
