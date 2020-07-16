package fr.diginamic.recensement.entities;

public class Ville {

	private String nomCommune;
	private String codeCommune;
	private String codeDepartement;
	private String nomRegion;
	private String codeRegion;
	private int population;
	
//	CONSTRUCTOR_______________________________________________________________________________________________________________________
	public Ville(String nomCommune, String codeCommune, String codeDepartement, String nomRegion, String codeRegion, int population) {
		this.nomCommune = nomCommune;
		this.codeCommune = codeCommune;
		this.codeDepartement = codeDepartement;
		this.nomRegion = nomRegion;
		this.codeRegion = codeRegion;
		this.population = population;
	}

//	METHODS_______________________________________________________________________________________________________________________
	@Override
	public String toString() {
		return "Ville :" +
				"\r Nom de la commune : " + nomCommune + 
				"\r Code de la commune : " + codeCommune + 
				"\r Code du département : "	+ codeDepartement + 
				"\r Nom de la région : " + nomRegion + 
				"\r Code de la région : " + codeRegion + 
				"\r Population : " + population;
	}
	
//	GETTERS & SETTERS_______________________________________________________________________________________________________________________
	/**
	 * @return the nomCommune
	 */
	public String getNomCommune() {
		return nomCommune;
	}

	/**
	 * @param nomCommune the nomCommune to set
	 */
	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	/**
	 * @return the codeCommune
	 */
	public String getCodeCommune() {
		return codeCommune;
	}

	/**
	 * @param codeCommune the codeCommune to set
	 */
	public void setCodeCommune(String codeCommune) {
		this.codeCommune = codeCommune;
	}

	/**
	 * @return the codeDepartement
	 */
	public String getCodeDepartement() {
		return codeDepartement;
	}

	/**
	 * @param codeDepartement the codeDepartement to set
	 */
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
	}

	/**
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}

	/**
	 * @param nomRegion the nomRegion to set
	 */
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	/**
	 * @return the codeRegion
	 */
	public String getCodeRegion() {
		return codeRegion;
	}

	/**
	 * @param codeRegion the codeRegion to set
	 */
	public void setCodeRegion(String codeRegion) {
		this.codeRegion = codeRegion;
	}

	/**
	 * @return the population
	 */
	public int getPopulation() {
		return population;
	}

	/**
	 * @param population the population to set
	 */
	public void setPopulation(int population) {
		this.population = population;
	}
}
