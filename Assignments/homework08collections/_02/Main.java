package homework08collections._02;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		Map<String, String> personMap = new LinkedHashMap<>();

		personMap.put("Ochmoneck", "Jake");
		personMap.put("Obama", "Barak");
		personMap.put("Trump", "Donald");
		personMap.put("Lohan", "Lindsey");
		personMap.put("Voronko", "Eugene");
		personMap.put("Man", "Police");
		personMap.put("Windows", "Kate");
		personMap.put("Clarkson", "Kelly");
		personMap.put("Sandler", "Adam");
		personMap.put("Taner", "Eugene");

		for (String pers : personMap.keySet()) {
			System.out.println(pers + " " + personMap.get(pers));
		}

//		Iterator<Map.Entry<String, String>> iterator = personMap.entrySet().iterator();
//		while (iterator.hasNext()) {
//			Map.Entry<String, String> entry = (Map.Entry<String, String>) iterator.next();
//			if (entry.getValue().equals("Eugene")) {
//				iterator.remove();
//			}
//		}

		for (Iterator<Entry<String, String>> i = personMap.entrySet().iterator(); i.hasNext();) {
			Map.Entry<String, String> entry = i.next();
			if (entry.getValue().equals("Eugene")) {
				i.remove();
			}
		}

//		for (Map.Entry<String, String> entry : personMap.entrySet()) {
//			if (entry.getValue().equals("Eugene")) {
//				personMap.remove(entry.getKey());
//			}
//		}

//		for (Map.Entry<String, String> entry : personMap.entrySet()) {
//			for (Map.Entry<String, String> newEntry : personMap.entrySet()) {
//				while (!entry.getValue().equals(newEntry.getValue())) {
//					personMap.remove(newEntry.getKey());
//				}
//			}
//		}

		System.out.println();

		for (String pers : personMap.keySet()) {
			System.out.println(pers + " " + personMap.get(pers));
		}
	}
}
