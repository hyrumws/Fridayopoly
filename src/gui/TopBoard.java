/**
 * @author Makell Evans
 * 
 * Assignment: Team Project
 */

package gui;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import background.PawnShops;
import background.Properties;
import background.Utilities;

public class TopBoard extends JPanel {
	Dimension top = new Dimension(100, 200);
	Dimension cornerPieces = new Dimension(202, 200);
	private JButton corner2, corner3, topBtn1, topBtn2, topBtn3, topBtn4, topBtn5, 
			topBtn6, topBtn7, topBtn8, topBtn9;

	/**
	 * Create the panel.
	 */
	public TopBoard() {
		setBackground(Color.BLACK);
		setBounds(0, 0, 1360, 205);
				
		corner2 = new JButton("");
		corner2.setIcon(new ImageIcon(TopBoard.class.getResource("/gui/freeParking.jpg")));
		corner2.setPreferredSize(cornerPieces);
		add(corner2);
		
		topBtn1 = new JButton();
		topBtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel wilson = new PropertyPanel(Properties.WILSON_AVENUE);
				wilson.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(wilson);			}
		});
		topBtn1.setIcon(new ImageIcon(TopBoard.class.getResource("/gui/WilsonAvenue(KentuckyAvenue).png")));
		topBtn1.setPreferredSize(top);
		add(topBtn1);
		
		topBtn2 = new JButton();
		topBtn2.setIcon(new ImageIcon(TopBoard.class.getResource("/gui/Chance(Top).png")));
		topBtn2.setPreferredSize(top);
		add(topBtn2);
		
		topBtn3 = new JButton();
		topBtn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel beaver = new PropertyPanel(Properties.BEAVER_CIRCLE);
				beaver.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(beaver);			}
		});
		topBtn3.setIcon(new ImageIcon(TopBoard.class.getResource("/gui/BeaverCircle(IndianaAvenue).png")));
		topBtn3.setPreferredSize(top);
		add(topBtn3);
		
		topBtn4 = new JButton();
		topBtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel emery = new PropertyPanel(Properties.EMERY_APPARTMENTS);
				emery.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(emery);			}
		});
		topBtn4.setIcon(new ImageIcon(TopBoard.class.getResource("/gui/EmeryApartments(IllinoiseAvenue).png")));
		topBtn4.setPreferredSize(top);
		add(topBtn4);
		
		topBtn5 = new JButton();
		topBtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel sportsmans = new PropertyPanel(PawnShops.LEHI_PAWNING);
				sportsmans.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(sportsmans);
			}
		});
		topBtn5.setIcon(new ImageIcon(TopBoard.class.getResource("/gui/LehiPawning(B.&O.RailRoad).png")));
		topBtn5.setPreferredSize(top);
		add(topBtn5);
		
		topBtn6 = new JButton();
		topBtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel brainSpin = new PropertyPanel(Properties.BRAIN_SPIN);
				brainSpin.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(brainSpin);			}
		});
		topBtn6.setIcon(new ImageIcon(TopBoard.class.getResource("/gui/BrainSpin(AtlanticAvenue).png")));
		topBtn6.setPreferredSize(top);
		add(topBtn6);
		
		topBtn7 = new JButton();
		topBtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel arrow = new PropertyPanel(Properties.ARROW_REALESTATE);
				arrow.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(arrow);			}
		});
		topBtn7.setIcon(new ImageIcon(TopBoard.class.getResource("/gui/ArrowRealEstate(VentnorAvenue).png")));
		topBtn7.setPreferredSize(top);
		add(topBtn7);
		
		topBtn8 = new JButton();
		topBtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel utilities = new PropertyPanel(Utilities.A1_DISSPOSAL);
				utilities.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(utilities);
			}
		});
		topBtn8.setIcon(new ImageIcon(TopBoard.class.getResource("/gui/WaterWorks.jpeg")));
		topBtn8.setPreferredSize(top);
		add(topBtn8);
		
		topBtn9 = new JButton();
		topBtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel ads = new PropertyPanel(Properties.ADS);
				ads.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(ads);			}
		});
		topBtn9.setIcon(new ImageIcon(TopBoard.class.getResource("/gui/ADS(MarvinGardens).png")));
		topBtn9.setPreferredSize(top);
		add(topBtn9);
		
		corner3 = new JButton("");
		corner3.setIcon(new ImageIcon(TopBoard.class.getResource("/gui/goToHiawatha.jpg")));
		corner3.setPreferredSize(cornerPieces);
		add(corner3);
	}
	
	public ArrayList<JButton> getAllProperties() {
		ArrayList<JButton> propertyList = new ArrayList<JButton>();

		propertyList.add(corner2);
		propertyList.add(topBtn1);
		propertyList.add(topBtn2);
		propertyList.add(topBtn3);
		propertyList.add(topBtn4);
		propertyList.add(topBtn5);
		propertyList.add(topBtn6);
		propertyList.add(topBtn7);
		propertyList.add(topBtn8);
		propertyList.add(topBtn9);
		propertyList.add(corner3);

		return propertyList;
	}
}
