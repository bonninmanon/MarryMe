package marryMe.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="beaute")
public class Beaute extends Prestation  {
	

	private boolean coiffure ;
	private boolean  makeUp ;
	private boolean  vetementHomme ;
	private boolean  vetementFemme ;
	private Lieu Domicile ;
	private Lieu Salon ;
	
	@OneToOne(mappedBy = "beaute")
	private Adresse adresse;


public Beaute() {
	// TODO Auto-generated constructor stub
}


public Beaute(double prix, boolean coiffure, boolean makeUp, boolean vetementHomme, boolean vetementFemme,
		Lieu domicile, Lieu salon) {
	super( prix);
	this.coiffure = coiffure;
	this.makeUp = makeUp;
	this.vetementHomme = vetementHomme;
	this.vetementFemme = vetementFemme;
	Domicile = domicile;
	Salon = salon;
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


public Lieu getDomicile() {
	return Domicile;
}


public void setDomicile(Lieu domicile) {
	Domicile = domicile;
}


public Lieu getSalon() {
	return Salon;
}


public void setSalon(Lieu salon) {
	Salon = salon;
}


@Override
public String toString() {
	return "Beaute [coiffure=" + coiffure + ", makeUp=" + makeUp + ", vetementHomme=" + vetementHomme
			+ ", vetementFemme=" + vetementFemme + ", Domicile=" + Domicile + ", Salon=" + Salon + "]";
}




	

}
