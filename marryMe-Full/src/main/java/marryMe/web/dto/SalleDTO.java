package marryMe.web.dto;
import marryMe.model.Adresse;


public class SalleDTO {
	
	private String  nom ;
	private int  capacite;
    private  boolean  debout ;
    private Adresse adresse;
    
    public SalleDTO() {
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
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

	public boolean isDebout() {
		return debout;
	}

	public void setDebout(boolean debout) {
		this.debout = debout;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public SalleDTO(String nom, int capacite, boolean debout, Adresse adresse) {
		super();
		this.nom = nom;
		this.capacite = capacite;
		this.debout = debout;
		this.adresse = adresse;
	}

	@Override
	public String toString() {
		return "salleDTO [nom=" + nom + ", capacite=" + capacite + ", debout=" + debout + ", adresse=" + adresse + "]";
	}
    
	

}
