package marryMe.model;

public class Cake extends Prestation {
	

	private String design ;
	private String saveur;
	
	public Cake(double prix) {
		super(prix);
	}

	public String getDesign() {
		return design;
	}

	public void setDesign(String design) {
		this.design = design;
	}

	public String getSaveur() {
		return saveur;
	}

	public void setSaveur(String saveur) {
		this.saveur = saveur;
	}
	
	
	
	
}
