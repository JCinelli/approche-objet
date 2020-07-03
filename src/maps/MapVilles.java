package maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import listes.Ville;

public class MapVilles {

	public static void main(String[] args) {
		List<Ville> listVille = new ArrayList<>();

		listVille.add(new Ville("Nice", 343000));
		listVille.add(new Ville("Carcassonne", 47800));
		listVille.add(new Ville("Narbonne", 53400));
		listVille.add(new Ville("Lyon", 484000));
		listVille.add(new Ville("Foix", 9700));
		listVille.add(new Ville("Pau", 77200));
		listVille.add(new Ville("Marseille", 850700));
		listVille.add(new Ville("Tarbes", 40600));

		HashMap<String, Ville> mapVilles = new HashMap<>();
		
		for (Ville ville : listVille) {
			mapVilles.put(ville.getNom(), ville);
		}
		
		Ville moinsPeuplee = mapVilles.values().iterator().next();

		for (Ville ville : mapVilles.values()) {
			if (ville.getNbHab() < moinsPeuplee.getNbHab()) {
				moinsPeuplee = ville;
			}
		}
		
		mapVilles.remove(moinsPeuplee.getNom(), moinsPeuplee);
		
		System.out.println("\r____________________Affichage de map après suppression______________________________\r");
		for (String cle : mapVilles.keySet()) {
			System.out.println(cle + " " + mapVilles.get(cle));
		}
	}

}
