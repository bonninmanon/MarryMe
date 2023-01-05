package marryMe.model;


import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "robe")
public class Robe extends Prestation {

	private String model ;
	private int taille;
		
	
	public Robe() {}
		
	
	public Robe(double prix, String model, int taille) {
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


	public int getTaille() {
		return taille;
	}


	public void setTaille(int taille) {
		this.taille = taille;
	}


	@Override
	public String toString() {
		return "Robe [model=" + model + ", taille=" + taille + "]";
	}

	
	

	
	
	
}
