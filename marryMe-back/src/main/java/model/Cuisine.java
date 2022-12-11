package model;

public enum Cuisine {
	Cocktail(5), Repas(8.5) ,AmusesBouches(3.5),CuisineDuMonde(8),Cafe(1);
	
	private double prix;

	private Cuisine(double prix) {
		this.prix = prix;
	}


}
