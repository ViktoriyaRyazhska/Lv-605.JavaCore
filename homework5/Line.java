package homework5;

import java.awt.Graphics;
import javax.swing.*;

public class Line extends JComponent{
	protected Point p1 = new Point();
	protected Point p2 = new Point();

	public Line() {	}

	public Line(Point p1, Point p2) {
		this.p1 = p1;
		this.p2 = p2;
	}

	public Point getP1() {
		return p1;
	}

	public void setP1(Point p1) {
		this.p1 = p1;
	}

	public Point getP2() {
		return p2;
	}

	public void setP2(Point p2) {
		this.p2 = p2;
	}

	@Override
	public String toString() {
		return "Line [p1=" + p1 + ", p2=" + p2 + "]";
	}

	public void paint(Graphics g) {
		g.drawLine(p1.getX(), p1.getY(), p2.getX(), p2.getY());
	}
	
}
