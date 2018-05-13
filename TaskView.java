import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class TaskView extends JFrame {
	private JTextField nameField;
	public static JTextField descriptionField;
	private ArrayList<String> [] Tasklist;
	private JTextField textField;
	
	public static String getDes()
	{
		return descriptionField.getText();
	}

	/**
	 * Create the frame.
	 */
	public TaskView() {
		
		setBounds(50, 50, 500, 600);
		
		JLabel lblTaskView = new JLabel("Task View");
		
		JLabel lblName = new JLabel("Name");
		
		nameField = new JTextField();
		nameField.setColumns(10);
		
		JLabel lblDescription = new JLabel("Description");
		
		descriptionField = new JTextField();
		descriptionField.setColumns(10);
		
		JLabel lblDueDate = new JLabel("Due Date");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Create");
	
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				String newName = nameField.getText();
				String newDes = descriptionField.getText();
				String newDate = textField.getText();
				if(TaskBoardV2.editChoice == 1)
				{
					MainScreen.colNames[0] = newName;
					MainScreen.des[0] = newDes;
					MainScreen.dates[0] = newDate; 
				}
				if(TaskBoardV2.editChoice == 2)
				{
					MainScreen.colNames[1] = newName;	
					MainScreen.des[1] = newDes;
					MainScreen.dates[1] = newDate; 
				}
				if(TaskBoardV2.editChoice == 3)
				{
					MainScreen.colNames[2] = newName;	
					MainScreen.des[2] = newDes;
					MainScreen.dates[2] = newDate; 
				}
				if(TaskBoardV2.editChoice == 4)
				{
					MainScreen.colNames[3] = newName;
					MainScreen.des[3] = newDes;
					MainScreen.dates[3] = newDate; 
				}
			
				dispose();
				TaskBoardV2 taskView = new TaskBoardV2();
				taskView.setVisible(true);
//				dispose();
				
				
			}
		});
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
//		textField = new JTextField();
//		textField.setColumns(10);

		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnNewButton)
							.addGap(18)
							.addComponent(cancelButton)
							.addGap(48))
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblDueDate)
									.addGap(40)
									.addComponent(textField, GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE))
								.addGroup(groupLayout.createSequentialGroup()
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
										.addComponent(lblDescription)
										.addComponent(lblName))
									.addGap(29)
									.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(nameField)
										.addComponent(descriptionField, GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE))))
							.addGap(57))))
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(228)
					.addComponent(lblTaskView)
					.addContainerGap(236, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTaskView)
					.addGap(30)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblName)
						.addComponent(nameField, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE))
					.addGap(53)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblDescription)
						.addComponent(descriptionField, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE))
					.addGap(109)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblDueDate)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton)
						.addComponent(cancelButton))
					.addContainerGap())
		);
		getContentPane().setLayout(groupLayout);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public String getName() {
		return nameField.getText();
	}
	
	public void setName(String name) {
		nameField.setText(name);
	}
	
	public String getDescription() {
		return descriptionField.getText();
	}
	
	public void setDescription(String name) {
		descriptionField.setText(name);
	}
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TaskView frame = new TaskView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
