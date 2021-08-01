package homework11threadsIO._01;

public class MyThread extends Thread {

	String str;

	public MyThread(String str) {
		this.str = str;
	}

	public void run() {
		for (int i = 0; i < 5; i++)
			System.out.println(str + " " + i);
	}
}
