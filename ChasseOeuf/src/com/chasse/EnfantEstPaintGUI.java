package com.chasse;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JComponent;

public class EnfantEstPaintGUI extends JComponent {
	
	private static final long serialVersionUID = 1L;
	
	public EnfantEstPaintGUI() {
        this.setPreferredSize(new Dimension(40, 40));
        this.setVisible (true);
    }
	
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		g.fillPolygon(new int[] {40, 20, 40}, new int[] {20, 30, 40}, 3);
	}
}