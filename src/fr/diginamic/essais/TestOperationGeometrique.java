package fr.diginamic.essais;

import fr.diginamic.tpInterface.Cercle;
import fr.diginamic.tpInterface.ObjetGeometrique;
import fr.diginamic.tpInterface.Rectangle;

public class TestOperationGeometrique {

	public static void main(String[] args) {

		ObjetGeometrique[] objTab = new ObjetGeometrique[2];

		Cercle cercle = new Cercle(5);
		Rectangle rect = new Rectangle(6, 7);
		
		objTab[0] = cercle;
		objTab[1] = rect;
		
		for (ObjetGeometrique objetGeometrique : objTab) {
			System.out.println(objetGeometrique.getClass().getSimpleName() + " --> \r"
					+ "Le périmetre est de --> " + objetGeometrique.perimetre() + "\r"
					+ "La surface est de --> " + objetGeometrique.surface() + "\r");
		}
	}

}
