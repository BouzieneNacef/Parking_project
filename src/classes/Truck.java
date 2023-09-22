package classes;

public class Truck extends vehicles {
	private boolean remorque;
	public Truck(String band, String model, String registraction, boolean remorque) {
		super(band, model, registraction);
		this.remorque = remorque;
	
	}
	public boolean isRemorque() {
		return remorque;
	}
	public void setRemorque(boolean remorque) {
		this.remorque = remorque;
	}

	

}
