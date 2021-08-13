package homework12java8._01.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<String> list1 = new ArrayList<>(Arrays.asList("Johnny", "Carla", "Mark", "Casey", "Stew"));
		System.out.println(list1);

		List<String> list2 = (List<String>) list1.stream().filter(s -> s.length() >= 5).collect(Collectors.toList());
		System.out.println(list2);

		// or
		List<String> list3 = new ArrayList<String>(list1);
		list3.removeIf(s -> s.length() < 5);
		System.out.println(list3);
	}
}
