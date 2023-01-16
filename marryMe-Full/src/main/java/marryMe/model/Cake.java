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
	private int NombreInvite;
	
	
	public Cake () {}

	
	public int getNombreInvite() {
		return NombreInvite;
	}


	public void setNombreInvite(int nombreInvite) {
		NombreInvite = nombreInvite;
	}


	public Cake(double prix, String design, String cremes, String genoise, String ganaches, Boolean alcoolisée,
			int nombreInvite) {
		super(prix);
		this.design = design;
		this.Cremes = cremes;
		this.Genoise = genoise;
		this.Ganaches = ganaches;
		this.alcoolisée = alcoolisée;
		this.NombreInvite = nombreInvite;
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
	};
	
	
	
}
