package entites;

public class Personne {

	String nom;
	String prenom;
	AdressePostale adresse;
	
//	CONSTRUCTOR
	public Personne(String nom, String prenom, AdressePostale adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}

//	GETTERS & SETTERS
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public AdressePostale getAdresse() {
		return adresse;
	}

	public void setAdresse(AdressePostale adresse) {
		this.adresse = adresse;
	}

//	METHODES
	@Override
	public String toString() {
		return "\nNom = " + nom + "\nPrenom = " + prenom + "\nAdresse = " + adresse;
	}
	
	public void toUp() {
		System.out.println("\nNom = " + nom.toUpperCase() + "\nPrenom = " + prenom);
	}

		
	
}
