package fr.diginamic.formes;

public class Rectangle extends Forme {

	private double longueur;
	private double largeur;

//	CONSTRUCTOR
	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}
	
	 public Rectangle(double longueur) {
		this.longueur = longueur;
	}

//	METHODS
	@Override
	public String toString() {
		return "Longueur = " + longueur + "cm , Largeur = " + largeur + "cm";
	}
	
	public double calculPeri() {
		return (longueur + largeur) * 2;
	}
	
	public double calculSurface() {
		return longueur * largeur;
	}

	// GETTERS & SETTERS
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
