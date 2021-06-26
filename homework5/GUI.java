package homework5;

import java.awt.*;
import javax.swing.JFrame;

public class GUI extends JFrame {
	int x1, x2, y1, y2;
	Color color = Color.BLACK;
	
	public GUI() {
		
	}
	
	public GUI(Line line) {
		setTitle("Drawing primitives");
		setSize(700,  700);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		x1 = line.getP1().getX();
		y1 = line.getP1().getY();
		x2 = line.getP2().getX();
		y2 = line.getP2().getY();
	}

	
	public void paint(Graphics g) {
		g.setColor(color);
		g.drawLine(x1, y1, x2, y2);
	}

}
