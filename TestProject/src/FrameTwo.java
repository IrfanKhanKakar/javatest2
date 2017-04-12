import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class FrameTwo extends JFrame {

	private JPanel contentPane;
	private String Name;
	JLabel Recieved;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FrameTwo frame = new FrameTwo("");
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
	public FrameTwo(String name)
	{
		Name = name;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMessage = new JLabel(" first Message");
		lblMessage.setBounds(33, 124, 105, 14);
		contentPane.add(lblMessage);
		
		Recieved = new JLabel("New label");
		Recieved.setBounds(159, 124, 207, 14);
		contentPane.add(Recieved);
		
		
		Recieved.setText(Name);
	}
	
	/*public void jaman() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMessage = new JLabel("Message");
		lblMessage.setBounds(33, 124, 46, 14);
		contentPane.add(lblMessage);
		
		Recieved = new JLabel("New label");
		Recieved.setBounds(159, 124, 46, 14);
		contentPane.add(Recieved);
	}*/

}
