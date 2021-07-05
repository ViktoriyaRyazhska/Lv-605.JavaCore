package homework;

public abstract class Bird {

	String feathers;
	boolean layEggs;
	
	public Bird ( boolean layEggs, String feathers) {
		this.feathers = feathers;
		this.layEggs = layEggs;
		
	}
	
	
	public abstract void fly();


	@Override
	public String toString() {
		return "Bird [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}
	
	
	
}
