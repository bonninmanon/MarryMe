package marryMe.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import marryMe.model.Cake;

public interface IDAOCake extends JpaRepository<Cake,Integer>{

}
