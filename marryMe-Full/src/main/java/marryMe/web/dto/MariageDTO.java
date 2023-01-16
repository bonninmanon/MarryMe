package marryMe.web.dto;

import java.time.LocalDate;
import java.util.List;


public class MariageDTO {
	
	private Integer idMariage;
	private LocalDate date ;	
	private String  theme;
	private List<PrestationDTO> prestations;
	private RobeDTO robes;
	private SalleDTO salles;
	private CakeDTO cakes;
	
	


	public MariageDTO() {
		
	}




	public MariageDTO(Integer idMariage, LocalDate date, String theme, List<PrestationDTO> prestations, RobeDTO robes,
			SalleDTO salles, CakeDTO cakes) {
		super();
		this.idMariage = idMariage;
		this.date = date;
		this.theme = theme;
		this.prestations = prestations;
		this.robes = robes;
		this.salles = salles;
		this.cakes = cakes;
	}




	public Integer getIdMariage() {
		return idMariage;
	}




	public void setIdMariage(Integer idMariage) {
		this.idMariage = idMariage;
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




	public List<PrestationDTO> getPrestations() {
		return prestations;
	}




	public void setPrestations(List<PrestationDTO> prestations) {
		this.prestations = prestations;
	}




	public RobeDTO getRobes() {
		return robes;
	}




	public void setRobes(RobeDTO robes) {
		this.robes = robes;
	}




	public SalleDTO getSalles() {
		return salles;
	}




	public void setSalles(SalleDTO salles) {
		this.salles = salles;
	}




	public CakeDTO getCakes() {
		return cakes;
	}




	public void setCakes(CakeDTO cakes) {
		this.cakes = cakes;
	}




	
	
	
	

}
