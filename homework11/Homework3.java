package homework11;

public class Homework3 {
	Homework3 hw3 = new Homework3();

	public static void main(String[] args) {
		Thread one = new Thread() {
			@Override
			public void run() {
				Thread two = new Thread() {
					@Override
					public void run() {
						for (int i = 0; i < 3; i++) {
							System.out.println("Thread number two");
						}
					}
				};
				two.start();
			}
		};

		Thread three = new Thread() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("Thread number three");
				}
			}
		};

		one.start();
		three.start();
	}
}
