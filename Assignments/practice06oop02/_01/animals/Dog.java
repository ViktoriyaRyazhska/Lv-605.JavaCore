package practice06oop02._01.animals;

public class Dog implements Animal {
	private String name;

	public Dog(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void voice() {
		System.out.println("Woof-woof!");
	}

	public void feed() {
		System.out.println("I eat meat.");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Hi, my name is ").append(name).append(".");
		return sb.toString();

	}
}
