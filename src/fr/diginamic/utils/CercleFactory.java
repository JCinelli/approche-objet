package fr.diginamic.utils;

import fr.diginamic.formes.Cercle;

public class CercleFactory {

	public static Cercle createCercle(double tailleR) {
		return new Cercle(tailleR);
	}
}
