package fr.diginamic.banque.entites;

public class Compte {

	private String numCompte;
	private double soldeCompte;

//	CONSTRUTOR
	public Compte(String numCompte, double soldeCompte) {
		this.numCompte = numCompte;
		this.soldeCompte = soldeCompte;
	}
	
	
//	METHODS
	@Override
	public String toString() {
		return "Numéro de compte = " + numCompte + "\rSolde du compte = " + soldeCompte;
	}

//	GETTERS & SETTERS
	public String getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(String numCompte) {
		this.numCompte = numCompte;
	}

	public double getSoldeCompte() {
		return soldeCompte;
	}

	public void setSoldeCompte(double soldeCompte) {
		this.soldeCompte = soldeCompte;
	}
}
