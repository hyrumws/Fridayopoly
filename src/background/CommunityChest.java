package background;

public enum CommunityChest implements Card{
	CC1("Get Out of Hiawatha Free", 1, true),
	CC2("Found Money on Ground\nCollect $26", 2, false),
	CC3("Recieve for Labor $26", 3, false),
	CC4("Go To Hiawatha\nDO NOT COLLECT $260", 4, false),
	CC5("Alan Jenkins gave you\nproduce\n Collect $100", 5, false),
	CC6("Xmas Just Happened\nCollect $100", 6, false),
	CC7("Pay Darren $126", 7, false),
	CC8("You are the host of this weeks GameNight,\n Collect $50 from each player", 8, false),
	CC9("Bank error in your favor, collect $200", 9, false),
	CC10("From sale of comfrey, you recieve $45", 10, false),
	CC11("You need to repair your property,\n pay $40 per house and $115 per hotel.", 11, false),
	CC12("Advance to GO, collect $200", 12, false),
	CC13("You Inherit $100", 13, false),
	CC14("Pay School Tax of $150", 14, false),
	CC15("You have won second prize in the\n dunking contest, and recieve $10", 15, false),
	CC16("Dr. Darrens fee of $50", 16, false);
	//fields 
		private final String descritption;
		private final int id;
		private final boolean ownable;
		
		//ctors
		private CommunityChest(String descritption, int id, boolean ownable) {
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
