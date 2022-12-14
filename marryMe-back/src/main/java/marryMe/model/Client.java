package marryMe.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="client")
public class Client extends Compte{
	
	@OneToOne
	private Adresse adresse;
	
	
	@OneToOne(mappedBy="client")
	private Mariage mariage;

	public Client() {
		// TODO Auto-generated constructor stub
	}


	public Client(String nom, String prenom, String mail, String mdp, Adresse adresse) {
		super(nom, prenom, mail, mdp);
		this.adresse = adresse;
	}









}
