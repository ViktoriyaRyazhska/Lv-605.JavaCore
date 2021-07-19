package lesson12.homework;

public class Task2 {
	public final static Object first = new Object();
	public final static Object second = new Object();

	public static void main(String s[]) throws InterruptedException {

		Thread t2 = new Thread() {
			public void run() {
				synchronized (second) {
					Thread.yield();
					synchronized (first) {
						System.out.println("Success!");
					}
					System.out.println("t2");
				}
			}
		};

		t2.start();
		synchronized (first) {
			Thread.yield();
			Thread.sleep(2);
			synchronized (second) {
				System.out.println("Success!");
			}
		}

	}
}
