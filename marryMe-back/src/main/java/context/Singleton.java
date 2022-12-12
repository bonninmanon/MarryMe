package context;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.DAOInvite;
import dao.IDAOInvite;


public class Singleton {

	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("quest");
	
	private IDAOInvite daoInvite = new DAOInvite();
	
	
	private static Singleton instance;
	
	
	private Singleton() {}

	
	public static Singleton getInstance() {
		if(instance==null) 
		{
			instance=new Singleton();
		}
		return instance;
	}


	public IDAOInvite getDaoFiliere() {
		return daoInvite;
	}


	public void setDaoFiliere(IDAOInvite daoInvite) {
		this.daoInvite = daoInvite;
	}


	public static void setInstance(Singleton instance) {
		Singleton.instance = instance;
	}


	public EntityManagerFactory getEmf() {
		return emf;
	}


	public void setEmf(EntityManagerFactory emf) {
		this.emf = emf;
	}


	
	
}
