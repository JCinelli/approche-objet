package fr.diginamic.enumeration;

public class TestEnumeration {

	public static void main(String[] args) {
		
		Saison [] saisons = Saison.values();
		
		for (Saison saison : saisons) {
			System.out.println(saison);
		}
		
		String nom = "ETE";
		System.out.println(Saison.valueOf(nom).getNom());
		
		String libelle = "Hiver";
		Saison s = Saison.saisonParNom(libelle);
		System.out.println(s);
		

	}

}
