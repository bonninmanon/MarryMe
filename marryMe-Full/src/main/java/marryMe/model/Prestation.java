package marryMe.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonView;


@Entity
@Table(name="prestation")
@Inheritance(strategy = InheritanceType.JOINED)
public class Prestation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	protected double  prix ;
	
	@ManyToMany(mappedBy = "prestations")
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
