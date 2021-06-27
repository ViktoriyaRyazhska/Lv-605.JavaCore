package homework;

public abstract class NonFlyingBird extends Bird {

	
	
	public  NonFlyingBird(boolean layEggs, String feathers) {
		super(layEggs, feathers);
	}
	
	
	
	@Override
	public void fly() {
		System.out.println("This bird cannot fly");
		
	}


}
