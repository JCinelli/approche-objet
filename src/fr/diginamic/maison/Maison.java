package fr.diginamic.maison;

public class Maison {

	private Piece[] pieceTab = new Piece[0];


//	METHODS	
	public void ajouterPiece(Piece newPiece) {
		
		if (newPiece != null && newPiece.getNumEtage() >= 0 && newPiece.getSuperficie() > 0) {	

		Piece newTab[] = new Piece[pieceTab.length + 1];

		for (int i = 0; i < pieceTab.length; i++) {
			newTab[i] = pieceTab[i];
		}

		newTab[newTab.length - 1] = newPiece;

		setPieceTab(newTab);
		
		} else {
			System.out.println("Données incohérentes!");
		}
	}

	public double superficieTotal() {
		double superficieTotal = 0;

		for (int i = 0; i < pieceTab.length; i++) {
			superficieTotal += pieceTab[i].getSuperficie();
		}

		return superficieTotal;
	}
	
	public double superficieEtage(int num) {
		double superficieEtage = 0;
		
		for (int i = 0; i < pieceTab.length; i++) {
			if (pieceTab[i].getNumEtage() == num) {
				superficieEtage += pieceTab[i].getSuperficie();
			}
		}
		
		return superficieEtage;
	}
	
	public double superficieType(Piece typePiece) {
		double superficieType = 0;
		
		for (int i = 0; i < pieceTab.length; i++) {
			if (pieceTab[i].getClass().getSimpleName().equals(typePiece.getClass().getSimpleName())) {
				superficieType += pieceTab[i].getSuperficie();
			}
		}
		
		return superficieType;
	}
	
	public int nbType(Piece typePiece) {
		int nbType = 0;
		
		for (Piece piece : pieceTab) {
			if (piece.getClass().getSimpleName().equals(typePiece.getClass().getSimpleName())) {
				nbType ++;
			}
		}
		
		return nbType;
	}

//	GETTERS & SETTERS
	/**
	 * @return the pieceTab
	 */
	public Piece[] getPieceTab() {
		return pieceTab;
	}

	/**
	 * @param pieceTab the pieceTab to set
	 */
	public void setPieceTab(Piece[] pieceTab) {
		this.pieceTab = pieceTab;
	}

}
