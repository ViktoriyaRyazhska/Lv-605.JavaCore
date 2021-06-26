package homework5;

import java.awt.*;
import javax.swing.*;

public class LinePaintingTester extends JComponent {
	public static void main(String[] args) {
		//Making JFrame to draw primitives on it:
		JFrame frame = new JFrame("Line paint");
		frame.setSize(700, 700);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.getContentPane().setBackground(Color.BLACK);
		frame.setVisible(true);
		
		Line[] lines = new Line[10];
		lines[0] = new Line(new Point(50, 50), new Point(400, 400));
		lines[1] = new ColorLine(new Point(40, 40), new Point(600, 600), Color.ORANGE);
		lines[2] = new Line(new Point(40, 40), new Point(200, 200));
		
		// But unfortunately I can draw only one line with that solution :(
		frame.getContentPane().add(lines[1]);
		
		//My second solution: To make GUI class. But it will draw each line on separate JFrame :(
		//Seems not OK as well.
		GUI gui = new GUI(lines[0]);
		GUI gui2 = new GUI(lines[1]);
		GUI gui3 = new GUI(lines[2]);
		
	}

}
