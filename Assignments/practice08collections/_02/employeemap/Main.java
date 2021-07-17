package practice08collections._02.employeemap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//	public static void employeeEntry(BufferedReader br, Map<Integer, String> employeeMap) throws IOException {
//		System.out.println("Please enter employee's ID:");
//		int id = Integer.parseInt(br.readLine());
//		System.out.println("Please enter employee's name:");
//		String name = br.readLine();
//		employeeMap.put(id, name);
//	}

	public static void main(String[] args) throws IOException {

		Map<Integer, String> employeeMap = new HashMap<>();

//		for (int i = 0; i < 7; i++) {
//			employeeEntry(br, employeeMap);
//		}

		employeeMap.put(01, "Johnny");
		employeeMap.put(02, "Jane");
		employeeMap.put(03, "Vasyl");
		employeeMap.put(04, "Kate");
		employeeMap.put(05, "Jane");
		employeeMap.put(06, "Carrie");
		employeeMap.put(07, "Robert");

		System.out.println(employeeMap);

		System.out.println("Please enter the ID of a person to find the corresponding name:");
		int id = Integer.parseInt(br.readLine());
		if (employeeMap.containsKey(id)) {
			System.out.println("This ID corresponds to: " + employeeMap.get(id));
		} else {
			System.out.println("There is no match.");
		}

		System.out.println("Please enter the name of a person to find the corresponding ID:");
		String name = br.readLine();

		if (employeeMap.containsValue(name)) {
			for (Map.Entry<Integer, String> entry : employeeMap.entrySet()) {
				if (entry.getValue().equals(name)) {
					System.out.println("The ID for name " + entry.getValue() + " is " + entry.getKey());
				}
			}
		} else {
			System.out.println("There is no match.");
		}
	}
}
