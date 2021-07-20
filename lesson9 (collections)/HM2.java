package hm2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HM2 {
	public static void main(String[] args) {
		
		HashMap<String, String> personMap = new HashMap<>();
		HashSet<String> set = new HashSet<String>();
		
			personMap.put("Petrenko ", " Ivan");
			personMap.put("Ivanenko ", " Petro");
			personMap.put("Romanenko ", " Volodymyr");
			personMap.put("Vasylenko ", " Ivan");
			personMap.put("Symonenko ", " Stepan");
			personMap.put("Bondarenko ", " Vasyl");
			personMap.put("Semko ", " Roman");
			personMap.put("Ostapenko ", " Maksym");
			personMap.put("Kozachenko ", " Ostap");
			personMap.put("Stepanenko ", " Bohdan");
			
			/*
			 * for (String person: personMap.keySet()) { System.out.println(person +
			 * personMap.get(person)); }
			 */
	
		for (Map.Entry<String, String> entry : personMap.entrySet()) {
			if (entry.getValue().equals("Ivan")) {
				personMap.remove(entry.getKey());
			}
		}
		
		for (String person: personMap.keySet()) {
			System.out.println(person + personMap.get(person));
		}
	
}
	
	
}