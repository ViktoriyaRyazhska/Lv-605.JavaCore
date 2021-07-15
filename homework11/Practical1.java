package homework11;

public class Practical1 {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("I study Java");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
