package lesson6.homework.task1;

public class TestBird {
	public static void main(String[] args) {
		Bird[] birds = {
				new Eagle(true, 3),
				new Swallow(true, 4),
				new Penguin(false, 2),
				new Chicken(true, 5)
		};
		for(Bird b : birds) {
			System.out.println(b);
			b.fly();
		}
	}
}
