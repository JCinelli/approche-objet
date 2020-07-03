package tri;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import listes.Ville;

public class TestTriVille {

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
		
//		Collections.sort(listVille, new ComparatorNom());
		Collections.sort(listVille, new ComparatorHabitant());
		
		for (Ville ville : listVille) {
			System.out.println(ville);
		}
	}

}
