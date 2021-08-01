package homework11threadsIO._02.deadlock;

public class Main2 extends Thread {

	public static void main(String[] args) {

		Thread main = Thread.currentThread();
		MyThread deadlock = new MyThread(main);
		
		deadlock.start();
		
		try {
			deadlock.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Deadlock failed in the MAIN thread.");
	}
}
