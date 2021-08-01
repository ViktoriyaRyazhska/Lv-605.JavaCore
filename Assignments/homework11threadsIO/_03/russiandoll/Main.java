package homework11threadsIO._03.russiandoll;

// Duzhe nezghrabno yakos' =( Mozhe treba bulo okremo stvoryty klassy dlja kozhnogo thread'u?

public class Main {

	public static void main(String[] args) {

		Thread one = new Thread() {
			public void run() {

				Thread two = new Thread() {
					public void run() {
						for (int i = 0; i++ < 3;) {
							System.out.println("Thread number two.");
						}

						Thread three = new Thread() {
							public void run() {
								for (int i = 0; i++ < 5;) {
									System.out.println("Thread number three.");
								}
							}
						};

						three.start();
					}
				};

				two.start();
			}
		};

		one.start();
	}
}
