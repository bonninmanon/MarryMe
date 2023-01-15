package marryMe.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonView;

import marryMe.model.Views.ViewBase;


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Mariage  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@JsonView(ViewBase.class)
	private Integer id;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@NotNull(message = "La date de fin est obligatoire")
	@JsonView(ViewBase.class)
	private LocalDate date ; 
	@Column(length = 25, nullable = false)
	@JsonView(ViewBase.class)
	private  String  theme ;
	
	@OneToMany(mappedBy = "mariage")
	@JsonView(Views.ViewMariageWithInvites.class)
	List<Invite> listeInvites = new ArrayList<>();
	
	@ManyToMany
	@JsonView(Views.ViewMariageWithPrestations.class)
	private List<Prestation> prestations=new ArrayList<>();
	
	@OneToOne
	@JsonView(Views.ViewMariageWithClient.class)
	private Client client;
	
	public Mariage( LocalDate date, String theme,Client client) {
		
		this.date = date;
		this.theme = theme;
		this.client=client;
	}
	 
	 

	public Mariage() {
		
	}



	public LocalDate getDate() {
		return date;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}



	public String getTheme() {
		return theme;
	}



	public void setTheme(String theme) {
		this.theme = theme;
	}

	


	public List<Invite> getListeInvites() {
		return listeInvites;
	}



	public void setListeInvites(List<Invite> listeInvites) {
		this.listeInvites = listeInvites;
	}



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public List<Prestation> getPrestations() {
		return prestations;
	}



	public void setPrestations(List<Prestation> prestations) {
		this.prestations = prestations;
	}



	public Client getClient() {
		return client;
	}



	public void setClient(Client client) {
		this.client = client;
	}



	@Override
	public String toString() {
		return "Mariage [date=" + date + ", theme=" + theme + "]";
	}
	
	


}
