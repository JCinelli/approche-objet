package listes;

import java.util.ArrayList;
import java.util.List;

public class TestVille {

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
		
		System.out.println("\r_____________________Recherchez et affichez la ville la plus peuplée______________________________\r");
		long plusPeuplee = 0;
		
		for (Ville ville : listVille) {
			if (ville.getNbHab() > plusPeuplee) {
				plusPeuplee = ville.getNbHab();
			}
		}
		
		for (Ville ville : listVille) {
			if (ville.getNbHab() == plusPeuplee) {
				System.out.println("La ville la plus peuplée est --> "+  ville.getNom());
			}
		}
				
		System.out.println("\r_____________________Supprimez la ville la moins peuplée______________________________\r");
		long moinsPeuplee = plusPeuplee;
		
		for (Ville ville : listVille) {
			if (ville.getNbHab() < plusPeuplee) {
				moinsPeuplee = ville.getNbHab();
			}
		}
		
		for (int i = 0; i < listVille.size(); i++) {
			if (listVille.get(i).getNbHab() == moinsPeuplee) {
				listVille.remove(i);
			}
		}
		
		System.out.println("\r___________Modifiez les villes de plus de 100 000 habitants en mettant leur nom en majuscules__________________\r");
		for (int i = 0; i < listVille.size(); i++) {
			if (listVille.get(i).getNbHab() > 100000) {
				listVille.get(i).setNom(listVille.get(i).getNom().toUpperCase());
			}
		}
		
		System.out.println("\r_____________________Affichez enfin la liste résultante______________________________\r");
		for (Ville ville : listVille) {
			System.out.println(ville);
		}
	}

}
