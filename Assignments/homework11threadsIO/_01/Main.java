package homework11threadsIO._01;

public class Main {

	public static void main(String[] args) {
		MyThread myT1 = new MyThread("Message for myT1");
		MyThread myT2 = new MyThread("Message for myT2");
		
		Thread myT3 = new Thread() {

			@Override
			public void run() {
				try {
					myT1.join();
					myT2.join();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				for (int i = 0; i < 5; i++) {
					System.out.println("Message for myT3 " + i);
				}
			}
		};
		
		myT1.start();
		myT2.start();
		myT3.start();
	}
}
