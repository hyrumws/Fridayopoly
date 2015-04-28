package background;

import java.util.ArrayList;
import background.Player;
import background.BoardPiece;

public class GameEngine {
	//fields
	public static ArrayList<Player> players = new ArrayList<>();
	private int turn = 0;
	private boolean isOver;
	
	//ctors
	
	
	//methods
	private void nextTurn(){
		if (isOver) {
			//set this as the main GUI frame
			frame.setTile("Game Over!");
			
		}
		
		int playerIndex;
		if (turn > players.size() - 1){
			playerIndex = 0;
		}else{
			playerIndex = turn;
		}
		Player player = players.get(playerIndex);
		
		// tell the player to roll the die
		System.out.println("roll die");
		
		
		
		
		
	}
	public void addPlayer(String name, int money, BoardPiece b){
		Player player = new Player(name, money, b);
		players.add(player);
		
	}
	
	
	
	
	
}
