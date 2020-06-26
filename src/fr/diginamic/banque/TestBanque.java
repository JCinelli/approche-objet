package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Compte compte1 = new Compte("FR15122645522", 30251);
		CompteTaux compte2 = new CompteTaux("FR458522326", 125.02, 3.2);
		
		Compte tabCompte[] = new Compte[2];
		
		tabCompte[0] = compte1;
		tabCompte[1] = compte2;
		
		double soldeTotal = 0;
		
		for (int i = 0; i < tabCompte.length; i++) {
			
			soldeTotal += tabCompte[i].getSoldeCompte(); 
			System.out.println(tabCompte[i]);
			System.out.println("\r___________________________________\r");
		}
		
		System.out.println("Le solde global de votre compte est de " + soldeTotal);
	}

}
