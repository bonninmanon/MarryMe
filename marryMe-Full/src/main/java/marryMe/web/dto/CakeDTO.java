package marryMe.web.dto;



public class CakeDTO {
	
	private Integer idCake;
	private double prixCake;
	private String design;
	private String Cremes;
	private String Genoise;
	private String Ganaches;
	private Boolean alcoolisee;
	private String NombreInvite;
	
		


		public CakeDTO() {
			
		}


		public CakeDTO(Integer idCake, double prixCake, String design, String cremes, String genoise, String ganaches,
				Boolean alcoolisee, String nombreInvite) {
			super();
			this.idCake = idCake;
			this.prixCake = prixCake;
			this.design = design;
			Cremes = cremes;
			Genoise = genoise;
			Ganaches = ganaches;
			this.alcoolisee = alcoolisee;
			NombreInvite = nombreInvite;
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


	


		public Boolean getAlcoolisee() {
			return alcoolisee;
		}


		public void setAlcoolisee(Boolean alcoolisee) {
			this.alcoolisee = alcoolisee;
		}


		public String getNombreInvite() {
			return NombreInvite;
		}


		public void setNombreInvite(String nombreInvite) {
			NombreInvite = nombreInvite;
		}


		


	
	}

