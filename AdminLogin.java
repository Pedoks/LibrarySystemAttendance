package LibrarySystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class AdminLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private final JLabel lblNewLabel_1 = new JLabel("Username:");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminLogin frame = new AdminLogin();
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
	public AdminLogin() {
		setTitle("Admin Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 827, 492);
		contentPane = new JPanel();
		contentPane.setForeground(Color.DARK_GRAY);
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Admin Login");
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.BOLD, 46));
		lblNewLabel.setBounds(222, -21, 358, 197);
		contentPane.add(lblNewLabel);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setForeground(Color.BLACK);
		textField_1.setBounds(220, 148, 426, 48);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.LIGHT_GRAY);
		textField_2.setForeground(Color.BLACK);
		textField_2.setColumns(10);
		textField_2.setBounds(220, 215, 426, 48);
		contentPane.add(textField_2);
		lblNewLabel_1.setForeground(Color.BLACK);
		lblNewLabel_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1.setBounds(84, 160, 126, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Password:");
		lblNewLabel_1_1.setForeground(Color.BLACK);
		lblNewLabel_1_1.setFont(new Font("Arial Black", Font.BOLD, 20));
		lblNewLabel_1_1.setBounds(84, 227, 126, 36);
		contentPane.add(lblNewLabel_1_1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Segoe UI Black", Font.BOLD, 18));
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.setBounds(286, 325, 253, 62);
		contentPane.add(btnNewButton);

		btnNewButton.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String username = textField_1.getText();
		        String password = textField_2.getText();
		        if (username.equals("Admin_01") && password.equals("AdminOne")||(username.equals("Admin_02") && password.equals("AdminTwo"))||(username.equals("Admin_03") && password.equals("AdminThree"))) {
		            // Display welcome message
		            JOptionPane.showMessageDialog(contentPane, "Welcome to NU Library System");
		        } else {
		            // Display error message
		            JOptionPane.showMessageDialog(contentPane, "Invalid username or password.");
		        }
		    }
		});
	}
}