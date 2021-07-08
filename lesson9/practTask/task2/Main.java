package lesson9.practTask.task2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashMap<Integer, String> employeeMap = new HashMap<>();
		String[] names = { "Vasya", "Roman", "Misha", "Olya", "Anna", "Dima", "Tania" };

		for (int i = 0; i < names.length; i++) {
			employeeMap.put(i, names[i]);
		}
		System.out.println(employeeMap.toString().replace("=", "-"));

		System.out.println("Please enter ID: ");
		Integer empID = Integer.valueOf(br.readLine());
		if (employeeMap.containsKey(empID)) {
			System.out.println("Employee name: " + employeeMap.get(empID));
		} else {
			System.out.println("There are not user with that ID!");
		}

		System.out.println("Please enter name: ");
		String empName = br.readLine();
		if (employeeMap.containsValue(empName)) {
			System.out.println("Employee name: " + getKey(employeeMap, empName));
		} else {
			System.out.println("There are not user with that name!");
		}

	}

	public static <K, V> K getKey(Map<K, V> map, V value) {
		for (Map.Entry<K, V> entry : map.entrySet()) {
			if (value.equals(entry.getValue())) {
				return entry.getKey();
			}
		}
		return null;
	}
}
