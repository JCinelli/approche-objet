package fr.diginamic.recensement.methods.fichier;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class LectureFichier {

	public static List<String> lireFichier() {
		try {
			
//			Aller chercher le fichier et le mettre dans un variable (file)
			File file = new File("C:/temp/recensement population 2016.csv");
			
//			Cr�ation d'une liste qui contient chaque lignes du fichier
			List<String> lignes = FileUtils.readLines(file, "UTF-8");
			
			return lignes;
			
			} catch (IOException e) {
				
			System.out.println(e.getMessage());
			return null;
			}
	}
}
