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
	private String cremes;
	@JsonView(Views.ViewBase.class)
	private String genoise;
	@JsonView(Views.ViewBase.class)
	private String ganaches;
	@JsonView(Views.ViewBase.class)
	private Boolean alcoolisee;
	@JsonView(Views.ViewBase.class)
	private String nombreInvite;
	
	
	public Cake () {}


	public Cake(double prix, String design, String cremes, String genoise, String ganaches, Boolean alcoolisee,
			String nombreInvite) {
		super(prix);
		this.design = design;
		this.cremes = cremes;
		this.genoise = genoise;
		this.ganaches = ganaches;
		this.alcoolisee = alcoolisee;
		this.nombreInvite = nombreInvite;
	}


	public String getDesign() {
		return design;
	}


	public void setDesign(String design) {
		this.design = design;
	}


	public String getCremes() {
		return cremes;
	}


	public void setCremes(String cremes) {
		this.cremes = cremes;
	}


	public String getGenoise() {
		return genoise;
	}


	public void setGenoise(String genoise) {
		this.genoise = genoise;
	}


	public String getGanaches() {
		return ganaches;
	}


	public void setGanaches(String ganaches) {
		this.ganaches = ganaches;
	}


	public Boolean getAlcoolisee() {
		return alcoolisee;
	}


	public void setAlcoolisee(Boolean alcoolisee) {
		this.alcoolisee = alcoolisee;
	}


	public String getNombreInvite() {
		return nombreInvite;
	}


	public void setNombreInvite(String nombreInvite) {
		this.nombreInvite = nombreInvite;
	}


	
	
	
	
}
