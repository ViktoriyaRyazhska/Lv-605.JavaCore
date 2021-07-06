package homework5;

import java.awt.*;
import java.awt.geom.*;

public class Cloud {
	private double x;
	private double y;
	private double size;
	private Color color;
	
	public Cloud() {}

	public Cloud(double x, double y, double size, Color color) {

		this.x = x;
		this.y = y;
		this.size = size;
		this.color = color;
	}
	
	public void drawCloud(Graphics2D g2d) {
		Ellipse2D.Double e1 = new Ellipse2D.Double(x,y,size, size);
		Ellipse2D.Double e2 = new Ellipse2D.Double(x+size*.35,y-size*.2,size*1.75, size*1.4);
		Ellipse2D.Double e3 = new Ellipse2D.Double(x+size*1.5,y+size*.15,size*.9, size*.9);
		Ellipse2D.Double e4 = new Ellipse2D.Double(x+size*1.8,y+size*.05,size*.3, size*.3);
		g2d.setColor(color);
		g2d.fill(e1);
		g2d.fill(e2);
		g2d.fill(e3);
		g2d.fill(e4);
	}
	
}
