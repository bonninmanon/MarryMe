package marryMe.model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class Admin extends Compte{

	
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(String nom, String prenom, String mail, String mdp) {
		super(nom, prenom, mail, mdp);
		// TODO Auto-generated constructor stub
	}


	

}
