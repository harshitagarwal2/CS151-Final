

import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.TransferHandler;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class TaskBoard extends JFrame{
    private javax.swing.JComboBox<String> projectSelectorBox;
    private int colsize= 4; //MainScreen.columnCount;
	private JPanel[] columnPanels;
	public static String columns[] = MainScreen.colNames;
	
	public TaskBoard() {
		getContentPane().setLayout(new BorderLayout());
		
		JPanel panel = new JPanel();
		getContentPane().add(panel, BorderLayout.NORTH);
		
		JLabel projectName = new JLabel("Project Name");
		panel.add(projectName);
		
		JComboBox<String> projectSelector = new JComboBox<String>();
		projectSelector.addItem(MainScreen.projectName.getText());
		panel.add(projectSelector);
		
		JButton btnEdit = new JButton("Edit");
		btnEdit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ProjectView editView = new ProjectView();
				editView.setVisible(true);
			}
		});
		panel.add(btnEdit);
		
		JButton btnDelete = new JButton("Delete");
		panel.add(btnDelete);
		
		JButton btnLoad = new JButton("Load");
		panel.add(btnLoad);
		
		JButton btnCreateNew = new JButton("Create New");
		btnCreateNew.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
				MainScreen mainScreen = new MainScreen();
				mainScreen.setVisible(true);
			}
		});
//		btnCreateNew.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				ProjectView view = new ProjectView();
//				view.setVisible(true);
//			}
//		});
		panel.add(btnCreateNew);
		
		JButton btnLogout = new JButton("Logout");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LoginView loginView = new LoginView();
				loginView.setVisible(true);
				setVisible(false);
			}
		});
		panel.add(btnLogout);
		
		JPanel columnPanel = new JPanel();
		getContentPane().add(columnPanel, BorderLayout.CENTER);
		columnPanel.setLayout(new GridLayout(1, 0, 0, 0));
		columnPanels = new JPanel[colsize];

		for (int i = 0; i < colsize; i++) {
			columnPanels[i] = new JPanel();
			columnPanels[i].setLayout(new BoxLayout(columnPanels[i], BoxLayout.PAGE_AXIS));
			columnPanel.add(columnPanels[i]);
		}
		// Add the column Name
		for (int i = 0; i < colsize; i++) {
			JLabel label = new JLabel(columns[i]);
			label.setBorder(BorderFactory.createMatteBorder(2, 
                                                                2, 
                                                                2, 
                                                                2, 
                                                                Color.BLACK));
			label.setTransferHandler(new TransferHandler("text"));

		    /*label.addMouseListener(new MouseAdapter() {
		      public void mousePressed(MouseEvent evt) {
		        JComponent comp = (JComponent) evt.getSource();
		        TransferHandler th = comp.getTransferHandler();

		        th.exportAsDrag(comp, evt, TransferHandler.COPY);
		      }
		    });*/
			columnPanels[i].add(label);
			
		}
		for (int i = 0; i < colsize; i++) {
			final int j = i;
			JButton jb = new JButton("+");
			jb.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent ae ) {
					TaskView Task = new TaskView();
					Task.setVisible(true);
					columnPanels[j].add(new JLabel("new task"));
					columnPanel.revalidate();
					columnPanel.repaint();
				}
			});
			columnPanels[i].add(jb);
		}
//		int j = 0;
//		for (int i = 0; i < 4*colsize; i++) {
//			JLabel jb = new JLabel("Task " + i);
//			jb.setBorder(BorderFactory.createMatteBorder(0,2,0,2,Color.BLACK));
//
//			columnPanels[j].add(jb);
//			j = (j+1) % colsize;
//		}
		


		this.pack();
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		TaskBoard b = new TaskBoard();
	}
	
}