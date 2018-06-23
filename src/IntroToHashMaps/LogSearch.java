package IntroToHashMaps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class LogSearch implements ActionListener {
	static HashMap<Integer, String> log = new HashMap<Integer, String>();
	JFrame frame;
	JPanel panel;
	JButton button;
	JButton button2;
	JButton button3;
	JButton button4;
	public LogSearch() {
		frame = new JFrame();
		panel = new JPanel();
		button = new JButton("Add Entry");
		button2 = new JButton("Search by ID");
		button3 = new JButton("View List");
		button4 = new JButton("Remove Entry");
		frame.add(panel);
		panel.add(button);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		button.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		frame.setVisible(true);
		frame.pack();
	}
	public static void main(String[] args) {
		LogSearch search = new LogSearch();
	}
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	public static void iterate() {
		for(int i: log.keySet()) {
			System.out.println("ID: " + i + " Name: " + log.get(i));
		}
	}
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource().equals(button)) {
			String id = JOptionPane.showInputDialog("Enter an ID number");
			String name = JOptionPane.showInputDialog("Enter a name");
			log.put(Integer.parseInt(id), name);
		}
		else if(e.getSource().equals(button2)) {
			String id = JOptionPane.showInputDialog("Search an ID number");
			if(log.keySet().contains(Integer.parseInt(id))) {
				JOptionPane.showMessageDialog(null, log.get(Integer.parseInt(id)));
			}
			else {
				JOptionPane.showMessageDialog(null, "ID number is not in the database");
			}
		}
		else if(e.getSource().equals(button3)) {
			iterate();
		}
		else if(e.getSource().equals(button4)) {
			String id = JOptionPane.showInputDialog("Enter an ID number to remove");
			if(log.keySet().contains(Integer.parseInt(id))) {
				log.remove(Integer.parseInt(id));
			}
			else {
				JOptionPane.showMessageDialog(null, "ID number is not in the database");
			}
		}
	}
}
