package fr.diginamic.recensement.methods;

import java.util.List;

import fr.diginamic.recensement.entities.Ville;

public class InfosVille {

	public static Ville informationsSurLaVille(List<Ville> listVilles, String nomDeLaCommune) {
		
//		Parcours de la liste de villes
		for (Ville ville : listVilles) {
			
//			Si dans la liste le nom de la commune passé en parametre est egal au nom de la commune de la ville courante
			if (nomDeLaCommune.equals(ville.getNomCommune())) {
				
//				Alors on retourne la ville courante
				return ville;
				
			}
			
		}
		
//		Si on est la c'est qu'aucune ville n'a été retourné dans la boucle
		System.err.println("La commune " + nomDeLaCommune + " est introuvable..");
		return null;
		
	}
}
