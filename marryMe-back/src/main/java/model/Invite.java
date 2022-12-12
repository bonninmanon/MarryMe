package model;

public class Invite {
	private Integer id;
	private String denomination ;
	private String nomfamille;
	private int nbreEnfant;
	private int nbreAdulte;
	private String adresse;
	private String codePostal;
	private String ville;
	private String pays;
	private String adresseEmail;
	private String ceremonieCivile;
	private String ceremonieReligieuse;
	private String vinHonneur;
	
	public Invite(String denomination, String nomfamille, int nbreEnfant, int nbreAdulte, String adresse,
			String codePostal, String ville, String pays, String adresseEmail, String ceremonieCivile,
			String ceremonieReligieuse, String vinHonneur) {
		super();
		this.denomination = denomination;
		this.nomfamille = nomfamille;
		this.nbreEnfant = nbreEnfant;
		this.nbreAdulte = nbreAdulte;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.pays = pays;
		this.adresseEmail = adresseEmail;
		this.ceremonieCivile = ceremonieCivile;
		this.ceremonieReligieuse = ceremonieReligieuse;
		this.vinHonneur = vinHonneur;
	}

	public Invite() {
		super();
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
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
				+ nbreEnfant + ", nbreAdulte=" + nbreAdulte + ", adresse=" + adresse + ", codePostal=" + codePostal
				+ ", ville=" + ville + ", pays=" + pays + ", adresseEmail=" + adresseEmail + ", ceremonieCivile="
				+ ceremonieCivile + ", ceremonieReligieuse=" + ceremonieReligieuse + ", vinHonneur=" + vinHonneur + "]";
	}
	
	

}
