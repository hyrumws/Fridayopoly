package gui;

import javax.swing.JPanel;
import java.util.Random;


import background.CommunityChest;

public class CommunityChestPanel extends JPanel {
	Random rand = new Random();
	/**
	 * Create the panel.
	 */
	public CommunityChestPanel() {
		randomCommunityChestGenerator();
	}
	public CommunityChest randomCommunityChestGenerator()
	{
		CommunityChest[] comChest = CommunityChest.values();
		Random rand = new Random();
		int randomIndex = rand.nextInt(comChest.length);
		CommunityChest randomCommunityChest = comChest[randomIndex];
		return randomCommunityChest;
	}
}
