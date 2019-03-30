package intro_to_array_lists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	public static void main(String[] args) {
		GuestBook book = new GuestBook();
		book.setUp();
	}

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton view = new JButton();
	ArrayList<String> names = new ArrayList<String>();

	public void setUp() {
		// JFrame frame = new JFrame();
		// JPanel panel = new JPanel();
		// JButton add = new JButton();
		// JButton names = new JButton();
		add.setText("Add Name");
		view.setText("View Names");
		add.addActionListener(this);
		view.addActionListener(this);
		panel.add(add);
		panel.add(view);
		frame.add(panel);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(add)) {
			String enter = JOptionPane.showInputDialog("Please enter a name.");
			names.add(enter);
		} else if (e.getSource().equals(view)) {
			for(int i = 0; i < names.size(); i++){
				String s = names.get(i);
				JOptionPane.showMessageDialog(null, "Guest #"+(i+1)+": "+s);
			}
		}
	}
}
// Create a GUI with two buttons. One button reads "Add Name" and the other
// button reads "View Names".
// When the add name button is clicked, display an input dialog that asks the
// user to enter a name. Add
// that name to an ArrayList. When the "View Names" button is clicked, display a
// message dialog that displays
// all the names added to the list. Format the list as follows:
// Guest #1: Bob Banders
// Guest #2: Sandy Summers
// Guest #3: Greg Ganders
// Guest #4: Donny Doners
