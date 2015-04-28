package background;

import java.awt.Color;

public enum Properties implements Card{
	// name,color, 0house, 1house, 2house, 3house, 4house, hotel, mortgage, houseCost, hotelCost, propCost, ownable, isowned, id
	MICHEALS_SHOE_REPAIR("Micheal's Shoe Repair",new Color(128,0,128), 2, 10, 30, 90, 160, 250, 30, 50, 50, 60, true, 1),
	SHOPPERS_BOOT_CORAL("Shoppers Boot Coral", new Color(128,0,128), 4, 20, 60, 180, 320, 450, 30, 50, 50, 60, true, 2),
	
	FAMILY_STORES("Family Stores", new Color(153,179,255), 6, 30, 90, 270, 400, 550, 50, 50, 50, 100, true, 3),
	ADVANCED_COPY("Advanced Copy", new Color(153,179,255), 6, 30, 90, 270, 400, 550, 50, 50, 50, 100, true, 4),
	JOHNS_MARKETPLACE("John's Marketplace", new Color(153,179,255), 8, 40, 100, 300, 450, 600, 60, 50, 50, 120, true, 5),
	
	CENTURY_OFFICE("Century Office", new Color(202,44,129), 10, 50, 150, 450, 625, 750, 70, 100, 100, 140, true, 6),
	ANGELO_OFFICE("Angelo Office", new Color(202,44,129), 10, 50, 150, 450, 625, 750, 70, 100, 100, 140, true, 7),
	VALLEY_COAL("VAlley Coal", new Color(202,44,129), 12, 60, 180, 500, 700, 900, 80, 100, 100, 160, true, 8),
	
	DAMON_PALMER("Damon Palmer", new Color(255, 92, 38), 14, 70, 200, 550, 750, 950, 90, 100, 100, 180, true, 9),
	DARRENS_HOUSE("Darren's House", new Color(255, 92, 38), 14, 70, 200, 550, 750, 950, 90, 100, 100, 180, true, 10),
	JENKINS_LANE("Jenkins Lane", new Color(255, 92, 38), 16, 80, 220, 600, 800, 1000, 100, 100, 100, 200, true, 11),
	
	WILSON_AVENUE("Wilson Avenue", new Color(255,0,0), 18, 90, 250, 700, 875, 1050, 110, 150, 150, 220, true, 12),
	BEAVER_CIRCLE("Beaver Circle", new Color(255,0,0), 18, 90, 250, 700, 875, 1050, 110, 150, 150, 220, true, 13),
	EMERY_APPARTMENTS("Emery Appartments", new Color(255,0,0), 20, 100, 300, 750, 925, 1100, 120, 150, 150, 240, true, 14),
	
	BRAIN_SPIN("Brain Spin", new Color(255,255,0), 22, 110, 330, 800, 975, 1150, 130, 150, 150, 260, true, 15),
	ARROW_REALESTATE("Arrow Realestate", new Color(255,255,0), 22, 110, 330, 800, 975, 1150, 130, 150, 150, 260, true, 16),
	ADS("ADS", new Color(255,255,0), 24, 120, 360, 850, 1025, 1200, 140, 150, 150, 280, true, 17),
	
	IDAHO_FARMS("Idaho Farms", new Color(0,217,54), 26, 130, 390, 900, 1100, 1275, 150, 200, 200, 300, true, 18),
	ANDERSON_FARMS("Anderson Farms", new Color(0,217,54), 26, 130, 390, 900, 1100, 1275, 150, 200, 200, 300, true, 19),
	THE_MINE("The Mine", new Color(0,217,54), 28, 150, 450, 1000, 1200, 1400, 160, 200, 200, 320, true, 20),
	
	DTA("DTA", new Color(0,0,140), 35, 175, 500, 1100, 1300, 1500, 175, 200, 200, 350, true, 21),
	WRE("WRE", new Color(0,0,140), 50, 200, 600, 1400, 1700, 2000, 200, 200, 200, 400, true, 22)
	;
	//fields
	private final String description;
	private final Color color;
	private final int rent0;
	private final int rent1;
	private final int rent2;
	private final int rent3;
	private final int rent4;
	private final int rentHotel;
	private final int mortgage;
	private final int housePrice;
	private final int hotelPrice;
	private int propCost;
	private final int id;
	private final boolean ownable;
	
	//ctors
	private Properties(String description, Color color, int rent0, int rent1,
			int rent2, int rent3, int rent4, int rentHotel, int mortgage, int housePrice,
			int hotelPrice, int propCost, boolean ownable, int id) {
		this.description = description;
		this.color = color;
		this.rent0 = rent0;
		this.rent1 = rent1;
		this.rent2 = rent2;
		this.rent3 = rent3;
		this.rent4 = rent4;
		this.rentHotel = rentHotel;
		this.mortgage = mortgage;
		this.housePrice = housePrice;
		this.hotelPrice = hotelPrice;
		this.propCost = propCost;
		this.id = id;
		this.ownable = ownable;
	}
	
	//methods
	public int getPropCost() {
		return propCost;
	}

	public void setPropCost(int propCost) {
		this.propCost = propCost;
	}

	public Color getColor() {
		return color;
	}

	public int getRent0() {
		return rent0;
	}

	public int getRent1() {
		return rent1;
	}

	public int getRent2() {
		return rent2;
	}

	public int getRent3() {
		return rent3;
	}

	public int getRent4() {
		return rent4;
	}

	public int getRentHotel() {
		return rentHotel;
	}
	
	public int getMortgage(){
		return mortgage;
	}

	public int getHousePrice() {
		return housePrice;
	}

	public int getHotelPrice() {
		return hotelPrice;
	}

	public boolean isOwnable() {
		return ownable;
	}
	
	@Override
	public String getDescription() {
		return description;
	}


	@Override
	public int getId(){ 
		return id;
	}

	@Override
	public boolean ownable(){ 
		return ownable;
	}

}
