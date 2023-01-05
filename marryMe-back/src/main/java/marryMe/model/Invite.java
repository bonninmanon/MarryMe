package marryMe.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name="invite")
public class Invite {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String denomination ;
	private String nomfamille;
	private int nbreEnfant;
	private int nbreAdulte;
	
	@Embedded
    private Adresse adresse;
    
	private String adresseEmail;
	private String ceremonieCivile;
	private String ceremonieReligieuse;
	private String vinHonneur;
	
	@ManyToOne
	private Mariage mariage;
	
	public Invite(String denomination, String nomfamille, int nbreEnfant, int nbreAdulte, Adresse adresse,
			String adresseEmail, String ceremonieCivile,
			String ceremonieReligieuse, String vinHonneur) {
		super();
		this.denomination = denomination;
		this.nomfamille = nomfamille;
		this.nbreEnfant = nbreEnfant;
		this.nbreAdulte = nbreAdulte;
		this.adresse = adresse;
		this.adresseEmail = adresseEmail;
		this.ceremonieCivile = ceremonieCivile;
		this.ceremonieReligieuse = ceremonieReligieuse;
		this.vinHonneur = vinHonneur;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDenomination() {
		return denomination;
	}

	public void setDenomination(String denomination) {
		this.denomination = denomination;
	}

	public String getNomfamille() {
		return nomfamille;
	}

	public void setNomfamille(String nomfamille) {
		this.nomfamille = nomfamille;
	}

	public int getNbreEnfant() {
		return nbreEnfant;
	}

	public void setNbreEnfant(int nbreEnfant) {
		this.nbreEnfant = nbreEnfant;
	}

	public int getNbreAdulte() {
		return nbreAdulte;
	}

	public void setNbreAdulte(int nbreAdulte) {
		this.nbreAdulte = nbreAdulte;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getAdresseEmail() {
		return adresseEmail;
	}

	public void setAdresseEmail(String adresseEmail) {
		this.adresseEmail = adresseEmail;
	}

	public String getCeremonieCivile() {
		return ceremonieCivile;
	}

	public void setCeremonieCivile(String ceremonieCivile) {
		this.ceremonieCivile = ceremonieCivile;
	}

	public String getCeremonieReligieuse() {
		return ceremonieReligieuse;
	}

	public void setCeremonieReligieuse(String ceremonieReligieuse) {
		this.ceremonieReligieuse = ceremonieReligieuse;
	}

	public String getVinHonneur() {
		return vinHonneur;
	}

	public void setVinHonneur(String vinHonneur) {
		this.vinHonneur = vinHonneur;
	}

	@Override
	public String toString() {
		return "Invite [id=" + id + ", denomination=" + denomination + ", nomfamille=" + nomfamille + ", nbreEnfant="
				+ nbreEnfant + ", nbreAdulte=" + nbreAdulte + ", adresse=" + adresse + ", adresseEmail=" + adresseEmail
				+ ", ceremonieCivile=" + ceremonieCivile + ", ceremonieReligieuse=" + ceremonieReligieuse
				+ ", vinHonneur=" + vinHonneur + "]";
	}

	
	

}
