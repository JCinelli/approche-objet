package fr.diginamic.recensement.methods;

import java.util.HashMap;
import java.util.List;

import fr.diginamic.recensement.entities.Ville;

public class DepartementPlusPeupleDeLaRegion {

	public static String rechercheDepartementPlusPeupleDeLaRegion(List<Ville> listVilles, String nomDeLaRegion) {
		
//		Creation d'une Map --> Clé = code departement
//							   Valeur = population du departement
		HashMap<String, Integer> mapPopulationParDep = new HashMap<>();
		
//		Parcours de la liste de villes du fichier
		for (Ville ville : listVilles) {
			
//			Si le nom de la region de la ville courante est egal au nom passé en parametre
			if (ville.getNomRegion().toLowerCase().equals(nomDeLaRegion.toLowerCase())) {
				
//				Si ma map contient un clé qui est le code departement de la ville courante
				if (mapPopulationParDep.containsKey(ville.getCodeDepartement())) {
//					Alors rien ne se passe
					continue;
				}
				
//				Sinon j'ajoute dans ma map le code departement de la ville (clé) et le nombre d'habitant total du departement (valeur)
				mapPopulationParDep.put(ville.getCodeDepartement(), PopulationDuDepartement.populationTotaleDuDepartement(listVilles, ville.getCodeDepartement()));
				
			}
			
		}
		
//		Si la map ne s'est pas remplit
		if (mapPopulationParDep.size() == 0) {
			
//			Alors c'est que le nom de la region en parametre est introuvable
			System.err.println("La région " + nomDeLaRegion + " est introuvable..");
			return null;
			
		}
		
//		Initialisation d'une variable qui contiendra le plus grand nb d'habitant des departements a 0
		int depPlusPeuple = 0;
		
//		Initialisation d'une variable qui contiendra le code departement du plus peuplé
		String codeDepartementPlusPeuple = "";
		
//		Parcours de la map
		for (String cle : mapPopulationParDep.keySet()) {
			
//			Si la valeur nb d'habitant de l'element courant est superieur a depPlusPeuple
			if (mapPopulationParDep.get(cle) > depPlusPeuple) {
				
//				Alors depPlusPeuple prend la valeur de l'element courant (nb total d'habitant du dep)
				depPlusPeuple = mapPopulationParDep.get(cle);
//				Et codeDepartementPlusPeuple prends la valeur de la clé de l'element courant
				codeDepartementPlusPeuple = cle;
				
			}
			
		}
		
		return codeDepartementPlusPeuple;
		
	}
	
}
