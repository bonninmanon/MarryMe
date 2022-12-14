package marryMe.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import marryMe.model.Invite;

public interface IDAOInvite extends JpaRepository<Invite,Integer>{

}
