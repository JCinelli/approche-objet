package fr.diginamic.essais;

import fr.diginamic.formes.Rectangle;

public class TestRectangle {

	public static void main(String[] args) {

		Rectangle r1 = new Rectangle(10, 5);
		Rectangle r2 = new Rectangle(8, 11);
		
		System.out.println("Le périmètre d'un rectangle r1 (" + r1 + ") est de --> " + r1.calculPeri() + " cm");
		System.out.println("La surface d'un rectangle r1 (" + r1 + ") est de --> " + r1.calculSurface() + " cm");
		System.out.println("\r______________________________________________________\r");
		System.out.println("Le périmètre d'un rectangle r2 (" + r2 + ") est de --> " + r2.calculPeri() + " cm");
		System.out.println("La surface d'un rectangle r2 (" + r2 + ") est de --> " + r2.calculSurface() + " cm");
	}

}
