package practice05oop01._02;

public class Line {
	private Point pointA;
	private Point pointB;

	public Line(Point a, Point b) {
		pointA = a;
		pointB = b;
	}

	@Override
	public String toString() {
		return "Line starts at " + pointA + " and ends at " + pointB;
	}

}
