package fr.diginamic.essais;

import fr.diginamic.formes.Carre;
import fr.diginamic.formes.Cercle;
import fr.diginamic.formes.Rectangle;

public class TestForme {

	public static void main(String[] args) {

		Cercle c1 = new Cercle(5);
		Rectangle r1 = new Rectangle(5, 7);
		Carre carr1 = new Carre(6);
		
		System.out.println(AffichageForme.afficher(c1));
		System.out.println("\r_______________________________________\r");
		System.out.println(AffichageForme.afficher(r1));
		System.out.println("\r_______________________________________\r");
		System.out.println(AffichageForme.afficher(carr1));
		System.out.println("\r_______________________________________\r");
	}

}
