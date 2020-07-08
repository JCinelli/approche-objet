package fr.diginamic.dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TestCalendar {

	public static void main(String[] args) {

		Calendar cal = Calendar.getInstance();
		cal.set(2016, 4, 19, 23, 59, 30);
		Date date = cal.getTime();
		SimpleDateFormat formateur = new SimpleDateFormat("dd/MM/yyyy");
		String chaine = formateur.format(date);
		System.out.println(chaine);

		cal = Calendar.getInstance();
		date = cal.getTime();
		formateur = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		chaine = formateur.format(date);
		System.out.println(chaine);

		formateur = new SimpleDateFormat("EEEEE yyyy/MMMM/dd HH:mm:ss", Locale.FRANCE);
		chaine = formateur.format(date);
		System.out.println(chaine);

		formateur = new SimpleDateFormat("EEEEE yyyy/MMMM/dd HH:mm:ss", Locale.GERMANY);
		chaine = formateur.format(date);
		System.out.println(chaine);

		formateur = new SimpleDateFormat("EEEEE yyyy/MMMM/dd HH:mm:ss", Locale.CHINA);
		chaine = formateur.format(date);
		System.out.println(chaine);

		Locale russie = new Locale("ru", "RU");
		formateur = new SimpleDateFormat("EEEEE yyyy/MMMM/dd HH:mm:ss", russie);
		chaine = formateur.format(date);
		System.out.println(chaine);

	}

}
