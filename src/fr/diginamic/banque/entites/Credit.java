package fr.diginamic.banque.entites;

public class Credit extends Operation {

	public Credit(String dateOpe, double montantOpe) {
		super(dateOpe, montantOpe);
	}
	
	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return "CREDIT";
	}

	@Override
	public String toString() {
		return getType() + "--> Date de l'opération : " + dateOpe + " | Montant de l'operation : -" + montantOpe;
	}
}
