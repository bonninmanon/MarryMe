package marryMe.web.dto;
import marryMe.model.Adresse;


public class SalleDTO {
	
	private Integer idSalle;
	private double prixSalle;
	private String  nom ;
	private int  capacite;

    
    public SalleDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}
	
	

	public Integer getIdSalle() {
		return idSalle;
	}

	public void setIdSalle(Integer idSalle) {
		this.idSalle = idSalle;
	}

	public double getPrixSalle() {
		return prixSalle;
	}

	public void setPrixSalle(double prixSalle) {
		this.prixSalle = prixSalle;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getCapacite() {
		return capacite;
	}

	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}



	public SalleDTO(Integer idSalle, double prixSalle, String nom, int capacite) {
		super();
		this.idSalle = idSalle;
		this.prixSalle = prixSalle;
		this.nom = nom;
		this.capacite = capacite;

	}



	

}
