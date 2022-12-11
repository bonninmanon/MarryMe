package model;

public enum Lieu {
	Domicile(600), Salon(520) ;
	
	private int  prix ;

	private Lieu(int prix) {
		this.prix = prix;
	}



}