package fr.diginamic.essais;

import fr.diginamic.formes.Forme;

public class AffichageForme {

	public static String afficher(Forme forme) {
		return "Le p�rim�tre de ce " + forme.getClass().getSimpleName() + " est --> " + forme.calculPeri() + 
				"\rLa surface de ce " + forme.getClass().getSimpleName() + " est --> " + forme.calculSurface();
	}

}
