package fr.diginamic.salaire;

public abstract class Intervenant {

	private String nom;
	private String prenom;

//	CONSTRUCTOR
	public Intervenant(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
	}

//	METHODS
	@Override
	public String toString() {
		return "Intervenant -->\r Nom --> " + nom + "\r Prénom --> " + prenom + " \r";
	}
	
	public abstract double getSalaire();
	
	public abstract String afficherDonnees();

	// GETTERS & SETTERS
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
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

}
