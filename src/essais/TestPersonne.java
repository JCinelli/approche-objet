package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdressePostale adrs1 = new AdressePostale(34, "Rue de Jupiter", "34000", "Montpellier");
		AdressePostale adrs2 = new AdressePostale(125, "Boulevard de la chapelle", "06110", "Le Cannet");
		
		Personne pers1 = new Personne("Salami", "Jean", adrs1);
		Personne pers2 = new Personne("Bros", "Mario", adrs2);
		
		System.out.println(pers1);
		System.out.println("___________________");
		System.out.println(pers2);
	}

}
