package sets;

public class Pays {

	private String nom;
	private long nbHabitant;
	private double pibParHabitant;
	
//	CONSTRUCTOR
	public Pays(String nom, long nbHabitant, double pibParHabitant) {
		super();
		this.nom = nom;
		this.nbHabitant = nbHabitant;
		this.pibParHabitant = pibParHabitant;
	}

//	METHODS
	@Override
	public String toString() {
		return "Pays :"
				+ "\r Nom : " + nom 
				+ "\r Nombre d'habitants : " + nbHabitant 
				+ "\r PIB parhabitant : " + pibParHabitant;
	}

//	GETTERS & SETTERS	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the nbHabitant
	 */
	public long getNbHabitant() {
		return nbHabitant;
	}

	/**
	 * @param nbHabitant the nbHabitant to set
	 */
	public void setNbHabitant(int nbHabitant) {
		this.nbHabitant = nbHabitant;
	}

	/**
	 * @return the pibParHabitant
	 */
	public double getPibParHabitant() {
		return pibParHabitant;
	}

	/**
	 * @param pibParHabitant the pibParHabitant to set
	 */
	public void setPibParHabitant(double pibParHabitant) {
		this.pibParHabitant = pibParHabitant;
	}
	
	
}
