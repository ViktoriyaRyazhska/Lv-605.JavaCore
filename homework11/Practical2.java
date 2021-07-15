package homework11;

class SecondThread extends Thread {
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Peace in the peace");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

public class Practical2 extends Thread {

	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello, world");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Practical2 pr2 = new Practical2();
		SecondThread st = new SecondThread();
		pr2.start();
		st.start();
		try {
			pr2.join();
			st.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("My name is Pavlo.");
	}

}
