package Guitest;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class frame1 extends JFrame {

	private JPanel contentPane;
	private String User;
	private String Pass;
	//JLabel UserName;
	//JLabel Password;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 frame = new frame1(" ", "");
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
	public frame1(String user,String pass) {
		
		User = user;
		Pass = pass;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel UserName = new JLabel("username");
		UserName.setBounds(63, 84, 218, 39);
		contentPane.add(UserName);
		
		JLabel Password = new JLabel("password");
		Password.setBounds(63, 156, 179, 44);
		contentPane.add(Password);
		
		UserName.setText(User);
		Password.setText(Pass);
	}
}
