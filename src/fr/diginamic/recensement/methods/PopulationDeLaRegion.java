package fr.diginamic.recensement.methods;

import java.util.List;

import fr.diginamic.recensement.entities.Ville;

public class PopulationDeLaRegion {

	public static int recherchePopulationDeLaRegion(List<Ville> listVilles, String nomDeLaRegion ) {
//		Initialisation de la variable qui contiendra le nombre d'habitants total de la region a 0
		int populationTotale = 0;
		
//		Parcours de la listes des villes du fichier
		for (Ville ville : listVilles) {
			
//			Si le nom de la region de la ville courante est egal au nom passé en parametre
			if (ville.getNomRegion().toLowerCase().equals(nomDeLaRegion.toLowerCase())) {
				
//				Alors on ajoute le nombre d'habitants de la ville courante a la population totale
				populationTotale += ville.getPopulation(); 
				
			}
			
		}
		
		return populationTotale;
		
	}
	
}
