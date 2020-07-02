package fr.diginamic.parseur;

public class Expression {

	private String membreGauche;
	private char operateur;
	private String membreDroite;

//	CONSTRUCTOR
	public Expression(String membreGauche, char operateur, String membreDroite) {
		this.membreGauche = membreGauche;
		this.operateur = operateur;
		this.membreDroite = membreDroite;
	}

//	METHODS
	public static boolean isANumber(String chaine) {
		try {
			Integer.parseInt(chaine);
			return true;
		} catch (NumberFormatException nfe) {
			return false;
		}
	}

	public double evaluer(String nomVar, double valeurVar) {
		double parsMembreGauche = 0;
		double parsMembreDroite = 0;

		if (isANumber(membreGauche)) {
			if (nomVar.equals(membreDroite)) {
				parsMembreGauche = Double.parseDouble(membreGauche);
				parsMembreDroite = valeurVar;
				return faireOpe(parsMembreGauche, parsMembreDroite);
			} else {
				System.out.println("Variable incorrecte!");
				return 0.0;
			}
		} else {
			if (nomVar.equals(membreGauche)) {
				parsMembreGauche = valeurVar;
				parsMembreDroite = Double.parseDouble(membreDroite);
				return faireOpe(parsMembreGauche, parsMembreDroite);
			} else {
				System.out.println("Variable incorrecte!");
				return 0.0;
			}
		}
	}

	public double faireOpe(double nb1, double nb2) {
		if (operateur == '+') {
			return nb1 + nb2;
		} else if (operateur == '-') {
			return nb1 - nb2;
		} else if (operateur == '*') {
			return nb1 * nb2;
		} else {
			return nb1 / nb2;
		}
	}
	
	@Override
	public String toString() {
		return "Expression --> " + membreGauche + " " + operateur + " "	+ membreDroite;
	}

//	GETTERS & SETTERS
	/**
	 * @return the membreGauche
	 */
	public String getMembreGauche() {
		return membreGauche;
	}

	/**
	 * @param membreGauche the membreGauche to set
	 */
	public void setMembreGauche(String membreGauche) {
		this.membreGauche = membreGauche;
	}

	/**
	 * @return the operateur
	 */
	public char getOperateur() {
		return operateur;
	}

	/**
	 * @param operateur the operateur to set
	 */
	public void setOperateur(char operateur) {
		this.operateur = operateur;
	}

	/**
	 * @return the membreDroite
	 */
	public String getMembreDroite() {
		return membreDroite;
	}

	/**
	 * @param membreDroite the membreDroite to set
	 */
	public void setMembreDroite(String membreDroite) {
		this.membreDroite = membreDroite;
	}
}
