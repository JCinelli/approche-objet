package fr.diginamic.recensement.methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import fr.diginamic.recensement.entities.Region;
import fr.diginamic.recensement.entities.Ville;
import fr.diginamic.recensement.methods.comparator.ComparatorRegions;

public class DixRegionsPlusPeupleesFrance {

	public static List<Region> rechercheDixRegionsPlusPeupleesFrance(List<Ville> listVilles) {
		
//		Creation d'une Map --> Clé = nom region
//							   Valeur = population region
		HashMap<String, Integer> mapPopulationParReg = new HashMap<>();
		
//		Parcours de la liste de villes du fichier
		for (Ville ville : listVilles) {
				
//				Si ma map contient un clé qui est le nom region de la ville courante
				if (mapPopulationParReg.containsKey(ville.getNomRegion())) {
//					Alors rien ne se passe
					continue;
				}
				
//				Sinon j'ajoute dans ma map le nom region de la ville (clé) et le nombre d'habitant total de la region (valeur)
				mapPopulationParReg.put(ville.getNomRegion(), PopulationDeLaRegion.recherchePopulationDeLaRegion(listVilles, ville.getNomRegion()));
			
		}
		
//		Si la map ne s'est pas remplit
		if (mapPopulationParReg.size() == 0) {
			
//			Alors c'est qu'il y a une erreur
			System.err.println("Error..");
			return null;
			
		}
		
//		Creation d'une liste qui contiendra toutes les regions de france
		List<Region> listRegions = new ArrayList<>();
		
//		Parcours de la map
		for (String cle : mapPopulationParReg.keySet()) {
			
//			Remplissage de la liste des regions avec les valeurs de la map
			listRegions.add(new Region(cle, mapPopulationParReg.get(cle)));
			
		}
		
//		Tri de la liste des regions de la plus peuplee a la moins peuplee 
		Collections.sort(listRegions, new ComparatorRegions(true));
		
//		Creation d'une liste qui contiendra les 10 plus peuplee
		List<Region> dixRegionsPlusPeupleesFrance = new ArrayList<>();
		

		for (int i = 0; i < 10; i++) {
			
//			Remplissage de ma liste avec les 10 premiers élément de ma liste contenant toutes les regions
			dixRegionsPlusPeupleesFrance.add(listRegions.get(i));
			
		}
		
		return dixRegionsPlusPeupleesFrance;
		
	}
	
}
