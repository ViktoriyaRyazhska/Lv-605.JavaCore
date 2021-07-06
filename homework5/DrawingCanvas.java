package homework5;

import java.awt.*;
import java.awt.geom.*;

import javax.swing.*;

public class DrawingCanvas extends JComponent {
	private int width, height;
	private DrawPainting painting;
	private Cloud cloud;
	private Cloud cloud2;

	public DrawingCanvas(int width, int height) {
		this.width = width;
		this.height = height;
		painting = new DrawPainting();
		cloud = new Cloud(50, 50, 100, Color.CYAN);
		cloud2 = new Cloud(200, 150, 100, Color.BLACK);
	}

	@Override
	protected void paintComponent(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;

		RenderingHints rh = new RenderingHints(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

		g2d.setRenderingHints(rh);
		//painting.drawPainting(g2d);
		
		cloud.drawCloud(g2d);
		cloud2.drawCloud(g2d);

	}
}
