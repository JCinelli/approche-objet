package tri;

import java.util.Comparator;

import listes.Ville;

public class ComparatorHabitant implements Comparator<Ville> {

	@Override
	public int compare(Ville o1, Ville o2) {
		if (o1.getNbHab() > o2.getNbHab()) {
			return -1;
		} else if (o1.getNbHab() < o2.getNbHab()) {
			return 1;
		} else {
			return 0;
		}
	}

}
