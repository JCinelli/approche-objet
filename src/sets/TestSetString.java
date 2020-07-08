package sets;

import java.util.HashSet;
import java.util.Iterator;

public class TestSetString {

	public static void main(String[] args) {

		HashSet<String> setDeString = new HashSet<>();
		
		setDeString.add("USA");
		setDeString.add("France");
		setDeString.add("Allemagne");
		setDeString.add("UK");
		setDeString.add("Italie");
		setDeString.add("Japon");
		setDeString.add("Chine");
		setDeString.add("Russie");
		setDeString.add("Inde");
		
		
		System.out.println("\r_____Recherchez le pays dans cette liste qui a le plus grand nombre de lettres et le supprimer_____________\r");
		
		Iterator<String> iterator = setDeString.iterator();

		String plusGrandNombreDeLettres = "";
		
		while (iterator.hasNext()) {

			String myString = iterator.next();
			
			if (myString.length() > plusGrandNombreDeLettres.length()) {
			
				plusGrandNombreDeLettres = myString;
				
			}

		}
		
		System.out.println(plusGrandNombreDeLettres);
		setDeString.remove(plusGrandNombreDeLettres);
		
		System.out.println("\r_________________________Affichez enfin le contenu de la collection ainsi modifiée________________________________\r");
		
		Iterator<String> iterator2 = setDeString.iterator();
		
		while (iterator2.hasNext()) {

			String myString = iterator2.next();
			
			System.out.println(myString);

		}
		
	}

}
