import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;

public class LoginView extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginView frame = new LoginView();
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
	public LoginView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTaskBoardLogin = new JLabel("Task Board Login");
		lblTaskBoardLogin.setBounds(166, 24, 117, 16);
		contentPane.add(lblTaskBoardLogin);
		
		JLabel lblUsername = new JLabel("Username:");
		lblUsername.setBounds(32, 74, 87, 16);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setBounds(32, 127, 87, 16);
		contentPane.add(lblPassword);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String usernameInput = username.getText();
					//String passwordInput = passwordField.getText();
					String myPass = String.valueOf(passwordField.getPassword());
					
					if( !(usernameInput.equals("admin") &&  myPass.equals("admin")) )
					{
						LoginView v = new LoginView();
						JOptionPane.showMessageDialog(v, "Invalid username or password");

					}
					else
					{
						TaskBoard mainScreen = new TaskBoard();
						mainScreen.setVisible(true);
						setVisible(false);
					}
			
			}
		});
		btnLogin.setBounds(198, 181, 97, 25);
		contentPane.add(btnLogin);
		
		username = new JTextField();
		username.setBounds(131, 71, 289, 22);
		contentPane.add(username);
		username.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(131, 124, 289, 22);
		contentPane.add(passwordField);
		
		JLabel checker = new JLabel("");
		checker.setBounds(216, 159, 56, 16);
		contentPane.add(checker);
	}
}
