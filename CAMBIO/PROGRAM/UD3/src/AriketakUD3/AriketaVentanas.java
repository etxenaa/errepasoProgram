package AriketakUD3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;

public class AriketaVentanas extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField tfIzena;
	private JButton btnBidali;
	private JLabel lblEZ;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AriketaVentanas frame = new AriketaVentanas();
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
	public AriketaVentanas() {
		setTitle("Identika zaitez");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIzena = new JLabel("Izena:");
		lblIzena.setBounds(38, 79, 71, 14);
		contentPane.add(lblIzena);
		
		JLabel lblPasahitza = new JLabel("Pasahitza:");
		lblPasahitza.setBounds(38, 141, 71, 14);
		contentPane.add(lblPasahitza);
		
		tfIzena = new JTextField();
		tfIzena.setBounds(137, 76, 183, 20);
		contentPane.add(tfIzena);
		tfIzena.setColumns(10);
		
		btnBidali = new JButton("Bidali");
		btnBidali.setBounds(164, 199, 89, 23);
		contentPane.add(btnBidali);
		
		lblEZ = new JLabel("");
		lblEZ.setBounds(63, 236, 309, 14);
		contentPane.add(lblEZ);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(137, 138, 183, 20);
		contentPane.add(passwordField);

		
		JOptionPane.showMessageDialog(this,(String)"Ongi etorri gure webgunera","Welcome",JOptionPane.INFORMATION_MESSAGE,null);
		
		btnBidali.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String a="abc";
		
		if (passwordField.getText().equals(a)) {
			AriketaVentanas2 v2 = new AriketaVentanas2();
			v2.setTitle("Ongi etorri "+tfIzena.getText());
			v2.setVisible(true);
			this.setVisible(false);
			this.dispose();
		}
		else {
			lblEZ.setText("Pasahitza okerra. Sartu berriro.");
		}
	}
}
