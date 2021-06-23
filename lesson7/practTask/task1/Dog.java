package lesson7.practTask.task1;

public class Dog implements Animal {

	@Override
	public void voice() {
		System.out.println("Woof");
	}

	@Override
	public void feed() {
		System.out.println("I eat bone");
	}

}
