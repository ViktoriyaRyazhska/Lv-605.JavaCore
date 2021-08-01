package homework11threadsIO._02.deadlock;

public class Main {

	public static void main(String[] args) {
		
		try {
			Thread.currentThread().join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Deadlock failed.");
	}
}
