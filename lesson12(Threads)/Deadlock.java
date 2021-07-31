package homework;

public class Deadlock extends Thread{
	
	public final static Object first = new Object();
	public final static Object second = new Object();
	
	public static void main(String[] args) {
		
		Thread1 t1 = new Thread1() {
		public void run() {
			
			synchronized (first) {
			Thread.yield();
			synchronized (second) {
			System.out.println("It's firt thread");	
			}
			}
		}
		};
		
		
		Thread t2 = new Thread() {
			
			public void run() {
				
				synchronized (second) {
				Thread.yield();
				synchronized (first) {
				System.out.println("It's a second Thread");	
				}
				}
			}
			
		};
		
		t1.start();
		t2.start();
	}
	
	
	

}
