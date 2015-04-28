package gui;

import background.Properties;
import background.PawnShops;
import background.Utilities;

public class Board {
	
	private static final Tile[] tiles = new Tile[40];
	
	public Tile getTile(int tile) {
		return tiles[tile];
	}
	
	public Board(){
		initilizeTiles();
	}

	private void initilizeTiles() {
		tiles[0] = new Tile(TileType.NEWYEAR, null);
		tiles[1] = new Tile(TileType.PROPERTY, Properties.MICHEALS_SHOE_REPAIR);
		tiles[2] = new Tile(TileType.COMMUNITYCHEST, null);
		tiles[3] = new Tile(TileType.PROPERTY, Properties.SHOPPERS_BOOT_CORAL);
		tiles[4] = new Tile(TileType.FEE, null);
		tiles[5] = new Tile(TileType.PAWNSHOPS, PawnShops.EZ_PAWN);
		tiles[6] = new Tile(TileType.PROPERTY, Properties.FAMILY_STORES);
		tiles[7] = new Tile(TileType.CHANCE, null);
		tiles[8] = new Tile(TileType.PROPERTY, Properties.ADVANCED_COPY);
		tiles[9] = new Tile(TileType.PROPERTY, Properties.JOHNS_MARKETPLACE);
		tiles[10] = new Tile(TileType.HIAWATHA, null);
		tiles[11] = new Tile(TileType.PROPERTY, Properties.CENTURY_OFFICE);
		tiles[12] = new Tile(TileType.UTILITY, Utilities.OBRIENS_PROPERTY_MAINTENENCE);
		tiles[13] = new Tile(TileType.PROPERTY, Properties.ANGELO_OFFICE);
		tiles[14] = new Tile(TileType.PROPERTY, Properties.VALLEY_COAL);
		tiles[15] = new Tile(TileType.PAWNSHOPS, PawnShops.EXTREME_PAWN);
		tiles[16] = new Tile(TileType.PROPERTY, Properties.DAMON_PALMER);
		tiles[17] = new Tile(TileType.COMMUNITYCHEST, null);
		tiles[18] = new Tile(TileType.PROPERTY, Properties.DARRENS_HOUSE);
		tiles[19] = new Tile(TileType.PROPERTY, Properties.JENKINS_LANE);
		tiles[20] = new Tile(TileType.TAXRETURN, null);
		tiles[21] = new Tile(TileType.PROPERTY, Properties.WILSON_AVENUE);
		tiles[22] = new Tile(TileType.CHANCE, null);
		tiles[23] = new Tile(TileType.PROPERTY, Properties.BEAVER_CIRCLE);
		tiles[24] = new Tile(TileType.PROPERTY, Properties.EMERY_APPARTMENTS);
		tiles[25] = new Tile(TileType.PAWNSHOPS, PawnShops.LEHI_PAWNING);
		tiles[26] = new Tile(TileType.PROPERTY, Properties.BRAIN_SPIN);
		tiles[27] = new Tile(TileType.PROPERTY, Properties.ARROW_REALESTATE);
		tiles[28] = new Tile(TileType.UTILITY, Utilities.A1_DISSPOSAL);
		tiles[29] = new Tile(TileType.PROPERTY, Properties.ADS);
		tiles[30] = new Tile(TileType.TOHIAWATHA, null);
		tiles[31] = new Tile(TileType.PROPERTY, Properties.IDAHO_FARMS);
		tiles[32] = new Tile(TileType.PROPERTY, Properties.ANDERSON_FARMS);
		tiles[33] = new Tile(TileType.COMMUNITYCHEST, null);
		tiles[34] = new Tile(TileType.PROPERTY, Properties.THE_MINE);
		tiles[35] = new Tile(TileType.PAWNSHOPS, PawnShops.SPORTSMANS_FAST_CASH);
		tiles[36] = new Tile(TileType.CHANCE, null);
		tiles[37] = new Tile(TileType.PROPERTY, Properties.DTA);
		tiles[38] = new Tile(TileType.FEE, null);
		tiles[39] = new Tile(TileType.PROPERTY, Properties.WRE);
	}
}
