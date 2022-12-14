package marryMe.dao;

import org.springframework.data.jpa.repository.JpaRepository;


import marryMe.model.Compte;

public interface IDAOCompte extends JpaRepository<Compte,Integer>{

}
