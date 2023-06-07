package sierpinskitriangle;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class SierpinskiTriangle {
	int order = 1;
	
	public SierpinskiTriangle() {
		final JFrame j = new JFrame("Sierpinski Triangle");
		
		SierpinskiPanel s = new SierpinskiPanel (order);
		
		JMenuItem m1 = new JMenuItem("Order 1");
		JMenuItem m2 = new JMenuItem("Order 2");
		JMenuItem m3 = new JMenuItem("Order 3");
		JMenuItem m4 = new JMenuItem("Order 4");
		JMenuItem m5 = new JMenuItem("Order 5");
		JMenuItem m6 = new JMenuItem("Order 6");
		JMenuItem m7 = new JMenuItem("Order 7");
		JMenuItem m8 = new JMenuItem("Order 8");
		JMenuItem m9 = new JMenuItem("Order 9");
		JMenuItem m10 = new JMenuItem("Order 10");
		
		m1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					s.setOrder(1);  
					s.repaint();
				}  
			});
		m2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					s.setOrder(2);  
					s.repaint();
				}  
			});
		m3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					s.setOrder(3);  
					s.repaint();
				}  
			});
		m4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					s.setOrder(4);  
					s.repaint();
				}  
			});
		m5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					s.setOrder(5);  
					s.repaint();
				}  
			});
		m6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					s.setOrder(6);  
					s.repaint();
				}  
			});
		m7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					s.setOrder(7);  
					s.repaint();
				}  
			});
		m8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					s.setOrder(8);  
					s.repaint();
				}  
			});
		m9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					s.setOrder(9);  
					s.repaint();
				}  
			});
		m10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					s.setOrder(10);  
					s.repaint();
				}  
			});
		
	    JMenu oMenu = new JMenu("Order");
	    oMenu.setMnemonic(KeyEvent.VK_F);
        oMenu.getAccessibleContext().setAccessibleDescription("Change the Order");
	    oMenu.add(m1);
	    oMenu.add(m2);
	    oMenu.add(m3);
	    oMenu.add(m4);
	    oMenu.add(m5);
	    oMenu.add(m6);
	    oMenu.add(m7);
	    oMenu.add(m8);
	    oMenu.add(m9);
	    oMenu.add(m10);
	    
	    
	    JMenuBar menuBar = new JMenuBar();
	    menuBar.add(oMenu);
	    
	    j.setJMenuBar(menuBar);
		j.getContentPane().add(s, BorderLayout.CENTER);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    j.setSize(new Dimension(600, 600));
	    j.setVisible(true);
	}
	
	
	public static void main(String [] args) {
		SierpinskiTriangle st = new SierpinskiTriangle();
    }
}
