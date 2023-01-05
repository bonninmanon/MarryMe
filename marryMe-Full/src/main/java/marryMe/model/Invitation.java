package marryMe.model;



import javax.persistence.Entity;
import javax.persistence.Table;



@Entity
@Table(name="invitation")
public class Invitation extends Prestation {
	

	private String modele;
	private Livraison ADomicile;
	private Livraison VoiePostal;
	
	
	public Invitation( double prix, String modele, Livraison aDomicile, Livraison voiePostal) {
		super(prix);
		this.modele = modele;
		ADomicile = aDomicile;
		VoiePostal = voiePostal;
	}
	
	public Invitation() {
		// TODO Auto-generated constructor stub
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public Livraison getADomicile() {
		return ADomicile;
	}

	public void setADomicile(Livraison aDomicile) {
		ADomicile = aDomicile;
	}

	public Livraison getVoiePostal() {
		return VoiePostal;
	}

	public void setVoiePostal(Livraison voiePostal) {
		VoiePostal = voiePostal;
	}

	@Override
	public String toString() {
		return "Invitation [modele=" + modele + ", ADomicile=" + ADomicile + ", VoiePostal=" + VoiePostal + "]";
	}
	
	
	

}
