package classes;

public class Moto extends vehicles {
	
	private int vitesseMax;
	public Moto(String band, String model, String registraction, int vitesseMax) {
		super(band, model, registraction);
		this.vitesseMax = vitesseMax;
		
	}
	public int getVitesseMax() {
		return vitesseMax;
	}
	public void setVitesseMax(int vitesseMax) {
		this.vitesseMax = vitesseMax;
	}

	

}
