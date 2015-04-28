/**
 * @author Makell Evans
 * 
 * Assignment: Team Project
 */

package gui;

import java.awt.Dimension;
import javax.swing.JPanel;
import java.awt.Color;

public class MainBoard extends JPanel {
	Dimension sidePnls = new Dimension(200, 950);
	Dimension topBottomPnls = new Dimension(1360, 205);
	Dimension middle = new Dimension(950, 950);
	
	/**
	 * Create the panel.
	 */
	public MainBoard() {
		setBackground(Color.BLACK);
		setBounds(0, 0, 1375, 1375);
		
		JPanel top = new TopBoard();
		top.setPreferredSize(topBottomPnls);
		add(top);
		
		JPanel lSide = new LeftSide();
		lSide.setPreferredSize(sidePnls);
		add(lSide);
		
		JPanel middlePanel = new MiddleBoardPanel();
		middlePanel.setPreferredSize(middle);
		add(middlePanel);
		
		JPanel rSide = new RightSide();
		rSide.setPreferredSize(sidePnls);
		add(rSide);
		
		JPanel bottom = new BottomBoard();
		bottom.setPreferredSize(topBottomPnls);
		bottom.get
		add(bottom);
	}

}
