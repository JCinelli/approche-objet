package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.Wc;

public class TestMaison {

	public static void main(String[] args) {

		Maison maison1 = new Maison();
		
		Chambre chambre1 = new Chambre(14.5, 1);
		Chambre chambre2 = new Chambre(18.2, 1);
		Salon salon1 = new Salon(33.3, 0);
		Cuisine cuis1 = new Cuisine(15, 0);
		SalleDeBain sdb1 = new SalleDeBain(8.5, 1);
		Wc wc1 =  new Wc(3.6, 0);
		
		
		maison1.ajouterPiece(chambre1);
		maison1.ajouterPiece(chambre2);
		maison1.ajouterPiece(salon1);
		maison1.ajouterPiece(cuis1);
		maison1.ajouterPiece(sdb1);
		maison1.ajouterPiece(wc1);
		
		System.out.println("\r__________________________Test methodes superficie________________________________\r");
		System.out.println("La maison mesure au total " + maison1.superficieTotal() + " m2");
		System.out.println("Le RDC mesure " + maison1.superficieEtage(0) + " m2");
		System.out.println("Le premier étage mesure " + maison1.superficieEtage(1) + " m2");
		
		System.out.println("\r__________________________Test données éronées________________________________\r");
		maison1.ajouterPiece(null);
		Chambre ch5 = new Chambre(-12, 3);
		maison1.ajouterPiece(ch5);
		Chambre ch51 = new Chambre(2, -3);
		maison1.ajouterPiece(ch51);
		
		System.out.println("\r__________________________Test superfice par type________________________________\r");
		
		System.out.println("La superfice totale des chambres --> " + maison1.superficieType(chambre1) + " m2");
		
		System.out.println("\r__________________________Test nombre de pièce par type________________________________\r");
		
		System.out.println("Il y a " + maison1.nbType(ch5) + " chambres dans cette maison!");
	}

}
