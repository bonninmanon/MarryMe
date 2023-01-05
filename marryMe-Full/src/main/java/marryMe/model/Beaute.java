package marryMe.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;

import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;



@Entity
@Table(name = "beaute")
public class Beaute extends Prestation {

	@JsonView(Views.ViewBase.class)
	private boolean coiffure;
	@JsonView(Views.ViewBase.class)
	private boolean makeUp;
	@JsonView(Views.ViewBase.class)
	private Lieu lieu;
	
	@Embedded
	@JsonView(Views.ViewBase.class)
	private Adresse adresse;

	public Beaute() {

	}

	public Beaute(double prix, boolean coiffure, boolean makeUp, Lieu lieu, Adresse adresse) {
		super(prix);
		this.coiffure = coiffure;
		this.makeUp = makeUp;
		this.lieu = lieu;
		this.adresse = adresse;
	}

	public boolean isCoiffure() {
		return coiffure;
	}

	public void setCoiffure(boolean coiffure) {
		this.coiffure = coiffure;
	}

	public boolean isMakeUp() {
		return makeUp;
	}

	public void setMakeUp(boolean makeUp) {
		this.makeUp = makeUp;
	}

	public Lieu getLieu() {
		return lieu;
	}

	public void setLieu(Lieu lieu) {
		this.lieu = lieu;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "Beaute [coiffure=" + coiffure + ", makeUp=" + makeUp + ", lieu=" + lieu + ", adresse=" + adresse + "]";
	}

	

}
