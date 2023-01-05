package test;


import java.time.LocalDate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import marryMe.config.ApplicationConfig;
import marryMe.dao.IDAOMariage;
import marryMe.dao.IDAOPrestation;
import marryMe.model.Adresse;
import marryMe.model.Beaute;
import marryMe.model.Cake;
import marryMe.model.Lieu;
import marryMe.model.Mariage;
import marryMe.model.Robe;



public class test {
	

	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		
		
		IDAOPrestation daoPrestation = context.getBean(IDAOPrestation.class);
		IDAOMariage daoMariage = context.getBean(IDAOMariage.class);
		
		
		
		Adresse a = new Adresse("1 bis", "rue de paris", "Paris", "cp");
		Beaute b = new Beaute(1100, false, true, false, true, Lieu.Domicile);
		b.setAdresse(a);
	
		b = daoPrestation.save(b);
		
		Beaute b2 = new Beaute(1500, true, true, false, true, Lieu.Domicile);
		b2.setAdresse(a);
		Cake cake = new Cake(150,"rafaello","vanille");
		Cake cake2 = new Cake(250,"coffe","chocolat");
		Robe robe1 =  new Robe(800, "princesse", 38);
		Robe robe2 =  new Robe(1000, "sirene", 40);
		Robe robe3 =  new Robe(900, "soft", 42);
		
		cake = daoPrestation.save(cake);
		cake2 = daoPrestation.save(cake2);
		robe1 = daoPrestation.save(robe1);
		robe2 = daoPrestation.save(robe2);
		robe3 = daoPrestation.save(robe3);

		b2 = daoPrestation.save(b2);
		
		Mariage m = new Mariage(LocalDate.parse("2022-12-31"),"Clown",null);
		
		Mariage m2 = new Mariage(LocalDate.parse("2022-10-31"),"Pirate",null);
		
		m.getPrestations().add(b);
		m.getPrestations().add(cake);
		m.getPrestations().add(cake2);
		m.getPrestations().add(robe1);
		m.getPrestations().add(robe2);
		m.getPrestations().add(robe3);
		
		
		m2.getPrestations().add(b2);
		m2.getPrestations().add(cake);
		m2.getPrestations().add(cake2);
		m2.getPrestations().add(robe1);
		m.getPrestations().add(robe2);
		m.getPrestations().add(robe3);
		
		
		
		
		m=daoMariage.save(m);
		m2=daoMariage.save(m2);
		
		
		
		context.close();
		
	}

}
