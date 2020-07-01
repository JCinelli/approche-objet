package entites;

public class Personne {

	private String nom;
	private String prenom;
	private AdressePostale adresse;
	
//	CONSTRUCTOR
	public Personne(String nom, String prenom, AdressePostale adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
	}
	
	
//	METHODES
	@Override
	public String toString() {
		return "Nom = " + nom + ", Prénom = " + prenom + ", Adresse = " + adresse;
	}
	
	public String nomToUp() {
		return "\nNom = " + nom.toUpperCase() + "\nPrenom = " + prenom;
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
	
}
