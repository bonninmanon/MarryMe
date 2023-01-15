package marryMe.web.dto;

import java.util.List;

public class PrestationDTO {
	
	private Integer idPrestation;
	private double prix;	
	private List<CakeDTO> cakes;
	
	
	public PrestationDTO() {
		
	}

	public PrestationDTO(Integer idPrestation, double prix, List<CakeDTO> cakes) {
		super();
		this.idPrestation = idPrestation;
		this.prix = prix;
		this.cakes = cakes;
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

	public List<CakeDTO> getCakes() {
		return cakes;
	}

	public void setCakes(List<CakeDTO> cakes) {
		this.cakes = cakes;
	}

	
	
	
}