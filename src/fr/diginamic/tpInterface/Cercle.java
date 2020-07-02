package fr.diginamic.tpInterface;

public class Cercle implements ObjetGeometrique {

	private double rayon;

//	CONSTRUCTOR
	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

//	METHODS
	@Override
	public double perimetre() {
		return (rayon * 2) * 3.14;
	}

	@Override
	public double surface() {
		return (rayon * rayon) * 3.14; 
	}

	@Override
	public String toString() {
		return "Cercle [rayon=" + rayon + "]";
	}

//	GETTERS & SETTERS
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
