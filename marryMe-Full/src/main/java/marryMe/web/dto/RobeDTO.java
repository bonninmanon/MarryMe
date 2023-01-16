package marryMe.web.dto;


public class RobeDTO {
	
	private String model ;
	private int taille;
		
		
		public RobeDTO() {
			
		}


		public RobeDTO(String model, int taille) {
			super();
			this.model = model;
			this.taille = taille;
		}


		public String getModel() {
			return model;
		}


		public void setModel(String model) {
			this.model = model;
		}


		public int getTaille() {
			return taille;
		}


		public void setTaille(int taille) {
			this.taille = taille;
		}

	
	}

