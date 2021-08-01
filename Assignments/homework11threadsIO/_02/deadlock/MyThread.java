package homework11threadsIO._02.deadlock;

public class MyThread extends Thread {

	Thread thrd;

	public MyThread(Thread thrd) {
		this.thrd = thrd;
	}

	public void run() {
		try {
			thrd.join();
			System.out.println("Deadlock failed in the INNER thread.");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
