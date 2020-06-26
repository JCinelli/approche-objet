package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	double tauxRemu;

//	CONSTRUCTOR
	public CompteTaux(String numCompte, double soldeCompte, double tauxRemu) {
		super(numCompte, soldeCompte);
		this.tauxRemu = tauxRemu;
	}

	@Override
	public String toString() {
		return super.toString() + "\rTaux de rénumération = " + tauxRemu;
	}
	
	
}
