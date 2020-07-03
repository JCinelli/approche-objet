package maps;

import java.util.HashMap;
import java.util.Map;

public class CreationMap {

	public static void main(String[] args) {

		Map<String, Integer> mapSalaires = new HashMap<>();
		
		mapSalaires.put("Paul", 1750);
		mapSalaires.put("Hicham", 1825);
		mapSalaires.put("Yu", 2250);
		mapSalaires.put("Ingrid", 2015);
		mapSalaires.put("Chantal", 2418);
		
		System.out.println("Il y a " + mapSalaires.size() + " éléments dans la map!");
		
//		• Paul – 1750 €
//		• Hicham – 1825 €
//		• Yu – 2250 €
//		• Ingrid – 2015 €
//		• Chantal – 2418 €

	}

}
