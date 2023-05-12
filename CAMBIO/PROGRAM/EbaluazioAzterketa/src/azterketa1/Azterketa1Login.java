package azterketa1;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import AriketakUD3.AriketaVentanas2;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

public class Azterketa1Login extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField tfErabiltzailea;
	private JPasswordField pfPasahitza;
	private JButton btnAurrera;
	private JLabel lbl;
	private int saiakerak=3;
	private String a="luken",b="idirin";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Azterketa1Login frame = new Azterketa1Login();
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
	public Azterketa1Login() {
		setTitle("Luken Idirinen azterketa");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblErabiltzailea = new JLabel("Erabiltzailea:");
		lblErabiltzailea.setBounds(20, 33, 141, 14);
		contentPane.add(lblErabiltzailea);
		
		tfErabiltzailea = new JTextField();
		tfErabiltzailea.setBounds(103, 30, 86, 20);
		contentPane.add(tfErabiltzailea);
		tfErabiltzailea.setColumns(10);
		
		JLabel lblPasahitza = new JLabel("Pasahitza:");
		lblPasahitza.setBounds(210, 33, 153, 14);
		contentPane.add(lblPasahitza);
		
		pfPasahitza = new JPasswordField();
		pfPasahitza.setBounds(281, 30, 96, 20);
		contentPane.add(pfPasahitza);
		
		lbl = new JLabel(" ");
		lbl.setBounds(69, 105, 294, 14);
		contentPane.add(lbl);
		
		btnAurrera = new JButton("Aurrera");
		btnAurrera.setBounds(158, 58, 89, 23);
		contentPane.add(btnAurrera);
		
		btnAurrera.addActionListener(this);
		pfPasahitza.addActionListener(this);
		tfErabiltzailea.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if (!tfErabiltzailea.getText().equals(a) || !pfPasahitza.getText().equals(b)) {
			saiakerak--;
			lbl.setText("Datu ez egokiak "+saiakerak+" saiakera dituzu oraindik.");
			tfErabiltzailea.setText("");
			pfPasahitza.setText("");
			if (saiakerak==0) {
				System.exit(0);
			}
		}
		else {
			Azterketa1Botoiak v2 = new Azterketa1Botoiak();
			v2.setTitle("Ongi etorri "+tfErabiltzailea.getText());
			v2.setVisible(true);
			this.setVisible(false);
			this.dispose();
		}
		
	}
}
