package homework05oop01._01.bird;

public abstract class Bird {
	private static boolean feathers = true;
	private int layEggs;

	public int getLayEggs() {
		return layEggs;
	}
	
	public boolean getFeathers() {
		return feathers;
	}

	public Bird(int layEggs) {
		this.layEggs = layEggs;
	}

	abstract void fly();

	@Override
	public String toString() {
		return "I am " + getClass().getSimpleName().toLowerCase() + " and I lay " + getLayEggs()
				+ " egg(s) per clutch.";
	}

}
