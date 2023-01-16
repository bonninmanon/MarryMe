package marryMe.web.dto;



public class PrestationDTO {
	
	private Integer idPrestation;
	private double prix;	
	private CakeDTO cake;
	private RobeDTO robe;
	
	


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