package maps;

public class Pays {

	private String nom;
	private Long nbHab;
	private String continant;
	
//	CONSTRUCTOR
	public Pays(String nom, Long nbHab, String continant) {
		super();
		this.nom = nom;
		this.nbHab = nbHab;
		this.continant = continant;
	}

//	METHODS
	@Override
	public String toString() {
		return "Pays [nom=" + nom + ", nbHab=" + nbHab + ", continant=" + continant + "]";
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
	public Long getNbHab() {
		return nbHab;
	}

	/**
	 * @param nbHab the nbHab to set
	 */
	public void setNbHab(Long nbHab) {
		this.nbHab = nbHab;
	}

	/**
	 * @return the continant
	 */
	public String getContinant() {
		return continant;
	}

	/**
	 * @param continant the continant to set
	 */
	public void setContinant(String continant) {
		this.continant = continant;
	}
	
}
