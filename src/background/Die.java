package background;

import java.util.Random;

public class Die {

	//fields
	static Random rand = new Random();
	//methods
	public static int rollDie(){
		return rand.nextInt(6) + 1;
	}
}
