package classes;

public abstract class vehicles {
	protected String band;
	protected String model;
	protected String registraction;
	
	
	public vehicles(String band, String model,
			String registraction){
		this.band = band;
		this.model = model;
		this.registraction = registraction;
	}
	
	
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getRegistraction() {
		return registraction;
	}
	public void setRegistraction(String registraction) {
		this.registraction = registraction;
	}

}
