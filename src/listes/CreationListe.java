package listes;

import java.util.ArrayList;
import java.util.List;

public class CreationListe {

	public static void main(String[] args) {

		List<Integer> listInt = new ArrayList<>();
		
		for (int i = 1; i <= 100; i++) {
			listInt.add(i);
		}
		
		System.out.println(listInt.size());
	}

}
