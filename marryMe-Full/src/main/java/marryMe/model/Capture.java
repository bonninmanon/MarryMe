package marryMe.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table(name="capture")
public class Capture extends Prestation {

	@JsonView(Views.ViewBase.class)
	private boolean photoShoot ;
	@JsonView(Views.ViewBase.class)
	private boolean bestOf ;
	@JsonView(Views.ViewBase.class)
	private boolean livreDor ; //livre d'or 
	@JsonView(Views.ViewBase.class)
	private boolean miniAlbum ;  // mini album
	
	@JsonView(Views.ViewBase.class)
	private int qtLivreDor;
	
	@JsonView(Views.ViewBase.class)
	private int qtAlbum;
	

	
	public Capture(double prix, boolean photoShoot, boolean bestOf, boolean livreDor, boolean miniAlbum, int qtLivreDor,
			int qtAlbum) {
		super(prix);
		this.photoShoot = photoShoot;
		this.bestOf = bestOf;
		this.livreDor = livreDor;
		this.miniAlbum = miniAlbum;
		this.qtLivreDor = qtLivreDor;
		this.qtAlbum = qtAlbum;
	}

	public Capture() {
		// TODO Auto-generated constructor stub
	}

	
	public int getQtLivreDor() {
		return qtLivreDor;
	}

	public void setQtLivreDor(int qtLivreDor) {
		this.qtLivreDor = qtLivreDor;
	}

	public int getQtAlbum() {
		return qtAlbum;
	}

	public void setQtAlbum(int qtAlbum) {
		this.qtAlbum = qtAlbum;
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
				+ miniAlbum + ", qtLivreDor=" + qtLivreDor + ", qtAlbum=" + qtAlbum + "]";
	}


	
	

}
