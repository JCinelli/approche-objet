package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

public class TestOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String result1 = Operations.calcul(5, '+', 2);
		String result2 = Operations.calcul(5, '-', 2);
		String result3 = Operations.calcul(5, '*', 2);
		String result4 = Operations.calcul(5, '/', 2);
		String result5 = Operations.calcul(5, '1', 2);
		
		System.out.println("R�sultat addition --> " + result1);
		System.out.println("R�sultat soustraction --> " + result2);
		System.out.println("R�sultat multiplication --> " + result3);
		System.out.println("R�sultat division --> " + result4);
		System.out.println("R�sultat pour un mauvais op�rateur --> " + result5);
	}

}
