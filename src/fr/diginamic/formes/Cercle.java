package fr.diginamic.formes;

public class Cercle extends Forme {

	private double rayon;

//	CONSTRUCTOR
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

//	METHODS
	@Override
	public String toString() {
		return "Rayon = " + rayon;
	}
	
	public double calculPeri() {
		return (rayon * 2) * 3.14;
	}
	
	public double calculSurface() {
		return (rayon * rayon) * 3.14; 
	}

	// GETTERS & SETTERS
	/**
	 * @return the rayon
	 */
	public double getRayon() {
		return rayon;
	}

	/**
	 * @param rayon the rayon to set
	 */
	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
}
