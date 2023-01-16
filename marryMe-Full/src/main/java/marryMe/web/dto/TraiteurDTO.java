package marryMe.web.dto;



public class TraiteurDTO {
	
	private Integer idTraiteur;
	private double prixTraiteur;
	private boolean vinDHonneur;
	private String cuisine;
	
	public TraiteurDTO() {
		// TODO Auto-generated constructor stub
	}
	
	public Integer getIdTraiteur() {
		return idTraiteur;
	}
	public void setIdTraiteur(Integer idTraiteur) {
		this.idTraiteur = idTraiteur;
	}
	public double getPrixTraiteur() {
		return prixTraiteur;
	}
	public void setPrixTraiteur(double prixTraiteur) {
		this.prixTraiteur = prixTraiteur;
	}
	public boolean isVinDHonneur() {
		return vinDHonneur;
	}
	public void setVinDHonneur(boolean vinDHonneur) {
		this.vinDHonneur = vinDHonneur;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public TraiteurDTO(Integer idTraiteur, double prixTraiteur, boolean vinDHonneur, String cuisine) {
		super();
		this.idTraiteur = idTraiteur;
		this.prixTraiteur = prixTraiteur;
		this.vinDHonneur = vinDHonneur;
		this.cuisine = cuisine;
	}
	
	
}
