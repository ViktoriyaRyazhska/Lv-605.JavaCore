package practice10exceptions._01.rectangle;

	// Create a method for calculating the area of a rectangle 
	// int squareRectangle (int a, int b), 
	// which should throw an exception if the user enters negative value.
	// Input values a and b from console.
	// Check the squareRectangle method in the method main.
	// Check to input nonnumeric value.

public class Main {

	public static int squareRectangle(int a, int b) throws ArithmeticException{
		if (a <= 0 || b <= 0) throw  new ArithmeticException();
		return ((2 * a) * 2 * b);
	}

	public static void main(String[] args) {
		try{
			squareRectangle(-2, 3);
		}catch (ArithmeticException e) {
			System.out.println("Whoopsey daisy, some wrong input numbers here...");
		}
	}
}
