package homework2;

public class Task3 {
	public static void main(String[] args) {
		Thread1 t = new Thread1();
		t.start();
	}
}

class Thread1 extends Thread {

	@Override
	public void run() {
		Thread2 t = new Thread2();
		t.start();
	}

}
class Thread2 extends Thread {

	@Override
	public void run() {
		for(int i = 0; i < 3; i++) {
			System.out.println("Thread number two");
		}
		Thread3 t = new Thread3();
		t.start();
	}

}
class Thread3 extends Thread {

	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println("Thread number three");
		}
	}

}