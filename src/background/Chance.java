package background;

public enum Chance implements Card {
	CH1("Go Back 3 Spaces", 1, false),
	CH2("Go Directly To Hiawatha", 2, false),
	CH3("Advance Token To Nearest Utility\nIf Unownd, you may buy\nit from the bank.\n\nIf owned re-role and pay\nten time amount shown.", 3, false),
	CH4("Make Repares to all of your propertiess\nFor each house pay $25\nand each hotel pay $100", 4, false),
	Ch5("Get Out of Hiawatha Free\nYou may sell or keep this card until needed.", 5, true),
	CH6("Head to EZ Pawn, if you pass GO, collect $200" , 6, false),
	CH7("Advance token to the nearest PawnShop \nand pay the owner twice the Rental\n which they are otherwise entitled. \nIf RailRoad is unowned, \nyou may buy it from the bank.", 7, false),
	CH8("Your Building And Loan Matures,\n Collect $150", 8, false),
	CH9("Advance to Century Office,\n if you pass GO, collect $200", 9, false),
	CH10("Bank pays you dividend of $50", 10, false),
	CH11("Advance token to the nearest PawnShop \nand pay the owner twice the Rental\n which they are otherwise entitled. \nIf RailRoad is unowned, \nyou may buy it from the bank.", 11, false),
	CH12("Pay Poor Tax of $15", 12, false),
	CH13("Go, Back Three Spaces", 13, false),
	CH14("Advance to GO, Collect $200", 14, false),
	CH15("You have been elected charman of the board.\n Pay each player $50", 15, false),
	CH16("Advance to ADS. \nIf you pass Go, collect $200", 16, false)
	;

	//fields 
	private final String descritption;
	private final int id;
	private final boolean ownable;
	
	//ctors
	private Chance(String descritption, int id, boolean ownable) {
		this.descritption = descritption;
		this.id = id;
		this.ownable = ownable;
	}
	
	@Override
	public String getDescription() {
		return descritption;
	}

	@Override
	public int getId() {
		return id;
	}

	@Override
	public boolean ownable() {
		return ownable;
	}

}
