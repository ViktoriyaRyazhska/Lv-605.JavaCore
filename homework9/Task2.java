package homework9;

public class Task2 {
	public static void main(String[] args) {
		String input = "I    am      learning     Java   Core";
		input = input.replaceAll("[ ]+", " ").replaceFirst("I am", "I'm");
		System.out.println(input);
	}
}