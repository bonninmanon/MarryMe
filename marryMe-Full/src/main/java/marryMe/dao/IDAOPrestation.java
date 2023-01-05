package marryMe.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import marryMe.model.Prestation;
import marryMe.model.Robe;



public interface IDAOPrestation extends JpaRepository<Prestation,Integer>{
	
	@Query("SELECT r from Robe r")
	public List<Robe> findAllRobe();
	
	@Query("SELECT r from Robe r where r.id = :id")
	public Optional<Robe> findRobeById(@Param("id") Integer idRobe);
}
