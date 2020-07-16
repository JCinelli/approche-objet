package fr.diginamic.recensement.methods;

import java.util.List;

import fr.diginamic.recensement.entities.Ville;

public class PlusPetiteVilleDuDepartement {

	public static Ville recherchePlusPetiteVilleDuDepartement(List<Ville> listVilles, String codeDuDepartement) {
		
//		Initialisation d'une variable ville qui est la prmiere ville du tableau
		Ville laPlusPetite = listVilles.get(0);
		
//		Parcours de la liste de ville
		for (Ville ville : listVilles) {
			
//			A chaque tour de boucle, si le code departement passé en parametre est egal au code de la ville courante
			if (ville.getCodeDepartement().equals(codeDuDepartement)) {
				
//				Et que la population de la ville courante est inferieur a la population de laPlusPetite
				if (ville.getPopulation() < laPlusPetite.getPopulation()) {
					
//					Alors laPlusPetite prends la valeur de la ville courante
					laPlusPetite = ville;
					
				}
				
			}
			
		}
		
//		Si la valeur de laPlusPetite n'a pas changer c'est que le code du departement est introuvable
		if (laPlusPetite.getCodeCommune().equals("1")) {
			System.err.println("Le departement " + codeDuDepartement + " est introuvable..");
			return null;
		}
		
		return laPlusPetite;
		
	}
}
