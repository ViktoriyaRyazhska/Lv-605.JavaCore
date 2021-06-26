package homework5;

import java.awt.Color;
import java.awt.Graphics;

public class ColorLine extends Line{
	private Color color;

	public ColorLine() {}

	public ColorLine(Color color) {
		this.color = color;
	}
	public ColorLine(Point p1, Point p2, Color c) {
		this.p1 = p1;
		this.p2 = p2;
		this.color = c;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "ColorLine [color=" + color + "]";
	}
	
	public void paint(Graphics g) {
		g.setColor(color);
		g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
		//Return color to black after painting:
		g.setColor(Color.BLACK);
	}
}
