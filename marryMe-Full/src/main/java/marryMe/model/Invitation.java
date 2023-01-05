package marryMe.model;



import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;



@Entity
@Table(name="invitation")
public class Invitation extends Prestation {
	
	@JsonView(Views.ViewBase.class)
	private String modele;
	@JsonView(Views.ViewBase.class)
	private Livraison SurPlace;
	@JsonView(Views.ViewBase.class)
	private Livraison ADomicile;
	
	
	public Invitation() {
		// TODO Auto-generated constructor stub
	}


	public Invitation(double prix, String modele, Livraison surPlace, Livraison aDomicile) {
		super(prix);
		this.modele = modele;
		SurPlace = surPlace;
		ADomicile = aDomicile;
	}


	public String getModele() {
		return modele;
	}


	public void setModele(String modele) {
		this.modele = modele;
	}


	public Livraison getSurPlace() {
		return SurPlace;
	}


	public void setSurPlace(Livraison surPlace) {
		SurPlace = surPlace;
	}


	public Livraison getADomicile() {
		return ADomicile;
	}


	public void setADomicile(Livraison aDomicile) {
		ADomicile = aDomicile;
	}


	@Override
	public String toString() {
		return "Invitation [modele=" + modele + ", SurPlace=" + SurPlace + ", ADomicile=" + ADomicile + "]";
	}
	
	
	
	

}
