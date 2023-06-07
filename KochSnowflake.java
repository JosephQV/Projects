package kochsnowflake;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class KochSnowflake {
	int order = 1;
	int angle = 60;
	
	public KochSnowflake() {
		final JFrame j = new JFrame("Koch Snowflake");
		
		KochPanel k = new KochPanel (order, angle);
		
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
		
		JMenuItem a1 = new JMenuItem("15 degrees");
		JMenuItem a2 = new JMenuItem("30 degrees");
		JMenuItem a3 = new JMenuItem("45 degrees");
		JMenuItem a4 = new JMenuItem("60 degrees");
		JMenuItem a5 = new JMenuItem("75 degrees");
		JMenuItem a6 = new JMenuItem("90 degrees");
		JMenuItem a7 = new JMenuItem("105 degrees");
		
		m1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					k.setOrder(1);  
					k.repaint();
				}  
			});
		m2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					k.setOrder(2);  
					k.repaint();
				}  
			});
		m3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					k.setOrder(3);  
					k.repaint();
				}  
			});
		m4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					k.setOrder(4);  
					k.repaint();
				}  
			});
		m5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					k.setOrder(5);  
					k.repaint();
				}  
			});
		m6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					k.setOrder(6);  
					k.repaint();
				}  
			});
		m7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					k.setOrder(7);  
					k.repaint();
				}  
			});
		m8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					k.setOrder(8);  
					k.repaint();
				}  
			});
		m9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					k.setOrder(9);  
					k.repaint();
				}  
			});
		m10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					k.setOrder(10);  
					k.repaint();
				}  
			});
		
		a1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					k.setAngle(15);  
					k.repaint();
				}  
			});
		a2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					k.setAngle(30);  
					k.repaint();
				}  
			});
		a3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					k.setAngle(45);  
					k.repaint();
				}  
			});
		a4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					k.setAngle(60);  
					k.repaint();
				}  
			});
		a5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					k.setAngle(75);  
					k.repaint();
				}  
			});
		a6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					k.setAngle(90);  
					k.repaint();
				}  
			});
		a7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
					k.setAngle(105);  
					k.repaint();
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
	    
	    JMenu aMenu = new JMenu("Angle");
	    aMenu.add(a1);
	    aMenu.add(a2);
	    aMenu.add(a3);
	    aMenu.add(a4);
	    aMenu.add(a5);
	    aMenu.add(a6);
	    aMenu.add(a7);
	    
	    JMenuBar menuBar = new JMenuBar();
	    menuBar.add(oMenu);
	    menuBar.add(aMenu);
	    
	    j.setJMenuBar(menuBar);
		j.getContentPane().add(k, BorderLayout.CENTER);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    j.setSize(new Dimension(600, 600));
	    j.setVisible(true);
	}
	
	
	public static void main(String [] args) {
		KochSnowflake ks = new KochSnowflake();
    }
}
