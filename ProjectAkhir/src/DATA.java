import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Date;
import java.awt.event.ActionEvent;

public class DATA {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JFrame LoginSystem;

	ArrayList<Project> data = new ArrayList<>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DATA window = new DATA();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 * 
	 */
	public DATA() {
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

		JLabel lblNewLabel = new JLabel("DATA MAHASISWA");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(85, 11, 269, 29);
		frame.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("NAMA");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(45, 51, 89, 23);
		frame.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("NIM");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_1.setBounds(45, 85, 89, 23);
		frame.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_2 = new JLabel("FAKULTAS");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_2.setBounds(45, 119, 89, 23);
		frame.getContentPane().add(lblNewLabel_1_2);

		JLabel lblNewLabel_1_3 = new JLabel("PRODI");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_3.setBounds(45, 153, 89, 23);
		frame.getContentPane().add(lblNewLabel_1_3);

		JLabel lblNewLabel_1_4 = new JLabel("SEMESTER KE-");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1_4.setBounds(45, 187, 89, 23);
		frame.getContentPane().add(lblNewLabel_1_4);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(170, 51, 184, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setBounds(170, 86, 184, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_2.setBounds(170, 120, 184, 20);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);

		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBounds(170, 154, 184, 20);
		frame.getContentPane().add(textField_3);

		textField_4 = new JTextField();
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_4.setColumns(10);
		textField_4.setBounds(170, 188, 184, 20);
		frame.getContentPane().add(textField_4);

		// JOptionPane.showConfirmDialog(LoginSystem, "Isi data dengan benar", "Sistem
		// Login", JOptionPane.ERROR_MESSAGE);
		// textField.setText(null);
		// return;
		JButton btnNewButton = new JButton("KELUAR");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				LoginSystem = new JFrame("KELUAR");
				if (JOptionPane.showConfirmDialog(LoginSystem, "Anda yakin ingin keluar", "Sistem Login",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
					System.exit(0);

				}
			}
		});

		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(69, 228, 89, 23);
		frame.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("SIMPAN");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nm = textField.getText();
				String ni = textField_1.getText();
				String fak = textField_2.getText();
				String pro = textField_3.getText();
				String semke = textField_4.getText();

				Project date = new Project(nm, ni, fak, pro, semke);
				data.add(date);

				String hasil = "";
				try {
					BufferedWriter simpan = new BufferedWriter(new FileWriter("datamahasiswa1.txt"));
					for (int i = 0; i < data.size(); i++) {
						hasil = ("NAMA :" + data.get(i).nama + "\tNIM :" + data.get(i).nim + "\tFAKULTAS :"
								+ data.get(i).fakultas + "\tPRODI :" + data.get(i).prodi + "\tSEMESTER KE- :"
								+ data.get(i).semesterke);
						simpan.append(hasil);
						JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
						simpan.close();
						System.exit(0);
					}

				} catch (Exception e1) {
					JOptionPane.showMessageDialog(null, e);
				}
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.setBounds(279, 228, 89, 23);
		frame.getContentPane().add(btnNewButton_1);

		// try {
		// BufferedWriter simpan = new BufferedWriter(new
		// FileWriter("datamahasiswa.txt"));
		// String panggil = "NAMA :\t\t" + textField.getText() + "\n" + "NIM :\t\t" +
		// textField_1.getText() + "\n"
		// + "FAKULTAS :\t\t" + textField_2.getText() + "\n" + "PRODI :\t\t" +
		// textField_3.getText() + "\n"
		// + "SEMESTER KE- :\t\t" + textField_4.getText();
		// simpan.write(panggil);
		// JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
		// simpan.close();

		// catch (Exception e) {
		// JOptionPane.showMessageDialog(null, e);
		// }

		// String[] data = new String[4];
		// data[0] = "NAMA :\t\t" + textField.getText();
		// data[1] = "NIM :\t\t" + textField_1.getText();
		// data[2] = "FAKULTAS :\t\t" + textField_2.getText();
		// data[3] = "PRODI :\t\t" + textField_3.getText();
		// data[4] = "SEMESTER KE- :\t\t" + textField_4.getText();
		// String[] data1 = { "NAMA :\t\t" + textField.getText() + "\n",
		// " NIM :\t\t" + textField_1.getText() + "\n",
		// " FAKULTAS :\t\t" + textField_2.getText() + "\n",
		// " PRODI :\t\t" + textField_3.getText() + "\n",
		// " SEMESTER KE- :\t\t" + textField_4.getText()};

		// BufferedWriter simpan = new BufferedWriter(new
		// FileWriter("datamahasiswa1.txt"));
		// String nama = ("NAMA :\t\t"+ textField.getText() + "\n");
		// String nim = ("NIM :\t\t"+ textField_1.getText() + "\n");
		// String fakultas = ("FAKULTAS :\t\t"+ textField_2.getText() + "\n");
		// String prodi = ("PRODI :\t\t"+ textField_3.getText() + "\n");
		// String semesterke = ("SEMESTER KE- :\t\t"+ textField_4.getText() + "\n");
		// String[] data = new String[4];
		// data[0] = nama;
		// data[1] = nim;
		// data[2] = fakultas;
		// data[3] = prodi;
		// data[4] = semesterke;
		// for (int i = 0; i < data.length; i++) {
		// simpan.write(data[i]);
		// JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
		// simpan.close();
		// System.exit(0);

		// String nama = ("NAMA :\t\t"+ textField.getText() + "\n");
		// String nim = ("NIM :\t\t"+ textField_1.getText() + "\n");
		// String fakultas = ("FAKULTAS :\t\t"+ textField_2.getText() + "\n");
		// String prodi = ("PRODI :\t\t"+ textField_3.getText() + "\n");
		// String semesterke = ("SEMESTER KE- :\t\t"+ textField_4.getText() + "\n");
		// String[] data = {"nama", "nim", "fakultas", "prodi", "semesterke"};
		// for (int i = 0; i < data.length; i++) {
		// simpan.write(data[i]);
		// JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
		// simpan.close();
		// System.exit(0);

	}

}
