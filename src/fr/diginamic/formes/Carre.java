package fr.diginamic.formes;

public class Carre extends Rectangle {

	private double longueur;
	
	public Carre(double longueur) {
		super(longueur);
		this.longueur = longueur;
	}

	// METHODS

	@Override
	public String toString() {
		return "Carre [longueur=" + longueur + "]";
	}
	
	@Override
	public double calculPeri() {
		return longueur * 4;
	}

	@Override
	public double calculSurface() {
		return longueur * longueur;
	}

//	GETTERS & SETTERS 
	@Override
	public double getLongueur() {
		// TODO Auto-generated method stub
		return super.getLongueur();
	}

	@Override
	public void setLongueur(double longueur) {
		// TODO Auto-generated method stub
		super.setLongueur(longueur);
	}

}
