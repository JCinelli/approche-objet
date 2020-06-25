package essais;

import entites.AdressePostale;

public class TestAdressePostale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdressePostale adrs1 = new AdressePostale(34, "Rue de Jupiter", "34000", "Montpellier \r");
		AdressePostale adrs2 = new AdressePostale(125, "Boulevard de la chapelle", "06110", "Le Cannet \r");
		
		System.out.println(adrs1);
		System.out.println(adrs2);
	}

}
