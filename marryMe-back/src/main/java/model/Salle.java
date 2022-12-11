package model;

public class Salle extends Prestation{

	private String  nom ;
     private int  capacite;
    private  boolean  debout ;
    
    



	public Salle(double prix, String nom, int capacite, boolean debout) {
		super(prix);
		this.nom = nom;
		this.capacite = capacite;
		this.debout = debout;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public int getCapacite() {
		return capacite;
	}


	public void setCapacite(int capacite) {
		this.capacite = capacite;
	}


	public boolean isDebout() {
		return debout;
	}


	public void setDebout(boolean debout) {
		this.debout = debout;
	}


	@Override
	public String toString() {
		return "Salle [nom=" + nom + ", capacite=" + capacite + ", debout=" + debout + "]";
	}
    
    
     
     
	
	
}
