package fr.diginamic.salaire;

public class Salarie extends Intervenant {

	private double montantSalaire;

	public Salarie(String nom, String prenom, double montantSalaire) {
		super(nom, prenom);
		this.montantSalaire = montantSalaire;
	}

//	METHODS
	@Override
	public String toString() {
		return "Montant du salaire --> " + montantSalaire + "\r Satus --> Salarié";
	}

	@Override
	public double getSalaire() {
		return montantSalaire;
	}

	@Override
	public String afficherDonnees() {
		return super.toString() + " " + toString();
	}

	// GETTERS & SETTERS
	/**
	 * @return the montantSalaire
	 */
	public double getMontantSalaire() {
		return montantSalaire;
	}

	/**
	 * @param montantSalaire the montantSalaire to set
	 */
	public void setMontantSalaire(double montantSalaire) {
		this.montantSalaire = montantSalaire;
	}

}
