package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Operation tabOpe[] = new Operation[8];

		tabOpe[0] = new Debit("10 / 12 / 2008", 160);
		tabOpe[1] = new Debit("25 / 01 / 2009", 1250.20);
		tabOpe[2] = new Debit("03 / 05 / 2008", 22.35);
		tabOpe[3] = new Debit("30 / 02 / 2022", 8.11);

		tabOpe[4] = new Credit("20 / 12 / 2008", 80.20);
		tabOpe[5] = new Credit("13 / 05 / 2009", 77.32);
		tabOpe[6] = new Credit("29 / 10 / 2008", 25.35);
		tabOpe[7] = new Credit("24 / 11 / 2022", 300.95);

		double montantGlobal = 0;

		for (int i = 0; i < tabOpe.length; i++) {
			System.out.println(tabOpe[i]);

			if (tabOpe[i].getType().equals("CREDIT")) {

				montantGlobal += tabOpe[i].getMontantOpe();

			} else {

				montantGlobal -= tabOpe[i].getMontantOpe();

			}

		}

		System.out.println("\r___________________________________\r");
		System.out.println("Le solde du compte est de --> " + montantGlobal + "$");
	}

}
