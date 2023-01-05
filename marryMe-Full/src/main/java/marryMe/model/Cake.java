package marryMe.model;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name="cake")
public class Cake extends Prestation {
	
	
	private String design ;
	private String saveur;
	private String Genoise;
	private String Ganaches;
	private Boolean alcoolisée;
	
	
	public Cake(double prix, String design, String saveur, String genoise, String ganaches, Boolean alcoolisée) {
		super(prix);
		this.design = design;
		this.saveur = saveur;
		Genoise = genoise;
		Ganaches = ganaches;
		this.alcoolisée = alcoolisée;
	}




	public String getDesign() {
		return design;
	}




	public void setDesign(String design) {
		this.design = design;
	}




	public String getSaveur() {
		return saveur;
	}




	public void setSaveur(String saveur) {
		this.saveur = saveur;
	}




	public String getGenoise() {
		return Genoise;
	}




	public void setGenoise(String genoise) {
		Genoise = genoise;
	}




	public String getGanaches() {
		return Ganaches;
	}




	public void setGanaches(String ganaches) {
		Ganaches = ganaches;
	}




	public Boolean getAlcoolisée() {
		return alcoolisée;
	}




	public void setAlcoolisée(Boolean alcoolisée) {
		this.alcoolisée = alcoolisée;
	}




	@Override
	public String toString() {
		return "Cake [design=" + design + ", saveur=" + saveur + ", Genoise=" + Genoise + ", Ganaches=" + Ganaches
				+ ", alcoolisée=" + alcoolisée + "]";
	}


	

	
	
	
}
