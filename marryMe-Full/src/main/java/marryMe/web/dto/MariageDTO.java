package marryMe.web.dto;

import java.time.LocalDate;
import java.util.List;

public class MariageDTO {
	
	private Integer idMariage;
	private LocalDate date ;	
	private String  theme;
	private List<PrestationDTO> prestations;
	
	public MariageDTO() {
		
	}

	public MariageDTO(Integer idMariage, LocalDate date, String theme, List<PrestationDTO> prestations) {
		super();
		this.idMariage = idMariage;
		this.date = date;
		this.theme = theme;
		this.prestations = prestations;
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

	
	
	
	

}
