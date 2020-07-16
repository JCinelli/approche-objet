package fr.diginamic.recensement.methods;

import java.util.ArrayList;
import java.util.List;

import fr.diginamic.recensement.entities.Ville;
import fr.diginamic.recensement.methods.comparator.ComparatorVilles;

public class DixVillesPlusPeupleesFrance {

	public static List<Ville> rechercheDixVillesPlusPeupleesFrance(List<Ville> listVilles) {
		
//		Tri de la liste qui contient toute les villes de france par ordre croissant
		listVilles.sort(new ComparatorVilles(true));
		
//		Creation d'une list qui condiendra les 10 plus peuplees
		List<Ville> dixPlusGrandes = new ArrayList<>();
		
		for (int i = 0; i < 10; i++) {
			
//			Remplissage de la liste avec les 10 premiers elements de la premiere liste
			dixPlusGrandes.add(listVilles.get(i));
			
		}
		
		return dixPlusGrandes;
	}
	
}
