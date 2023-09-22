package classes;

public class Car extends vehicles {
	private int nombrePortes;
	public Car(String band, String model, String registraction,  int nombrePortes) {
		super(band, model, registraction);
		this.nombrePortes = nombrePortes;
	}
	public int getNombrePortes() {
		return nombrePortes;
	}
	public void setNombrePortes(int nombrePortes) {
		this.nombrePortes = nombrePortes;
	}

	

}
