package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetObject {

	public static void main(String[] args) {

		HashSet<Pays> setDePays = new HashSet<>();
		
		setDePays.add(new Pays("USA", 328_200_000, 62794.59));
		setDePays.add(new Pays("France", 66_990_000, 41463.64));
		setDePays.add(new Pays("Allemagne", 83_020_000, 47603.03));
		setDePays.add(new Pays("UK", 66_650_000, 42943.90));
		setDePays.add(new Pays("Italie", 60_360_000, 34483.20));
		setDePays.add(new Pays("Japon", 126_500_000, 39289.96));
		setDePays.add(new Pays("Chine", 1_393_000_000, 9770.85));
		setDePays.add(new Pays("Russie", 144_500_000, 11288.87));
		setDePays.add(new Pays("Inde", 1_353_000_000, 2009.98));

		System.out.println("\r_________________Le pays avec le PIB/habitant le plus important____________________\r");
		
		Iterator<Pays> iterator = setDePays.iterator();

		Pays plusGrandPibParHabitant = new Pays("zouzou", 0, 0.0);
		
		while (iterator.hasNext()) {

			Pays myPays = iterator.next();
			
			if (myPays.getPibParHabitant() > plusGrandPibParHabitant.getPibParHabitant()) {
	
				plusGrandPibParHabitant = myPays;
				
			}

		}
		
		System.out.println(plusGrandPibParHabitant);
		
		System.out.println("\r_________________Recherchez le pays avec le PIB total le plus important____________________\r");

		
		Iterator<Pays> iterator2 = setDePays.iterator();

		Pays plusGrandPibTotal = new Pays("zouzou", 0, 0.0);
		
		while (iterator2.hasNext()) {

			Pays myPays = iterator2.next();
			
			double pibTotalMyPays = myPays.getPibParHabitant() * myPays.getNbHabitant();
			
			double pibTotalPlusGrandPibTotal = plusGrandPibTotal.getPibParHabitant() * plusGrandPibTotal.getNbHabitant();
			
			if ( pibTotalMyPays > pibTotalPlusGrandPibTotal) {
	
				plusGrandPibTotal = myPays;
				
			}

		}
		
		System.out.println(plusGrandPibTotal);
		
		System.out.println("\r_________________ Mettre en majuscule le pays qui a le PIB total le plus petit____________________\r");
		
		Iterator<Pays> iterator3 = setDePays.iterator();

		Pays plusPetitPibTotal = new Pays("zouzou", 1_000_000_000, 99999.99);
		
		while (iterator3.hasNext()) {

			Pays myPays = iterator3.next();
			
			double pibTotalMyPays = myPays.getPibParHabitant() * myPays.getNbHabitant();
			
			double pibTotalPlusPetitPibTotal = plusPetitPibTotal.getPibParHabitant() * plusPetitPibTotal.getNbHabitant();
			
			if ( pibTotalMyPays < pibTotalPlusPetitPibTotal) {
	
				plusPetitPibTotal = myPays;
				
			}

		}
		
		plusPetitPibTotal.setNom(plusPetitPibTotal.getNom().toUpperCase());
		
		for (Pays pays : setDePays) {
			System.out.println(pays + "\r");
		}
		
		System.out.println("\r_________________ Supprimer le pays qui a le PIB total le plus petit et afficher____________________\r");
		
		setDePays.remove(plusPetitPibTotal);
		
		for (Pays pays : setDePays) {
			System.out.println(pays + "\r");
		}
		
		
	}

}
