import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.awt.event.ActionEvent;

public class LOGIN {

	private JFrame frame;
	private JTextField Username;
	private JPasswordField Password;
	private JFrame LoginSystem;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGIN window = new LOGIN();
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
	public LOGIN() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton btnNewButton = new JButton("KELUAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				LoginSystem = new JFrame("KELUAR");
				if (JOptionPane.showConfirmDialog(LoginSystem, "Apakah kamu ingin keluar?", "Sistem Login",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);
				}
			}
		});
		btnNewButton.setBounds(86, 203, 89, 33);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("LOGIN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				@Deprecated
				String password = Password.getText();
				String username = Username.getText();

				if (password.contains("1162") && username.contains("yona")) {
					Password.setText(null);
					Username.setText(null);

					// DATA info = new DATA();
					DATA.main(null);
					
				} else {
					JOptionPane.showMessageDialog(null, "Login tidak valid", "Login Error", JOptionPane.ERROR_MESSAGE);
					Password.setText(null);
					Username.setText(null);
					return;
				}
			}
		});
		btnNewButton_1.setBounds(260, 203, 89, 33);
		frame.getContentPane().add(btnNewButton_1);

		JLabel lblNewLabel = new JLabel("SELAMAT DATANG");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(22, 11, 389, 40);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblUsername = new JLabel("USERNAME");
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblUsername.setBounds(70, 78, 120, 23);
		frame.getContentPane().add(lblUsername);

		JLabel lblPassword = new JLabel("PASSWORD");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPassword.setBounds(70, 128, 120, 23);
		frame.getContentPane().add(lblPassword);

		Username = new JTextField();
		Username.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Username.setBounds(200, 81, 171, 20);
		frame.getContentPane().add(Username);
		Username.setColumns(10);

		Password = new JPasswordField();
		Password.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Password.setBounds(200, 131, 171, 20);
		frame.getContentPane().add(Password);
	}
}
