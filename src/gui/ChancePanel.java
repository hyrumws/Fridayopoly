package gui;

import javax.swing.JPanel;
import background.Chance;
import java.util.Random;

public class ChancePanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public ChancePanel() {
		randomChanceGenerator();
		
	}

	public static Chance randomChanceGenerator() {
		Chance[] c = Chance.values();
		Random rand = new Random();
		int randomIndex = rand.nextInt(c.length);
		Chance randomChance = c[randomIndex];
		return randomChance;
	}

}
