package maps;

import java.util.HashMap;

public class CreationEtManipulationMap {

	public static void main(String[] args) {

		HashMap<Integer, String> mapVilles = new HashMap<>();
		
		mapVilles.put(13, "Marseille");
		mapVilles.put(34, "Montpellier");
		mapVilles.put(44, "Nantes");
		mapVilles.put(75, "Paris");
		mapVilles.put(31, "Toulouse");
		mapVilles.put(59, "Lille");
		mapVilles.put(69, "Lyon");
		mapVilles.put(33, "Bordeaux");
		
		System.out.println("\r____________________Affichage des clés de la maps______________________________\r");
		for (Integer cle : mapVilles.keySet()) {
			System.out.println(cle);
		}
		
		System.out.println("\r____________________Affichage des valeurs de la maps______________________________\r");
		for (String value : mapVilles.values()) {
			System.out.println(value);
		}
		
		System.out.println("\r____________________Affichage de la taille de la map______________________________\r");
		System.out.println("Il y a " + mapVilles.size() + " éléments dans la map!");
	}

}
