package practice06oop02._01.animals;

public class Cat implements Animal {
	private String name;

	public Cat(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void voice() {
		System.out.println("Meow...");
	}

	public void feed() {
		System.out.println("I eat fish.");
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Hi, my name is ").append(name).append(".");
		return sb.toString();

	}
}
