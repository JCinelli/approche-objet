package fr.diginamic.banque.entites;

public class Debit extends Operation {

//	CONSTRUCTOR
	public Debit(String dateOpe, double montantOpe) {
		super(dateOpe, montantOpe);
	}
	
//	METHODS
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "DEBIT";
	}
	
	@Override
	public String toString() {
		return getType() + "--> Date de l'opération : " + super.getDateOpe() + " | Montant de l'operation : +" + super.getMontantOpe();
	}

}
