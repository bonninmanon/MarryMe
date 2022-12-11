package model;

public class Cadeau  extends Prestation {

	private  boolean dragées  ;
	private boolean fleursSeche ;
	private boolean miniBougies;
	private boolean cubeSurprise  ;
	
	
	



	public Cadeau(double prix, boolean dragées, boolean fleurs_seche, boolean mini_bougies, boolean cube_surprise) {
		super(prix);
		this.dragées = dragées;
		this.fleursSeche = fleurs_seche;
		this.miniBougies = mini_bougies;
		this.cubeSurprise = cube_surprise;
	}



	public boolean isDragées() {
		return dragées;
	}



	public void setDragées(boolean dragées) {
		this.dragées = dragées;
	}



	public boolean isFleurs_seche() {
		return fleursSeche;
	}



	public void setFleurs_seche(boolean fleurs_seche) {
		this.fleursSeche = fleurs_seche;
	}



	public boolean isMini_bougies() {
		return miniBougies;
	}



	public void setMini_bougies(boolean mini_bougies) {
		this.miniBougies = mini_bougies;
	}



	public boolean isCube_surprise() {
		return cubeSurprise;
	}



	public void setCube_surprise(boolean cube_surprise) {
		this.cubeSurprise = cube_surprise;
	}
	
	
	
	
	
}
	
	