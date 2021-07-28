import java.util.Random;

public class Task9 {

	public static void main(String[] args) {

		System.out.println("Task2 start");

		Random random = new Random();
		int number = 98;
		int counter = 0;

		for (int i = 0; i < number; i++) {
			int x = random.nextInt(2);
			if (x == 1) {
				counter++;
			}
		}
		System.out.print("The number 1 was generated randomly for " + counter + " times.");
		System.out.println("\nTask2 end");
	}
}
