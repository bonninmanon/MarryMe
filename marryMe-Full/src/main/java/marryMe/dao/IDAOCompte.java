package marryMe.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import marryMe.model.Compte;

public interface IDAOCompte extends JpaRepository<Compte,Integer>{
	@Query("Select c from Compte c where c.mail = :mail and c.mdp = :mdp")
	

	Optional<Compte> findByLoginAndPassword(String mail, String mdp);

}
