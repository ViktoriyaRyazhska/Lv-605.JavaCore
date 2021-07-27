package practice10exceptions._02.plant;

// Create a class Plant, which includes fields int size, Color color and Type type,
// and a constructor where these fields are initialized.
// Color and type are Enum. Override the method toString( ).
// Create classes ColorException and TypeException and describe all possible colors and types of plants there.
// In the method main create an array of five plants. Check to work your exceptions.
public class Main {

	public static void main(String[] args) {

		Plant[] flowers = new Plant[3];
		try {
			flowers[0] = new Plant(5, "Black", "Rose");
		} catch (ColorException | TypeException e) {
			System.err.println(e.getMessage());
		}
		try {
			flowers[1] = new Plant(3, "green", "Li-Li");
		} catch (ColorException | TypeException e) {
			System.err.println(e.getMessage());
		}
		try {
			flowers[2] = new Plant(1, "red", "Poppy");
		} catch (ColorException | TypeException e) {
			System.out.println(e);
		}
		
		for (Plant p : flowers) {
			System.out.println(p);
		}
	}
}
