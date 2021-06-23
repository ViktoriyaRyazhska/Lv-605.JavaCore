package lesson7.practTask.task2;

public class Teacher extends Staff {

	public Teacher(String name) {
		super(name);
	}
	@Override
	public void salary() {
		System.out.println("Salary of a " + TYPE_PERSON);
	}

}
