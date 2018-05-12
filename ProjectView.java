import java.awt.BorderLayout;
import java.awt.EventQueue;

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

public class ProjectView extends JFrame implements ActionListener{
	private JPanel contentPane;
	private JTextField textField;
	private ArrayList<String> Projects; 
	private int columnsize=0;
	JPanel panel_1;
	private JTextField [] column = new JTextField[10];
	//private String[] columnTitles;
	
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
		
		JButton addcolumnbutton = new JButton("+");
		addcolumnbutton.setBounds(214, 136, 53, 23);
		contentPane.add(addcolumnbutton);
		
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
		
		panel_1 = new JPanel();
		panel_1.setBounds(101, 181, 769, 160);
		contentPane.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
				ProjectModel newModel = new ProjectModel();
				
				for (int i = 0; i < columnsize; i++) {
					newModel.setColumnName(i, column[i].getText());
				}
				
				newModel.printColumnNames();
			}
		});
		addcolumnbutton.addActionListener(this);
	}
	
	public JTextField[] getColumns() {
		return column;
	}
	
	public int getColumnSize() {
		return columnsize;
	}

	    
	class FieldButtonPair extends JPanel {import java.awt.BorderLayout;
import java.awt.EventQueue;

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

public class ProjectView extends JFrame implements ActionListener{
	private JPanel contentPane;
	private JTextField textField;
	private ArrayList<String> Projects; 
	private int columnsize=0;
	JPanel panel_1;
	private JTextField [] column = new JTextField[10];
	//private String[] columnTitles;
	
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
		
		JButton addcolumnbutton = new JButton("+");
		addcolumnbutton.setBounds(214, 136, 53, 23);
		contentPane.add(addcolumnbutton);
		
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
		
		panel_1 = new JPanel();
		panel_1.setBounds(101, 181, 769, 160);
		contentPane.add(panel_1);
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));
		
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		btnCreate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				
				ProjectModel newModel = new ProjectModel();
				
				newModel.setName(textField.getText());
				for (int i = 0; i < columnsize; i++) {
					newModel.setColumnName(i, column[i].getText());
				}
				
				newModel.printColumnNames();
				newModel.printName();
			}
		});
		addcolumnbutton.addActionListener(this);
	}
	
	public JTextField[] getColumns() {
		return column;
	}
	
	public int getColumnSize() {
		return columnsize;
	}

	    
	class FieldButtonPair extends JPanel {
	    JTextField field;
	    JButton removebutton;

	    FieldButtonPair() {
	        super(new BorderLayout());
	        field = new JTextField();
	        add(field, BorderLayout.CENTER);
	        removebutton = new JButton("Remove");
	        add(removebutton, BorderLayout.EAST);
	    }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		column[columnsize] = new JTextField();
        this.panel_1.add(column[columnsize]);
        this.panel_1.revalidate();
        validate();
        columnsize = columnsize + 1;
	} 
	    

	    JTextField field;
	    JButton removebutton;

	    FieldButtonPair() {
	        super(new BorderLayout());
	        field = new JTextField();
	        add(field, BorderLayout.CENTER);
	        removebutton = new JButton("Remove");
	        add(removebutton, BorderLayout.EAST);
	    }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		column[columnsize] = new JTextField();
        this.panel_1.add(column[columnsize]);
        this.panel_1.revalidate();
        validate();
        columnsize = columnsize + 1;
	} 
	    
}
