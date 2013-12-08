package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

import bmi.bmiKalkulator;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

public class bmiGui extends JFrame {

	private JPanel contentPane;
	private JTextField tfTezina;
	private JTextField tfVisina;
	private JLabel rez;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bmiGui frame = new bmiGui();
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
	public bmiGui() {
		setTitle("BMI kalkulator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 442, 330);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 204, 204));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTezina = new JLabel("Vasa tezina (u kg): ");
		lblTezina.setBounds(98, 64, 120, 24);
		contentPane.add(lblTezina);

		JLabel lblVasaVisina = new JLabel("Vasa visina (u cm): ");
		lblVasaVisina.setBounds(228, 64, 111, 24);
		contentPane.add(lblVasaVisina);

		tfTezina = new JTextField();
		tfTezina.setBounds(98, 99, 86, 20);
		contentPane.add(tfTezina);
		tfTezina.setColumns(10);

		tfVisina = new JTextField();
		tfVisina.setBounds(228, 99, 86, 20);
		contentPane.add(tfVisina);
		tfVisina.setColumns(10);

		JButton btnIzracunajBmi = new JButton("Izracunaj BMI");
		btnIzracunajBmi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String v1 = tfVisina.getText();
				double v = Double.parseDouble(v1);

				String t1 = tfTezina.getText();
				double t = Double.parseDouble(t1);

				bmiKalkulator b1 = new bmiKalkulator();

				String text2 = b1.ispisi(b1.bmi(t, v));
				rez.setText(text2);
			}
		});
		btnIzracunajBmi.setBounds(145, 146, 120, 24);
		contentPane.add(btnIzracunajBmi);

		JLabel lblR = new JLabel("");
		lblR.setBounds(98, 222, 216, 24);
		contentPane.add(lblR);

		rez = lblR;
	}
}
