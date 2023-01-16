package marryMe.web.dto;

public class RobeDTO {

	private Integer idRobe;
	private Integer prixRobe;
	private String model ;
	private String taille;
	
	public RobeDTO() {
		// TODO Auto-generated constructor stub
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

	public RobeDTO(String model, String taille) {
		super();
		this.model = model;
		this.taille = taille;
	}

	@Override
	public String toString() {
		return "RobeDTO [model=" + model + ", taille=" + taille + "]";
	}
	
	

	
}
