import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class Task2 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();

		employeeMap.put(125, "Marta");
		employeeMap.put(496, "Orest");
		employeeMap.put(159, "Iryna");
		employeeMap.put(943, "Anton");
		employeeMap.put(573, "Ilona");
		employeeMap.put(617, "Julia");
		employeeMap.put(763, "Julia");

		System.out.println(employeeMap);

		System.out.println("ID: ");
		try {
			input = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (employeeMap.containsKey(Integer.parseInt(input)) == false) {
			System.err.println("there is no such key!");
		} else {
			System.out.println(employeeMap.get(Integer.parseInt(input)));
		}
		
		System.out.println("Name: ");
		try {
			input = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(employeeMap.containsValue(input) == false){
			System.out.println("There is no such name");
		} else {
			Set<Integer> keys = new HashSet<Integer>();
			for(Entry<Integer, String> entry : employeeMap.entrySet()) {
				if(Objects.equals(input, entry.getValue())){
					keys.add(entry.getKey());
				}
			}
			System.out.println(keys);
		}
	}
}
