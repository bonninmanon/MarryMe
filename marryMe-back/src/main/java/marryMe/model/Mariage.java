package marryMe.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
public class Mariage  {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private LocalDate date ; 
	private  String  theme ;
	
	@OneToMany(mappedBy = "mariage")
	List<Invite> listeInvites = new ArrayList();
	
	@ManyToMany
	private List<Prestation> prestations=new ArrayList();
	
	@OneToOne
	private Client client;
	
	public Mariage( LocalDate date, String theme,Client client) {
		
		this.date = date;
		this.theme = theme;
		this.client=client;
	}
	 
	 

	public Mariage() {
		// TODO Auto-generated constructor stub
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
