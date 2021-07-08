package homework8;

import java.util.*;

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

		for (Map.Entry entry : myMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}

		// There are at least two persons with the same firstName among these 10 people?
		System.out.println(checkDuplicateValues(myMap));
		System.out.println("======================================");
		//Remove Orest ))) <^_^>
		removePersonWithTheFirstName(myMap, "Iggie");
		System.out.println(myMap);
	}

	public static boolean checkDuplicateValues(Map<String, String> map) {
		Set<String> valuesSet = new HashSet<String>();
		valuesSet.addAll(map.values());
		if (valuesSet.size() < map.size()) {
			return true;
		}
		return false;
	}
	
	public static Map<String, String> removePersonWithTheFirstName(Map<String, String> map, String name) {
		Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> entry = (Map.Entry<String, String>) it.next();
			if(entry.getValue().equals(name)) {
				it.remove();
			}
		}
		return map;
	}
}
