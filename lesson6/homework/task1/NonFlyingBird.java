package lesson6.homework.task1;

public abstract class NonFlyingBird extends Bird {
	
	public NonFlyingBird(boolean feathers, int layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public void fly() {
		System.out.println("This bird can't fly.");
	}
	
}
