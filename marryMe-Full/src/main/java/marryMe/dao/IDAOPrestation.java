package marryMe.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import marryMe.model.Beaute;
import marryMe.model.Cake;


import marryMe.model.Prestation;
import marryMe.model.Robe;
import marryMe.model.Salle;
import marryMe.model.Traiteur;



public interface IDAOPrestation extends JpaRepository<Prestation,Integer>{
	
	@Query("SELECT r from Robe r")
	public List<Robe> findAllRobe();
	
	@Query("SELECT r from Robe r where r.id = :id")
	public Optional<Robe> findRobeById(@Param("id") Integer idRobe);
	
	@Query("SELECT c from Cake c")
	public List<Cake> findAllCake();
	
	@Query("SELECT c from Cake c where c.id = :id")
	public Optional<Cake> findCakeById(@Param("id") Integer idCake);
	
	@Query("SELECT b from Beaute b")
	public List<Beaute> findAllBeaute();
	
	@Query("SELECT b from Beaute b where b.id = :id")
	public Optional<Beaute> findBeauteById(@Param("id") Integer idBeaute);
	
		
	@Query("SELECT s from Salle s")
	public List<Salle> findAllSalle();
	
	@Query("SELECT s from Salle s where s.id = :id")
	public Optional<Salle> findSalleById(@Param("id") Integer idSalle);
	
	@Query("SELECT t from Traiteur t")
	public List<Traiteur> findAllTraiteur();
	
	@Query("SELECT t from Traiteur t where t.id = :id")
	public Optional<Traiteur> findTraiteurById(@Param("id") Integer idTraiteur);
	

	@Query("SELECT p from Prestation p left join p.mariages m where m.id = :id")
	public List<Prestation> findAllByMariage(@Param("id")Integer idMariage);

	@Query("SELECT r from Robe r left join r.mariages m where m.id = :id")
	public List<Robe> findAllRobeByMariage(@Param("id")Integer idMariage);

	
	


	
}


