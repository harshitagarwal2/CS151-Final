import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.SystemColor;
import java.util.ArrayList;

import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProjectView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private ArrayList<String> Projects; 
	private int columnsize;
	private JPanel listing;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProjectView frame = new ProjectView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ProjectView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel OverViewLabel = new JLabel("Create New Project");
		OverViewLabel.setBounds(375, 13, 167, 34);
		contentPane.add(OverViewLabel);
		OverViewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JLabel nameLabel = new JLabel("Name");
		nameLabel.setBounds(101, 89, 46, 14);
		contentPane.add(nameLabel);
		nameLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		JButton button_2 = new JButton("+");
		button_2.setBounds(214, 136, 53, 23);
		contentPane.add(button_2);
		
		textField = new JTextField();
		textField.setBounds(215, 86, 244, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setBounds(566, 390, 89, 23);
		contentPane.add(btnCreate);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(768, 389, 89, 23);
		contentPane.add(btnCancel);
		
		JLabel lblAddColumns = new JLabel("Add Columns");
		lblAddColumns.setBounds(101, 140, 56, 16);
		contentPane.add(lblAddColumns);
		
		JPanel panel = new JPanel();
		panel.setBounds(36, 178, 821, 156);
        listing = new JPanel();
        listing.setLayout(new BoxLayout(listing, BoxLayout.Y_AXIS));
		contentPane.add(listing);
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				columnsize++;
				String FieldName = "FieldName " + Integer.toString(columnsize);
				for(int i=0 ; i<columnsize; i++) {
					new JTextField();	
				}

			}
		});
	}
}
