package homework;

public class Thread3 extends Thread{
	
	private int pause;
	
	
	
public Thread3(int pause) {
		this.pause = pause;
	}



public void run() {
		
		for (int i = 0; i < 5; i++) {
			try{sleep(pause);} catch (InterruptedException e) {}
			System.out.println("This is the third Thread, it implemets interface Runnable");
		}
	}

}
