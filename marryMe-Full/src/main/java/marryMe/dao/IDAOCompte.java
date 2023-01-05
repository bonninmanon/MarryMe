package marryMe.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import marryMe.model.Compte;

public interface IDAOCompte extends JpaRepository<Compte, Integer>{

	
	public Optional<Compte> findByMailAndMdp(String login,String password);
	/*
	 * 
	 * 
	 * public List<Invite >findAllByDateFilter(LocalDate filter); public List<Invite
	 * > findAllWithStagiaires();
	 */
}
