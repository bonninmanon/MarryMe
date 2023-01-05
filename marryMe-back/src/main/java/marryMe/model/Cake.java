package marryMe.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="cake")
public class Cake extends Prestation {
	

	private String design ;
	private String saveur;
	public Cake(double prix, String design, String saveur) {
		super(prix);
		this.design = design;
		this.saveur = saveur;
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
	@Override
	public String toString() {
		return "Cake [design=" + design + ", saveur=" + saveur + "]";
	}
	
	
}