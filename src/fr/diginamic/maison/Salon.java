package fr.diginamic.maison;

public class Salon extends Piece {

//	CONSTRUCTOR
	public Salon(double superficie, int numEtage) {
		super(superficie, numEtage);
	}
	
	@Override
	public String toString() {
		return "Salon --> Superficie --> " + getSuperficie() + "| Etage --> " + getNumEtage();
				
	}

}
