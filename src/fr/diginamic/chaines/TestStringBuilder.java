package fr.diginamic.chaines;

public class TestStringBuilder {

	public static void main(String[] args) {

		StringBuilder builder = new StringBuilder();
		
		long debut = System.currentTimeMillis();
		
		for (int i = 1; i <= 100000; i++) {
			builder.append(i);
		}
		
		long fin = System.currentTimeMillis();
		
		System.out.println("Temps écoulé en millisecondes avec StringBuilder:" + (fin - debut));

		long debut2 = System.currentTimeMillis();
		
		String test = "";
		
		for (int i = 1; i <= 100000; i++) {

			test += i;
		}
		
		long fin2 = System.currentTimeMillis();
		
		System.out.println("Temps écoulé en millisecondes sans StringBuilder:" + (fin2 - debut2));
	}

}
