package homework05oop01._01.bird;

public class FlyingBird extends Bird {
	
	public FlyingBird(int layEggs) {
		super(layEggs);
	}

	public void fly() {
		System.out.println("I can fly! (\\(*^*)/)");
	}
}
