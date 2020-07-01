package fr.diginamic.essais;

import fr.diginamic.parseur.Expression;
import fr.diginamic.parseur.Parser;

public class TestExpression {

	public static void main(String[] args) {
		
		String chaine = "var+3";
		Expression expr = Parser.parse(chaine);
		double resultat = expr.evaluer("var", 5);
		
		System.out.println("Le resultat de l'opération est --> " + resultat);
	}

}
