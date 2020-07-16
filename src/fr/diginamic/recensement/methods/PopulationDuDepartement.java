package fr.diginamic.recensement.methods;

import java.util.List;

import fr.diginamic.recensement.entities.Ville;

public class PopulationDuDepartement {

	public static int populationTotaleDuDepartement(List<Ville> listVilles, String codeDuDepartement) {
		
//		Initialisation de la populationTotaleDuDepartement � 0
		int populationTotaleDuDepartement = 0;
		
//		Parcours de la liste de villes
		for (Ville ville : listVilles) {
			
//			A chaque tour de boucle, si le code departement pass� en parametre est egal au code de la ville courante
			if (codeDuDepartement.equals(ville.getCodeDepartement())) {
				
//				Alors on prends la valeur de la variable populationTotaleDuDepartement et on y ajoute la population de la ville courante
				populationTotaleDuDepartement += ville.getPopulation();
				
			}
			
		}
		
//		Si populationTotaleDuDepartement est toujours a 0 c'est que le code du departement est introuvable
		if (populationTotaleDuDepartement == 0) {
			System.err.println("Le code de département " + codeDuDepartement + " est introuvable..");
		}
		
		return populationTotaleDuDepartement;
	}
	
}
