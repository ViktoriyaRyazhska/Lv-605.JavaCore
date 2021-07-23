package homework12;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Homework1 {
	public static void main(String[] args) {
		List<String> list1 = Arrays.asList("Ann", "Zoltan", "Bob", "Yasmin", "Chloe", "Xena", "David", "William");
		List<String> list2 = list1.stream().filter(s -> s.length() < 5).collect(Collectors.toList());
		System.out.println(list2);
	}

}
