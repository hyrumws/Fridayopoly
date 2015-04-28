package background;

import javax.swing.ImageIcon;

public class Player {
	//fields
	private String name;
	private int money;
	private BoardPiece boardPiece;
	private int boardPosition;
	private int orderNum;
	private int position;
	
	public int getOrderNum() {
		return orderNum;
	}

	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}

	//ctors
	public Player(String name, int money, BoardPiece boardPiece) {
		this.name = name;
		this.money = money;
		this.boardPiece = boardPiece;
		boardPosition = 0;
	}

	//methods
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public BoardPiece getBoardPiece() {
		return boardPiece;
	}

	public void setBoardPiece(BoardPiece boardPiece) {
		this.boardPiece = boardPiece;
	}
	
	public int getBoardPosition(){
		return boardPosition;
	}
	
	
	//when you can get to this
	public void setPosition(int pos){
		//set position based on the about of properties
		position = pos;
	}
	
	public int getPosition(){
		return position;
	}
	
	public void repaintPiece(){
		boardPiece.repaint();
	}

	@Override
	public String toString() {
		return "Player: " + name + " money= " + money + ", boardPiece= "
				+ boardPiece;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + money;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof Player))
			return false;
		Player other = (Player) obj;
		if (money != other.money)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	

}
