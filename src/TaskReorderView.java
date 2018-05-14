

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.Box;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TaskReorderView extends JFrame {

	private JPanel contentPane;
	public JCheckBox CheckBox1;
	public JCheckBox CheckBox2;
	public JCheckBox CheckBox3;
	public JCheckBox CheckBox4;
	private JLabel lblOnlyChooseOne;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TaskReorderView frame = new TaskReorderView();
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
	public TaskReorderView() {
		JFrame myframe = this;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Colomn Reorder");
		
		Box verticalBox = Box.createVerticalBox();
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TaskBoardV2 view = new TaskBoardV2();
				view.setVisible(true);
				setVisible(false);
			}
		});
		
		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TaskBoardV2 view = new TaskBoardV2();
				view.setVisible(true);
				setVisible(false);
			}
		});
		
		JButton btnMoveUp = new JButton("Move Up");
		btnMoveUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			if(CheckBox1.isSelected()) {
				JOptionPane.showMessageDialog(myframe, "Choose Valid one of them is the top most column and cannot be moved up further ");
			}
			
			if(CheckBox4.isSelected()) {
				String temp = MainScreen.colNames[3];
				MainScreen.colNames[3] = MainScreen.colNames[2];
				MainScreen.colNames[2] = temp;
			}
			
			if(CheckBox3.isSelected()) {
				String temp = MainScreen.colNames[2];
				MainScreen.colNames[2] = MainScreen.colNames[1];
				MainScreen.colNames[1] = temp;
			}
			if(CheckBox3.isSelected()) {
				String temp = MainScreen.colNames[0];
				MainScreen.colNames[0] = MainScreen.colNames[1];
				MainScreen.colNames[1] = temp;
			}
			repaint();
			}
		});
		
		JButton btnMoveDown = new JButton("Move Down");
		btnMoveDown.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(CheckBox4.isSelected()) {
					JOptionPane.showMessageDialog(myframe, "Choose Valid column and option, one of them is the last column and cannot be moved down further");
				}
				
				if(CheckBox1.isSelected()) {
					String temp = MainScreen.colNames[0];
					MainScreen.colNames[0]  = MainScreen.colNames[1];
					MainScreen.colNames[1] = temp;
				}
				
				if(CheckBox2.isSelected()) {
					String temp = MainScreen.colNames[1];
					MainScreen.colNames[1]  = MainScreen.colNames[2];
					MainScreen.colNames[2] = temp;
				}
				
				if(CheckBox3.isSelected()) {
					String temp = MainScreen.colNames[2];
					MainScreen.colNames[2]  = MainScreen.colNames[3];
					MainScreen.colNames[3] = temp;
				}
				repaint();
			}
		});
		for(int i=0 ; i<4 ; i++) {
			if(MainScreen.colNames[i] == null) {
				MainScreen.colNames[i] = "column not Selected";
			}
		}
		
		 CheckBox1 = new JCheckBox(MainScreen.colNames[0]);
		
		 CheckBox2 = new JCheckBox(MainScreen.colNames[1]);
		
		 CheckBox3 = new JCheckBox(MainScreen.colNames[2]);
		
		 CheckBox4 = new JCheckBox(MainScreen.colNames[3]);
		
		lblOnlyChooseOne = new JLabel("Only Choose One Column at a time to move Up or Down");
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(169)
					.addComponent(lblNewLabel)
					.addContainerGap(160, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(CheckBox3)
							.addContainerGap())
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addComponent(lblOnlyChooseOne, GroupLayout.PREFERRED_SIZE, 380, GroupLayout.PREFERRED_SIZE)
								.addContainerGap())
							.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addComponent(CheckBox4, Alignment.LEADING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(btnSave)
											.addComponent(CheckBox1)
											.addComponent(CheckBox2))
										.addPreferredGap(ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
											.addComponent(btnMoveDown)
											.addComponent(btnMoveUp, GroupLayout.PREFERRED_SIZE, 99, GroupLayout.PREFERRED_SIZE)
											.addComponent(btnCancel))))
								.addGap(60)))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(5)
							.addComponent(lblNewLabel)
							.addGap(18)
							.addComponent(lblOnlyChooseOne)
							.addGap(27)
							.addComponent(CheckBox1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(73)
							.addComponent(btnMoveUp)))
					.addGap(3)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(CheckBox2)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(CheckBox3)
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(CheckBox4)
							.addGap(11))
						.addComponent(btnMoveDown))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnSave)
						.addComponent(btnCancel))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
