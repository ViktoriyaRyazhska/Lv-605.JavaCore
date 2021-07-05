package homework;

public abstract class FlyingBird extends Bird {

	
	public FlyingBird(boolean layEggs, String feathers) {
		super(layEggs, feathers);
	}
	
	@Override
	public void fly() {
		System.out.println("This bird can fly");
		
	}

	 
	
}
