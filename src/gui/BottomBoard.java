/**
 * @author Makell Evans
 * 
 * Assignment: Team Project
 */

package gui;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

import background.PawnShops;
import background.Properties;

public class BottomBoard extends JPanel {
	Dimension bottom = new Dimension(100, 200);
	Dimension cornerPieces = new Dimension(202, 200);
	
	/**
	 * Create the panel.
	 */
	public BottomBoard() {
		setBackground(Color.BLACK);
		setBounds(0, 0, 1360, 205);
		
		JButton corner1 = new JButton("");
		corner1.setIcon(new ImageIcon(BottomBoard.class.getResource("/gui/Hiawatha.jpg")));
		corner1.setPreferredSize(cornerPieces);
		add(corner1);
		
		JButton bottomBtn1 = new JButton();
		bottomBtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel johns = new PropertyPanel(Properties.JOHNS_MARKETPLACE);
				johns.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(johns);			}
		});
		bottomBtn1.setIcon(new ImageIcon(BottomBoard.class.getResource("/gui/JohnsMarketPlace(ConneticuitAvenue).png")));
		bottomBtn1.setPreferredSize(bottom);
		add(bottomBtn1);
		
		JButton bottomBtn2 = new JButton();
		bottomBtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel advancedCopy = new PropertyPanel(Properties.ADVANCED_COPY);
				advancedCopy.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(advancedCopy);
			}
		});
		bottomBtn2.setIcon(new ImageIcon(BottomBoard.class.getResource("/gui/AdvancedCopy(VermontAvenue).png")));
		bottomBtn2.setPreferredSize(bottom);
		add(bottomBtn2);
		
		JButton bottomBtn3 = new JButton();
		bottomBtn3.setIcon(new ImageIcon(BottomBoard.class.getResource("/gui/Chance(Bottom).png")));
		bottomBtn3.setPreferredSize(bottom);
		add(bottomBtn3);
		
		JButton bottomBtn4 = new JButton();
		bottomBtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel familyStores = new PropertyPanel(Properties.FAMILY_STORES);
				familyStores.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(familyStores);			}
		});
		bottomBtn4.setIcon(new ImageIcon(BottomBoard.class.getResource("/gui/FamilyStores(OrientalAvenue).png")));
		bottomBtn4.setPreferredSize(bottom);
		add(bottomBtn4);
		
		JButton bottomBtn5 = new JButton();
		bottomBtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel sportsmans = new PropertyPanel(PawnShops.EZ_PAWN);
				sportsmans.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(sportsmans);
			}
		});
		bottomBtn5.setIcon(new ImageIcon(BottomBoard.class.getResource("/gui/EZPawn(ReadingRailRoad).png")));
		bottomBtn5.setPreferredSize(bottom);
		add(bottomBtn5);
		
		JButton bottomBtn6 = new JButton();
		bottomBtn6.setIcon(new ImageIcon(BottomBoard.class.getResource("/gui/IncomeTax.png")));
		bottomBtn6.setPreferredSize(bottom);
		add(bottomBtn6);
		
		JButton bottomBtn7 = new JButton();
		bottomBtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel shoppers = new PropertyPanel(Properties.SHOPPERS_BOOT_CORAL);
				shoppers.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(shoppers);			}
		});
		bottomBtn7.setIcon(new ImageIcon(BottomBoard.class.getResource("/gui/ShoppersBootCoral(BalticAvenue).png")));
		bottomBtn7.setPreferredSize(bottom);
		add(bottomBtn7);
		
		JButton bottomBtn8 = new JButton();
		bottomBtn8.setIcon(new ImageIcon(BottomBoard.class.getResource("/gui/CommunityChance(Bottom).png")));
		bottomBtn8.setPreferredSize(bottom);
		add(bottomBtn8);
		
		JButton bottomBtn9 = new JButton();
		bottomBtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel michaels = new PropertyPanel(Properties.MICHEALS_SHOE_REPAIR);
				michaels.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(michaels);
			}
		});
		bottomBtn9.setIcon(new ImageIcon(BottomBoard.class.getResource("/gui/MichaelsShoeRepair(MediteranianAvenue).png")));
		bottomBtn9.setPreferredSize(bottom);
		add(bottomBtn9);
		
		JButton corner4 = new JButton("");
		corner4.setIcon(new ImageIcon(BottomBoard.class.getResource("/gui/StartTheNewYear.png")));
		corner4.setPreferredSize(cornerPieces);
		add(corner4);
	}

}
