package homework7;

public class WrapperTest {

	public static void main(String[] args) {
		Wrapper<Shape> circleWrapper = new Wrapper<Shape>();
		circleWrapper.setT(new Circle()); // ok because circle implements shape
		Wrapper<Square> squareWrapper = new Wrapper<Square>();
		squareWrapper.setT(new Square()); // ok because square implements shape
		
		// Don't works because String is not allowed:
		//Wrapper<String> stringWrapper = new Wrapper<String>(); 

	}

}
