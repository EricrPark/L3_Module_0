package IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook extends JFrame implements ActionListener {
	ArrayList<String> book = new ArrayList<>();
	JButton button2;
	JButton button;
	public GuestBook() {
		JPanel panel = new JPanel();
		add(panel);
		button = new JButton("add name");
		button2 = new JButton("view names");
		button.addActionListener(this);
		button2.addActionListener(this);
		panel.add(button);
		panel.add(button2);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pack();
	}
	public void iterate() {
		String guests = "";
		for(int i = 0; i < book.size(); i++){
			String s = book.get(i);
			guests += "Guest #" + (i + 1) + ": " + s + "\n";
		}
		JOptionPane.showMessageDialog(null, guests);
	}
	public static void main(String[] args) {
		GuestBook guests = new GuestBook();
		
		
	}
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==button) {
			book.add(JOptionPane.showInputDialog("Type in a name"));
		}
		else {
			iterate();
		}
	}
}
