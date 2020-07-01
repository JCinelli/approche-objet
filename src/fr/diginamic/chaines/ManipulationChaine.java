package fr.diginamic.chaines;

import entites.Salarie;

public class ManipulationChaine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String chaine = "Durand;Marcel;2 523.5";
				
		System.out.println("Premier caractère --> " + chaine.charAt(0));
		System.out.println("-----------------------------------------------------");
		System.out.println("Taille de la chaine --> " + chaine.length());
		System.out.println("-----------------------------------------------------");
		System.out.println("Index du premier ';' --> " + chaine.indexOf(';'));
		System.out.println("-----------------------------------------------------");
		String nom = chaine.substring(chaine.indexOf("D"), chaine.indexOf(";"));
		
		System.out.println("Extraction du nom de famille --> " + nom);
		System.out.println("-----------------------------------------------------");
		System.out.println("Nom de famille en majuscule --> " + nom.toUpperCase());
		System.out.println("-----------------------------------------------------");
		System.out.println("Nom de famille en minuscule --> " + nom.toLowerCase());
		System.out.println("-----------------------------------------------------");
		
		System.out.println("Découpage de la chaine avec le séparateur ';' --> ");
		String tabSplit[] = chaine.split(";");
		for (String string : tabSplit) {
			System.out.println(string);
		}
		System.out.println("-----------------------------------------------------");
		
		String nom1 = tabSplit[0];
		String prenom = tabSplit[1];
		double salaire = Double.parseDouble(tabSplit[2].replace(" ", ""));
		
		Salarie salarie = new Salarie(nom1, prenom, salaire);
		
		System.out.println(salarie);
	}

}
