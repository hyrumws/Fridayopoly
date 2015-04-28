/**
 * @author Makell Evans
 * 
 * Assignment: Team Project
 */

package gui;

import java.awt.Dimension;
import javax.swing.*;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Map;

public class MainBoard extends JPanel {
	Dimension sidePnls = new Dimension(200, 950);
	Dimension topBottomPnls = new Dimension(1360, 205);
	Dimension middle = new Dimension(950, 950);
	ArrayList<JButton> topBoardButtons, leftButtons, rightButtons,
			bottomBoardButtons;
	Map<Integer,JButton> orderedButtons;
	
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
		
		BottomBoard bottom = new BottomBoard();
		bottom.setPreferredSize(topBottomPnls);
		bottomBoardButtons = bottom.getAllProperties();
		add(bottom);

		orderedButtons = this.getOrderedListOfButtons();
	}

	private Map<Integer, JButton> getOrderedListOfButtons() {



		return null;
	}

}
