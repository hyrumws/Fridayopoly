/**
 * @author Makell Evans
 * 
 * Assignment: Team Project
 */

package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import background.Die;
import background.Properties;

public class MiddleBoardPanel extends JPanel {
	private JButton diceNumber;
	private JTextField textField;
	private static JPanel property;
	private static JPanel propertie;
	private static JPanel propertyCntrl;
	JTextPane communityChestCard = new JTextPane();
	Scanner input = new Scanner(System.in);
	static JPanel ads = new PropertyPanel(Properties.ADS);
	String fileName = "player.txt";
	ArrayList<JLabel> playerLbls = new ArrayList<JLabel>();

	private JTextPane chanceCard;

	/**
	 * Create the panel.
	 */
	public MiddleBoardPanel(ArrayList<JLabel> playerLbls) {
		this.playerLbls = playerLbls;
		setBackground(Color.WHITE);
		setLayout(new GridLayout(0, 1, 0, 0));

		JPanel propertyCntrl = propertyCntrl();
		add(propertyCntrl);

		JPanel diceBtns = diceBtn();
		add(diceBtns);

		JPanel cards = cards();
		add(cards);

	}

	private JPanel cards() {
		JPanel cards = new JPanel();
		cards.setLayout(new GridLayout(0, 4, 0, 0));

		JButton chance = new JButton("Chance");
		chance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ChancePanel cp = new ChancePanel();
				chanceCard.setText(" "
						+ cp.randomChanceGenerator().getDescription());
			}
		});
		chance.setBackground(new Color(255, 140, 0));

		cards.add(chance);

		chanceCard = new JTextPane();
		chanceCard.setBackground(Color.WHITE);
		cards.add(chanceCard);

		JButton communityChest = new JButton("Community Chest");
		communityChest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CommunityChestPanel cp = new CommunityChestPanel();
				communityChestCard.setText(" "
						+ cp.randomCommunityChestGenerator().getDescription());

			}
		});
		communityChest.setBackground(new Color(30, 144, 255));
		cards.add(communityChest);

		communityChestCard.setBackground(Color.WHITE);
		cards.add(communityChestCard);
		return cards;
	}

	private JPanel diceBtn() {
		JPanel diceBtns = new JPanel();
		diceBtns.setLayout(new GridLayout(0, 3, 0, 0));

		JButton rollBtn = new JButton("Roll");
		rollBtn.setFont(new Font("Tahoma", Font.BOLD, 52));
		rollBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int die1 = Die.rollDie();
				int die2 = Die.rollDie();
				int num = die1 + die2;
				diceNumber.setText("" + num);
			}
		});
		rollBtn.setBackground(Color.WHITE);
		diceBtns.add(rollBtn);

		JButton moneyAmount = new JButton("$");
		moneyAmount.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int g = 0;
				while (g < 1) {
					ArrayList<String> playerNames = new ArrayList<String>();

					try (BufferedReader br = new BufferedReader(new FileReader(
							fileName))) {
						String currentLine;
						while ((currentLine = br.readLine()) != null) {
							playerNames.add(currentLine);
						}
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					StringBuilder nameList = new StringBuilder("");
					playerNames.forEach(name -> {
						nameList.append(name + "\n");
					});
					String input = JOptionPane
							.showInputDialog("Would you like to use the players from last round? "
									+ "\n(If this is your first round then type no to add players)"
									+ "\nPlayers from last round were: "
									+ nameList.toString());
					if (input.equals("yes")) {
						g++;

					} else if (input.equals("no")) {
						// clear the file
						try (PrintWriter clearMe = new PrintWriter(fileName)) {
							clearMe.write("");
						} catch (FileNotFoundException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}

						int numOfPlayers = Integer.parseInt(JOptionPane
								.showInputDialog("How many Players do you want (up to six players)?"));
						PrintWriter outputStream = null;

						for (int i = 0; i < numOfPlayers; i++) {
							String playerName = JOptionPane
									.showInputDialog("Please Enter The Players Names");

							try {
								outputStream = new PrintWriter(
										new BufferedWriter(new FileWriter(
												fileName, true)));

								outputStream.println(playerName);
								outputStream.close();

							} catch (Exception el) {
								System.out
										.println("Could not find the file player");
							}
						}

						g++;
					} else {
						System.out.println("Please Enter yes or no");
					}
				}
			}
		});
		moneyAmount.setBackground(Color.WHITE);
		moneyAmount.setFont(new Font("Tahoma", Font.BOLD, 52));
		diceBtns.add(moneyAmount);

		diceNumber = new JButton("");
		diceNumber.setFont(new Font("Tahoma", Font.BOLD, 80));
		diceNumber.setBackground(Color.WHITE);
		diceBtns.add(diceNumber);
		return diceBtns;
	}

	private JPanel propertyCntrl() {
		propertyCntrl = new JPanel();
		propertyCntrl.setBackground(null);
		propertyCntrl.setLayout(new GridLayout(0, 3, 0, 0));

		JButton payMeBtn = new JButton("Pay Me");
		payMeBtn.setFont(new Font("Tahoma", Font.BOLD, 52));
		payMeBtn.setBackground(null);
		propertyCntrl.add(payMeBtn);

		property = new JPanel();
		property.setPreferredSize(new Dimension(200, 200));
		propertie = ads;
		propertie.setPreferredSize(new Dimension(315, 312));
		property.add(propertie);
		propertyCntrl.add(property);

		JButton buyItBtn = new JButton("Buy It");
		buyItBtn.setBackground(Color.WHITE);
		buyItBtn.setFont(new Font("Tahoma", Font.BOLD, 52));
		propertyCntrl.add(buyItBtn);
		return propertyCntrl;
	}

	public static void setPropertyPanel(Properties p) {

		JPanel propertytest = new PropertyPanel(p);
		propertyCntrl.remove(property);
		propertyCntrl.add(propertytest);

	}

	public static void setPoperty(JPanel j) {
		property.removeAll();
		property.add(j);
		property.repaint();
		property.revalidate();
	}

}
