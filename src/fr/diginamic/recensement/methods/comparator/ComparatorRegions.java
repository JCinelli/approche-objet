package fr.diginamic.recensement.methods.comparator;

import java.util.Comparator;

import fr.diginamic.recensement.entities.Region;
import fr.diginamic.recensement.entities.Ville;

public class ComparatorRegions implements Comparator<Region>{


	private boolean croissant;

	public ComparatorRegions(boolean croissant) {
		this.croissant = croissant;
	}

	@Override
	public int compare(Region o1, Region o2) {

//		Si croissant est a true la liste est rangé du plus grand au plus petit
		if (croissant) {
			if (o1.getPopTot() > o2.getPopTot()) {

				return -1;

			} else if (o1.getPopTot() < o2.getPopTot()) {

				return 1;

			} else {

				return 0;

			}
//		  Si croissant est a false c'est linverse
		} else {

			if (o1.getPopTot() < o2.getPopTot()) {

				return -1;

			} else if (o1.getPopTot() > o2.getPopTot()) {

				return 1;

			} else {

				return 0;

			}

		}
	}
	
}
