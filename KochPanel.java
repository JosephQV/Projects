package kochsnowflake;
import java.awt.*;
import javax.swing.JPanel;
public class KochPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private final int PANEL_WIDTH = 400;
	private final int PANEL_HEIGHT = 400;
	private double sine;
	private double cosine;
	private final int TOPX = 200, TOPY = 20;
	private final int LEFTX = 60, LEFTY = 300;
	private final int RIGHTX = 340, RIGHTY = 300;
	private int current; // current order
	// -----------------------------------------------------------------
	// Sets the initial fractal order to the value specified.
	// -----------------------------------------------------------------
	public KochPanel (int currentOrder, int currentAngle) {
		current = currentOrder;
		sine = Math.sin((Math.PI/180) * currentAngle);
		cosine = Math.cos((Math.PI/180) * currentAngle);
		setBackground (Color.black);
		setPreferredSize (new Dimension (PANEL_WIDTH, PANEL_HEIGHT));
	}
	// -----------------------------------------------------------------
	// Draws the fractal recursively. The base case is order 1 for
	// which a simple straight line is drawn. Otherwise three
	// intermediate points are computed, and each line segment is
	// drawn as a fractal.
	// -----------------------------------------------------------------
	public void drawFractal (int order, int x1, int y1, int x5, int y5, double c, double s, Graphics page) {
		int deltaX, deltaY, x2, y2, x3, y3, x4, y4;
		if (order == 1)
			page.drawLine (x1, y1, x5, y5);
		else
		{
			deltaX = x5 - x1; // distance between end points
			deltaY = y5 - y1;
			x2 = x1 + deltaX /3;
			y2 = y1 + deltaY / 3;
			x3 = (int) (x2 + (c * deltaX - s * deltaY)/3);
			y3 = (int) (y2 + (c * deltaY + s * deltaX)/3);
			x4 = x1 + deltaX * 2 / 3;
			y4 = y1 + deltaY * 2 / 3;
			drawFractal (order - 1, x1, y1, x2, y2, c, s, page);
			drawFractal (order - 1, x2, y2, x3, y3, c, s, page);
			drawFractal (order - 1, x3, y3, x4, y4, c, s, page);
			drawFractal (order - 1, x4, y4, x5, y5, c, s, page);
		}
	}
	// Performs the initial calls to the drawFractal method.
	public void paintComponent (Graphics page) {
		super.paintComponent (page);
		page.setColor (Color.yellow);
		drawFractal (current, TOPX, TOPY, LEFTX, LEFTY, cosine, sine, page);
		drawFractal (current, LEFTX, LEFTY, RIGHTX, RIGHTY, cosine, sine, page);
		drawFractal (current, RIGHTX, RIGHTY, TOPX, TOPY, cosine, sine, page);
	}
	// Sets the fractal order to the specified value.
	public void setOrder (int order) {
		current = order;
	}
	public void setAngle (int a) {
		sine = Math.sin((Math.PI/180) * a);
		cosine = Math.cos((Math.PI/180) * a);
	}
	// Returns the current order.
	public int getOrder () {
		return current;
	}
}