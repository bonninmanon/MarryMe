package marryMe.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonView;

@Entity
@Table(name="client")
public class Client extends Compte{
	
	@Embedded
	@JsonView(Views.ViewBase.class)
	@Nullable
	private Adresse adresse;
	
	
	@OneToOne(mappedBy="client")
	@JsonView(Views.ViewClientWithMariage.class)
	private Mariage mariage;

	public Client() {
		// TODO Auto-generated constructor stub
	}


	public Client(String nom, String prenom, String mail, String mdp, Adresse adresse) {
		super(nom, prenom, mail, mdp);
		this.adresse = adresse;
	}









}
