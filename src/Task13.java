
public class Task13 {

	public static void main(String[] args) {
		System.out.println("Task13 start");
		System.out.println(getNumber());
		System.out.println("Task13 end");
	}

	private static long getNumber() {
		for (long i = 1; i < Long.MAX_VALUE; i++) {
			if (checkRemainder(i)) {
				return i;
			}
		}
		return 0;
	}

	private static boolean checkRemainder(long n) {
		for (int i = 1; i <= 20; i++) {
			if (n % i != 0) {
				return false;
			}
		}
		return true;
	}
}
