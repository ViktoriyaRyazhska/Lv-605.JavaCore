package homework11;

public class Homework2 extends Thread {
	static Homework2 hw2 = new Homework2();
	public static void main(String[] args) {
		hw2.start();
	}
	public void run() {
		try {
			hw2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//"The end!" will never be printed:
		System.out.println("The end!");
	}
}
