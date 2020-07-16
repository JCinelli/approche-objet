package fr.diginamic.recensement.methods.comparator;

import java.util.Comparator;

import fr.diginamic.recensement.entities.Ville;

public class ComparatorVilles implements Comparator<Ville> {

	private boolean croissant;

	public ComparatorVilles(boolean croissant) {
		this.croissant = croissant;
	}

	@Override
	public int compare(Ville o1, Ville o2) {

//		Si croissant est a true la liste est rangé de la plus peuplee a la moins peuplee
		if (croissant) {
			if (o1.getPopulation() > o2.getPopulation()) {

				return -1;

			} else if (o1.getPopulation() < o2.getPopulation()) {

				return 1;

			} else {

				return 0;

			}
//		  Si croissant est a false c'est linverse
		} else {

			if (o1.getPopulation() < o2.getPopulation()) {

				return -1;

			} else if (o1.getPopulation() > o2.getPopulation()) {

				return 1;

			} else {

				return 0;

			}

		}
	}

}
