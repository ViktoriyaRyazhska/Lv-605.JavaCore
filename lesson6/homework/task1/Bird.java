package lesson6.homework.task1;

public abstract class Bird {
	private boolean feathers;
	private int layEggs;
	
	public Bird(boolean feathers, int layEggs) { 
		this.feathers = feathers;
		this.layEggs = layEggs;
	}
	
	public abstract void fly();

	@Override
	public String toString() {
				// getClass().getSimpleName() - цей метод повертає імя классу в нормальному вигляді
		return getClass().getSimpleName() + " [feathers=" + feathers + ", layEggs=" + layEggs + "]";
	}
	
}
