package homework12;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Practical {

	public static void main(String[] args) {
		
		// First task
		new Random().ints(0, 100).limit(50).forEach(System.out::println);
		
		// Second task
		System.out.println("--------------------------------------------------");
		new Random().ints(0, 100).limit(50).sorted().forEach(System.out::println);
		
		// Third task
		System.out.println("--------------------------------------------------");
		System.out.println(new Random().ints(0, 10).limit(5).summaryStatistics().getMax());
		
		//Fourth task
		System.out.println("--------------------------------------------------");
		System.out.println("Today is " + DayOfWeek.from(LocalDateTime.now()).toString().toLowerCase());
		
		//Fifth task
		System.out.println("--------------------------------------------------");
		System.out.println("A date of first Monday for current month is: "
				+LocalDate.now().with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.MONDAY)));
		
		//Sixth task test
		System.out.println("--------------------------------------------------");
		List<String> strList = Arrays.asList("Ann", "Zoltan", "Bob", "Yasmin", "Chloe", "Xena", "David", "William");
		System.out.println("Sorted list = " + sortStringList(strList));
		System.out.println("Sorted list = " + strList);
		
	}
	
	public static List<String> sortStringList(List<String> strList) {
		List<String> resultStrList = strList;
		return strList.stream().sorted().collect(Collectors.toList());
	}

}
