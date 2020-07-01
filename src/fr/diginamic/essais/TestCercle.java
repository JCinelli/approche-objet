package fr.diginamic.essais;

import fr.diginamic.formes.Cercle;
import fr.diginamic.utils.CercleFactory;

public class TestCercle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cercle c1 = new Cercle(4);
		Cercle c2 = new Cercle(2);
		
//		Cercle avec factory
		Cercle c3 = CercleFactory.createCercle(5);
		Cercle c4 = CercleFactory.createCercle(15.3);
		
		System.out.println("Le périmètre du cercle c1 pour un rayon de " + c1.getRayon() + "cm, est de --> " + c1.calculPeri() + "cm");
		System.out.println("La surface du cercle c2 pour un rayon de " + c2.getRayon() + "cm, est de --> " + c2.calculSurface() + "cm");
		System.out.println("Le périmètre du cercle c3 pour un rayon de " + c3.getRayon() + "cm, est de --> " + c3.calculPeri() + "cm");
		System.out.println("La surface du cercle c4 pour un rayon de " + c4.getRayon() + "cm, est de --> " + c4.calculSurface() + "cm");
	}

}
