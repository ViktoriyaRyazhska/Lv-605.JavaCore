package lesson12.homework;

public class Task1 {
	static ThreadOne t1 = new ThreadOne();
	static ThreadTwo t2 = new ThreadTwo();
	static ThreadThree t3 = new ThreadThree();

	public static void main(String[] args) {
		t1.start();
		t2.start();
		t3.start();
	}
}

class ThreadOne extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("One");
		}
	}

}

class ThreadTwo extends Thread {

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Two");
		}
	}

}

class ThreadThree extends Thread {

	@Override
	public void run() {
		try {
			Task1.t1.join();
			Task1.t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println("Three");
		}
	}

}
