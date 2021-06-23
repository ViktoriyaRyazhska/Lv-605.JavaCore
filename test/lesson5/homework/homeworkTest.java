package lesson5.homework;

import static org.junit.jupiter.api.Assertions.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.junit.jupiter.api.Test;

class homeworkTest {
	Tasks t = new Tasks();
	@Test
	void testGetMonthDays() {
		assertTrue(t.getMonthDays(3)==31);
	}

	@Test
	void testCalcSum() {
		int[] numbers = {1, 2, 3, 4, -5, 6, 7, 8, 9, 10};
		assertTrue(t.calcSum(numbers)==40);
	}

	@Test
	void testSecondPositiveIndex() {
		int[] numbers = {1, -2, 3, 4, -5};
		assertTrue(t.secondPositiveIndex(numbers)==2);
	}

	@Test
	void testFindMinimum() {
		int[] numbers = {1, -2, 3, 4, -5};
		assertTrue(t.findMinimum(numbers)==4);
	}

	@Test
	void testCalcProduct() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		assertFalse(t.calcProduct(br)<0);
	}

	@Test
	void testModulesInYear() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Car cars[] = {
				new Car("A", 2002, 5000),
				new Car("B", 1998, 1000),
				new Car("C", 2002, 4000),
				new Car("D", 2010, 10000),
				new Car("E", 2012, 3000),
		};
		System.out.println("Enter year: ");
		int year = Integer.parseInt(br.readLine());
		String expected = "Models released in 2002:\nA C ";
		assertEquals(t.modulesInYear(year, cars), expected);
	}

	@Test
	void testSortByYear() {
		boolean check = true;
		Car cars[] = {
				new Car("A", 2002, 5000),
				new Car("B", 1998, 1000),
				new Car("C", 2001, 4000),
				new Car("D", 2010, 10000),
				new Car("E", 2012, 3000),
		};
		t.sortByYear(cars);
		Car expected[] = {
				new Car("B", 1998, 1000),
				new Car("C", 2001, 4000),
				new Car("A", 2002, 5000),
				new Car("D", 2010, 10000),
				new Car("E", 2012, 3000)
		};
		for(int i = 0; i<cars.length; i++) {
			if(!cars[i].equals(expected[i])) { 
				check = true;
				break;
			}
		}
		assertTrue(check);
	}
}
