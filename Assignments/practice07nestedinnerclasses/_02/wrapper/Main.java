package practice07nestedinnerclasses._02.wrapper;

public class Main {

	public static void main(String[] args) {
		ShapeWrapper<Shape> square = new ShapeWrapper<Shape>(new Square());
		ShapeWrapper<Shape> circle = new ShapeWrapper<Shape>(new Circle());
		
		//compile error due Diamond not implementing Shape interface
		ShapeWrapper<Shape> diamond = new ShapeWrapper<Shape>(new Diamond());
		
		circle.getT().info(); //I'm a circle.
		square.getT().info(); //I'm a square.
		
	}
}
