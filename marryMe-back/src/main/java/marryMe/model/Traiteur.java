package marryMe.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="traiteur")
public class Traiteur extends Prestation {
	

	private boolean vinDHonneur;
	private Cuisine Cocktail ;
	private Cuisine Repas ;
	private Cuisine AmusesBouches;
	private Cuisine CuisineDuMonde;
	private Cuisine Cafe;
	
	public Traiteur(double prix, boolean vinDHonneur, Cuisine cocktail, Cuisine repas,
			Cuisine amusesBouches, Cuisine cuisineDuMonde, Cuisine cafe) {
		super( prix);
		this.vinDHonneur = vinDHonneur;
		Cocktail = cocktail;
		Repas = repas;
		AmusesBouches = amusesBouches;
		CuisineDuMonde = cuisineDuMonde;
		Cafe = cafe;
	}
	
	public Traiteur() {
		// TODO Auto-generated constructor stub
	}

	public boolean isVinDHonneur() {
		return vinDHonneur;
	}

	public void setVinDHonneur(boolean vinDHonneur) {
		this.vinDHonneur = vinDHonneur;
	}

	public Cuisine getCocktail() {
		return Cocktail;
	}

	public void setCocktail(Cuisine cocktail) {
		Cocktail = cocktail;
	}

	public Cuisine getRepas() {
		return Repas;
	}

	public void setRepas(Cuisine repas) {
		Repas = repas;
	}

	public Cuisine getAmusesBouches() {
		return AmusesBouches;
	}

	public void setAmusesBouches(Cuisine amusesBouches) {
		AmusesBouches = amusesBouches;
	}

	public Cuisine getCuisineDuMonde() {
		return CuisineDuMonde;
	}

	public void setCuisineDuMonde(Cuisine cuisineDuMonde) {
		CuisineDuMonde = cuisineDuMonde;
	}

	public Cuisine getCafe() {
		return Cafe;
	}

	public void setCafe(Cuisine cafe) {
		Cafe = cafe;
	}

	@Override
	public String toString() {
		return "Traiteur [vinDHonneur=" + vinDHonneur + ", Cocktail=" + Cocktail + ", Repas=" + Repas
				+ ", AmusesBouches=" + AmusesBouches + ", CuisineDuMonde=" + CuisineDuMonde + ", Cafe=" + Cafe + "]";
	}
	
	
	
	
}
