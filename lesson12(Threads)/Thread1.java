package homework;

public class Thread1 extends Thread {
	
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			
			System.out.println("This is the first Thread, it extends form class Thread");
		}
	}
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread1();
		Runnable r = new Thread2();
		Thread t2 = new Thread(r);
		Thread t3 = new Thread3(300);
		t1.start();
		t2.start();
		t3.start();
	}

}
