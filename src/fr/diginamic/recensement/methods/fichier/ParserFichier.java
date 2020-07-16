package fr.diginamic.recensement.methods.fichier;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.recensement.entities.Ville;

public class ParserFichier {

	public static List<Ville> parseFichier(List<String> lignesFichier) {
		
		List<Ville> listVilles = new ArrayList<>();
		
//		Suppression de la premiere ligne car inutile
		lignesFichier.remove(0);
		
//		Parcours de chaque lignes du fichier
		for (String ligne : lignesFichier) {
//			Decoupages de la ligne en plusieurs morceaux correspondant a un attribut d'une ville
			String[] morceaux = ligne.split(";");
			
			String codeRegion = morceaux[0];
			String nomRegion = morceaux[1];
			String codeDepartement = morceaux[2];
			String codeCommune = morceaux[5];
			String nomCommune = morceaux[6];
			// Changement du type de population (String to int) tout en supprimant les espaces
			int population = Integer.parseInt(morceaux[7].replaceAll(" ", "")); 
			
//			Creation de la ville grace aux morceaux
			Ville ville = new Ville(nomCommune, codeCommune, codeDepartement, nomRegion, codeRegion, population);
			
//			Ajout de la ville a la liste
			listVilles.add(ville);
		}
		
		return listVilles;
	}
}
