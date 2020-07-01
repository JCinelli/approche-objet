package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {

	private double[] tab = new double[0];

//	CONSTRUCTOR
	public CalculMoyenne() {
		super();
	}

//	METHODS
	@Override
	public String toString() {
		return "CalculMoyenne [tab=" + Arrays.toString(tab) + "]";
	}

	public void ajoutNote(double newNote) {
		
			double newTab[] = new double[tab.length + 1];
			
			for (int i = 0; i < tab.length; i++) {
				newTab[i] = tab[i];
			}
			
			newTab[newTab.length - 1] = newNote;
			
			setTab(newTab);
	}
	
	public double calculMoyenne() {
		double somme = 0;
		
		for (int i = 0; i < tab.length; i++) {
			somme += tab[i];
		}
		
		return somme / tab.length;
	}

//	GETTERS & SETTERS
	/**
	 * @return the tab
	 */
	public double[] getTab() {
		return tab;
	}

	/**
	 * @param tab the tab to set
	 */
	public void setTab(double[] tab) {
		this.tab = tab;
	}

}
