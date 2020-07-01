package fr.diginamic.salaire;

public class Pigiste extends Intervenant {

	private double nbJour;
	private double salaireJour;

	public Pigiste(String nom, String prenom, double nbJour, double salaireJour) {
		super(nom, prenom);
		this.nbJour = nbJour;
		this.salaireJour = salaireJour;
	}

//	METHODS
	@Override
	public String toString() {
		return "Montant du salaire --> " + getSalaire() + "\r Satus --> Pigiste";
	}

	@Override
	public double getSalaire() {
		return salaireJour * nbJour;
	}

	@Override
	public String afficherDonnees() {
		return super.toString() + " " + toString();
	}

	// GETTERS & SETTERS
	/**
	 * @return the nbJour
	 */
	public double getNbJour() {
		return nbJour;
	}

	/**
	 * @param nbJour the nbJour to set
	 */
	public void setNbJour(double nbJour) {
		this.nbJour = nbJour;
	}

	/**
	 * @return the salaireJour
	 */
	public double getSalaireJour() {
		return salaireJour;
	}

	/**
	 * @param salaireJour the salaireJour to set
	 */
	public void setSalaireJour(double salaireJour) {
		this.salaireJour = salaireJour;
	}

}
