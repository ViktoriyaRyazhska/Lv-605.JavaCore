package homework5;

import javax.swing.*;

public class Test{

	public static void main(String[] args) {
		JFrame frame = new JFrame("Test");
		DrawingCanvas dc = new DrawingCanvas(800, 800);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(800, 800);
		frame.add(dc);
	}

}
