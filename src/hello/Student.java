package hello;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Student extends JFrame {

	private JPanel contentPane;
	private JTextField username;
	private JTable table;
	private JTextField textField;
	private JLabel lblNewLabel_1;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student frame = new Student();
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
	public Student() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 884, 516);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("username:");
		lblNewLabel.setFont(new Font("ËÎÌו", Font.PLAIN, 14));
		lblNewLabel.setBounds(215, 88, 79, 24);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("submit");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("hello->"+username.getText());
			}
		});
		btnNewButton.setBackground(Color.CYAN);
		btnNewButton.setBounds(326, 377, 93, 23);
		contentPane.add(btnNewButton);
		
		username = new JTextField();
		username.setText("250");
		username.setFont(new Font("ËÎÌו", Font.PLAIN, 14));
		username.setBounds(326, 90, 259, 21);
		contentPane.add(username);
		username.setColumns(24);
		
		textField = new JTextField();
		textField.setBounds(326, 135, 259, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		lblNewLabel_1 = new JLabel("secret");
		lblNewLabel_1.setBounds(215, 159, 54, 15);
		contentPane.add(lblNewLabel_1);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(20);
		passwordField.setBounds(326, 209, 259, 21);
		contentPane.add(passwordField);
	}
}
