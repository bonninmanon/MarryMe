package marryMe.web.dto;

public class RobeDTO {

	private Integer idRobe;
	private double prixRobe;
	private String model ;
	private String taille;

	
	public RobeDTO() {
		// TODO Auto-generated constructor stub
	}
	

	public Integer getIdRobe() {
		return idRobe;
	}



	public void setIdRobe(Integer idRobe) {
		this.idRobe = idRobe;
	}



	public double getPrixRobe() {
		return prixRobe;
	}



	public void setPrixRobe(double prixRobe) {
		this.prixRobe = prixRobe;
	}



	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getTaille() {
		return taille;
	}

	public void setTaille(String taille) {
		this.taille = taille;
	}



	



	public RobeDTO(Integer idRobe, double prixRobe, String model, String taille) {
		super();
		this.idRobe = idRobe;
		this.prixRobe = prixRobe;
		this.model = model;
		this.taille = taille;
	}




	@Override
	public String toString() {
		return "RobeDTO [model=" + ", taille=" + taille + "]";
	}
	
	

	
}
