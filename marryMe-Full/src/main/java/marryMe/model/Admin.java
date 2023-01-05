package marryMe.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("admin")
public class Admin extends Compte {
	
	
	
	public Admin() {
	}

	public Admin(String nom, String prenom, String mail, String mdp) {
		super(nom, prenom, mail, mdp);
	}

}
