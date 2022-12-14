package marryMe.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="mariage")
public class Mariage extends Prestation {

	private LocalDate date ; 
	private  String  theme ;
	
	@OneToMany(mappedBy = "mariage")
	List<Invite> listeInvites = new ArrayList();
	
	@OneToMany(mappedBy="prestation")
	private Prestation prestation;
	
	@OneToOne
	private Client client;
	
	public Mariage( double prix, LocalDate date, String theme) {
		super( prix);
		this.date = date;
		this.theme = theme;
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



	@Override
	public String toString() {
		return "Mariage [date=" + date + ", theme=" + theme + "]";
	}
	
	


}
