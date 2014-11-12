package MainPackage;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Arrays;
import javax.swing.JOptionPane;

public class CMain extends JFrame {

	private JPanel contentPane;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CMain frame = new CMain();
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
	public CMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		final JFrame messageFrame = new JFrame();
		
		
		JLabel lblEnterPassword = new JLabel("Enter Password: ");
		lblEnterPassword.setBounds(10, 50, 101, 14);
		contentPane.add(lblEnterPassword);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(124, 47, 91, 20);
		contentPane.add(passwordField);
		
		JButton OKbutton = new JButton("OK");
		OKbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				char[] correct_pass = {'b','u','g','a','b','o','o'};
				if (Arrays.equals(passwordField.getPassword(), correct_pass)){
					JOptionPane.showMessageDialog(messageFrame, "Correct");
				}
				else{
					JOptionPane.showMessageDialog(messageFrame, "Incorrect");
				}
			}
		});
		OKbutton.setBounds(235, 28, 89, 23);
		contentPane.add(OKbutton);
		
		JButton Helpbutton = new JButton("Help");
		Helpbutton.setBounds(235, 62, 89, 23);
		Helpbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				JOptionPane.showMessageDialog(messageFrame, "I couldn't get the tutorial to work");
			}
	    });
		contentPane.add(Helpbutton);
	}
}
