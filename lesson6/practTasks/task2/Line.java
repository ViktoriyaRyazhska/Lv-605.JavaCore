package lesson6.practTasks.task2;

public class Line {
	private Point p1;
	private Point p2;
	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}
	@Override
	public String toString() {
		return "Line [p1=" + p1 + ", p2=" + p2 + "]";
	}
	public void print() {
		System.out.println("Point1: ");
		p1.print();
		System.out.println("Point2: ");
		p2.print();
	}
	public Point getFirstPoint() { //гетери створив щоб в ColorLine міг вивести змінні
		return p1;
	}
	public Point getSecondPoint() {
		return p2;
	}
}
