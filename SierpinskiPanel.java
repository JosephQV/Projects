package sierpinskitriangle;
import java.awt.*;
import javax.swing.JPanel;

public class SierpinskiPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	private final int PANEL_WIDTH = 400;
	private final int PANEL_HEIGHT = 400;
	private final int TOPX = 200, TOPY = 20;
	private final int LEFTX = 60, LEFTY = 300;
	private final int RIGHTX = 340, RIGHTY = 300;
	private int current; // current order
	// -----------------------------------------------------------------
	// Sets the initial fractal order to the value specified.
	// -----------------------------------------------------------------
	public SierpinskiPanel (int currentOrder) {
		current = currentOrder;
		setBackground (Color.black);
		setPreferredSize (new Dimension (PANEL_WIDTH, PANEL_HEIGHT));
	}
	// -----------------------------------------------------------------
	// Draws the fractal recursively. The base case is order 1 for
	// which a simple straight line is drawn. Otherwise three
	// intermediate points are computed, and each line segment is
	// drawn as a fractal.
	// -----------------------------------------------------------------
	public void drawFractal (int order, int tx, int ty, int lx, int ly, int rx, int ry, Graphics page) {
		int lengthX, lengthY, mlx, mly, mrx, mry, mbx, mby;
		if (order == 1) {
			page.drawLine (tx, ty, lx, ly);
			page.drawLine(lx, ly, rx, ry);
			page.drawLine(tx, ty, rx, ry);
		} else {
			mlx = lx + ((tx-lx)/ 2);
			mly = ty + ((ly - ty) / 2);
			
			mrx = tx + ((rx - tx) / 2);
			mry = ty + ((ry - ty) /2);
			
			mbx = rx + ((lx - rx) / 2);
			mby = ly;
			
			drawFractal (order - 1, tx, ty, lx, ly, rx, ry, page);
			drawFractal (order - 1, tx, ty, mlx, mly, mrx, mry, page);
			drawFractal (order - 1, mlx, mly, lx, ly, mbx, mby, page);
			drawFractal (order - 1, mrx, mry, mbx, mby, rx, ry, page);
		}
	}
	// Performs the initial calls to the drawFractal method.
	public void paintComponent (Graphics page) {
		super.paintComponent (page);
		page.setColor (Color.yellow);
		drawFractal (current, TOPX, TOPY, LEFTX, LEFTY, RIGHTX, RIGHTY, page);
		
	}
	// Sets the fractal order to the specified value.
	public void setOrder (int order) {
		current = order;
	}
	// Returns the current order.
	public int getOrder () {
		return current;
	}
}