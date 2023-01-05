package marryMe.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("client")
public class Client extends Compte{
	
	
	public Client() {
		// TODO Auto-generated constructor stub
	}

	public Client(String nom, String prenom, String mail, String mdp) {
		super(nom, prenom, mail, mdp);
		// TODO Auto-generated constructor stub
	}

}
