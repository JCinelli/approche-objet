package fr.diginamic.recensement.methods.comparator;

import java.util.Comparator;

import fr.diginamic.recensement.entities.Departement;

public class ComparatorDepartements implements Comparator<Departement>{


	private boolean croissant;

	public ComparatorDepartements(boolean croissant) {
		this.croissant = croissant;
	}

	@Override
	public int compare(Departement o1, Departement o2) {

//		Si croissant est a true la liste est rangé du plus grand au plus petit
		if (croissant) {
			if (o1.getPopulationTotale() > o2.getPopulationTotale()) {

				return -1;

			} else if (o1.getPopulationTotale() < o2.getPopulationTotale()) {

				return 1;

			} else {

				return 0;

			}
//		  Si croissant est a false c'est linverse
		} else {

			if (o1.getPopulationTotale() < o2.getPopulationTotale()) {

				return -1;

			} else if (o1.getPopulationTotale() > o2.getPopulationTotale()) {

				return 1;

			} else {

				return 0;

			}

		}
	}
	
}
