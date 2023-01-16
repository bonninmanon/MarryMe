package marryMe.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;


@Entity
@Table(name="traiteur")
public class Traiteur extends Prestation {
	
	@JsonView(Views.ViewBase.class)
	private boolean vinDHonneur;
	@JsonView(Views.ViewBase.class)
	private Cuisine cuisine ;
	
	
	@OneToOne
	private Mariage mariage;
	
	public Traiteur () {};
		
	public Traiteur(double prix, boolean vinDHonneur, Cuisine cuisine) {
		super(prix);
		this.vinDHonneur = vinDHonneur;
		this.cuisine = cuisine;
	}


	public boolean isVinDHonneur() {
		return vinDHonneur;
	}


	public void setVinDHonneur(boolean vinDHonneur) {
		this.vinDHonneur = vinDHonneur;
	}


	public Cuisine getCuisine() {
		return cuisine;
	}


	public void setCuisine(Cuisine cuisine) {
		this.cuisine = cuisine;
	}


	@Override
	public String toString() {
		return "Traiteur [vinDHonneur=" + vinDHonneur + ", cuisine=" + cuisine + "]";
	}

	
	
}
