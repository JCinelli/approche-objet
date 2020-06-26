package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdressePostale adrs1 = new AdressePostale(34, "Rue de Jupiter", "34000", "Montpellier");
		AdressePostale adrs2 = new AdressePostale(125, "Boulevard de la chapelle", "06110", "Le Cannet");
		AdressePostale adrs3 = new AdressePostale(548, "Chemin blabla", "13000", "Marseille");
		
		Personne pers1 = new Personne("Salami", "Jean", adrs1);
		Personne pers2 = new Personne("Bros", "Mario", adrs2);
		
		System.out.println("Personne 1 --> " + pers1);
		System.out.println("______________________________________________\r");
		System.out.println("Personne 2 --> " + pers2);
		
		System.out.println("______________________________________________\r");
		System.out.println("Personne 1, nom en MAJ --> ");
		System.out.println(pers1.nomToUp());
		
		pers1.setNom("Sardine");
		pers1.setPrenom("Pascal");
		pers1.setAdresse(adrs3);
		
		System.out.println("______________________________________________\r");
		System.out.println("Personne 1 --> " + pers1);
	}

}
