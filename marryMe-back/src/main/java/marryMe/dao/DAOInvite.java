package dao;

import java.util.List;

import javax.persistence.EntityManager;

import context.Singleton;
import model.Invite;

public class DAOInvite implements IDAOInvite {

	@Override
	public Invite findById(Integer id) {
		EntityManager em = Singleton.getInstance().getEmf().createEntityManager();
		Invite Invite = em.find(Invite.class, id);
		em.close();
		return Invite;
	}

	@Override
	public List<Invite> findAll() {
		EntityManager em = Singleton.getInstance().getEmf().createEntityManager();
		List<Invite> Invites = em.createQuery("from Invite").getResultList();
		em.close();
		return Invites;
	}

	@Override
	public Invite save(Invite f) {
		EntityManager em = Singleton.getInstance().getEmf().createEntityManager();
		try 
		{
			em.getTransaction().begin();
			f=em.merge(f);
			em.getTransaction().commit();
		}
		catch(Exception e){e.printStackTrace();}
		em.close();
		return f;
	}

	@Override
	public void delete(Invite f) {
	
		EntityManager em = Singleton.getInstance().getEmf().createEntityManager();
		try 
		{
			em.getTransaction().begin();
			f=em.merge(f);
			em.remove(f);
			em.getTransaction().commit();
		}
		catch(Exception e){e.printStackTrace();}
		em.close();
	}

	/*
	 * @Override public List<Invite> findAllByDateFilter(LocalDate filter) {
	 * EntityManager em = Singleton.getInstance().getEmf().createEntityManager();
	 * List<Invite> Invites = em.
	 * createQuery("SELECT distinct f from Invite f  left join fetch f.stagiaires where :filter BETWEEN f.debut and f.fin"
	 * ).setParameter("filter", filter).getResultList(); em.close(); return Invites;
	 * }
	 * 
	 * 
	 * @Override public List<Invite> findAllWithStagiaires() { EntityManager em =
	 * Singleton.getInstance().getEmf().createEntityManager(); List<Invite> Invites
	 * =
	 * em.createQuery("SELECT distinct f from Invite f left join fetch f.stagiaires"
	 * ).getResultList(); em.close(); return Invites; }
	 */

}

