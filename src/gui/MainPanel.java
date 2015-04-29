package gui;

import javax.swing.JPanel;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;

import java.awt.GridLayout;
import java.util.ArrayList;

import background.GameEngine;
import background.Player;

public class MainPanel extends JPanel {
	private static JLabel player6Lbl;
	private static JLabel player2Lbl;
	private static JLabel player1Lbl;
	private static JLabel player3Lbl;
	private static JLabel player4Lbl;
	private static JLabel player5Lbl;
	ArrayList<JLabel> playersLbls = new ArrayList<JLabel>();

	/**
	 * Create the panel.
	 */
	public MainPanel() {
		playersLbls.add(player1Lbl);
		playersLbls.add(player2Lbl);
		playersLbls.add(player3Lbl);
		playersLbls.add(player4Lbl);
		playersLbls.add(player5Lbl);
		playersLbls.add(player6Lbl);

		
		setBounds(0, 0, 1610, 1983);
		setLayout(new BorderLayout(0, 0));
		
		JPanel panel = northPanel();
		add(panel, BorderLayout.NORTH);
		
		JPanel panel_1 = westPanel();
		add(panel_1, BorderLayout.WEST);
		
		JPanel mainBoard = new MainBoard(playersLbls);
		mainBoard.setPreferredSize(new Dimension(1300, 1300));
		
		add(mainBoard, BorderLayout.CENTER);
		
		//TODO fix asap
		System.out.println("X: " + mainBoard.getX() + "Y: " + mainBoard.getY());
		
		
		
		JPanel southPanel = southPanel();
		add(southPanel, BorderLayout.SOUTH);
		
		JPanel eastPanel = eastPanel();
		add(eastPanel, BorderLayout.EAST);
		
	}

	public static void writeUpLables() {
		for(Player e : GameEngine.players){
			if(e.getPosition() == 1){
				player1Lbl.setText(e.getName() + "        $" + e.getMoney());
				player1Lbl.setIcon(e.getBoardPiece().getCharacter());
			}else if(e.getPosition() == 2){
				player2Lbl.setText(e.getName() + "        $" + e.getMoney());
				player2Lbl.setIcon(e.getBoardPiece().getCharacter());
			}else if(e.getPosition() == 3){
				player3Lbl.setText(e.getName() + "        $" + e.getMoney());
				player3Lbl.setIcon(e.getBoardPiece().getCharacter());
			}else if(e.getPosition() == 4){
				player4Lbl.setText(e.getName() + "        $" + e.getMoney());
				player4Lbl.setIcon(e.getBoardPiece().getCharacter());
			}else if(e.getPosition() == 5){
				player5Lbl.setText(e.getName() + "        $" + e.getMoney());
				player5Lbl.setIcon(e.getBoardPiece().getCharacter());
			}else if(e.getPosition() == 6){
				player6Lbl.setText(e.getName() + "        $" + e.getMoney());
				player6Lbl.setIcon(e.getBoardPiece().getCharacter());
			}
		}
	}

	private JPanel eastPanel() {
		JPanel eastPanel = new JPanel();
		eastPanel.setLayout(new GridLayout(0, 1, 0, 0));
		eastPanel.setPreferredSize(new Dimension(110, 1500));
		
		player6Lbl = new JLabel("");
		player6Lbl.setText("playerrerere6");
		eastPanel.add(player6Lbl);
		return eastPanel;
	}

	private JPanel southPanel() {
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(0, 2, 0, 0));
		southPanel.setPreferredSize(new Dimension(1500, 110));
		
		player2Lbl = new JLabel("player2");
		southPanel.add(player2Lbl);
		
		player1Lbl = new JLabel("player1");
		southPanel.add(player1Lbl);
		return southPanel;
	}

	private JPanel westPanel() {
		JPanel westPanel = new JPanel();
		westPanel.setLayout(new GridLayout(0, 1, 0, 0));
		westPanel.setPreferredSize(new Dimension(110, 1500));
		player3Lbl = new JLabel("player3");
		westPanel.add(player3Lbl);
		return westPanel;
	}

	private JPanel northPanel() {
		JPanel northPanel = new JPanel();
		northPanel.setLayout(new GridLayout(0, 2, 0, 0));
		northPanel.setPreferredSize(new Dimension(1500, 110));
		
		player4Lbl = new JLabel("player4");
		northPanel.add(player4Lbl);
		
		player5Lbl = new JLabel("player5");
		northPanel.add(player5Lbl);
		return northPanel;
	}
	public ArrayList<JLabel> getPlayerLbls()
	{
		return playersLbls;

	}
	

}
