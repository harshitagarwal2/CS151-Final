import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Label;
import java.awt.Panel;
import java.awt.Choice;
import java.awt.Button;
import java.awt.GridLayout;
import javax.swing.BoxLayout;

public class TaskBoard extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TaskBoard frame = new TaskBoard();
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
	public TaskBoard() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 400, 950, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		Panel panel = new Panel();
		contentPane.add(panel);
		
		Label label = new Label("Select Project");
		panel.add(label);
		
		Choice choice = new Choice();
		panel.add(choice);
		
		Button edit_button = new Button("Edit");
		panel.add(edit_button);
		
		Button save_button = new Button("Save");
		panel.add(save_button);
		
		Button delete_button = new Button("Delete");
		panel.add(delete_button);
		
		Button load_button = new Button("Load");
		panel.add(load_button);
		
		Button create_button = new Button("Create New");
		panel.add(create_button);
		
		Button logout_button = new Button("Logout");
		panel.add(logout_button);
		
		
		
	}

}
