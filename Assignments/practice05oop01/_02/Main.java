package practice05oop01._02;

//Create three classes: 
//Point with attributes x and y
//Line which contains two object of Point class
//ColorLine with attributes Color  which extends Line class.
//Override method toString() and define method print() in every class
//In main() method create array of Line and add some Line and ColorLine to it. Call method print() for all of it. 
public class Main {
	public static void main(String[] args) {

		Line[] lines = { new ColorLine(new Point(2, 3), new Point(3, 4), "Green"),
				new Line(new Point(4, 1), new Point(2, 1)), new ColorLine(new Point(2, 3), new Point(3, 4), "Red"),
				new Line(new Point(4, 1), new Point(2, 1)) };

		for (Line l : lines) {
			System.out.println(l);
		}
	}

}
