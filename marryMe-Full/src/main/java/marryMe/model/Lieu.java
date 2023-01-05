package marryMe.model;

public enum Lieu {
	Domicile(600), Salon(520) ;
	
	private int  prix ;

	private Lieu(int prix) {
		this.prix = prix;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}



}