package marryMe.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

import marryMe.model.Views.ViewBase;

@Entity
@Table(name = "beaute")
public class Beaute extends Prestation {

	private boolean coiffure;
	private boolean makeUp;
	private boolean vetementHomme;
	private boolean vetementFemme;
	private Lieu lieu;
	
	@Embedded
	private Adresse adresse;

	public Beaute() {

	}

	public Beaute(double prix, boolean coiffure, boolean makeUp, boolean vetementHomme, boolean vetementFemme,
			Lieu lieu) {
		super(prix);
		this.coiffure = coiffure;
		this.makeUp = makeUp;
		this.vetementHomme = vetementHomme;
		this.vetementFemme = vetementFemme;
		this.lieu = lieu;

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

	public boolean isVetementHomme() {
		return vetementHomme;
	}

	public void setVetementHomme(boolean vetementHomme) {
		this.vetementHomme = vetementHomme;
	}

	public boolean isVetementFemme() {
		return vetementFemme;
	}

	public void setVetementFemme(boolean vetementFemme) {
		this.vetementFemme = vetementFemme;
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
		return "Beaute [coiffure=" + coiffure + ", makeUp=" + makeUp + ", vetementHomme=" + vetementHomme
				+ ", vetementFemme=" + vetementFemme + ", lieu=" + lieu + ", adresse=" + adresse + "]";
	}

}
