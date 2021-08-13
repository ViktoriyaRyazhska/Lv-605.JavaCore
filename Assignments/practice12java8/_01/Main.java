package practice12java8._01;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		Random random = new Random();

		// #1
		System.out.println("Task #1: randomly generated Java8 numbers.");
		random.ints(8, 0, 100).forEach(System.out::println);

		// #2
		System.out.println("\nTask #2: ordered randomly generated Java8 numbers.");
		random.ints(8, 0, 100).sorted().forEach(System.out::println);

		// #3
		System.out.println("\nTask #3: maximum random number.");
		List<Integer> rndNum01 = new ArrayList<Integer>();
		random.ints(8, 0, 100).forEach((x) -> rndNum01.add(x));
		IntSummaryStatistics maxNum01 = rndNum01.stream().mapToInt((n) -> n).summaryStatistics();
		System.out.println(maxNum01.getMax());
		
		// or
		ArrayList<Integer> rndNum02 = (ArrayList<Integer>) random.ints(8, 0, 100).mapToObj(e -> (int) e)
				.collect(Collectors.toList());
		int maxNum02 = rndNum02.stream().mapToInt((n) -> n).summaryStatistics().getMax();
		System.out.println(maxNum02);
		
		// or
		System.out.println(random.ints(8, 0, 100).summaryStatistics().getMax());

		// #4
		System.out.println("\nTask #4: present day of the week.");
		System.out.println(LocalDate.now().getDayOfWeek());

		// #5
		System.out.println("\nTask #5: date of first Monday for current month.");
		System.out.println(LocalDate.now().with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY)));
	}

	// #6
	public static void sorting(List<String> list) {
		Collections.sort(list, (a, b) -> a.compareTo(b));
	}
}
