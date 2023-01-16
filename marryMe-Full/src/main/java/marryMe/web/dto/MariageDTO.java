package marryMe.web.dto;

import java.time.LocalDate;
import java.util.List;


public class MariageDTO {
	
	private Integer idMariage;
	private LocalDate date ;	
	private String  theme;
	//private SalleDTO salles;
	//private CakeDTO cakes;
	//private SalleDTO robes;
	//private SalleDTO traiteurs;
	
	private List<RobeDTO> robes;
	private List<CakeDTO> cakes;
	private List<SalleDTO> salles;
	private List<TraiteurDTO> traiteurs;

	public MariageDTO() {
		
	}
	
	

	public List<TraiteurDTO> getTraiteurs() {
		return traiteurs;
	}



	public void setTraiteurs(List<TraiteurDTO> traiteurs) {
		this.traiteurs = traiteurs;
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

	public List<RobeDTO> getRobes() {
		return robes;
	}

	public void setRobes(List<RobeDTO> robes) {
		this.robes = robes;
	}

	public List<CakeDTO> getCakes() {
		return cakes;
	}

	public void setCakes(List<CakeDTO> cakes) {
		this.cakes = cakes;
	}

	public List<SalleDTO> getSalles() {
		return salles;
	}

	public void setSalles(List<SalleDTO> salles) {
		this.salles = salles;
	}

	public MariageDTO(Integer idMariage, LocalDate date, String theme, List<RobeDTO> robes, List<CakeDTO> cakes,
			List<SalleDTO> salles) {
		super();
		this.idMariage = idMariage;
		this.date = date;
		this.theme = theme;
		this.robes = robes;
		this.cakes = cakes;
		this.salles = salles;
	}
	
	

	
	
	
	

}
