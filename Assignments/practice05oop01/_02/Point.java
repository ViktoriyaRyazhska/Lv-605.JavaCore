package practice05oop01._02;

public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "point of x=" + x + " and y=" + y + ".";
	}

}
