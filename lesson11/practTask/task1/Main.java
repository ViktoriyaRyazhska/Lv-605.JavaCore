package lesson11.practTask.task1;

public class Main {
	public static void main(String[] args) {
		squareRectangle(-1, 2);
	}
	private static int squareRectangle(int a, int b) throws IllegalArgumentException{
		if(a < 0 || a < 0) {
			throw new IllegalArgumentException("You entered negative number!");
		}
		return a*b;
	}
}

