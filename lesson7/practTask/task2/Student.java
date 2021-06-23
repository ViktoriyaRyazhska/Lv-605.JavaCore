package lesson7.practTask.task2;

public class Student extends Person {

	public Student(String name) {
		super(name);
	}
	@Override
	public void print() {
		System.out.println("My name is " + getName() + ", and i'm " + TYPE_PERSON);
	}

}
