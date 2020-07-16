package fr.diginamic.recensement;

import java.util.List;

import fr.diginamic.recensement.entities.Departement;
import fr.diginamic.recensement.entities.Region;
import fr.diginamic.recensement.entities.Ville;
import fr.diginamic.recensement.methods.DepartementPlusPeupleDeLaRegion;
import fr.diginamic.recensement.methods.DixDepPlusPeupleFrance;
import fr.diginamic.recensement.methods.DixPlusGrandesVillesDeLaRegion;
import fr.diginamic.recensement.methods.DixPlusGrandesVillesDuDepartement;
import fr.diginamic.recensement.methods.DixPlusPetitesVillesDuDepartement;
import fr.diginamic.recensement.methods.DixRegionsPlusPeupleesFrance;
import fr.diginamic.recensement.methods.DixVillesPlusPeupleesFrance;
import fr.diginamic.recensement.methods.InfosVille;
import fr.diginamic.recensement.methods.PlusPetiteVilleDuDepartement;
import fr.diginamic.recensement.methods.PopulationDeLaRegion;
import fr.diginamic.recensement.methods.PopulationDuDepartement;
import fr.diginamic.recensement.methods.fichier.LectureFichier;
import fr.diginamic.recensement.methods.fichier.ParserFichier;

public class Application {

	public static void main(String[] args) {

//		Recuperation de chaque ligne du fichier
		List<String> lignesFichier = LectureFichier.lireFichier();
//		Creation de la liste des villes a partir des lignes du fichier
		List<Ville> listVilles = ParserFichier.parseFichier(lignesFichier);
		
		System.out.println("-------------------------Afficher les infos concernant la ville de Montpellier--------------------------------\r");
//		Recuperation de la ville pass� en parametre a partir de la methode de la classe InfosVille
		Ville ville = InfosVille.informationsSurLaVille(listVilles, "Montpellier");
//		Affichage de la ville
		System.out.println(ville);
		
		
		System.out.println("\r-------------------------Afficher la population de tout le departement de l'Hérault--------------------------------\r");
//		Recuperation de la population totale du departement a partir de la methode de la classe PopulationDuDepartement
		int populationTotaleDuDepartement = PopulationDuDepartement.populationTotaleDuDepartement(listVilles, "34");
//		Affichage de la population totale du departement
		System.out.println("Dans ce département, il y a " + populationTotaleDuDepartement + " habitants.");
		
		
		System.out.println("\r-------------------------Afficher la plus petite ville departement de l'Hérault--------------------------------\r");

//		Recuperation de la plus petite ville du departement pass� en parametre a partir de la methode de la classe PlusPetiteVilleDuDepartement
		Ville plusPetiteVille = PlusPetiteVilleDuDepartement.recherchePlusPetiteVilleDuDepartement(listVilles, "34");
//		Affichage de la ville
		System.out.println("La plus petite ville de ce departement est :\r\r" + plusPetiteVille);
		
		
		System.out.println("\r------------------------- 10 plus grandes villes du d�partement de l'Hérault--------------------------------\r");
//		Recuperation des dix plus grandes villes de l'hérault a partir de la methode de la classe DixPlusGrandesVillesDuDepartement
		List<Ville> dixPlusGrandesVillesDuDep = DixPlusGrandesVillesDuDepartement.rechercheDixPlusGrandesVillesDuDepartement(listVilles, "34");
//		Parcours de la liste pour affichage
		for (int i = 0; i < dixPlusGrandesVillesDuDep.size(); i++) {
			System.out.println(i + 1 + ") " + dixPlusGrandesVillesDuDep.get(i) + "\r");
		}
		
		
		System.out.println("\r------------------------- 10 plus petites villes du département de l'Hérault--------------------------------\r");
//		Recuperation des dix plus grandes villes de l'hérault a partir de la methode de la classe DixPlusGrandesVillesDuDepartement
		List<Ville> dixPlusPetitesVillesDuDep = DixPlusPetitesVillesDuDepartement.rechercheDixPlusPetitesVillesDuDepartement(listVilles, "34");
//		Parcours de la liste pour affichage
		for (int i = 0; i < dixPlusPetitesVillesDuDep.size(); i++) {
			System.out.println(i + 1 + ") " + dixPlusPetitesVillesDuDep.get(i) + "\r");
		}
		
		System.out.println("\r-------------------------Afficher la population de toute la région Occitanie--------------------------------\r");
//		Recuperation de la population totale de la region Occitanie a partir de la methode de la classe PopulationRegion	
		int populationTotaleDeLaRegion = PopulationDeLaRegion.recherchePopulationDeLaRegion(listVilles, "Occitanie");
//		Affichage du nombre
		System.out.println("Dans cette région, il y a " + populationTotaleDeLaRegion + " habitants.");
		
		
		System.out.println("\r------------------------- 10 plus grandes villes de la région Occitanie--------------------------------\r");
//		Recuperation des 10 plus grandes villes de la region a partir de la methode de la classe dixPlusGrandesVillesDeLaRegion
		List<Ville> dixPlusGrandesVillesDeLaRegion = DixPlusGrandesVillesDeLaRegion.rechercheDixPlusGrandesVillesDeLaRegion(listVilles, "Occitanie");
//		Parcours de la liste pour affichage
		for (int i = 0; i < dixPlusGrandesVillesDeLaRegion.size(); i++) {
			System.out.println(i + 1 + ") " + dixPlusGrandesVillesDeLaRegion.get(i) + "\r");
		}
		
		
		System.out.println("\r------------------------- Afficher le département le plus peulé de la région Occitanie--------------------------------\r");
//		Recuperation du code du departement le plus peuple de la region a partir de la methode de la classe DepartementPlusPeupleRegion
		String codeDepPlusPeupleDeLaRegion = DepartementPlusPeupleDeLaRegion.rechercheDepartementPlusPeupleDeLaRegion(listVilles, "Occitanie");
//		Affichage du departement
		System.out.println("Le département le plus peuplé de cette région est le " + codeDepPlusPeupleDeLaRegion);
		
		
		System.out.println("\r-------------------------Affichez les 10 régions les plus peuplées de France--------------------------------\r");
//		Recuperation des 10 plus grandes region  de Francec a partir de la methode de la classe DixRegionsPlusPeupleesFrance
		List<Region> dixPlusGrandesRegions = DixRegionsPlusPeupleesFrance.rechercheDixRegionsPlusPeupleesFrance(listVilles);
//		Parcours de la liste pour affichage
		for (int i = 0; i < dixPlusGrandesRegions.size(); i++) {
			System.out.println(i + 1 + ") " + dixPlusGrandesRegions.get(i) + "\r");
		}
		
		System.out.println("\r-------------------------Affichez les 10 département les plus peuplés de France--------------------------------\r");
//		Recuperation des 10 plus grands dep  de Francec a partir de la methode de la classe DixDepPlusPeupleFrance
		List<Departement> dixPlusGrandDep = DixDepPlusPeupleFrance.rechercheDixDepPlusPeupleFrance(listVilles);
//		Parcours de la liste pour affichage
		for (int i = 0; i < dixPlusGrandDep.size(); i++) {
			System.out.println(i + 1 + ") " + dixPlusGrandDep.get(i) + "\r");
		}
		
		System.out.println("\r-------------------------Affichez les 10 villes les plus peuplées de France.--------------------------------\r");
//		Recuperation des 10 plus grandes villes de Francec a partir de la methode de la classe DixVillesPlusPeupleesFrance
		List<Ville> dixPlusGrandesVillesFrance = DixVillesPlusPeupleesFrance.rechercheDixVillesPlusPeupleesFrance(listVilles);
//		Parcours de la liste pour affichage
		for (int i = 0; i < dixPlusGrandesVillesFrance.size(); i++) {
			System.out.println(i + 1 + ") " + dixPlusGrandesVillesFrance.get(i) + "\r");
		}
	}

}
