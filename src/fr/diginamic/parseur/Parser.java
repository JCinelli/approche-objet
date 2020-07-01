package fr.diginamic.parseur;

public class Parser {
	
	public static char findOp(String chaine) {
		char operator = ' ';
		
		if (chaine.indexOf("*") >= 0) {
			operator = '*';
			return operator;
		} else if (chaine.indexOf("/") >= 0) {
			operator = '/';
			return operator;
		} else if (chaine.indexOf("-") >= 0) {
			operator = '-';
			return operator;
		} else if (chaine.indexOf("+") >= 0) {
			operator = '+';
			return operator;
		} else {
			System.out.println("Opérateur non pris en charge!");
			return operator;
		}
	}

	public static Expression parse(String chaine1) {
		String chaine = chaine1.replace(" ", "");
		
		char operateur = Parser.findOp(chaine);
		
		String membreGauche = chaine.substring(chaine.indexOf(chaine.charAt(0)), chaine.indexOf(operateur));
		
		String membreDroite = chaine.substring(chaine.indexOf(operateur) + 1, chaine.length());
		
		Expression expression = new Expression(membreGauche, operateur, membreDroite);
		return expression;
	}
}
