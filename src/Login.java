import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JPasswordField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login {

	private JFrame frame;
	/**
	 * @wbp.nonvisual location=-38,339
	 */
	private final JTextField textField = new JTextField();
	private final JLabel lblTaskBoardLogin = new JLabel("Task Board Login");
	private final JLabel lblUsername = new JLabel("Username");
	private final JLabel lblPassword = new JLabel("Password");
	private JPasswordField passwordField;
	private final JTextField username = new JTextField();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
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
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		username.setBounds(340, 164, 246, 20);
		username.setColumns(10);
		textField.setColumns(10);
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 17));
		frame.setBounds(100, 100, 900, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		lblTaskBoardLogin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblTaskBoardLogin.setBounds(340, 41, 182, 29);
		
		frame.getContentPane().add(lblTaskBoardLogin);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblUsername.setBounds(259, 159, 70, 29);
		
		frame.getContentPane().add(lblUsername);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblPassword.setBounds(259, 215, 83, 23);
		
		frame.getContentPane().add(lblPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(340, 217, 246, 20);
		frame.getContentPane().add(passwordField);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String usernameInput = username.getText();
				//String passwordInput = passwordField.getText();
				String myPass = String.valueOf(passwordField.getPassword());
				
				if( !(usernameInput.equals("admin") &&  myPass.equals("admin")) )
					JOptionPane.showMessageDialog(frame, "Invalid username or password");
				else
				{
					MainScreen mainScreen = new MainScreen();
					mainScreen.setVisible(true);
				}
					
					
			}
		});
		btnLogin.setBackground(Color.WHITE);
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLogin.setBounds(340, 322, 136, 52);
		frame.getContentPane().add(btnLogin);
		
		frame.getContentPane().add(username);
	}
}
