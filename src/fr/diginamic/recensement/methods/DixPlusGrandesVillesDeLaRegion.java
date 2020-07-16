package fr.diginamic.recensement.methods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import fr.diginamic.recensement.entities.Ville;
import fr.diginamic.recensement.methods.comparator.ComparatorVilles;

public class DixPlusGrandesVillesDeLaRegion {

	public static List<Ville> rechercheDixPlusGrandesVillesDeLaRegion(List<Ville> listVilles, String nomDeLaRegion) {

//		Creation d'une liste qui contiendra toute les villes de la region
		List<Ville> listVillesDeLaRegion = new ArrayList<>();

//		Parcours de la listes des villes du fichier
		for (Ville ville : listVilles) {

//			Si le nom de la region de la ville courante est egal au nom passé en parametre
			if (ville.getNomRegion().toLowerCase().equals(nomDeLaRegion.toLowerCase())) {

//				Alors on ajoute la ville courante a la liste des villes de la région
				listVillesDeLaRegion.add(ville);

			}

		}
		
//		Si la liste a une taille de 0, donc qu'elle est vide
		if (listVillesDeLaRegion.size() == 0) {
			
//			Alors c'est que le nom de la region en parametre est introuvable
			System.err.println("La région " + nomDeLaRegion + " est introuvable..");
			return null;
		}
		
//		Tri de la liste des villes de la regions de la plus peuplee a la moins peuplee
		Collections.sort(listVillesDeLaRegion, new ComparatorVilles(true));
		
//		Creation d'une nouvelle liste qui contiendra seulement les dix villes les plus peuplee de la region
		List<Ville> dixPlusGrande = new ArrayList<>();
		
//		Remplissage de la liste ci dessus avec les dix premieres villes de la liste de villes de la région
		for (int i = 0; i < 10; i++) {
			
			dixPlusGrande.add(listVillesDeLaRegion.get(i));
			
		}
		
		return dixPlusGrande;
		
	}

}
