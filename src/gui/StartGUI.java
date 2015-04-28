package gui;

import javax.swing.JPanel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import background.GameEngine;
import background.Player;
import background.BoardPiece;

import java.awt.CardLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.GridLayout;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;

import java.awt.Font;

public class StartGUI extends JPanel {
	private int playerCounter = 0;
	private String name;
	private BoardPiece bp;
	private int money = 1500;
	private int orderdelaration;
	private int order1;
	private int order2;
	private int order3;
	private int order4;
	private int order5;
	private int order6;

	/**
	 * Create the panel.
	 */
	public StartGUI() {
		setBounds(0, 0, 600, 540);
		
		final JPanel playerBtn4 = new JPanel();
		
		final JPanel playerBtn3 = new JPanel();
		
		final JPanel playerBtn2 = new JPanel();
		
		final JPanel playerBtn5 = new JPanel();
		
		final JPanel playerBtn6 = new JPanel();
		
		final JPanel playerBtn1 = new JPanel();
		
		JButton playBtn = new JButton("Play");
		playBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JPanel mainboar = new MainBoard();
				mainboar.setPreferredSize(new Dimension(1600, 1600));
				PlayGame.swapPanels();
			}
		});
		GroupLayout groupLayout = new GroupLayout(this);
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(playerBtn4, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
						.addComponent(playerBtn3, GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(playBtn, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
						.addComponent(playerBtn5, GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE)
						.addComponent(playerBtn2, GroupLayout.DEFAULT_SIZE, 396, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(playerBtn6, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
						.addComponent(playerBtn1, GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(playerBtn6, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
								.addComponent(playerBtn4, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(playerBtn1, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
									.addComponent(playerBtn2, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
									.addComponent(playerBtn3, GroupLayout.PREFERRED_SIZE, 251, GroupLayout.PREFERRED_SIZE))))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(playerBtn5, GroupLayout.PREFERRED_SIZE, 143, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(playBtn, GroupLayout.PREFERRED_SIZE, 209, GroupLayout.PREFERRED_SIZE)))
					.addGap(36))
		);

//1111111111111111111111111111111111111111111111111111111111111111111111Button1		
		final CardLayout layout1 = new CardLayout(0, 0);
		playerBtn1.setLayout(layout1);
		
		JButton btnAddPlayer1 = new JButton("Add Player 1");
		btnAddPlayer1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout1.show(playerBtn1, "name_245734962181367");
			}
		});
		playerBtn1.add(btnAddPlayer1, "name_191746854038054");
		
		JPanel namePanel1 = createNamePanel(playerBtn1, layout1, "name_245755987790206");
		playerBtn1.add(namePanel1, "name_245734962181367");
		
		JPanel iconPanel1 = createVerticalIconPanel(playerBtn1, layout1, 1);
		playerBtn1.add(iconPanel1, "name_245755987790206");
		
		
//222222222222222222222222222222222222222222222222222222222222222222222button2	
		final CardLayout layout2 = new CardLayout(0, 0);
		playerBtn2.setLayout(layout2);
		
		JButton btnAddPlayer2 = new JButton("Add Player 2");
		btnAddPlayer2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout2.show(playerBtn2, "name_245678209418868");
			}
		});
		playerBtn2.add(btnAddPlayer2, "name_191739774435875");
		
		JPanel namePanel2 = createNamePanel(playerBtn2, layout2, "name_245698177325153");
		playerBtn2.add(namePanel2, "name_245678209418868");
		
		JPanel iconPanel2 = createHorizontalIconPanel(playerBtn2, layout2, 2);
		playerBtn2.add(iconPanel2, "name_245698177325153");
		
		
//333333333333333333333333333333333333333333333333333333333333333333333button3	
		final CardLayout layout3 = new CardLayout(0, 0);
		playerBtn3.setLayout(layout3);
		JButton btnAddPlayer3 = new JButton("Add Player 3");
		btnAddPlayer3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout3.show(playerBtn3, "name_245605649153958");
			}
		});
		playerBtn3.add(btnAddPlayer3, "name_191724524137558");
		
		JPanel namePanel3 = createNamePanel(playerBtn3, layout3, "name_245633684122850");
		playerBtn3.add(namePanel3, "name_245605649153958");
		
		JPanel IconPanel3 = createVerticalIconPanel(playerBtn3, layout3, 3);
		playerBtn3.add(IconPanel3, "name_245633684122850");
		
		
//66666666666666666666666666666666666666666666666666666666666666666666button6
		final CardLayout layout6 = new CardLayout(0, 0);
		playerBtn6.setLayout(layout6);
		
		JButton btnAddPlayer6 = new JButton("Add Player 6");
		btnAddPlayer6.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				layout6.show(playerBtn6, "name_245547407251799");
			}
		});
		playerBtn6.add(btnAddPlayer6, "name_191709373263760");
		
		JPanel namePanel6 = createNamePanel(playerBtn6, layout6, "name_245574283379133");
		playerBtn6.add(namePanel6, "name_245547407251799");
		
		JPanel iconPanel6 = createVerticalIconPanel(playerBtn6, layout6, 6);
		playerBtn6.add(iconPanel6, "name_245574283379133");
		

//5555555555555555555555555555555555555555555555555555555555555555555555Button5	
		final CardLayout layout5 = new CardLayout(0, 0);
		playerBtn5.setLayout(layout5);
		//button
		JButton btnAddPlayer5 = new JButton("Add Player 5");
		btnAddPlayer5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout5.show(playerBtn5, "name_244661501214241");
			}
		});
		playerBtn5.add(btnAddPlayer5, "name_191590266564505");
		//namepanel
		JPanel namePanel5 = createNamePanel(playerBtn5, layout5, "name_245507066765852");
		playerBtn5.add(namePanel5, "name_244661501214241");
		//iconpanel
		JPanel iconPanel5 = createHorizontalIconPanel(playerBtn5, layout5, 5);
		playerBtn5.add(iconPanel5, "name_245507066765852");
		

//44444444444444444444444444444444444444444444444444444444444444444444444444Button4	
		final CardLayout layout4 = new CardLayout(0, 0);
		playerBtn4.setLayout(layout4);
		JButton btnAddPlayer4 = new JButton("Add player 4");
		btnAddPlayer4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				layout4.show(playerBtn4, "name_191930695453535");
			}
		});
		playerBtn4.add(btnAddPlayer4, "name_191580888983741");
		
		JPanel namePanel4 = createNamePanel(playerBtn4, layout4, "name_192439991005869");
		playerBtn4.add(namePanel4, "name_191930695453535");
		
		JPanel verticalIconPanel4 = createVerticalIconPanel(playerBtn4, layout4, 4);
		playerBtn4.add(verticalIconPanel4, "name_192439991005869");
		
		
		
		
		
		setLayout(groupLayout);

	}

	public int getNum0fPlayers() {
		return playerCounter;
	}

	public int getOrder1() {
		return order1;
	}

	public int getOrder2() {
		return order2;
	}

	public int getOrder3() {
		return order3;
	}

	public int getOrder4() {
		return order4;
	}

	public int getOrder5() {
		return order5;
	}

	public int getOrder6() {
		return order6;
	}

	public void addPlayertoArray(){
		
	}
	
	private JPanel createNamePanel(final JPanel p, final CardLayout l, final String nIP) {
		JPanel namePanel = new JPanel();
		namePanel.setAlignmentX(CENTER_ALIGNMENT);
		namePanel.setAlignmentY(CENTER_ALIGNMENT);
		
		
		JLabel lblEnterName = new JLabel("Enter Name: ");
		lblEnterName.setFont(new Font("Tahoma", Font.PLAIN, 25));
		namePanel.add(lblEnterName);
		
		final JTextField txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 25));
		txtName.setToolTipText("");
		txtName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				name = txtName.getText();
				l.show(p, nIP);
			}
		});
		namePanel.add(txtName);
		txtName.setColumns(10);
		return namePanel;
	}
	
	private JPanel createVerticalIconPanel(final JPanel p, final CardLayout l, final int pos) {
		JPanel verticalIconPanel = new JPanel();
		verticalIconPanel.setLayout(new GridLayout(4, 2, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Choose ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		verticalIconPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Icon:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalIconPanel.add(lblNewLabel_1);
		
		final JButton icon1 = new JButton("");
		icon1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bp = new BoardPiece(icon1.getIcon());
				Player player = new Player(name, money, bp);
				player.setPosition(pos);
				player.setOrderNum(playerCounter);
				orderdelaration = playerCounter;
				GameEngine.players.add(player);
				JPanel finalPanel = createFinalPanel(playerCounter);
				p.add(finalPanel, "name_202615384631037");
				l.show(p, "name_202615384631037");
				playerCounter++;
			}
		});
		icon1.setIcon(new ImageIcon(StartGUI.class.getResource("/gui/Horse.jpg")));
		verticalIconPanel.add(icon1);
		
		final JButton icon2 = new JButton("");
		icon2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bp = new BoardPiece(icon2.getIcon());
				Player player = new Player(name, money, bp);
				player.setPosition(pos);
				player.setOrderNum(playerCounter);
				orderdelaration = playerCounter;
				GameEngine.players.add(player);
				JPanel finalPanel = createFinalPanel(playerCounter);
				p.add(finalPanel, "name_202615384631037");
				l.show(p, "name_202615384631037");
				playerCounter++;
			}
		});
		icon2.setIcon(new ImageIcon(StartGUI.class.getResource("/gui/crown.jpg")));
		verticalIconPanel.add(icon2);
		
		final JButton icon3 = new JButton("");
		icon3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bp = new BoardPiece(icon3.getIcon());
				Player player = new Player(name, money, bp);
				player.setPosition(pos);
				player.setOrderNum(playerCounter);
				orderdelaration = playerCounter;
				GameEngine.players.add(player);
				JPanel finalPanel = createFinalPanel(playerCounter);
				p.add(finalPanel, "name_202615384631037");
				l.show(p, "name_202615384631037");
				playerCounter++;
			}
		});
		icon3.setIcon(new ImageIcon(StartGUI.class.getResource("/gui/horn.jpg")));
		verticalIconPanel.add(icon3);
		
		final JButton icon4 = new JButton("");
		icon4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bp = new BoardPiece(icon4.getIcon());
				Player player = new Player(name, money, bp);
				player.setPosition(pos);
				player.setOrderNum(playerCounter);
				orderdelaration = playerCounter;
				GameEngine.players.add(player);
				JPanel finalPanel = createFinalPanel(playerCounter);
				p.add(finalPanel, "name_202615384631037");
				l.show(p, "name_202615384631037");
				playerCounter++;
			}
		});
		icon4.setIcon(new ImageIcon(StartGUI.class.getResource("/gui/leaf.jpg")));
		verticalIconPanel.add(icon4);
		
		final JButton icon5 = new JButton("");
		icon5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bp = new BoardPiece(icon5.getIcon());
				Player player = new Player(name, money, bp);
				player.setPosition(pos);
				player.setOrderNum(playerCounter);
				orderdelaration = playerCounter;
				GameEngine.players.add(player);
				JPanel finalPanel = createFinalPanel(playerCounter);
				p.add(finalPanel, "name_202615384631037");
				l.show(p, "name_202615384631037");
				playerCounter++;
			}
		});
		icon5.setIcon(new ImageIcon(StartGUI.class.getResource("/gui/sword.jpg")));
		verticalIconPanel.add(icon5);
		
		final JButton icon6 = new JButton("");
		icon6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bp = new BoardPiece(icon6.getIcon());
				Player player = new Player(name, money, bp);
				player.setPosition(pos);
				player.setOrderNum(playerCounter);
				orderdelaration = playerCounter;
				GameEngine.players.add(player);
				JPanel finalPanel = createFinalPanel(playerCounter);
				p.add(finalPanel, "name_202615384631037");
				l.show(p, "name_202615384631037");
				playerCounter++;
			}
		});
		icon6.setIcon(new ImageIcon(StartGUI.class.getResource("/gui/wizardHat.jpg")));
		verticalIconPanel.add(icon6);
		if(pos == 1){
			order1 = orderdelaration;
		}else if(pos == 2){
			order2 = orderdelaration;
		}else if (pos == 3){
			order3 = orderdelaration;
		}else if(pos == 4){
			order4 = orderdelaration;
		}else if(pos == 5){
			order5 = orderdelaration;
		}else{
			order6 = orderdelaration;
		}
		return verticalIconPanel;
	}

	private JPanel createHorizontalIconPanel(final JPanel p, final CardLayout l, final int pos) {
		JPanel verticalIconPanel = new JPanel();
		verticalIconPanel.setLayout(new GridLayout(2, 4, 0, 0));
		
		JLabel lblNewLabel = new JLabel("Choose ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.TRAILING);
		verticalIconPanel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Icon:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 25));
		verticalIconPanel.add(lblNewLabel_1);
		
		final JButton icon1 = new JButton("");
		icon1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bp = new BoardPiece(icon1.getIcon());
				Player player = new Player(name, money, bp);
				player.setPosition(pos);
				player.setOrderNum(playerCounter);
				orderdelaration = playerCounter;
				GameEngine.players.add(player);
				JPanel finalPanel = createFinalPanel(playerCounter);
				p.add(finalPanel, "name_202615384631037");
				l.show(p, "name_202615384631037");
				playerCounter++;
			}
		});
		icon1.setIcon(new ImageIcon(StartGUI.class.getResource("/gui/Horse.jpg")));
		verticalIconPanel.add(icon1);
		
		final JButton icon2 = new JButton("");
		icon2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bp = new BoardPiece(icon2.getIcon());
				Player player = new Player(name, money, bp);
				player.setPosition(pos);
				player.setOrderNum(playerCounter);
				orderdelaration = playerCounter;
				GameEngine.players.add(player);
				JPanel finalPanel = createFinalPanel(playerCounter);
				p.add(finalPanel, "name_202615384631037");
				l.show(p, "name_202615384631037");
				playerCounter++;
			}
		});
		icon2.setIcon(new ImageIcon(StartGUI.class.getResource("/gui/crown.jpg")));
		verticalIconPanel.add(icon2);
		
		final JButton icon3 = new JButton("");
		icon3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bp = new BoardPiece(icon3.getIcon());
				Player player = new Player(name, money, bp);
				player.setPosition(pos);
				player.setOrderNum(playerCounter);
				orderdelaration = playerCounter;
				GameEngine.players.add(player);
				JPanel finalPanel = createFinalPanel(playerCounter);
				p.add(finalPanel, "name_202615384631037");
				l.show(p, "name_202615384631037");
				playerCounter++;
			}
		});
		icon3.setIcon(new ImageIcon(StartGUI.class.getResource("/gui/horn.jpg")));
		verticalIconPanel.add(icon3);
		
		final JButton icon4 = new JButton("");
		icon4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bp = new BoardPiece(icon4.getIcon());
				Player player = new Player(name, money, bp);
				player.setPosition(pos);
				player.setOrderNum(playerCounter);
				orderdelaration = playerCounter;
				GameEngine.players.add(player);
				JPanel finalPanel = createFinalPanel(playerCounter);
				p.add(finalPanel, "name_202615384631037");
				l.show(p, "name_202615384631037");
				playerCounter++;
			}
		});
		icon4.setIcon(new ImageIcon(StartGUI.class.getResource("/gui/leaf.jpg")));
		verticalIconPanel.add(icon4);
		
		final JButton icon5 = new JButton("");
		icon5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bp = new BoardPiece(icon5.getIcon());
				Player player = new Player(name, money, bp);
				player.setPosition(pos);
				player.setOrderNum(playerCounter);
				orderdelaration = playerCounter;
				GameEngine.players.add(player);
				JPanel finalPanel = createFinalPanel(playerCounter);
				p.add(finalPanel, "name_202615384631037");
				l.show(p, "name_202615384631037");
				playerCounter++;
			}
		});
		icon5.setIcon(new ImageIcon(StartGUI.class.getResource("/gui/sword.jpg")));
		verticalIconPanel.add(icon5);
		
		final JButton icon6 = new JButton("");
		icon6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bp = new BoardPiece(icon6.getIcon());
				Player player = new Player(name, money, bp);
				player.setPosition(pos);
				player.setOrderNum(playerCounter);
				orderdelaration = playerCounter;
				GameEngine.players.add(player);
				JPanel finalPanel = createFinalPanel(playerCounter);
				p.add(finalPanel, "name_202615384631037");
				l.show(p, "name_202615384631037");
				playerCounter++;
			}
		});
		icon6.setIcon(new ImageIcon(StartGUI.class.getResource("/gui/wizardHat.jpg")));
		verticalIconPanel.add(icon6);
		if(pos == 1){
			order1 = orderdelaration;
		}else if(pos == 2){
			order2 = orderdelaration;
		}else if (pos == 3){
			order3 = orderdelaration;
		}else if(pos == 4){
			order4 = orderdelaration;
		}else if(pos == 5){
			order5 = orderdelaration;
		}else{
			order6 = orderdelaration;
		}
		return verticalIconPanel;
	}
	
	private JPanel createFinalPanel(int orderpos) {
		JPanel finalPanel = new JPanel();
		finalPanel.setLayout(new GridLayout(3, 1, 0, 0));
		if(GameEngine.players.isEmpty()){
			JLabel lblName = new JLabel("Scary");
			finalPanel.add(lblName);
			
			JLabel lblMoney = new JLabel("$" + 000000);
			finalPanel.add(lblMoney);
			
			JLabel boardGameIcon = new JLabel("you didn't choose a peice.");
			finalPanel.add(boardGameIcon);
		}else{
			Player p = GameEngine.players.get(orderpos);
			JLabel lblName = new JLabel("");
			lblName.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblName.setHorizontalAlignment(SwingConstants.CENTER);
			lblName.setText(p.getName());
			finalPanel.add(lblName);
			
			JLabel lblMoney = new JLabel("$");
			lblMoney.setFont(new Font("Tahoma", Font.PLAIN, 20));
			lblMoney.setHorizontalAlignment(SwingConstants.CENTER);
			lblMoney.setText("Starts with: $" + p.getMoney());
			finalPanel.add(lblMoney);
			
			JLabel boardGameIcon = new JLabel("");
			boardGameIcon.setHorizontalAlignment(SwingConstants.CENTER);
			boardGameIcon.setIcon(p.getBoardPiece().getCharacter());
			finalPanel.add(boardGameIcon);
		}
		return finalPanel;
	}

	
}
