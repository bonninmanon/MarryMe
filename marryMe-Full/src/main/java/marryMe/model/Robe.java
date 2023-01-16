package marryMe.model;


import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table(name = "robe")
public class Robe extends Prestation {

	@JsonView(Views.ViewBase.class)
	private String model ;
	@JsonView(Views.ViewBase.class)
	private int taille;
	
	@OneToOne
	private Mariage mariage;
		
	
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
