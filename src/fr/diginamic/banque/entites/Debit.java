package fr.diginamic.banque.entites;

public class Debit extends Operation {

	public Debit(String dateOpe, double montantOpe) {
		super(dateOpe, montantOpe);
	}
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "DEBIT";
	}
	
	@Override
	public String toString() {
		return getType() + "--> Date de l'opération : " + dateOpe + " | Montant de l'operation : +" + montantOpe;
	}

}
