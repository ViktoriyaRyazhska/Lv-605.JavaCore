package lesson6.homework.task1;

public abstract class FlyingBird extends Bird {

	public FlyingBird(boolean feathers, int layEggs) {
		super(feathers, layEggs);
	}

	@Override
	public void fly() {
		System.out.println("This bird can fly!");
	}

}
