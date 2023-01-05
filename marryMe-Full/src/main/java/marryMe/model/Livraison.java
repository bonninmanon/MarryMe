package marryMe.model;

public enum Livraison {
	ADomicile(4),SurPlace(2);;
	
private int prix;

private Livraison(int prix) {
	this.prix = prix;
}

public int getPrix() {
	return prix;
}

public void setPrix(int prix) {
	this.prix = prix;
}




}
