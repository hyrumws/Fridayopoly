/**
 * @author Makell Evans
 * 
 * Assignment: Team Project
 */

package gui;

import java.awt.Dimension;

import background.PawnShops;
import background.Properties;

import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class RightSide extends JPanel {
	Dimension rightSide = new Dimension(200, 100);
	Dimension cornerPieces = new Dimension(200, 200);
	private JButton rightBtn1, rightBtn2, rightBtn3, rightBtn4, rightBtn5, rightBtn6, rightBtn7, rightBtn8, rightBtn9;
	/**
	 * Create the panel.
	 */
	public RightSide() {
		setBackground(Color.BLACK);
		setBounds(0, 0, 200, 950);
		
		rightBtn1 = new JButton("");
		rightBtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel idaho = new PropertyPanel(Properties.IDAHO_FARMS);
				idaho.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(idaho);
			}
		});
		rightBtn1.setIcon(new ImageIcon(RightSide.class.getResource("/gui/IdahoFarms(PacificAvenue).png")));
		rightBtn1.setPreferredSize(rightSide);
		add(rightBtn1);
		
		rightBtn2 = new JButton("");
		rightBtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel anderson = new PropertyPanel(Properties.ANDERSON_FARMS);
				anderson.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(anderson);
			}
		});
		rightBtn2.setIcon(new ImageIcon(RightSide.class.getResource("/gui/AndersonFarms(NorthCarolinaAvenue).png")));
		rightBtn2.setPreferredSize(rightSide);
		add(rightBtn2);
		
		rightBtn3 = new JButton("");
		rightBtn3.setIcon(new ImageIcon(RightSide.class.getResource("/gui/CommunityChance(RightSide).png")));
		rightBtn3.setBackground(Color.BLACK);
		rightBtn3.setPreferredSize(rightSide);
		add(rightBtn3);
		
		rightBtn4 = new JButton("");
		rightBtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel mine = new PropertyPanel(Properties.THE_MINE);
				mine.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(mine);
			}
		});
		rightBtn4.setIcon(new ImageIcon(RightSide.class.getResource("/gui/TheMine(PennsylvaniaAvenue).png")));
		rightBtn4.setPreferredSize(rightSide);
		add(rightBtn4);
		
		rightBtn5 = new JButton("");
		rightBtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel sportsmans = new PropertyPanel(PawnShops.SPORTSMANS_FAST_CASH);
				sportsmans.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(sportsmans);
			}
		});
		rightBtn5.setIcon(new ImageIcon(RightSide.class.getResource("/gui/SportsMan'sFastCash(ShortLine).png")));
		rightBtn5.setPreferredSize(rightSide);
		add(rightBtn5);
		
		rightBtn6 = new JButton("");
		rightBtn6.setIcon(new ImageIcon(RightSide.class.getResource("/gui/Chance(RightSide).png")));
		rightBtn6.setPreferredSize(rightSide);
		add(rightBtn6);
		
		rightBtn7 = new JButton("");
		rightBtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel dta = new PropertyPanel(Properties.DTA);
				dta.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(dta);
			}
		});
		rightBtn7.setIcon(new ImageIcon(RightSide.class.getResource("/gui/DTA(ParkPlace).png")));
		rightBtn7.setPreferredSize(rightSide);
		add(rightBtn7);
		
		rightBtn8 = new JButton("");
		rightBtn8.setIcon(new ImageIcon(RightSide.class.getResource("/gui/LuxuryTax.png")));
		rightBtn8.setPreferredSize(rightSide);
		add(rightBtn8);
		
		rightBtn9 = new JButton("");
		rightBtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel wre = new PropertyPanel(Properties.WRE);
				wre.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(wre);
			}
		});
		rightBtn9.setIcon(new ImageIcon(RightSide.class.getResource("/gui/WRE(BoardWalk).png")));
		rightBtn9.setPreferredSize(rightSide);
		add(rightBtn9);
	}
	
	public ArrayList<JButton> getAllProperties() {
		ArrayList<JButton> propertyList = new ArrayList<JButton>();

		propertyList.add(rightBtn1);
		propertyList.add(rightBtn2);
		propertyList.add(rightBtn3);
		propertyList.add(rightBtn4);
		propertyList.add(rightBtn5);
		propertyList.add(rightBtn6);
		propertyList.add(rightBtn7);
		propertyList.add(rightBtn8);
		propertyList.add(rightBtn9);

		return propertyList;
	}


}
