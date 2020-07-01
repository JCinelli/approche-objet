package fr.diginamic.maison;

public class Chambre extends Piece {

//	CONSTRUCTOR
	public Chambre(double superficie, int numEtage) {
		super(superficie, numEtage);
	}

	@Override
	public String toString() {
		return "Chambre --> Superficie --> " + getSuperficie() + "| Etage --> " + getNumEtage();
				
	}

}
