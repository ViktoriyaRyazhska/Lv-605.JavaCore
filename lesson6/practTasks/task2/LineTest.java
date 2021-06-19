package lesson6.practTasks.task2;

public class LineTest {
	public static void main(String[] args) {
		Line[] lines = {
				new Line(new Point(1,1), new Point(2,3)),
				new Line(new Point(4,5), new Point(10,1)),
				new ColorLine(new Point(4,2), new Point(1,4), "Yellow"),
				new ColorLine(new Point(12,7), new Point(-5,1), "Pink")
		};
		for(Line l:lines) {
			l.print();
			System.out.println("------"); //просто розділювач для виводу
		}
	}
}
