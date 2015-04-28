package background;

public enum PawnShops implements Card{
	SPORTSMANS_FAST_CASH("Sportsmans Fast Cash", 25, 50, 100, 200, 100, true, 25),
	EZ_PAWN("EZ Pawn", 25, 50, 100, 200, 100, true, 26),
	EXTREME_PAWN("Extreme Pawn", 25, 50, 100, 200, 100, true, 27),
	LEHI_PAWNING("Lehi Pawning", 25, 50, 100, 200, 100, true, 28)
	;
	//fields
	private final String descriptioin;
	private final int rent1;
	private final int rent2;
	private final int rent3;
	private final int rent4;
	private final int mortgage;
	private final int id;
	private final boolean ownable;
	
	//ctors
	private PawnShops(String descriptioin, int rent1, int rent2, int rent3,
			int rent4, int mortgage, boolean ownable, int id) {
		this.descriptioin = descriptioin;
		this.rent1 = rent1;
		this.rent2 = rent2;
		this.rent3 = rent3;
		this.rent4 = rent4;
		this.mortgage = mortgage;
		this.ownable = ownable;
		this.id = id;
	}
	
	//methods
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

	public int getMortgage() {
		return mortgage;
	}
	
	@Override
	public String getDescription() {
		return descriptioin;
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
