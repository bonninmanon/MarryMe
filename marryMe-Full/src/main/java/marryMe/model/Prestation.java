package marryMe.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;


import com.fasterxml.jackson.annotation.JsonView;

import marryMe.model.Views.ViewBase;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Prestation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@JsonView(ViewBase.class)
	private Integer id;
	@JsonView(ViewBase.class)
	protected double  prix ;
	
	@ManyToMany(mappedBy = "prestations")
	@JsonView(Views.ViewPrestationWithMariages.class)
	private List<Mariage> mariages;
	
	public Prestation( double prix) {
		this.prix = prix;
	}

	public Prestation() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	
	public List<Mariage> getMariages() {
		return mariages;
	}

	public void setMariages(List<Mariage> mariages) {
		this.mariages = mariages;
	}

	@Override
	public String toString() {
		return "Prestation [id=" + id + ", prix=" + prix + "]";
	}
	
	
	
	
	
	
}
