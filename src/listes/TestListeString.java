package listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeString {

	public static void main(String[] args) {

		List<String> listStr = new ArrayList<>();
		
		listStr.add("Nice");
		listStr.add("Carcassonne");
		listStr.add("Narbonne");
		listStr.add("Lyon");
		listStr.add("Foix");
		listStr.add("Pau");
		listStr.add("Marseille");
		listStr.add("Tarbes");
		
		System.out.println("\r_____________________La ville qui a le plus grand nombre de lettres______________________________\r");
		String plusGrandNbDeLettres = "";

		for (String string : listStr) {
			if (string.length() > plusGrandNbDeLettres.length()) {
				plusGrandNbDeLettres = string;
			}
		}
		
		System.out.println("La ville qui a le plus grand nombre de lettres est --> " + plusGrandNbDeLettres);
		
		System.out.println("\r_____________________Nom de ville en majuscule______________________________\r");
		for (int i = 0; i < listStr.size(); i++) {
			listStr.set(i, listStr.get(i).toUpperCase());
		}
		
		System.out.println(listStr);
		
		System.out.println("\r_____________________Suppression des villes qui commencent par N______________________________\r");
		for (int i = 0; i < listStr.size(); i++) {
			if (listStr.get(i).charAt(0) == 'N') {
				listStr.remove(i);
			}
		}
		
		System.out.println(listStr);
	}

}
