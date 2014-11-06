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
import javax.swing.UIManager;
import java.awt.SystemColor;

public class Calculator {

	private JFrame frame;
	private JButton btnNewButton_1;
	private JButton btnNewButton_2;
	private JButton btnNewButton_5;
	private JButton button;
	private JTextField txtField;

	// Declarem els nostres variables
	float sum=0,rest=0, mult=0, div=0, num2=0, resultat=0,resultatDiv=0;

	String op,suma, resta, multiplicar, dividir;

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
		frame.setBounds(100, 100, 400, 345);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		txtField = new JTextField();
		txtField.setForeground(Color.BLACK);
		txtField.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtField.setBackground(SystemColor.desktop);
		txtField.setEnabled(false);
		txtField.setBounds(32, 10, 309, 50);
		frame.getContentPane().add(txtField);
		txtField.setColumns(10);

		// Configuració del botó "1"
		btnNewButton_2 = new JButton("1");
		btnNewButton_2.setBackground(SystemColor.inactiveCaption);
		btnNewButton_2.setForeground(new Color(0, 0, 0));
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Els màxims números mostrats són 8
				if (txtField.getText().length() < 8) {
					txtField.setText(txtField.getText() + "1");

				}
			}
		});
		btnNewButton_2.setBounds(32, 73, 47, 23);
		frame.getContentPane().add(btnNewButton_2);

		// Configuració del botó "7"
		JButton btnNewButton = new JButton("7");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton.setBounds(32, 181, 47, 23);
		btnNewButton.setAlignmentY(Component.TOP_ALIGNMENT);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (txtField.getText().length() < 8) {
					txtField.setText(txtField.getText() + "7");
				}
			}
		});

		// Configuració del botó "4"
		button = new JButton("4");
		button.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtField.getText().length() < 8) {
					txtField.setText(txtField.getText() + "4");
				}
			}
		});
		button.setBounds(32, 130, 47, 23);
		frame.getContentPane().add(button);
		frame.getContentPane().add(btnNewButton);

		// Configuració del botó "2"
		btnNewButton_5 = new JButton("2");
		btnNewButton_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtField.getText().length() < 8) {
					txtField.setText(txtField.getText() + "2");
				}
			}
		});
		btnNewButton_5.setBounds(102, 73, 47, 23);
		frame.getContentPane().add(btnNewButton_5);

		// // Configuració del botó "5"
		btnNewButton_1 = new JButton("5");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtField.getText().length() < 8) {
					txtField.setText(txtField.getText() + "5");
				}
			}
		});
		btnNewButton_1.setBounds(102, 130, 44, 23);
		frame.getContentPane().add(btnNewButton_1);

		// // Configuració del botó "8"
		JButton button_1 = new JButton("8");
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtField.getText().length() < 8) {
					txtField.setText(txtField.getText() + "8");
				}
			}
		});
		button_1.setAlignmentY(0.0f);
		button_1.setBounds(102, 181, 47, 23);
		frame.getContentPane().add(button_1);

		// Configuració del botó "3"
		JButton button_2 = new JButton("3");
		button_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtField.getText().length() < 8) {
					txtField.setText(txtField.getText() + "3");
				}
			}
		});
		button_2.setBounds(177, 73, 44, 23);
		frame.getContentPane().add(button_2);

		JButton button_3 = new JButton("6");
		button_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtField.getText().length() < 8) {
					txtField.setText(txtField.getText() + "6");
				}
			}
		});
		button_3.setBounds(177, 130, 44, 23);
		frame.getContentPane().add(button_3);

		JButton button_4 = new JButton("9");
		button_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtField.getText().length() < 8) {
					txtField.setText(txtField.getText() + "9");
				}
			}
		});
		button_4.setBounds(177, 181, 44, 23);
		frame.getContentPane().add(button_4);

		JButton button_5 = new JButton("0");
		button_5.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtField.getText().length() < 8) {
					txtField.setText(txtField.getText() + "0");
				}
			}
		});
		button_5.setAlignmentY(0.0f);
		button_5.setBounds(102, 227, 47, 23);
		frame.getContentPane().add(button_5);

		JButton button_6 = new JButton("/");
		button_6.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dividir = txtField.getText();
				if (dividir.equals("")){
					div=0;
				} else {
					txtField.setText("");
					div= Float.parseFloat(dividir);
				}
				op = "div";
			}
		});
		button_6.setAlignmentY(0.0f);
		button_6.setBounds(294, 73, 47, 23);
		frame.getContentPane().add(button_6);

		JButton button_7 = new JButton("*");
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				multiplicar = txtField.getText();
				if (multiplicar.equals("")){
					mult=0;
				} else {
					txtField.setText("");
					mult= Float.parseFloat(multiplicar);
				}
				op = "multi";
			}
		});
		button_7.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_7.setAlignmentY(0.0f);
		button_7.setBounds(294, 130, 47, 23);
		frame.getContentPane().add(button_7);

		JButton button_8 = new JButton("-");
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resta = txtField.getText();
				if (resta.equals("")){
					rest=0;
				} else {
					txtField.setText("");
					rest= Float.parseFloat(resta);
				}
				op = "resta";
			}
		});
		button_8.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_8.setAlignmentY(0.0f);
		button_8.setBounds(294, 181, 47, 23);
		frame.getContentPane().add(button_8);

		JButton button_9 = new JButton("+");
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				op = "sum";
				suma = txtField.getText();
				if (suma.equals("")){
					sum=0;
				} else {
					txtField.setText("");
					sum= Float.parseFloat(suma);
				}
			
			}
		});
		button_9.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_9.setAlignmentY(0.0f);
		button_9.setBounds(294, 227, 47, 23);
		frame.getContentPane().add(button_9);

		JButton button_10 = new JButton("=");
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num2 = Float.parseFloat(txtField.getText());
				if (op == "sum") {
					resultat = sum + num2;
					txtField.setText(Float.toString(resultat));
				}
				if (op == "resta") {
					resultat = rest - num2;
					txtField.setText(Float.toString(resultat));
				}
				if (op == "multi") {
					resultat = mult * num2;
					txtField.setText(Float.toString(resultat));
				}
				if (op == "div") {
					if (num2 == 0) {
						txtField.setText("Error! No es pot dividir entre 0");
					} else {
						resultatDiv =  (div / num2);
						txtField.setText(Float.toString(resultatDiv));
					}
				}
			}
		});
		button_10.setFont(new Font("Tahoma", Font.PLAIN, 15));
		button_10.setAlignmentY(0.0f);
		button_10.setBounds(177, 227, 47, 23);
		frame.getContentPane().add(button_10);

		JButton btnC = new JButton("c");
		btnC.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtField.setText("");
			}
		});
		btnC.setAlignmentY(0.0f);
		btnC.setBounds(32, 227, 47, 23);
		frame.getContentPane().add(btnC);
		
		// Configuració del botó coma "."
		JButton btnNewButton_3 = new JButton(".");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// Si el camp de text no conté res, ni que no acabi en una coma, i ni que hi hagi una coma abans
				if ( ! txtField.getText().equals("") && txtField.getText().length()<7  &&  ! txtField.getText().contains(".")   ) {
					txtField.setText(txtField.getText() + "."); // llavors s'escriurà la coma
				}
			}
		});
		btnNewButton_3.setBounds(102, 272, 47, 23);
		frame.getContentPane().add(btnNewButton_3);

	}
}

