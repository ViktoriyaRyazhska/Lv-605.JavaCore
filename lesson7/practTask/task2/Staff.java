package lesson7.practTask.task2;

public abstract class Staff extends Person {

	public Staff(String name) {
		super(name);
	}
	@Override
	public void print() {
		System.out.println("My name is " + getName() + ", and i'm " + TYPE_PERSON);
	}
	public abstract void salary();
	
}
