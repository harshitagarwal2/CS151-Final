import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JSeparator;
import javax.swing.JEditorPane;
import javax.swing.JProgressBar;
import javax.swing.JPanel;

public class CreateProject {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CreateProject window = new CreateProject();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CreateProject() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.control);
		frame.setBounds(100, 100, 900, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setForeground(SystemColor.control);
		panel.setBounds(111, 138, 690, 290);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(0, 56, 690, 19);
		panel.add(separator_1);
		
		JLabel lblCreateNewProject = new JLabel("Create New Project");
		lblCreateNewProject.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCreateNewProject.setBounds(270, 11, 167, 34);
		panel.add(lblCreateNewProject);
		
		JLabel lblColumns = new JLabel("Columns");
		lblColumns.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblColumns.setBounds(32, 122, 98, 14);
		panel.add(lblColumns);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setBounds(32, 86, 46, 14);
		panel.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(121, 86, 244, 20);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton button = new JButton("+");
		button.setBounds(121, 120, 53, 23);
		panel.add(button);
		
		textField_1 = new JTextField();
		textField_1.setBounds(32, 161, 181, 20);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(32, 205, 181, 20);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(31, 247, 182, 20);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(147, 31, 180, 20);
		frame.getContentPane().add(comboBox);
		
		JButton btnCreateNew = new JButton("Create New");
		btnCreateNew.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCreateNew.setBounds(642, 31, 113, 23);
		frame.getContentPane().add(btnCreateNew);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogout.setBounds(768, 30, 95, 24);
		frame.getContentPane().add(btnLogout);
		
		JLabel lblSelectProject = new JLabel("Select Project");
		lblSelectProject.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblSelectProject.setBounds(30, 28, 107, 24);
		frame.getContentPane().add(lblSelectProject);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 87, 884, 23);
		frame.getContentPane().add(separator);
	}
}
