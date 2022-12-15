package marryMe.model;

public enum Livraison {
	ADomicile(2),VoiePostal(1);
	
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
