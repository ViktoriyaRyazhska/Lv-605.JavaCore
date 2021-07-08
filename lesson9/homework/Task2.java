package lesson9.homework;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class Task2 {
	public static void main(String[] args) {
		HashMap<String, String> personMap = new HashMap<>();
		HashSet<String> set = new HashSet<String>();
		String[] firstNames = { "Roman", "Vasya", "Mykola", "Roman", "Myron", "Misha", "Olya", "Eguene", "Olena",
				"Dmytro" };
		String[] lastNames = { "Kols", "Pupkin", "Klymus", "Meniok", "Kozak", "Kochuk", "Chayka", "Ledviy", "Lesiv",
				"Byk" };

		for (int i = 0; i < firstNames.length; i++) {
			personMap.put(lastNames[i], firstNames[i]);
		}
		set.addAll(personMap.values());

		System.out.println(personMap.toString().replace("=", " "));
		if (personMap.size() > set.size()) {
			System.out.println("There are more than two persons with the same name.");
		} else {
			System.out.println("There are not persons with the same name");
		}
		
		Iterator<Map.Entry<String, String> > iterator = personMap.entrySet().iterator();
		while (iterator.hasNext()) {
		    Map.Entry<String, String> entry = iterator.next();
		    if ("Roman".equals(entry.getValue())) {
		        iterator.remove();
		    }
		}
		System.out.println(personMap.toString().replace("=", " "));
	}
}
