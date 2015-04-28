/**
 * @author Makell Evans
 * 
 * Assignment: Team Project
 */

package gui;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import background.PawnShops;
import background.Properties;
import background.Utilities;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import java.awt.Font;

public class PropertyPanel extends JPanel {
	Dimension houseExpenses = new Dimension(276, 230);
	Dimension topLbl = new Dimension(286, 30);
	Dimension rentLbl = new Dimension(286, 20);
	
	private JLabel mortgage;
	private Border border = BorderFactory.createLineBorder(Color.BLACK, 5, true);
	private Border titleBorder = BorderFactory.createLineBorder(Color.BLACK, 3, false);
	private boolean probType;
	/**
	 * Create the panel.
	 */
	public PropertyPanel(Properties prop) {
		setBackground(Color.WHITE);
		setBorder(border);	
		
		JLabel nameLbl = new JLabel();
		nameLbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		nameLbl.setOpaque(true);
		nameLbl.setHorizontalAlignment(SwingConstants.CENTER);
		nameLbl.setPreferredSize(topLbl);
		nameLbl.setBackground(prop.getColor());
		nameLbl.setText(prop.getDescription());
		nameLbl.setBorder(titleBorder);
		add(nameLbl);
		
		JLabel rentNoHouses = new JLabel("Rent $" + prop.getRent0());
		rentNoHouses.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rentNoHouses.setHorizontalAlignment(SwingConstants.CENTER);
		rentNoHouses.setPreferredSize(rentLbl);
		rentNoHouses.setBackground(null);
		add(rentNoHouses);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(houseExpenses);
		panel.setLayout(new GridLayout(8, 2, 0, 0));
		panel.setBackground(null);
		add(panel);
		
		JLabel oneHouse = new JLabel("With 1 house  ");
		oneHouse.setFont(new Font("Tahoma", Font.PLAIN, 18));
		oneHouse.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(oneHouse);
		
		JLabel amountWith1 = new JLabel("$" + prop.getRent1());
		amountWith1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(amountWith1);
		
		JLabel twohouses = new JLabel("With 2 houses  ");
		twohouses.setFont(new Font("Tahoma", Font.PLAIN, 18));
		twohouses.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(twohouses);
		
		JLabel amountWith2 = new JLabel("$" + prop.getRent2());
		amountWith2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(amountWith2);
		
		JLabel threeHouses = new JLabel("With 3 houses  ");
		threeHouses.setFont(new Font("Tahoma", Font.PLAIN, 18));
		threeHouses.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(threeHouses);
		
		JLabel amountWith3 = new JLabel("$" + prop.getRent3());
		amountWith3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(amountWith3);
		
		JLabel fourHouses = new JLabel("With 4 houses  ");
		fourHouses.setFont(new Font("Tahoma", Font.PLAIN, 18));
		fourHouses.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(fourHouses);
		
		JLabel amountWith4 = new JLabel("$" + prop.getRent4());
		amountWith4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(amountWith4);
		
		JLabel withHotel = new JLabel("With Hotel ");
		withHotel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		withHotel.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(withHotel);
		
		JLabel amountWithHotel = new JLabel("$" + prop.getRentHotel());
		amountWithHotel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(amountWithHotel);
		
		mortgage = new JLabel("Mortgage Value  ");
		mortgage.setFont(new Font("Tahoma", Font.PLAIN, 18));
		mortgage.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(mortgage);
		
		JLabel mortgageAmount = new JLabel("$" + prop.getMortgage());
		mortgageAmount.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(mortgageAmount);
		
		JLabel houseCost = new JLabel("Houses Cost  ");
		houseCost.setFont(new Font("Tahoma", Font.PLAIN, 18));
		houseCost.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(houseCost);
		
		JLabel amountOfEachHouse = new JLabel("$" + prop.getHousePrice() + " each");
		amountOfEachHouse.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(amountOfEachHouse);
		
		JLabel hotelAmount = new JLabel("Hotel  $" + prop.getHotelPrice());
		hotelAmount.setFont(new Font("Tahoma", Font.PLAIN, 18));
		hotelAmount.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(hotelAmount);
		
		JLabel houseAmount = new JLabel("  plus 4 houses");
		houseAmount.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(houseAmount);

	}
	public PropertyPanel(PawnShops railRoad) {
		setBackground(Color.WHITE);	
		setBorder(border);	
		
		JLabel nameLbl = new JLabel();
		nameLbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		nameLbl.setOpaque(true);
		nameLbl.setHorizontalAlignment(SwingConstants.CENTER);
		nameLbl.setPreferredSize(topLbl);
		nameLbl.setText(railRoad.getDescription());
		nameLbl.setBackground(null);
		nameLbl.setBorder(titleBorder);
		add(nameLbl);
		
		JLabel rentOnePawnShop = new JLabel("Rent $" + railRoad.getRent1());
		rentOnePawnShop.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rentOnePawnShop.setHorizontalAlignment(SwingConstants.CENTER);
		rentOnePawnShop.setPreferredSize(rentLbl);
		rentOnePawnShop.setBackground(null);
		add(rentOnePawnShop);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(houseExpenses);
		panel.setLayout(new GridLayout(4, 2, 0, 0));
		panel.setBackground(null);
		add(panel);
		
		JLabel twoPawnShops = new JLabel("if 2 PawnShops ");
		twoPawnShops.setFont(new Font("Tahoma", Font.PLAIN, 18));
		twoPawnShops.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(twoPawnShops);
		
		JLabel amountWith1 = new JLabel("are owned: $" + railRoad.getRent2());
		amountWith1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(amountWith1);
		
		JLabel twohouses = new JLabel("if 3 PawnShops ");
		twohouses.setFont(new Font("Tahoma", Font.PLAIN, 18));
		twohouses.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(twohouses);
		
		JLabel amountWith2 = new JLabel("are owned: $" + railRoad.getRent3());
		amountWith2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(amountWith2);
		
		JLabel threeHouses = new JLabel("if 4 PawnShops ");
		threeHouses.setFont(new Font("Tahoma", Font.PLAIN, 18));
		threeHouses.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(threeHouses);
		
		JLabel amountWith3 = new JLabel("are owned: $" + railRoad.getRent4());
		amountWith3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(amountWith3);
		
		JLabel fourHouses = new JLabel("Mortgage Value  ");
		fourHouses.setFont(new Font("Tahoma", Font.PLAIN, 18));
		fourHouses.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(fourHouses);
		
		JLabel amountWith4 = new JLabel(" $" + railRoad.getMortgage());
		amountWith4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(amountWith4);
	}
	public PropertyPanel(Utilities util) {
		setBackground(Color.WHITE);	
		setBorder(border);	
		
		JLabel nameLbl = new JLabel();
		nameLbl.setFont(new Font("Tahoma", Font.BOLD, 18));
		nameLbl.setOpaque(true);
		nameLbl.setHorizontalAlignment(SwingConstants.CENTER);
		nameLbl.setPreferredSize(topLbl);
		nameLbl.setText(util.getDescription());
		nameLbl.setBackground(null);
		nameLbl.setBorder(titleBorder);
		add(nameLbl);
		
		JLabel rentOnePawnShop = new JLabel("    if one Utility is owned rent is");
		rentOnePawnShop.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rentOnePawnShop.setHorizontalAlignment(SwingConstants.CENTER);
		rentOnePawnShop.setPreferredSize(new Dimension(286, 30));
		rentOnePawnShop.setBackground(null);
		add(rentOnePawnShop);
		
		JLabel rentOnePawnShop_2 = new JLabel("4 times amount shown on dice. ");
		rentOnePawnShop_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rentOnePawnShop_2.setHorizontalAlignment(SwingConstants.CENTER);
		rentOnePawnShop_2.setPreferredSize(new Dimension(286, 30));
		rentOnePawnShop_2.setBackground(null);
		add(rentOnePawnShop_2);
		
		JLabel rentOnePawnShop_3 = new JLabel("    if both utilities are owned ");
		rentOnePawnShop_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rentOnePawnShop_3.setHorizontalAlignment(SwingConstants.CENTER);
		rentOnePawnShop_3.setPreferredSize(new Dimension(286, 30));
		rentOnePawnShop_3.setBackground(null);
		add(rentOnePawnShop_3);
		
		JLabel rentOnePawnShop_4 = new JLabel("rent is 10 times amount shown ");
		rentOnePawnShop_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rentOnePawnShop_4.setHorizontalAlignment(SwingConstants.CENTER);
		rentOnePawnShop_4.setPreferredSize(new Dimension(286, 30));
		rentOnePawnShop_4.setBackground(null);
		add(rentOnePawnShop_4);
		
		JLabel rentOnePawnShop_5 = new JLabel("on dice. ");
		rentOnePawnShop_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		rentOnePawnShop_5.setHorizontalAlignment(SwingConstants.CENTER);
		rentOnePawnShop_5.setPreferredSize(new Dimension(286, 30));
		rentOnePawnShop_5.setBackground(null);
		add(rentOnePawnShop_5);
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(houseExpenses);
		panel.setLayout(new GridLayout(1, 2, 0, 0));
		panel.setPreferredSize(new Dimension(286, 30));
		panel.setBackground(null);
		add(panel);
		
		JLabel twoPawnShops = new JLabel("Mortgage Value ");
		twoPawnShops.setFont(new Font("Tahoma", Font.PLAIN, 18));
		twoPawnShops.setHorizontalAlignment(SwingConstants.RIGHT);
		panel.add(twoPawnShops);
		
		JLabel amountWith1 = new JLabel(" $" + util.getMorgage());
		amountWith1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(amountWith1);
		
		
	}

}
