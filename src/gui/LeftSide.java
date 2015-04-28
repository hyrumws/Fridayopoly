/**
 * @author Makell Evans
 * 
 * Assignment: Team Project
 */

package gui;

import java.awt.Dimension;

import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.GridLayout;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;





import background.PawnShops;
import background.Properties;
import background.Utilities;

public class LeftSide extends JPanel {
	Dimension leftSide = new Dimension(200, 100);
	
	/**
	 * Create the panel.
	 */
	public LeftSide() {
		setBackground(Color.BLACK);
		setBounds(0, 0, 200, 950);
		
		JButton leftBtn1 = new JButton("");
		leftBtn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel jenkins = new PropertyPanel(Properties.JENKINS_LANE);
				jenkins.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(jenkins);				
			}
		});
		leftBtn1.setIcon(new ImageIcon(LeftSide.class.getResource("/gui/JenkinsLane(NewYorkAvenue).png")));
		leftBtn1.setPreferredSize(leftSide);
		add(leftBtn1);
		
		JButton	leftBtn2 = new JButton("");
		leftBtn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel darrens = new PropertyPanel(Properties.DARRENS_HOUSE);
				darrens.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(darrens);
			}
		});
		leftBtn2.setIcon(new ImageIcon(LeftSide.class.getResource("/gui/DarrensHouse(TennesseAvenue).png")));
		leftBtn2.setPreferredSize(leftSide);
		add(leftBtn2);
		
		JButton leftBtn3 = new JButton("");
		leftBtn3.setIcon(new ImageIcon(LeftSide.class.getResource("/gui/CommunityChance(LeftSide).png")));
		leftBtn3.setPreferredSize(leftSide);
		add(leftBtn3);
		
		JButton	leftBtn4 = new JButton("");
		leftBtn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel damon = new PropertyPanel(Properties.DAMON_PALMER);
				damon.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(damon);			}
		});
		leftBtn4.setIcon(new ImageIcon(LeftSide.class.getResource("/gui/DamonPalmer(St.JamesPlace).png")));
		leftBtn4.setPreferredSize(leftSide);
		add(leftBtn4);
		
		JButton leftBtn5 = new JButton("");
		leftBtn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel sportsmans = new PropertyPanel(PawnShops.EXTREME_PAWN);
				sportsmans.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(sportsmans);
			}
		});
		leftBtn5.setIcon(new ImageIcon(LeftSide.class.getResource("/gui/X-tremePawn(PennsylvaniaRailRoad).png")));
		leftBtn5.setPreferredSize(leftSide);
		add(leftBtn5);
		
		JButton	leftBtn6 = new JButton("");
		leftBtn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel valley = new PropertyPanel(Properties.VALLEY_COAL);
				valley.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(valley);
			}
		});
		leftBtn6.setIcon(new ImageIcon(LeftSide.class.getResource("/gui/ValleyCoal(VirginiaAvenue).png")));
		leftBtn6.setPreferredSize(leftSide);
		add(leftBtn6);
		
		JButton leftBtn7 = new JButton("");
		leftBtn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel angelo = new PropertyPanel(Properties.ANGELO_OFFICE);
				angelo.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(angelo);
			}
		});
		leftBtn7.setIcon(new ImageIcon(LeftSide.class.getResource("/gui/AngeloOffice(StatesAvenue).png")));
		leftBtn7.setPreferredSize(leftSide);
		add(leftBtn7);
		
		JButton	leftBtn8 = new JButton();
		leftBtn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel utilities = new PropertyPanel(Utilities.OBRIENS_PROPERTY_MAINTENENCE);
				utilities.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(utilities);
			}
		});
		leftBtn8.setIcon(new ImageIcon(LeftSide.class.getResource("/gui/ElectricCompany.jpeg")));
		leftBtn8.setPreferredSize(leftSide);
		add(leftBtn8);
		
		JButton	leftBtn9 = new JButton("");
		leftBtn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPanel century= new PropertyPanel(Properties.CENTURY_OFFICE);
				century.setPreferredSize(new Dimension(315, 312));
				MiddleBoardPanel.setPoperty(century);
			}
		});
		leftBtn9.setIcon(new ImageIcon(LeftSide.class.getResource("/gui/CenturyOffice(St.CharlesPlace).png")));
		leftBtn9.setPreferredSize(leftSide);
		add(leftBtn9);
	}

}
