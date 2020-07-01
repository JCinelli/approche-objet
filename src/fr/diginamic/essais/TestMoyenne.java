package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculMoyenne cm = new CalculMoyenne();
		
		cm.ajoutNote(12);	
		cm.ajoutNote(5);
		cm.ajoutNote(18);
		
		for (int i = 0; i < cm.getTab().length; i++) {
			System.out.println(cm.getTab()[i]);
		}
		
		double moyenne = cm.calculMoyenne();
		
		System.out.println("\r---------------------------------------\r");
		
		System.out.println("La moyenne des éléments du tableau est --> " + moyenne);
		
	}

}
