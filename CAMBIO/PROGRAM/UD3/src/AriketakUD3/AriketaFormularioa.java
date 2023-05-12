package AriketakUD3;

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
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;

public class AriketaFormularioa extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField tfIzena,tfAbizena;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton btnBidali;
	private JCheckBox chckbxEuskera,chckbxErdera,chckbxIngelera;
	private JRadioButton rdbtnIrakaslea,rdbtnIkaslea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AriketaFormularioa frame = new AriketaFormularioa();
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
	public AriketaFormularioa() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCIFP = new JLabel("CIFP ZORNOTZA LHII");
		lblCIFP.setForeground(new Color(0, 0, 255));
		lblCIFP.setFont(new Font("Verdana", Font.PLAIN, 18));
		lblCIFP.setBounds(111, 11, 217, 23);
		contentPane.add(lblCIFP);
		
		JLabel lblIzena = new JLabel("Izena:");
		lblIzena.setBounds(51, 67, 46, 14);
		contentPane.add(lblIzena);
		
		JLabel lblAbizena = new JLabel("Abizena:");
		lblAbizena.setBounds(51, 124, 46, 14);
		contentPane.add(lblAbizena);
		
		tfIzena = new JTextField();
		tfIzena.setBounds(111, 64, 86, 20);
		contentPane.add(tfIzena);
		tfIzena.setColumns(10);
		
		tfAbizena = new JTextField();
		tfAbizena.setBounds(111, 121, 86, 20);
		contentPane.add(tfAbizena);
		tfAbizena.setColumns(10);
		
		rdbtnIrakaslea = new JRadioButton("Irakaslea");
		buttonGroup.add(rdbtnIrakaslea);
		rdbtnIrakaslea.setBounds(276, 63, 109, 23);
		contentPane.add(rdbtnIrakaslea);
		
		rdbtnIkaslea = new JRadioButton("Ikaslea");
		buttonGroup.add(rdbtnIkaslea);
		rdbtnIkaslea.setBounds(276, 120, 109, 23);
		contentPane.add(rdbtnIkaslea);
		
		JLabel lblHizkuntzak = new JLabel("Ezagutzen dituzun hizkuntzak (B2 maila gutxienez)");
		lblHizkuntzak.setBounds(83, 159, 302, 14);
		contentPane.add(lblHizkuntzak);
		
		chckbxEuskera = new JCheckBox("Euskera");
		chckbxEuskera.setBounds(69, 180, 97, 23);
		contentPane.add(chckbxEuskera);
		
		chckbxErdera = new JCheckBox("Erdera");
		chckbxErdera.setBounds(168, 180, 97, 23);
		contentPane.add(chckbxErdera);
		
		chckbxIngelera = new JCheckBox("Ingelera");
		chckbxIngelera.setBounds(267, 180, 97, 23);
		contentPane.add(chckbxIngelera);
		
		btnBidali = new JButton("BIDALI");
		btnBidali.setBounds(148, 212, 89, 23);
		contentPane.add(btnBidali);
		
		btnBidali.addActionListener(this);
		rdbtnIrakaslea.addActionListener(this);
		rdbtnIkaslea.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		
		String texto="",hizkuntzak="";
		
		//Radio Buttonak
		if (o == rdbtnIkaslea || o == rdbtnIrakaslea) {
			texto = ((JRadioButton)o).getText();
		}
		
		//CheckBoxak
		if (chckbxEuskera.isSelected()) {
			hizkuntzak = hizkuntzak+ " " + chckbxEuskera.getText();
		}
		
		if (chckbxErdera.isSelected()) {
			hizkuntzak = hizkuntzak+ " " + chckbxErdera.getText();
		}
		
		if (chckbxIngelera.isSelected()) {
			hizkuntzak = hizkuntzak+ " " + chckbxIngelera.getText();
		}
		
		//Botoia
		if (o == btnBidali) {
			
		JOptionPane.showMessageDialog(this,(String)("Ezagutzen dituzun hizkuntzak "+hizkuntzak+" dira."),"Welcome "+tfIzena.getText()+" "+tfAbizena.getText()+" "+texto,JOptionPane.INFORMATION_MESSAGE,null);

		}
}
}
