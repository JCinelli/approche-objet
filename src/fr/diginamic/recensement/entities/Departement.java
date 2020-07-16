package fr.diginamic.recensement.entities;

public class Departement {

	private String codeDep;
	private int populationTotale;
	
//	CONSTRUCTOR
	public Departement(String codeDep, int populationTotale) {
		super();
		this.codeDep = codeDep;
		this.populationTotale = populationTotale;
	}

//	METHODS
	@Override
	public String toString() {
		return "Departement :\r Code du département : " + codeDep + "\r Population totale : " + populationTotale;
	}

//	GETTERS & SETTERS
	/**
	 * @return the codeDep
	 */
	public String getCodeDep() {
		return codeDep;
	}

	/**
	 * @param codeDep the codeDep to set
	 */
	public void setCodeDep(String codeDep) {
		this.codeDep = codeDep;
	}

	/**
	 * @return the populationTotale
	 */
	public int getPopulationTotale() {
		return populationTotale;
	}

	/**
	 * @param populationTotale the populationTotale to set
	 */
	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}
	
	
	
}
