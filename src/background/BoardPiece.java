package background;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class BoardPiece {
	//fields 
	ImageIcon character;
	Position piecePosition;

	//ctors
	public BoardPiece(Icon icon) {
		this.character = (ImageIcon) icon;
	}

	//methods

	public ImageIcon getCharacter() {
		return character;
	}

	public void setCharacter(ImageIcon character) {
		this.character = character;
	}
	
	public void updatePosition(int p){
		int newY = piecePosition.getY() + p;
		int newX = piecePosition.getX() + p;
		piecePosition.setPosition(newX, newY);
	}
	
	public void repaint(){
		
	}
	
	
}
