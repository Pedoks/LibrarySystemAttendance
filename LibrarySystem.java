package LibrarySystem;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class LibrarySystem {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LibrarySystem window = new LibrarySystem();
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
	public LibrarySystem() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.setBounds(100, 100, 817, 477);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("Admin Login");
		
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(Color.BLACK);
		btnNewButton.setFont(new Font("Segoe UI Black", Font.BOLD, 29));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AdminLogin second = new AdminLogin();
				second.setVisible(true);
				
				
			}
		});
		btnNewButton.setBounds(262, 131, 275, 108);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Librarian Login");
		btnNewButton_1.setBackground(Color.LIGHT_GRAY);
		btnNewButton_1.setForeground(Color.BLACK);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LibrarianLogin second = new LibrarianLogin();
				second.setVisible(true);
			}
		});
		btnNewButton_1.setFont(new Font("Segoe UI Black", Font.BOLD, 29));
		btnNewButton_1.setBounds(262, 249, 275, 108);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("Library Management");
		lblNewLabel.setForeground(new Color(192, 192, 192));
		lblNewLabel.setBackground(new Color(128, 128, 128));
		lblNewLabel.setFont(new Font("Segoe UI Black", Font.PLAIN, 47));
		lblNewLabel.setBounds(166, 42, 488, 60);
		frame.getContentPane().add(lblNewLabel);
	}
}
