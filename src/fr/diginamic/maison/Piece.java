package fr.diginamic.maison;

public abstract class Piece {

	private double superficie;
	private int numEtage;
	
//	CONSTRUCTOR
	public Piece(double superficie, int numEtage) {
		super();
		this.superficie = superficie;
		this.numEtage = numEtage;
	}

//	GETTERS & SETTERS
	/**
	 * @return the superficie
	 */
	public double getSuperficie() {
		return superficie;
	}

	/**
	 * @param superficie the superficie to set
	 */
	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	/**
	 * @return the numEtage
	 */
	public int getNumEtage() {
		return numEtage;
	}

	/**
	 * @param numEtage the numEtage to set
	 */
	public void setNumEtage(int numEtage) {
		this.numEtage = numEtage;
	}
	
	
}
