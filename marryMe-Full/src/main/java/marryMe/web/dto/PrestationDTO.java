package marryMe.web.dto;



public class PrestationDTO {
	
	private Integer idPrestation;
	private double prix;	
	private CakeDTO cake;
	private RobeDTO robe;
	private SalleDTO salle;
	private TraiteurDTO traiteur;

	

	public PrestationDTO(Integer idPrestation, double prix, CakeDTO cake, RobeDTO robe, SalleDTO salle,
			TraiteurDTO traiteur) {
		super();
		this.idPrestation = idPrestation;
		this.prix = prix;
		this.cake = cake;
		this.robe = robe;
		this.salle = salle;
		this.traiteur = traiteur;
	}


	public SalleDTO getSalle() {
		return salle;
	}


	public void setSalle(SalleDTO salle) {
		this.salle = salle;
	}


	public TraiteurDTO getTraiteur() {
		return traiteur;
	}


	public void setTraiteur(TraiteurDTO traiteur) {
		this.traiteur = traiteur;
	}


	public CakeDTO getCake() {
		return cake;
	}


	public void setCake(CakeDTO cake) {
		this.cake = cake;
	}


	public RobeDTO getRobe() {
		return robe;
	}


	public void setRobe(RobeDTO robe) {
		this.robe = robe;
	}


	public PrestationDTO() {
		
	}


	public Integer getIdPrestation() {
		return idPrestation;
	}

	public void setIdPrestation(Integer idPrestation) {
		this.idPrestation = idPrestation;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}



	
	
	
}