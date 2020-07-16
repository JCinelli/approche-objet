package fr.diginamic.enumeration;

public enum Saison {

	PRINTEMPS ("Printemps", 1), 
	ETE ("Eté", 2),
	AUTOMNE ("Automne", 3),
	HIVER ("Hiver", 4);
	
	String nom;
	int numero;
	
	private Saison(String nom, int numero) {
		this.nom = nom;
		this.numero = numero;
	}

	public static Saison saisonParNom(String nom) {
		
		for (Saison saison : Saison.values()) {
			
			if (saison.nom.equals(nom)) {
				
				return saison;
				
			}
			
		}
		
		System.err.println("Cette saison est introuvable ..");
		return null;
		
	}
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}
	
	
	
}
