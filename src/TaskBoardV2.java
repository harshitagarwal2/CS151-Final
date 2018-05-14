

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileSystemView;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JButton;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TaskBoardV2 extends JFrame {

	private static JPanel contentPane;
	public static JTextField textField;
	public static JTextField textField_1;
	public static JTextField textField_2;
	public static JTextField textField_3;
	public static JTextField textField_4;
	public static JTextField textField_5;
	public static JTextField textField_6;
	public static JTextField textField_7;
	public static int editChoice = 0;
	public static boolean noProj = true;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;

	/**
	 * Launch the application.
	 */
	
	public static JPanel getJPanel()
	{
		return contentPane;
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TaskBoardV2 frame = new TaskBoardV2();
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
	public TaskBoardV2() {
		JFrame myframe = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 500);
		contentPane = new JPanel();
		contentPane.setForeground(Color.RED);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("Project Name");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(10, 34, 108, 42);
		contentPane.add(label);
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(105, 47, 182, 20);
		if (!MainScreen.cancel) {
			comboBox.addItem(MainScreen.projectName.getText());
			contentPane.add(comboBox);
		}
		
		JButton button = new JButton("Edit");
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (TaskBoardV2.noProj == false) {
					editChoice = 1;
					dispose();
					TaskView taskView = new TaskView();
					taskView.setVisible(true);
				}
			}
		});
		button.setBounds(78, 103, 69, 23);
		contentPane.add(button);
		
		JButton button_1 = new JButton("Delete");
		button_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				for (int i = 0; i < 4; i++) {
					MainScreen.colNames[i] = "";
					MainScreen.des[i] = "";
				}
				MainScreen.projectName = new JTextField("");
				TaskBoardV2.noProj = true;
				
				TaskBoardV2 taskView = new TaskBoardV2();
				dispose();
				taskView.setVisible(true);
				
				
			}
		});
		button_1.setBounds(551, 46, 88, 23);
		contentPane.add(button_1);
		
		JButton button_3 = new JButton("Create New");
		button_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				MainScreen mainScreen = new MainScreen();
				dispose();
				mainScreen.setVisible(true);
			}
		});
		button_3.setBounds(649, 46, 89, 23);
		contentPane.add(button_3);
		
		JButton button_4 = new JButton("Logout");
		button_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				LoginView loginView = new LoginView();
				//dispose();
				loginView.setVisible(true);
				
				
			}
		});
		button_4.setBounds(761, 13, 108, 23);
		contentPane.add(button_4);
		
		JSeparator separator = new JSeparator();
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(216, 103, 50, 361);
		contentPane.add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setBounds(448, 103, 50, 361);
		contentPane.add(separator_1);
		
		JSeparator separator_2 = new JSeparator();
		separator_2.setOrientation(SwingConstants.VERTICAL);
		separator_2.setBounds(669, 103, 50, 361);
		contentPane.add(separator_2);
		
		if (MainScreen.columnCount >= 1) {
			textField = new JTextField(MainScreen.colNames[0]);
			textField.setBounds(10, 205, 196, 20);
			contentPane.add(textField);
			
			textField_4 = new JTextField(MainScreen.des[0]);
			textField_4.setBounds(10, 278, 196, 172);
			contentPane.add(textField_4);
			textField_4.setColumns(10);
			
			textField_8 = new JTextField(MainScreen.dates[0]);
			textField_8.setBounds(78, 165, 128, 20);
			contentPane.add(textField_8);
			textField_8.setColumns(10);
		}
		
		JButton button_5 = new JButton("Edit");
		button_5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				if (TaskBoardV2.noProj == false) {
					editChoice = 2;
					dispose();
					TaskView taskView = new TaskView();
					taskView.setVisible(true);
				}
			}
		});
		button_5.setBounds(300, 103, 69, 23);
		contentPane.add(button_5);
		
		JButton button_6 = new JButton("Edit");
		button_6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (TaskBoardV2.noProj == false) {
					editChoice = 3;
					dispose();
					TaskView taskView = new TaskView();
					taskView.setVisible(true);
				}
			}
		});
		button_6.setBounds(521, 103, 69, 23);
		contentPane.add(button_6);
		
		JButton button_7 = new JButton("Edit");
		button_7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (TaskBoardV2.noProj == false) {
					editChoice = 4;
					dispose();
					TaskView taskView = new TaskView();
					taskView.setVisible(true);
				}
			}
		});
		button_7.setBounds(748, 103, 69, 23);
		contentPane.add(button_7);
		
		JLabel lblDueDate = new JLabel("Due Date");
		lblDueDate.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDueDate.setBounds(10, 166, 74, 14);
		contentPane.add(lblDueDate);
		
		JLabel label_1 = new JLabel("Due Date");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_1.setBounds(222, 166, 74, 14);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Due Date");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_2.setBounds(458, 166, 74, 14);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Due Date");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label_3.setBounds(676, 166, 74, 14);
		contentPane.add(label_3);
		
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JFileChooser jfc = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
				File selectedFile = null;
				BufferedReader br = null;
				int returnValue = jfc.showOpenDialog(null);
				// int returnValue = jfc.showSaveDialog(null);

				if (returnValue == JFileChooser.APPROVE_OPTION) {
					 selectedFile = jfc.getSelectedFile();
				}
				File f = new File(selectedFile.getName());
				try {
					 br = new BufferedReader(new FileReader(f));
					 String t= br.readLine();
					//MainScreen.projectName.setText(t);
					 for(int i =0 ; i<4 ; i++){
						
						String col = br.readLine();
						MainScreen.colNames[i] = col;
						String des = br.readLine();
						String date = br.readLine();
						MainScreen.dates[i] = date;
						MainScreen.des[i] = des;
					 }
					 br.close();
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				finally {
					try {
						br.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				TaskBoardV2 v2 = new TaskBoardV2();
				v2.setVisible(true);
				setVisible(false);
			}
		});
		btnLoad.setBounds(448, 44, 97, 25);
		contentPane.add(btnLoad);
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BufferedWriter writer = null;
				String file = JOptionPane.showInputDialog(myframe, "Enter fileName");
				File f = new File(file);
				try {
					writer = new BufferedWriter(new FileWriter(file));
					writer.write(MainScreen.projectName.getText());
					writer.newLine();
					for(int i=0; i<4; i++) {
						writer.write(MainScreen.colNames[i] + "\n");
						writer.newLine();
						writer.write(MainScreen.dates[i] + "\n"  );
						writer.newLine();
						writer.write(MainScreen.des[i] + "\n" );
						writer.newLine();
					}
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				finally {
					try {
						writer.close();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
	
			}
		});
		btnSave.setBounds(339, 44, 97, 25);
		contentPane.add(btnSave);
		
		JButton btnTaskReorder = new JButton("Task Reorder");
		btnTaskReorder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TaskReorderView v = new TaskReorderView();
				v.setVisible(true);
				setVisible(false);
			}
		});
		btnTaskReorder.setBounds(750, 44, 111, 25);
		contentPane.add(btnTaskReorder);
		
		JLabel lblTaskName = new JLabel("Task Name");
		lblTaskName.setBounds(20, 181, 106, 16);
		contentPane.add(lblTaskName);
		
		JLabel label_5 = new JLabel("Task Name");
		label_5.setBounds(468, 181, 108, 16);
		contentPane.add(label_5);
		
		JLabel label_4 = new JLabel("Task Name");
		label_4.setBounds(232, 181, 108, 16);
		contentPane.add(label_4);
		
		JLabel label_6 = new JLabel("Task Name");
		label_6.setBounds(686, 181, 108, 16);
		contentPane.add(label_6);
		
		JLabel lblDescription = new JLabel("Description");
		lblDescription.setBounds(10, 256, 97, 16);
		contentPane.add(lblDescription);
		
		JLabel label_7 = new JLabel("Description");
		label_7.setBounds(222, 256, 97, 16);
		contentPane.add(label_7);
		
		JLabel label_8 = new JLabel("Description");
		label_8.setBounds(458, 256, 97, 16);
		contentPane.add(label_8);
		
		JLabel label_9 = new JLabel("Description");
		label_9.setBounds(676, 256, 97, 16);
		contentPane.add(label_9);
		
		
		
		
		
	
		
		if (MainScreen.columnCount >= 2) {
			textField_1 = new JTextField(MainScreen.colNames[1]);
			textField_1.setColumns(10);
			textField_1.setBounds(230, 205, 196, 20);
			contentPane.add(textField_1);

			textField_5 = new JTextField(MainScreen.des[1]);
			textField_5.setColumns(10);
			textField_5.setBounds(230, 278, 196, 172);
			contentPane.add(textField_5);
			
			textField_9 = new JTextField(MainScreen.dates[1]);
			textField_9.setColumns(10);
			textField_9.setBounds(289, 165, 128, 20);
			contentPane.add(textField_9);
		}
		
		if (MainScreen.columnCount >= 3) {
			textField_2 = new JTextField(MainScreen.colNames[2]);
			textField_2.setColumns(10);
			textField_2.setBounds(469, 205, 196, 20);
			contentPane.add(textField_2);

			textField_6 = new JTextField(MainScreen.des[2]);
			textField_6.setColumns(10);
			textField_6.setBounds(469, 278, 196, 172);
			contentPane.add(textField_6);
			
			textField_10 = new JTextField(MainScreen.dates[2]);
			textField_10.setColumns(10);
			textField_10.setBounds(521, 165, 128, 20);
			contentPane.add(textField_10);
		}
		
		if (MainScreen.columnCount >= 4) {
			textField_3 = new JTextField(MainScreen.colNames[3]);
			textField_3.setColumns(10);
			textField_3.setBounds(692, 205, 182, 20);
			contentPane.add(textField_3);

			textField_7 = new JTextField(MainScreen.des[3]);
			textField_7.setColumns(10);
			textField_7.setBounds(688, 278, 196, 172);
			contentPane.add(textField_7);
			
			textField_11 = new JTextField(MainScreen.dates[3]);
			textField_11.setColumns(10);
			textField_11.setBounds(746, 165, 128, 20);
			contentPane.add(textField_11);
			textField.setColumns(10);

		}
		
		
		
		
		
		
		
	}
}
