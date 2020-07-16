package fr.diginamic.recensement.entities;

public class Region {

	private String nomRegion;
	private String codeRegion;
	private Integer popTot;
	
//	CONSTRUCTOR
	public Region(String nomRegion, Integer popTot) {
	super();
	this.nomRegion = nomRegion;
	this.popTot = popTot;
}
	
//	METHODS
@Override
	public String toString() {
		return "Region :\r Nom de la region : " + nomRegion + "\r Population totale : " + popTot;
	}

	//	GETTERS & SETTERS
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
	 * @return the popTot
	 */
	public Integer getPopTot() {
		return popTot;
	}

	/**
	 * @param popTot the popTot to set
	 */
	public void setPopTot(Integer popTot) {
		this.popTot = popTot;
	}
	
	
	
}
