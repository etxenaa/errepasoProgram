package AriketakUD3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Birpasa4 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField tfEuro1;
	private JTextField tfDolar1;
	private JTextField tfDolar2;
	private JTextField tfEuro2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Birpasa4 frame = new Birpasa4();
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
	public Birpasa4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEuro = new JLabel("Euro");
		lblEuro.setBounds(58, 91, 46, 14);
		contentPane.add(lblEuro);
		
		JLabel lblDolar = new JLabel("Peseta");
		lblDolar.setBounds(38, 163, 46, 14);
		contentPane.add(lblDolar);
		
		JLabel lblEuro_1 = new JLabel("Euro");
		lblEuro_1.setBounds(306, 163, 46, 14);
		contentPane.add(lblEuro_1);
		
		JLabel lblDolar_1 = new JLabel("Peseta");
		lblDolar_1.setBounds(306, 91, 46, 14);
		contentPane.add(lblDolar_1);
		
		tfEuro1 = new JTextField();
		tfEuro1.setBounds(90, 88, 86, 20);
		contentPane.add(tfEuro1);
		tfEuro1.setColumns(10);
		
		tfDolar1 = new JTextField();
		tfDolar1.setColumns(10);
		tfDolar1.setBounds(90, 160, 86, 20);
		contentPane.add(tfDolar1);
		
		JLabel lbl = new JLabel("-->");
		lbl.setBounds(186, 91, 46, 14);
		contentPane.add(lbl);
		
		JLabel lbl_1 = new JLabel("-->");
		lbl_1.setBounds(186, 163, 46, 14);
		contentPane.add(lbl_1);
		
		tfDolar2 = new JTextField();
		tfDolar2.setColumns(10);
		tfDolar2.setBounds(212, 88, 86, 20);
		contentPane.add(tfDolar2);
		
		tfEuro2 = new JTextField();
		tfEuro2.setColumns(10);
		tfEuro2.setBounds(210, 160, 86, 20);
		contentPane.add(tfEuro2);
		
		tfEuro1.addActionListener(this);
		tfDolar1.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		
		if (o == tfEuro1 || o == tfDolar2) {
		int euro;
		double peseta;
		String texto = tfEuro1.getText();
		euro = Integer.parseInt(texto);
		peseta = euro*166.386;
		String erantzuna = String.valueOf(peseta);
		tfDolar2.setText(erantzuna);
		}
		if (o == tfEuro2 || o == tfDolar1) {
			double euro;
			int peseta;
			String texto = tfDolar1.getText();
			peseta = Integer.parseInt(texto);
			euro = peseta/166.386;
			String erantzuna = String.valueOf(euro);
			tfEuro2.setText(erantzuna);
			}
	}
}
