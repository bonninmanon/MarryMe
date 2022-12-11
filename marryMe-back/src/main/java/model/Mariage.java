package model;

import java.time.LocalDate;

public class Mariage extends Prestation {
	
	private LocalDate date ; 
	private  String  theme ;
	 
	 
	 
	public Mariage(double prix, LocalDate date, String theme) {
		super(prix);
		this.date = date;
		this.theme = theme;
	}





	public LocalDate getDate() {
		return date;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}



	public String getTheme() {
		return theme;
	}



	public void setTheme(String theme) {
		this.theme = theme;
	}





	@Override
	public String toString() {
		return "Mariage [date=" + date + ", theme=" + theme + "]";
	}



	 
	 
	 


}
