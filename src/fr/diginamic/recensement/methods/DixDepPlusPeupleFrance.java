package fr.diginamic.recensement.methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import fr.diginamic.recensement.entities.Departement;
import fr.diginamic.recensement.entities.Ville;
import fr.diginamic.recensement.methods.comparator.ComparatorDepartements;

public class DixDepPlusPeupleFrance {

	public static List<Departement> rechercheDixDepPlusPeupleFrance(List<Ville> listVilles) {
		
//		Creation d'une Map --> Clé = code dep
//							   Valeur = population dep
		HashMap<String, Integer> mapPopulationParReg = new HashMap<>();
		
//		Parcours de la liste de villes du fichier
		for (Ville ville : listVilles) {
				
//				Si ma map contient un clé qui est le code dep de la ville courante
				if (mapPopulationParReg.containsKey(ville.getCodeDepartement())) {
//					Alors rien ne se passe
					continue;
				}
				
//				Sinon j'ajoute dans ma map le code dep de la ville (clé) et le nombre d'habitant total du dep (valeur)
				mapPopulationParReg.put(ville.getCodeDepartement(), PopulationDuDepartement.populationTotaleDuDepartement(listVilles, ville.getCodeDepartement()));
			
		}
		
//		Si la map ne s'est pas remplit
		if (mapPopulationParReg.size() == 0) {
			
//			Alors c'est qu'il y a une erreur
			System.err.println("Error..");
			return null;
			
		}
		
//		Creation d'une liste qui contiendra tout les departements de france
		List<Departement> listDep = new ArrayList<>();
		
//		Parcours de la map
		for (String cle : mapPopulationParReg.keySet()) {
			
//			Remplissage de la liste des dep avec les valeurs de la map
			listDep.add(new Departement(cle, mapPopulationParReg.get(cle)));
			
		}
		
//		Tri de la liste des departements du plus peuplee au moins peuplee 
		Collections.sort(listDep, new ComparatorDepartements(true));
		
//		Initialisation d'une list qui ne conitendra que les 10 plus peuple
		List<Departement> dixDepPlusPeupleesFrance = new ArrayList<>();
		

		for (int i = 0; i < 10; i++) {

//			Remplissage de ma liste avec les dix plus peuplé
			dixDepPlusPeupleesFrance.add(listDep.get(i));
			
		}
		
		return dixDepPlusPeupleesFrance;
		
	}
	
}
