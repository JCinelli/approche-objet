package fr.diginamic.maison;

public class Cuisine extends Piece {

//	CONSTRUCTOR
	public Cuisine(double superficie, int numEtage) {
		super(superficie, numEtage);
	}

	@Override
	public String toString() {
		return "Cuisine --> Superficie --> " + getSuperficie() + "| Etage --> " + getNumEtage();
				
	}
}
