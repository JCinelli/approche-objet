package sets;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class TestSetDouble {

	public static void main(String[] args) {

		HashSet<Double> setDeDouble = new HashSet<>();

		double d1 = 1.5;
		double d2 = 8.25;
		double d3 = -7.32;
		double d4 = 13.3;
		double d5 = -12.45;
		double d6 = 48.5;
		double d7 = 0.01;

		setDeDouble.add(d1);
		setDeDouble.add(d2);
		setDeDouble.add(d3);
		setDeDouble.add(d4);
		setDeDouble.add(d5);
		setDeDouble.add(d6);
		setDeDouble.add(d7);

		System.out.println("\r_________________________Afficher les éléments du Set________________________________\r");

		Iterator<Double> iterator = setDeDouble.iterator();

		while (iterator.hasNext()) {

			Double myDouble = iterator.next();
			System.out.println(myDouble);

		}

		System.out.println("\r_________________________Recherchez le plus grand élément de la collection________________________________\r");

		System.out.println(Collections.max(setDeDouble));
		
		System.out.println("\r__________________Supprimez le plus petit élément de la collection et afficher le resultat____________________________\r");
		
		setDeDouble.remove(Collections.min(setDeDouble));
		
		Iterator<Double> iterator2 = setDeDouble.iterator();
		
		while (iterator2.hasNext()) {

			Double myDouble = iterator2.next();
			System.out.println(myDouble);

		}
		
	}

}
