package fr.diginamic.banque.entites;

public class Compte {

	String numCompte;
	double soldeCompte;

//	CONSTRUTOR
	public Compte(String numCompte, double soldeCompte) {
		this.numCompte = numCompte;
		this.soldeCompte = soldeCompte;
	}

//	GETTER & SETTER
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

	@Override
	public String toString() {
		return "Num�ro de compte = " + numCompte + "\rSolde du compte = " + soldeCompte;
	}
	

}