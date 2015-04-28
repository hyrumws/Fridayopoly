/**
 * @author Makell Evans
 * 
 * Assignment: Team Project
 */

package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import background.Die;
import background.PawnShops;
import background.Properties;
import background.Utilities;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MiddleBoardPanel extends JPanel {
	private JButton diceNumber;
	private JTextField textField;
	private static JPanel property;
	private static JPanel propertie;
	private static JPanel propertyCntrl;

	static JPanel ads = new PropertyPanel(Properties.ADS);
	/**
	 * Create the panel.
	 */
	public MiddleBoardPanel() {
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
		
		cards.add(chance);
		
		JButton chanceCard = new JButton("");
		chanceCard.setBackground(Color.WHITE);
		cards.add(chanceCard);
		
		JButton communityChance = new JButton("Community Chance");
		cards.add(communityChance);
		
		JButton communityChanceCard = new JButton("");
		communityChanceCard.setBackground(Color.WHITE);
		cards.add(communityChanceCard);
		return cards;
	}

	private JPanel diceBtn() {
		JPanel diceBtns = new JPanel();
		diceBtns.setLayout(new GridLayout(0, 3, 0, 0));
		
		JButton rollBtn = new JButton("Roll");
		rollBtn.setFont(new Font("Tahoma", Font.BOLD, 52));
		rollBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num = Die.rollDie() + Die.rollDie();
				diceNumber.setText("" + num);
			}
		});
		rollBtn.setBackground(Color.WHITE);
		diceBtns.add(rollBtn);
		
		JButton moneyAmount = new JButton("$");
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
	
	public static void setPropertyPanel(Properties p){
		
		JPanel propertytest = new PropertyPanel(p);
		propertyCntrl.remove(property);
		propertyCntrl.add(propertytest);
		
	}
	public static void setPoperty(JPanel j){
		property.removeAll();
		property.add(j);
		property.repaint();
		property.revalidate();
	}

}
