package marryMe.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;



@Entity
@Table(name="salle")
public class Salle extends Prestation{
	
	@Column(length = 25, nullable = false)
	@JsonView(Views.ViewBase.class)
	private String  nom ;
	@JsonView(Views.ViewBase.class)
	private int  capacite;


    
	public Salle( double prix, String nom, int capacite) {
		super( prix);
		this.nom = nom;
		this.capacite = capacite;
	
	}
    
    public Salle() {
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}


	@Override
	public String toString() {
		return "Salle [nom=" + nom + ", capacite=" + capacite + "]";
	}
    
    


	
	
}
