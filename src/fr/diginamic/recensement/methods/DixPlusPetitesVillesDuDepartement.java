package fr.diginamic.recensement.methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.diginamic.recensement.entities.Ville;
import fr.diginamic.recensement.methods.comparator.ComparatorVilles;

public class DixPlusPetitesVillesDuDepartement {

	
	public static List<Ville> rechercheDixPlusPetitesVillesDuDepartement(List<Ville> listVilles, String codeDepartement) {
		
//		Declaration d'une liste qui contiendra les liste du departement
		List<Ville> villesDuDep = new ArrayList<Ville>();
		
//		Parcours de la liste des villes du fichier
		for (Ville ville : listVilles) {
			
//			Si le code departement de la ville courante est egal au code departement passé en parametre
			if (ville.getCodeDepartement().equals(codeDepartement)) {

//				Alors j'ajoute la ville courante a la liste des villes de la region
				villesDuDep.add(ville);
				
			}
			
		}
		
//		Si la liste a une taille de 0, donc qu'elle est vide
		if (villesDuDep.size() == 0) {
			
//			Alors c'est que le code du departemennt en parametre est introuvable
			System.err.println("Le département " + codeDepartement + " est introuvable..");
			return null;
		}
		
//		Tri de la liste des villes de la regions de la moins peuplee a la plus peuplee 
		Collections.sort(villesDuDep, new ComparatorVilles(false));
		
//		Creation d'une nouvelle listes qui contiendra seulement les 10 villes les moins peuplee
		List<Ville> dixPlusPetitesVilles = new ArrayList<>();
		
//		Remplissage de la liste des dix plus grandes villes avec les 10 premiere valeur de la liste des villes de la region
		for (int i = 0; i < 10; i++) {
			dixPlusPetitesVilles.add(villesDuDep.get(i));
		}
		
		return dixPlusPetitesVilles;
		
	}
}
