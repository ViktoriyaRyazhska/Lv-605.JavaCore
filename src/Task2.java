
import java.lang.Math;

public class Task2 {

	public static void primeFactors(int number) {

		while (number % 2 == 0) {
			System.out.print(2 + " ");
			number /= 2;
		}

		for (int i = 3; i <= Math.sqrt(number); i += 2) {
			while (number % i == 0) {
				System.out.print(i + " ");
				number /= i;
			}
		}

		if (number > 2)
			System.out.print(number);
	}

	public static void main(String[] args) {

		System.out.println("Task2 start");
		int number = 84;
		System.out.print("A product of prime numbers of with their degrees of number " + number + " is: ");
		primeFactors(number);
		System.out.println("\nTask2 end");
	}
}
