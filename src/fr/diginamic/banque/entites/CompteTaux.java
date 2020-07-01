package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

	private double tauxRemu;

//	CONSTRUCTOR
	public CompteTaux(String numCompte, double soldeCompte, double tauxRemu) {
		super(numCompte, soldeCompte);
		this.tauxRemu = tauxRemu;
	}
	
	
//	METHODS
	@Override
	public String toString() {
		return super.toString() + "\rTaux de rénumération = " + tauxRemu;
	}

	
//	GETTERS & SETTERS
	/**
	 * @return the tauxRemu
	 */
	public double getTauxRemu() {
		return tauxRemu;
	}

	/**
	 * @param tauxRemu the tauxRemu to set
	 */
	public void setTauxRemu(double tauxRemu) {
		this.tauxRemu = tauxRemu;
	}
	
	
}
