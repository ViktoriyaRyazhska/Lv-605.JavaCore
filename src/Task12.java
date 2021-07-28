
public class Task12 {

	public static void main(String[] args) {
		System.out.println("Task12 start");
		System.out.println(findSumOfMultiples());
		System.out.println("Task12 end");
	}

	private static int findSumOfMultiples() {
		int sum = 0;
		for (int i = 0; i < 1000; i++) {
			if ((i % 3 == 0) || (i % 5 == 0)) {
				sum+=i;
			}
		}
		return sum;
	}
}
