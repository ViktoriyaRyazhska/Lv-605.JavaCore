package homework5;

import java.awt.*;
import java.awt.geom.*;

public class DrawPainting {
	public DrawPainting(){
		
	}
	
	public void drawPainting(Graphics2D g2d) {
		Rectangle2D.Double r = new Rectangle2D.Double(0,0,800,800);
		g2d.setColor(new Color(100,149,237));
		g2d.fill(r);
		
		Ellipse2D.Double e = new Ellipse2D.Double(200, 75, 100, 100);
		g2d.setColor(Color.BLUE);
		g2d.fill(e);
		
		
		Line2D.Double line = new Line2D.Double(100,250,300,75);
		g2d.setColor(Color.BLACK);
		g2d.draw(line);
		
		Line2D.Double[] lines = new Line2D.Double[10];
		for(int i=0; i<lines.length; i++) {
			lines[i] = new Line2D.Double();
		}
		
		for(int i=0; i<lines.length; i++) {
			lines[i].x1 = i * 10;
			lines[i].y1 = 0;
			lines[i].x2 = 800;
			lines[i].y2 = 800;
			g2d.draw(lines[i]);
		}
	}
}
