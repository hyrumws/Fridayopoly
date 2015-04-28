package gui;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;

import java.awt.GridLayout;

public class MainPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public MainPanel() {
		setBounds(0, 0, 1610, 1983);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = northPanel();
		add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = westPanel();
		add(panel_1, BorderLayout.WEST);
		
		JPanel mainBoard = new MainBoard();
		mainBoard.setPreferredSize(new Dimension(1300, 1300));
		add(mainBoard, BorderLayout.CENTER);
		
		//TODO fix asap
		System.out.println("X: " + mainBoard.getX() + "Y: " + mainBoard.getY());
		
		
		
		JPanel southPanel = southPanel();
		add(southPanel, BorderLayout.SOUTH);
		
		JPanel eastPanel = eastPanel();
		add(eastPanel, BorderLayout.EAST);
	}

	private JPanel eastPanel() {
		JPanel eastPanel = new JPanel();
		eastPanel.setLayout(new GridLayout(0, 1, 0, 0));
		eastPanel.setPreferredSize(new Dimension(110, 1500));
		
		JLabel player6Lbl = new JLabel("player6");
		eastPanel.add(player6Lbl);
		return eastPanel;
	}

	private JPanel southPanel() {
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(0, 2, 0, 0));
		southPanel.setPreferredSize(new Dimension(1500, 110));
		
		JLabel player2Lbl = new JLabel("player2");
		southPanel.add(player2Lbl);
		
		JLabel player1Lbl = new JLabel("player1");
		southPanel.add(player1Lbl);
		return southPanel;
	}

	private JPanel westPanel() {
		JPanel westPanel = new JPanel();
		westPanel.setLayout(new GridLayout(0, 1, 0, 0));
		westPanel.setPreferredSize(new Dimension(110, 1500));
		JLabel player3Lbl = new JLabel("player3");
		westPanel.add(player3Lbl);
		return westPanel;
	}

	private JPanel northPanel() {
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(0, 2, 0, 0));
		northPanel.setPreferredSize(new Dimension(1500, 110));
		
		JLabel player4Lbl = new JLabel("player4");
		northPanel.add(player4Lbl);
		
		JLabel player5Lbl = new JLabel("player5");
		northPanel.add(player5Lbl);
		return northPanel;
	}

}
