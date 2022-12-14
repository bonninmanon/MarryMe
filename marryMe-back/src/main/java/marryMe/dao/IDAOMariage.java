package marryMe.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import marryMe.model.Mariage;

public interface IDAOMariage extends JpaRepository<Mariage,Integer>{

}
