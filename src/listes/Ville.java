package listes;

public class Ville {

	private String nom;
	private long nbHab;
	
//	CONSTRUCTOR
	public Ville(String nom, long nbHab) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
	}

//	METHODS
	@Override
	public String toString() {
		return "Nom --> " + nom + " | Nombre d'habitants --> " + nbHab;
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
	 * @return the nbHab
	 */
	public long getNbHab() {
		return nbHab;
	}

	/**
	 * @param nbHab the nbHab to set
	 */
	public void setNbHab(long nbHab) {
		this.nbHab = nbHab;
	}
}
