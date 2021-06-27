package homework05oop01._01.bird;

public class NonFlyingBird extends Bird {

	public NonFlyingBird(int layEggs) {
		super(layEggs);
	}

	public void fly() {
		System.out.println("I can't fly... (Q , Q)");
	}

}
