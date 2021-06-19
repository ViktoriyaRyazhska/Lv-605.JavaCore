package lesson6.practTasks.task2;

public class ColorLine extends Line {
	private String color;
	public ColorLine(Point p1, Point p2, String color) {
		super(p1, p2);
		this.color = color;
	}
	@Override
	public String toString() { //в цьому методі викликаю туСтінг з суперклассу, щоб менше писати коду
		return "ColorLine [color=" + color + ", Points=" + super.toString() + "]";
	}
	public void print() {
		System.out.println("Point 1: ");
		getFirstPoint().print(); 	//просто викликаю метод з классу поінт
		System.out.println("Point 2: ");
		getSecondPoint().print();
		System.out.println("Color: " + color);
	}
}
