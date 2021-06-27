package practice05oop01._02;

public class ColorLine extends Line {
	private String color;

	public ColorLine(Point a, Point b, String newColor) {
		super(a, b);
		color = newColor;
	}

	@Override
	public String toString() {
		return color + " " + super.toString().toLowerCase();
	}

}
