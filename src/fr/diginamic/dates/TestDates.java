package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDates {

	public static void main(String[] args) {

		Date dateJour = new Date(120, 6, 8);
		
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		
		String dateFormater = formateur.format(dateJour);
		
		System.out.println(dateFormater);
		
		Date uneDate = new Date(116, 4, 19, 23, 59, 30);
				
		formateur = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		
		dateFormater = formateur.format(uneDate);
		
		System.out.println(dateFormater);
		
		Date now = new Date();
		
		dateFormater = formateur.format(now);
		
		System.out.println(dateFormater);
		
		
		
	}

}
