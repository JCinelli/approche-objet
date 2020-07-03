package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ComptagePaysParContinent {

	public static void main(String[] args) {

		List<Pays> listPays = new ArrayList<>();

		listPays.add(new Pays("France", 65_000_000L, "Europe"));
		listPays.add(new Pays("Allemagne", 80_000_000L, "Europe"));
		listPays.add(new Pays("Belgique", 10_000_000L, "Europe"));
		listPays.add(new Pays("Russie", 150_000_000L, "Asie"));
		listPays.add(new Pays("Chine", 1_400_000_000L, "Europe"));
		listPays.add(new Pays("Indonésie", 220_000_000L, "Océanie"));
		listPays.add(new Pays("Austalie", 20_000_000L, "Océanie"));
		
		HashMap<String, Integer> map = new HashMap<>();
		
		for (Pays pays : listPays) {
			
			 Integer compteur = map.get(pays.getContinant());
			 
			 if (compteur == null) {
				 
				map.put(pays.getContinant(), 1);
				
			} else {
				
				compteur ++;
				map.put(pays.getContinant(), compteur);
			}
			 
		}
		
		for (String cle : map.keySet()) {
			System.out.println("Nombre de pays de la liste présent en " + cle + " --> " + map.get(cle));
		}
	
	}

}
