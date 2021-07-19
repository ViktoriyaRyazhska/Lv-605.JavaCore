package lesson12.practTask;

public class Task2 {
	public static void main(String[] args) throws InterruptedException {
		ThreadOne threadO = new ThreadOne();
		Thread t = new Thread(threadO);
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello, world");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
		}
		t.join();
		System.out.println("My name is Roman");
	}
}

class ThreadOne implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Peace in the peace");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
		}
	}

}
