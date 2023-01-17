package marryMe.web.dto;



public class CakeDTO {
	
	private Integer idCake;
	private double prixCake;
	private String design;
	private String cremes;
	private String genoise;
	private String ganaches;
	private Boolean alcoolisee;
	private String nombreInvite;
	
		


		public CakeDTO() {
			
		}




		public CakeDTO(Integer idCake, double prixCake, String design, String cremes, String genoise, String ganaches,
				Boolean alcoolisee, String nombreInvite) {
			super();
			this.idCake = idCake;
			this.prixCake = prixCake;
			this.design = design;
			this.cremes = cremes;
			this.genoise = genoise;
			this.ganaches = ganaches;
			this.alcoolisee = alcoolisee;
			this.nombreInvite = nombreInvite;
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
			return cremes;
		}




		public void setCremes(String cremes) {
			this.cremes = cremes;
		}




		public String getGenoise() {
			return genoise;
		}




		public void setGenoise(String genoise) {
			this.genoise = genoise;
		}




		public String getGanaches() {
			return ganaches;
		}




		public void setGanaches(String ganaches) {
			this.ganaches = ganaches;
		}




		public Boolean getAlcoolisee() {
			return alcoolisee;
		}




		public void setAlcoolisee(Boolean alcoolisee) {
			this.alcoolisee = alcoolisee;
		}




		public String getNombreInvite() {
			return nombreInvite;
		}




		public void setNombreInvite(String nombreInvite) {
			this.nombreInvite = nombreInvite;
		}







	
	}

