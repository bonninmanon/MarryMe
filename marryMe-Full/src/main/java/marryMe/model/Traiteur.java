package marryMe.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;


@Entity
@Table(name="traiteur")
public class Traiteur extends Prestation {
	
	@JsonView(Views.ViewBase.class)
	private boolean vinDHonneur;
	@JsonView(Views.ViewBase.class)
	private String cuisine ;
	
	public Traiteur () {};
		
	public Traiteur(double prix, boolean vinDHonneur, String cuisine) {
		super(prix);
		this.vinDHonneur = vinDHonneur;
		this.cuisine = cuisine;
	}


	public boolean getVinDHonneur() {
		return vinDHonneur;
	}


	public void setVinDHonneur(boolean vinDHonneur) {
		this.vinDHonneur = vinDHonneur;
	}


	public String getCuisine() {
		return cuisine;
	}


	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}


	@Override
	public String toString() {
		return "Traiteur [vinDHonneur=" + vinDHonneur + ", cuisine=" + cuisine + "]";
	}

	
	
}
