package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Point;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.SwingUtilities;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;


public class PlayGame extends JFrame {


	private JPanel contentPane;
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

		
		JPanel panel = new MainPanel();
		panel.setPreferredSize(new Dimension(1600, 1600));
		contentPane.add(panel, BorderLayout.NORTH);
		
		
		//TODO fix asap
		System.out.println("X: " + panel.getX() );
		
		
		JScrollPane scrollBar = new JScrollPane(panel);
		this.getContentPane().add(scrollBar, BorderLayout.EAST);
		
		
		JLayeredPane lPane = new JLayeredPane() {
             private static final long serialVersionUID = 1L;

             @Override
             public Dimension getPreferredSize() {
                 return new Dimension(800, 600);
             }
         };

		
		JLabel player1 = new JLabel("floating");
		  player1.scrollRectToVisible(new Rectangle(0,0,player1.getWidth(), player1.getHeight()));

		  //Point loc = player1.getLocation();
		  Point loc = new Point(0,0);
		  Point wrPos = SwingUtilities.convertPoint(player1, loc, lPane);
		  player1.setLocation(wrPos);
		  player1.setVisible(true);
		  
		JLabel player2 = new JLabel();
		JLabel player3 = new JLabel();
		JLabel player4 = new JLabel();
		JLabel player5 = new JLabel();
		JLabel player6 = new JLabel();
	}

}
