import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JSeparator;
import java.awt.Color;
import java.awt.SystemColor;
import java.util.ArrayList;

import javax.swing.JTextField;

public class ProjectView extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private ArrayList<String> Projects; 
	
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
		
		JLabel label = new JLabel("Select Project");
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(31, 28, 107, 24);
		contentPane.add(label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(135, 32, 180, 20);
		contentPane.add(comboBox);
		
		JButton button = new JButton("Create New");
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBounds(599, 29, 113, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Logout");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button_1.setBounds(737, 28, 107, 24);
		contentPane.add(button_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 75, 884, 23);
		contentPane.add(separator);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setForeground(SystemColor.menu);
		panel.setBackground(Color.WHITE);
		panel.setBounds(116, 119, 690, 331);
		contentPane.add(panel);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 56, 690, 19);
		panel.add(separator_1);
		
		JLabel label_1 = new JLabel("Create New Project");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(270, 11, 167, 34);
		panel.add(label_1);
		
		JLabel label_2 = new JLabel("Columns");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_2.setBounds(32, 122, 98, 14);
		panel.add(label_2);
		
		JLabel label_3 = new JLabel("Name");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_3.setBounds(32, 86, 46, 14);
		panel.add(label_3);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(121, 86, 244, 20);
		panel.add(textField);
		
		JButton button_2 = new JButton("+");
		button_2.setBounds(121, 120, 53, 23);
		panel.add(button_2);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(32, 161, 181, 20);
		panel.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(32, 205, 181, 20);
		panel.add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(31, 247, 182, 20);
		panel.add(textField_3);
		
		JButton btnCreate = new JButton("Create");
		btnCreate.setBounds(466, 297, 89, 23);
		panel.add(btnCreate);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.setBounds(572, 297, 89, 23);
		panel.add(btnCancel);
	}
}
