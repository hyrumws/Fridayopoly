package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;

public class PlayGame extends JFrame {

	
	private static JPanel contentPane;
	private static JPanel panel;
	private static JPanel mainBoard;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayGame frame = new PlayGame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PlayGame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 1640, 1350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		
		panel = new StartGUI();
		panel.setPreferredSize(new Dimension(1600, 1600));
		contentPane.add(panel, BorderLayout.NORTH);
		
		JScrollPane scrollBar = new JScrollPane(panel);
		this.getContentPane().add(scrollBar, BorderLayout.EAST);
	}
	
	public static void swapPanels(){
		contentPane.remove(panel);
		mainBoard = new MainBoard();
		mainBoard.setPreferredSize(new Dimension(1600, 1600));
		mainBoard.add(panel, BorderLayout.NORTH);
		
		contentPane.revalidate();
		contentPane.repaint();
	}

}
