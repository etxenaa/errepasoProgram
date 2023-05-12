package AriketakUD3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ProiektuTxikiaKomuna extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField izena;
	private JTextField abizena;
	private JTextField adina;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProiektuTxikiaKomuna frame = new ProiektuTxikiaKomuna();
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
	public ProiektuTxikiaKomuna() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Izena:");
		lblNewLabel.setBounds(87, 49, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Abizena:");
		lblNewLabel_1.setBounds(87, 74, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Adina:");
		lblNewLabel_2.setBounds(87, 100, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setBounds(87, 191, 248, 14);
		contentPane.add(lblNewLabel_3);
		
		JButton btn = new JButton("Onartu");
		btn.setBounds(145, 157, 89, 23);
		contentPane.add(btn);
		
		izena = new JTextField();
		izena.setBounds(184, 46, 86, 20);
		contentPane.add(izena);
		izena.setColumns(10);
		
		abizena = new JTextField();
		abizena.setBounds(184, 71, 86, 20);
		contentPane.add(abizena);
		abizena.setColumns(10);
		
		adina = new JTextField();
		adina.setBounds(184, 97, 86, 20);
		contentPane.add(adina);
		adina.setColumns(10);
		
		btn.addActionListener(this);
		adina.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String a=adina.getText();
		int b;
		b = Integer.parseInt(a);
		if (b>18) {
			lblNewLabel_3.setText("Ongi etorri "+izena.getText()+" "+abizena.getText());
		} else {
			lblNewLabel_3.setText("18 urte edo gehiago izan behar dituzu");
		}
	}

}
