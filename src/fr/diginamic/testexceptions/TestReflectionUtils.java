package fr.diginamic.testexceptions;

import fr.diginamic.testexceptions.exceptions.ReflectionException;
import sets.Pays;

public class TestReflectionUtils {

	public static void main(String[] args) {

		Pays france = new Pays("France", 66_990_000, 41463.64);
		
		try {
			
			ReflectionUtils.afficherAttributs(france);
			
		} catch (IllegalArgumentException e) {
			
			e.printStackTrace();
			
		} catch (IllegalAccessException e) {
			
			e.printStackTrace();
			
		} catch (ReflectionException e) {
			
			System.err.println(e);
			
		}
		
	}

}
