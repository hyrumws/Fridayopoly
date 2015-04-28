package gui;

import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class test extends JPanel {
	private JTextField titleNameText;
	private JTextField txtName;

	/**
	 * Create the panel.
	 */
	public test() {
		
		titleNameText = new JTextField();
		titleNameText.setText("please enter Name below");
		add(titleNameText);
		titleNameText.setColumns(25);
		
		txtName = new JTextField();
		txtName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = txtName.getText();
				
			}
		});
		txtName.setText("Name");
		add(txtName);
		txtName.setColumns(10);
		

	}

}
