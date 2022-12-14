package marryMe.model;

public class Beaute extends Prestation  {
	
	
	private boolean coiffure ;
	private boolean  makeUp ;
	private Lieu Domicile ;
	private Lieu Salon ;

	




	public Beaute(double prix, boolean coiffure, boolean makeUp, Lieu domicile, Lieu salon) {
		super(prix);
		this.coiffure = coiffure;
		this.makeUp = makeUp;
		Domicile = domicile;
		Salon = salon;
	}






	public boolean isCoiffure() {
		return coiffure;
	}






	public void setCoiffure(boolean coiffure) {
		this.coiffure = coiffure;
	}






	public boolean isMakeUp() {
		return makeUp;
	}






	public void setMakeUp(boolean makeUp) {
		this.makeUp = makeUp;
	}






	public Lieu getDomicile() {
		return Domicile;
	}






	public void setDomicile(Lieu domicile) {
		Domicile = domicile;
	}






	public Lieu getSalon() {
		return Salon;
	}






	public void setSalon(Lieu salon) {
		Salon = salon;
	}



	

}
