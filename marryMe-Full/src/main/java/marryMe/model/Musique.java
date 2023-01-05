package marryMe.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table(name="musique")
public class Musique extends Prestation {
	
	@JsonView(Views.ViewBase.class)
	private String specialite;
	@JsonView(Views.ViewBase.class)
	private boolean animation;
	
	public Musique( double prix, String specialite, boolean animation) {
		super( prix);
		this.specialite = specialite;
		this.animation = animation;
	}
	
	
 public Musique() {
	// TODO Auto-generated constructor stub
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


@Override
public String toString() {
	return "Musique [specialite=" + specialite + ", animation=" + animation + "]";
}
 
 
	
	

}
