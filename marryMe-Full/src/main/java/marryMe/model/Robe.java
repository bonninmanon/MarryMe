package marryMe.model;


import javax.persistence.Entity;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table(name = "robe")
public class Robe extends Prestation {

	@JsonView(Views.ViewBase.class)
	private String model ;
	@JsonView(Views.ViewBase.class)
	private String taille;
	@JsonView(Views.ViewBase.class)
	private String nom;
		
	
	public Robe() {}
	
	
		
	
	public Robe(double prix, String model, String taille, String nom) {
		super(prix);
		this.model = model;
		this.taille = taille;
		this.nom = nom;
	}




	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}




	public Robe(double prix, String model, String taille) {
		super(prix);
		this.model = model;
		this.taille = taille;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public String getTaille() {
		return taille;
	}


	public void setTaille(String taille) {
		this.taille = taille;
	}




	@Override
	public String toString() {
		return "Robe [model=" + model + ", taille=" + taille + ", nom=" + nom + "]";
	}




	
	
	
}
