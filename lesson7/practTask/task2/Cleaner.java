package lesson7.practTask.task2;

public class Cleaner extends Staff {

	public Cleaner(String name) {
		super(name);
	}
	@Override
	public void salary() {
		System.out.println("Salary of a " + TYPE_PERSON);
	}

}
