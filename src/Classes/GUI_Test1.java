package Classes;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JTable;
import java.awt.Button;

public class GUI_Test1 {

	private JFrame frame;
	private JTextField textField;
	private JTable table;

	// Launch the application.
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI_Test1 window = new GUI_Test1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Create the application.
	
	public GUI_Test1() {
		initialize();
	}


	// Initialize the contents of the frame.

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 801, 542);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(frame.getContentPane(), popupMenu);
		
		JLabel lblEnterYourNumber = new JLabel("Enter your number here: ");
		lblEnterYourNumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEnterYourNumber.setBounds(44, 56, 205, 22);
		frame.getContentPane().add(lblEnterYourNumber);
		
		textField = new JTextField();
		textField.setBounds(273, 55, 146, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setHorizontalAlignment(SwingConstants.LEFT);
		chckbxNewCheckBox.setFont(new Font("Tahoma", Font.PLAIN, 17));
		chckbxNewCheckBox.setBounds(44, 149, 163, 29);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		table = new JTable();
		table.setBounds(311, 205, 312, 221);
		frame.getContentPane().add(table);
		
		Button button = new Button("New button");
		button.setBounds(116, 289, 91, 27);
		frame.getContentPane().add(button);
	}
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
}
