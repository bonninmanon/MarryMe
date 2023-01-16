package marryMe.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;


@Entity
@Table(name="cake")
public class Cake extends Prestation {
	
	@JsonView(Views.ViewBase.class)
	private String design ;
	@JsonView(Views.ViewBase.class)
	private String Cremes;
	@JsonView(Views.ViewBase.class)
	private String Genoise;
	@JsonView(Views.ViewBase.class)
	private String Ganaches;
	@JsonView(Views.ViewBase.class)
	private Boolean alcoolisée;
	@JsonView(Views.ViewBase.class)
	private String NombreInvite;
	
	
	public Cake () {}


	public Cake(double prix, String design, String cremes, String genoise, String ganaches, Boolean alcoolisée,
			String nombreInvite) {
		super(prix);
		this.design = design;
		Cremes = cremes;
		Genoise = genoise;
		Ganaches = ganaches;
		this.alcoolisée = alcoolisée;
		NombreInvite = nombreInvite;
	}


	public String getDesign() {
		return design;
	}


	public void setDesign(String design) {
		this.design = design;
	}


	public String getCremes() {
		return Cremes;
	}


	public void setCremes(String cremes) {
		Cremes = cremes;
	}


	public String getGenoise() {
		return Genoise;
	}


	public void setGenoise(String genoise) {
		Genoise = genoise;
	}


	public String getGanaches() {
		return Ganaches;
	}


	public void setGanaches(String ganaches) {
		Ganaches = ganaches;
	}


	public Boolean getAlcoolisée() {
		return alcoolisée;
	}


	public void setAlcoolisée(Boolean alcoolisée) {
		this.alcoolisée = alcoolisée;
	}


	public String getNombreInvite() {
		return NombreInvite;
	}


	public void setNombreInvite(String nombreInvite) {
		NombreInvite = nombreInvite;
	}
	
	

	
	
	
	
}
