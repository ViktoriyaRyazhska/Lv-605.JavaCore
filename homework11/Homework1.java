package homework11;

class ThreadOne extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("First thread message!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class ThreadTwo extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Second thread message!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class ThreadThree extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Third thread message!");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Homework1 {

	public static void main(String[] args) {
		ThreadOne threadOne = new ThreadOne();
		ThreadTwo threadTwo = new ThreadTwo();
		ThreadThree threadThree = new ThreadThree();

		threadOne.start();
		threadTwo.start();
		try {
			threadOne.join();
			threadTwo.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		threadThree.start();

	}

}
