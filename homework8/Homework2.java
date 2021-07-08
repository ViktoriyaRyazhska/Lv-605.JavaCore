package homework8;

import java.util.*;
import java.util.Map.Entry;

public class Homework2 {
	public static void main(String[] args) {
		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("Jolie", "Angelina");
		myMap.put("Pitt", "Brad");
		myMap.put("Talor", "Corey");
		myMap.put("Mustane", "Dave");
		myMap.put("Mercury", "Fraddie");
		myMap.put("Lucas", "George");
		myMap.put("Lory", "Iggie");
		myMap.put("Pop", "Iggie");
		myMap.put("Aniston", "Jennifer");
		myMap.put("Reaves", "Keanu");
		myMap.put("Lohan", "Lindsey");
		myMap.put("Manson", "Marlyn");
		myMap.put("Kidman", "Nicole");

		// Testing different ways of output
		System.out.println(myMap);
		System.out.println(myMap.entrySet());
		Iterator<Entry<String, String>> it = myMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
		System.out.println("=========================================");
		for (Map.Entry entry : myMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		// There are at least two persons with the same firstName among these 10 people?
		System.out.println(checkDuplicateValues(myMap));

	}

	public static boolean checkDuplicateValues(Map<String, String> map) {
		Set<String> valuesSet = new HashSet<String>();
		valuesSet.addAll(map.values());
		if (valuesSet.size() < map.size()) {
			return true;
		}
		return false;
	}
}
