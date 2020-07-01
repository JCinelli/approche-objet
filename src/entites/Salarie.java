package entites;

public class Salarie {

	private String nom;
	private String prenom;
	private double salaire;
	
//	CONSTRUCTOR
	public Salarie(String nom, String prenom, double salaire) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.salaire = salaire;
	}

// METHODS
	@Override
	public String toString() {
		return "Salari� ==> Nom --> " + nom + "| Pr�nom --> " + prenom + "| Salaire --> " + salaire + "$";
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

	/**
	 * @return the salaire
	 */
	public double getSalaire() {
		return salaire;
	}

	/**
	 * @param salaire the salaire to set
	 */
	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}
}
