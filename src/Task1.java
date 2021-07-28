
public class Task1 {

	public static void main(String[] args) {
		System.out.println("Task1 start");

		int lastNum = 6, prevNum = 0, nextNum = 1;
		System.out.print("Fibonacci number: " + lastNum + "; result: " );

		for (int i = 1; i <= lastNum; ++i) {
			System.out.print(prevNum + " ");

			int sumOfPrevTwo = prevNum + nextNum;
			prevNum = nextNum;
			nextNum = sumOfPrevTwo;
		}

		System.out.println("\nTask1 end");
	}
}
