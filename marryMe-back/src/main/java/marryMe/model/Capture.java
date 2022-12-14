package marryMe.model;

public class Capture extends Prestation {

	private boolean photoBooth ;
	private boolean bestOf ;
	private boolean livreDor ; //livre d'or 
	private boolean miniAlbum ;  // mini album
	
	
	public Capture(double prix, boolean photoBooth, boolean bestOf, boolean livreDor, boolean miniAlbum) {
		super(prix);
		this.photoBooth = photoBooth;
		this.bestOf = bestOf;
		this.livreDor = livreDor;
		this.miniAlbum = miniAlbum;
	}


	public boolean isPhotoBooth() {
		return photoBooth;
	}


	public void setPhotoBooth(boolean photoBooth) {
		this.photoBooth = photoBooth;
	}


	public boolean isBestOf() {
		return bestOf;
	}


	public void setBestOf(boolean bestOf) {
		this.bestOf = bestOf;
	}


	public boolean isLivreDor() {
		return livreDor;
	}


	public void setLivreDor(boolean livreDor) {
		this.livreDor = livreDor;
	}


	public boolean isMiniAlbum() {
		return miniAlbum;
	}


	public void setMiniAlbum(boolean miniAlbum) {
		this.miniAlbum = miniAlbum;
	}
	
	
	
}
