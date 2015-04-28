package background;

public enum Utilities implements Card{
	OBRIENS_PROPERTY_MAINTENENCE("Obrien's Property Maintenance", 75, true, 23),
	A1_DISSPOSAL("A1 Disposal", 75, true, 24)
	;
	
	//fields
	private final String description;
	private final int mortgage;
	private final int id;
	private final boolean ownable;
	
	//ctors
	private Utilities(String description, int mortgage, boolean ownable, int id) {
		this.description = description;
		this.mortgage = mortgage;
		this.id = id;
		this.ownable = ownable;
	}

	
	
	//methods
	public int getMorgage(){
		return mortgage;
	}
	
	@Override
	public String getDescription() {
		return description;
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
