package fr.diginamic.maison;

public class SalleDeBain extends Piece {

//	CONSTRUCTOR
	public SalleDeBain(double superficie, int numEtage) {
		super(superficie, numEtage);
	}

	@Override
	public String toString() {
		return "Salle de bain --> Superficie --> " + getSuperficie() + "| Etage --> " + getNumEtage();
				
	}
}
