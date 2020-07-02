package fr.diginamic.tpInterface;

public class Rectangle implements ObjetGeometrique {

	
	private double longueur;
	private double largeur;
	
//	CONSTRUCTOR
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
//	METHODS
	@Override
	public double perimetre() {
		return (longueur + largeur) * 2;
	}

	@Override
	public double surface() {
		return longueur * largeur;
	}

	@Override
	public String toString() {
		return "Rectangle [longueur=" + longueur + ", largeur=" + largeur + "]";
	}

//	GETTERS & SETTERS
	/**
	 * @return the longueur
	 */
	public double getLongueur() {
		return longueur;
	}

	/**
	 * @param longueur the longueur to set
	 */
	public void setLongueur(double longueur) {
		this.longueur = longueur;
	}

	/**
	 * @return the largeur
	 */
	public double getLargeur() {
		return largeur;
	}

	/**
	 * @param largeur the largeur to set
	 */
	public void setLargeur(double largeur) {
		this.largeur = largeur;
	}

}
