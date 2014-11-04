import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.Component;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;


public class Calculator {

	private JFrame frame;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_5;
	private JButton button;
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 7));
		frame.setBounds(100, 100, 359, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnNewButton_2 = new JButton("1");
		btnNewButton_2.setBackground(Color.BLACK);
		btnNewButton_2.setForeground(Color.CYAN);
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() < 8){
					textField.setText("1");
				} 
			}
		});
		btnNewButton_2.setBounds(32, 73, 47, 23);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnNewButton.setBounds(32, 181, 47, 23);
		btnNewButton.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (textField.getText().length() < 8){
					textField.setText("7");
				} 
			}
		});
		
		button = new JButton("4");
		button.setFont(new Font("Tahoma", Font.PLAIN, 7));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() < 8){
					textField.setText("4");
				} 
			}
		});
		button.setBounds(32, 130, 47, 23);
		frame.getContentPane().add(button);
		frame.getContentPane().add(btnNewButton);
		
		btnNewButton_5 = new JButton("2");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() < 8){
					textField.setText("2");
				} 
			}
		});
		btnNewButton_5.setBounds(102, 73, 47, 23);
		frame.getContentPane().add(btnNewButton_5);
		
		btnNewButton_1 = new JButton("5");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() < 8){
					textField.setText("5");
				} 
			}
		});
		btnNewButton_1.setBounds(102, 130, 44, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton button_1 = new JButton("8");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 7));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() < 8){
					textField.setText("8");
				} 
			}
		});
		button_1.setAlignmentY(0.0f);
		button_1.setBounds(102, 181, 47, 23);
		frame.getContentPane().add(button_1);
		
		JButton button_2 = new JButton("3");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 7));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() < 8){
					textField.setText("3");
				} 
			}
		});
		button_2.setBounds(177, 73, 44, 23);
		frame.getContentPane().add(button_2);
		
		JButton button_3 = new JButton("6");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 7));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() < 8){
					textField.setText("6");
				} 
			}
		});
		button_3.setBounds(177, 130, 44, 23);
		frame.getContentPane().add(button_3);
		
		JButton button_4 = new JButton("9");
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 7));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() < 8){
					textField.setText("9");
				} 
			}
		});
		button_4.setBounds(177, 181, 44, 23);
		frame.getContentPane().add(button_4);
		
		JButton button_5 = new JButton("0");
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 7));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().length() < 8){
					textField.setText("");
				} 
			}
		});
		button_5.setAlignmentY(0.0f);
		button_5.setBounds(102, 227, 47, 23);
		frame.getContentPane().add(button_5);
		
		JButton button_6 = new JButton("/");
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 7));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_6.setAlignmentY(0.0f);
		button_6.setBounds(257, 73, 47, 23);
		frame.getContentPane().add(button_6);
		
		JButton button_7 = new JButton("*");
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 7));
		button_7.setAlignmentY(0.0f);
		button_7.setBounds(257, 130, 47, 23);
		frame.getContentPane().add(button_7);
		
		JButton button_8 = new JButton("-");
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 7));
		button_8.setAlignmentY(0.0f);
		button_8.setBounds(257, 181, 47, 23);
		frame.getContentPane().add(button_8);
		
		JButton button_9 = new JButton("+");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 7));
		button_9.setAlignmentY(0.0f);
		button_9.setBounds(257, 227, 47, 23);
		frame.getContentPane().add(button_9);
		
		JButton button_10 = new JButton("=");
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 7));
		button_10.setAlignmentY(0.0f);
		button_10.setBounds(177, 227, 47, 23);
		frame.getContentPane().add(button_10);
		
		JButton btnC = new JButton("c");
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 7));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText("");
			}
		});
		btnC.setAlignmentY(0.0f);
		btnC.setBounds(32, 227, 47, 23);
		frame.getContentPane().add(btnC);
		
		textField = new JTextField();
		textField.setBackground(Color.YELLOW);
		textField.setEnabled(false);
		textField.setBounds(32, 10, 272, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
	}
}
