package marryMe.dao;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import marryMe.model.Client;
import marryMe.model.Compte;
import marryMe.model.Mariage;


public interface IDAOMariage extends JpaRepository<Mariage,Integer>{
	
	@Query("Select m from Mariage m where m.client.id = :id")
	

	Optional<Mariage> findByIdClient(int id);


}
