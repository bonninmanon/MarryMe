package model;

public class Musique extends Prestation {
	
	private String specialite;
	private boolean animation;
	
	
	public Musique(double prix, String specialite, boolean animation) {
		super(prix);
		this.specialite = specialite;
		this.animation = animation;
	}


	public String getSpecialite() {
		return specialite;
	}


	public void setSpecialite(String specialite) {
		this.specialite = specialite;
	}


	public boolean isAnimation() {
		return animation;
	}


	public void setAnimation(boolean animation) {
		this.animation = animation;
	}
	
	
	

}
