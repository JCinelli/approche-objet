package fr.diginamic.maison;

public class Wc extends Piece {

//	CONSTRUCTOR
	public Wc(double superficie, int numEtage) {
		super(superficie, numEtage);
	}

	@Override
	public String toString() {
		return "Wc --> Superficie --> " + getSuperficie() + "| Etage --> " + getNumEtage();
				
	}
}
