package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

	public static void main(String[] args) {

	Salarie sala1 = new Salarie("Zizou", "John", 1357.22);
	Pigiste pig1 = new Pigiste("Mousse", "Tarzan", 10, 92.32);
	
	System.out.println("Le salaire du Salarié est --> " + sala1.getSalaire());
	System.out.println("Le salaire du Pigiste est --> " + pig1.getSalaire());
	
	System.out.println("\r_________________________________________________\r");
	
	System.out.println(sala1.afficherDonnees());
	
	System.out.println("\r_________________________________________________\r");
	
	System.out.println(pig1.afficherDonnees());
	}

}
