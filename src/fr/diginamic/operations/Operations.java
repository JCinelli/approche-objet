package fr.diginamic.operations;

public class Operations {

	public static String calcul(double nb1, char operator, double nb2) {
		
		switch (operator) {
		case '+':
			return String.valueOf(nb1 + nb2); 

		case '-':
			return String.valueOf(nb1 - nb2);

		case '*':
			return String.valueOf(nb1 * nb2);
			
		case '/' :
			return String.valueOf(nb1 / nb2);
			
		default : 
			return "Votre opérateur doit être +, -, * ou /";
			
		}
		
	}
}
