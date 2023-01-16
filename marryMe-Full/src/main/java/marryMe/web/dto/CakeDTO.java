package marryMe.web.dto;



public class CakeDTO {
	
	private Integer idCake;
	private double prixCake;
	private String design;
	private String Cremes;
	private String Genoise;
	private String Ganaches;
	private Boolean alcoolisée;
		
		
		public CakeDTO() {
			
		}


		public CakeDTO(Integer idCake, double prixCake, String design, String cremes, String genoise, String ganaches,
				Boolean alcoolisée) {
			super();
			this.idCake = idCake;
			this.prixCake = prixCake;
			this.design = design;
			Cremes = cremes;
			Genoise = genoise;
			Ganaches = ganaches;
			this.alcoolisée = alcoolisée;
		}


		public Integer getIdCake() {
			return idCake;
		}


		public void setIdCake(Integer idCake) {
			this.idCake = idCake;
		}


		public double getPrixCake() {
			return prixCake;
		}


		public void setPrixCake(double prixCake) {
			this.prixCake = prixCake;
		}


		public String getDesign() {
			return design;
		}


		public void setDesign(String design) {
			this.design = design;
		}


		public String getCremes() {
			return Cremes;
		}


		public void setCremes(String cremes) {
			Cremes = cremes;
		}


		public String getGenoise() {
			return Genoise;
		}


		public void setGenoise(String genoise) {
			Genoise = genoise;
		}


		public String getGanaches() {
			return Ganaches;
		}


		public void setGanaches(String ganaches) {
			Ganaches = ganaches;
		}


		public Boolean getAlcoolisée() {
			return alcoolisée;
		}


		public void setAlcoolisée(Boolean alcoolisée) {
			this.alcoolisée = alcoolisée;
		}


	
	}

