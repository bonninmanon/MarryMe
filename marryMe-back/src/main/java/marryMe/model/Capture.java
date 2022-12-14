package marryMe.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="capture")
public class Capture extends Prestation {


	private boolean photoShoot ;
	private boolean bestOf ;
	private boolean livreDor ; //livre d'or 
	private boolean miniAlbum ;  // mini album
	
	public Capture( double prix, boolean photoShoot, boolean bestOf, boolean livreDor, boolean miniAlbum) {
		super(prix);
		this.photoShoot = photoShoot;
		this.bestOf = bestOf;
		this.livreDor = livreDor;
		this.miniAlbum = miniAlbum;
	}
	
	public Capture() {
		// TODO Auto-generated constructor stub
	}

	public boolean isPhotoShoot() {
		return photoShoot;
	}

	public void setPhotoShoot(boolean photoShoot) {
		this.photoShoot = photoShoot;
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

	@Override
	public String toString() {
		return "Capture [photoShoot=" + photoShoot + ", bestOf=" + bestOf + ", livreDor=" + livreDor + ", miniAlbum="
				+ miniAlbum + "]";
	}
	
	

}
