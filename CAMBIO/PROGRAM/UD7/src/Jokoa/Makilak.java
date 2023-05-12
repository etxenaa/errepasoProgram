package Jokoa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;

public class Makilak extends JFrame implements ActionListener {

	private int kont = 0, kontIr = 0, num = 0, kont1 = 7, kont2 = 5, kont3 = 3;
	private String[] opc = { " ", "I", "I I", "I I I", "I I I I", "I I I I I", "I I I I I I", "I I I I I I I" };
	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblJugador, lbl3, lbl2, lbl1;
	private JButton btnOK;
	private JRadioButton rdbtn1, rdbtn2, rdbtn3;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel lblMensaje;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Makilak frame = new Makilak();
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
	public Makilak() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 414, 193);
		contentPane.add(panel);
		panel.setLayout(null);

		lbl1 = new JLabel("I I I I I I I");
		lbl1.setFont(new Font("Tahoma", Font.BOLD, 30));
		lbl1.setBounds(121, 11, 193, 45);
		panel.add(lbl1);

		lbl2 = new JLabel("I I I I I");
		lbl2.setFont(new Font("Tahoma", Font.BOLD, 30));
		lbl2.setBounds(147, 67, 124, 45);
		panel.add(lbl2);

		lbl3 = new JLabel("I I I");
		lbl3.setFont(new Font("Tahoma", Font.BOLD, 30));
		lbl3.setBounds(170, 123, 74, 45);
		panel.add(lbl3);

		rdbtn1 = new JRadioButton("1. Lerroa");
		buttonGroup.add(rdbtn1);
		rdbtn1.setBounds(6, 30, 109, 23);
		panel.add(rdbtn1);

		rdbtn2 = new JRadioButton("2. Lerroa");
		buttonGroup.add(rdbtn2);
		rdbtn2.setBounds(6, 86, 109, 23);
		panel.add(rdbtn2);

		rdbtn3 = new JRadioButton("3. Lerroa");
		buttonGroup.add(rdbtn3);
		rdbtn3.setBounds(6, 140, 109, 23);
		panel.add(rdbtn3);

		lblMensaje = new JLabel("");
		lblMensaje.setBounds(134, 168, 180, 14);
		panel.add(lblMensaje);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.BOLD, 20));
		textField.setBounds(143, 214, 123, 36);
		contentPane.add(textField);
		textField.setColumns(10);

		btnOK = new JButton("EZABATU");
		btnOK.setBounds(299, 224, 89, 23);
		contentPane.add(btnOK);

		lblJugador = new JLabel("1. Jokalaria");
		lblJugador.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblJugador.setBounds(10, 214, 123, 36);
		contentPane.add(lblJugador);

		textField.addActionListener(this);
		rdbtn1.addActionListener(this);
		rdbtn2.addActionListener(this);
		rdbtn3.addActionListener(this);
		btnOK.addActionListener(this);
		
		JOptionPane.showMessageDialog(this,(String)"ARAUAK:\n- Bi jokalari behar dira, txandakako joku bat da.\n- Ilara bakoitzean nahi dituzun makilak kendu ahal dituzu.\n- Txanda bakoitzeko ilara batetik bakarrik kendu ahal dituzu makilak.\n- Azken makila ezabatzen duenak galtzen du.", "Ongi etorri Makilen jolasera",JOptionPane.INFORMATION_MESSAGE,null);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();

		if (o == btnOK || o == textField) {
			if (!this.rdbtn1.isSelected() && !this.rdbtn2.isSelected() && !this.rdbtn3.isSelected()) {
				lblMensaje.setText("Aukeratu fila.");
			} else {

				if (this.rdbtn1.isSelected()) {
					num = Integer.parseInt(textField.getText());
					if (num > kont1) {
						lblMensaje.setText("Ez daude hainbeste makila.");
					} else {
						lbl1.setText(opc[kont1 - num]);
						if((kont1 - num)==0) {
							kontIr++;
						}
						kont1 = kont1 - num;
						if (kont % 2 == 0) {
							lblJugador.setText("2. Jokalaria");
							kont++;
						} else {
							lblJugador.setText("1. Jokalaria");
							kont++;
						}
					}
				}

				if (this.rdbtn2.isSelected()) {
					num = Integer.parseInt(textField.getText());
					if (num > kont2) {
						lblMensaje.setText("Ez daude hainbeste makila.");
					} else {
						lbl2.setText(opc[kont2 - num]);
						if((kont2 - num)==0) {
							kontIr++;
						}
						kont2 = kont2 - num;
						if (kont % 2 == 0) {
							lblJugador.setText("2. Jokalaria");
							kont++;
						} else {
							lblJugador.setText("1. Jokalaria");
							kont++;
						}
					}
				}

				if (this.rdbtn3.isSelected()) {
					num = Integer.parseInt(textField.getText());
					if (num > kont3) {
						lblMensaje.setText("Ez daude hainbeste makila.");
					} else {
						lbl3.setText(opc[kont3 - num]);
						if((kont3 - num)==0) {
							kontIr++;
						}
						kont3 = kont3 - num;
						if (kont % 2 == 0) {
							lblJugador.setText("2. Jokalaria");
							kont++;
						} else {
							lblJugador.setText("1. Jokalaria");
							kont++;
						}
					}
				}
				textField.setText("");
				
				if (kontIr==3) {
					JOptionPane.showMessageDialog(this, (String) "Oso ondo :)", lblJugador.getText() + " irabazi du!",
							JOptionPane.WARNING_MESSAGE, null);
					this.setVisible(false);
					this.dispose();
					Menua v2 = new Menua();
					v2.setVisible(true);
					this.setVisible(false);
					this.dispose();
				}
			}
		}
	}

}
