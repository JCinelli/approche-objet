package fr.diginamic.essais;

import entites.AdressePostale;
import entites.Personne;
import fr.diginamic.entities.CompteBancaire;

public class TestCompteBancaire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AdressePostale ad1 = new AdressePostale(13, "Rue de la soif", "13000", "Marseille");
		Personne pers1 = new Personne("Pastis", "Marcel", ad1);
		CompteBancaire cpt1 = new CompteBancaire("FR0003145201325", 1459.32, pers1);
		
		cpt1.crediterMontant(156.32);
		cpt1.debiterMontant(600.45);
		
		System.out.println(cpt1);
	}

}
