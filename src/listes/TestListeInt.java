package listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeInt {

	public static void main(String[] args) {

		List<Integer> listInt = new ArrayList<>();
		
		listInt.add(-1);
		listInt.add(5);
		listInt.add(7);
		listInt.add(3);
		listInt.add(-2);
		listInt.add(4);
		listInt.add(8);
		listInt.add(5);
		
		System.out.println("\r______________________Affichage du contenu de la liste_____________________________\r");
		for (Integer integer : listInt) {
			System.out.println(integer);
		}
		
		System.out.println("\r______________________Taille de la liste_____________________________\r"); 
		System.out.println("Il y a " + listInt.size() + " elements dans la liste");
		
		System.out.println("\r______________________Plus grand element de la liste_____________________________\r");
		int plusGrand = 0;
		
		for (Integer integer : listInt) {
			if (integer > plusGrand) {
				plusGrand = integer;
			}
		}
		
		System.out.println("Le plus grand element est " + plusGrand);
		
		System.out.println("\r______________________Suppression du plus petit element de la liste_____________________________\r");
		int plusPetit = 0;
		int indexPlusPetit = 0;
		
		for (int i = 0; i < listInt.size(); i++) {
			if (listInt.get(i) < plusPetit) {
				plusPetit = listInt.get(i);
				indexPlusPetit = i;
			}
		}
		
		listInt.remove(indexPlusPetit);
		for (Integer integer : listInt) {
			System.out.println(integer);
		}
		
		System.out.println("\r______________________Changement des elements negatifs en positif_____________________________\r");
		
		for (int i = 0; i < listInt.size(); i++) {
			if (listInt.get(i) <= 0) {
				listInt.set(i, Math.abs(listInt.get(i)));
			}
		}
		
		for (Integer integer : listInt) {
			System.out.println(integer);
		}
		
	}

}
