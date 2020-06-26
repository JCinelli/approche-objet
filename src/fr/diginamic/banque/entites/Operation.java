package fr.diginamic.banque.entites;

public abstract class Operation {

	String dateOpe;
	double montantOpe;
	
//	CONSTRUCTOR
	public Operation(String dateOpe, double montantOpe) {
		super();
		this.dateOpe = dateOpe;
		this.montantOpe = montantOpe;
	}
	
	public abstract String getType();

	/**
	 * @return the dateOpe
	 */
	public String getDateOpe() {
		return dateOpe;
	}

	/**
	 * @param dateOpe the dateOpe to set
	 */
	public void setDateOpe(String dateOpe) {
		this.dateOpe = dateOpe;
	}

	/**
	 * @return the montantOpe
	 */
	public double getMontantOpe() {
		return montantOpe;
	}

	/**
	 * @param montantOpe the montantOpe to set
	 */
	public void setMontantOpe(double montantOpe) {
		this.montantOpe = montantOpe;
	}
	
}
