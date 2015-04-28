package gui;

import background.Card;
import background.Player;

public class Tile {
	// fields
	public final TileType type;
	public final Card card;
	public Player owner = null;

	// ctors
	public Tile(TileType type, Card card) {
		this.type = type;
		this.card = card;
	}

	// methods
	public boolean isOwned() {
		return owner != null;
	}

	public TileType getType() {
		return type;
	}

	public Card getCard() {
		return card;
	}

	public Player getOwner() {
		return owner;
	}

	public boolean isProperty() {
		return type == TileType.PROPERTY;
	}

	public boolean isRailroad() {
		return type == TileType.PAWNSHOPS;
	}

	public boolean isUtility() {
		return type == TileType.UTILITY;
	}

	public boolean isFee() {
		return type == TileType.FEE;
	}

	public boolean isShabbos() {
		return type == TileType.NEWYEAR;
	}

	public boolean isJail() {
		return type == TileType.HIAWATHA;
	}

	public boolean isToJail() {
		return type == TileType.TOHIAWATHA;
	}

	public boolean isGutterballs() {
		return type == TileType.PAWNSHOPS;
	}
}
