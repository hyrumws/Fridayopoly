package background;

public class Position {
	//fields
	int x;
	int y;
	
	//ctors	
	
	//methods
	public Position(int x, int y){
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	public void setPosition(int x, int y){
		this.x = x;
		this.y = y;
	}

	
}
