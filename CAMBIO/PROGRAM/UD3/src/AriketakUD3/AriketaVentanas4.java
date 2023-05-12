package AriketakUD3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

import say.swing.JFontChooser;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class AriketaVentanas4 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField tfIzena;
	private JTextField tfAbizena;
	private JTextField tfAdina;
	private JButton btnFont,btnBidali;
	private JLabel lbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AriketaVentanas4 frame = new AriketaVentanas4();
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
	public AriketaVentanas4() {
		setTitle("Informazio gehiago");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIzena = new JLabel("Izena:");
		lblIzena.setBounds(44, 49, 46, 14);
		contentPane.add(lblIzena);
		
		JLabel lblAbizena = new JLabel("Abizena:");
		lblAbizena.setBounds(44, 86, 46, 14);
		contentPane.add(lblAbizena);
		
		JLabel lblAdina = new JLabel("Adina");
		lblAdina.setBounds(44, 125, 46, 14);
		contentPane.add(lblAdina);
		
		tfIzena = new JTextField();
		tfIzena.setBounds(130, 46, 86, 20);
		contentPane.add(tfIzena);
		tfIzena.setColumns(10);
		
		tfAbizena = new JTextField();
		tfAbizena.setBounds(130, 83, 86, 20);
		contentPane.add(tfAbizena);
		tfAbizena.setColumns(10);
		
		tfAdina = new JTextField();
		tfAdina.setBounds(130, 122, 86, 20);
		contentPane.add(tfAdina);
		tfAdina.setColumns(10);
		
		btnFont = new JButton("Aldatu fonta");
		btnFont.setBounds(249, 86, 157, 92);
		contentPane.add(btnFont);
		
		btnBidali = new JButton("Bidali");
		btnBidali.setBounds(77, 167, 89, 23);
		contentPane.add(btnBidali);
		
		lbl = new JLabel("");
		lbl.setBounds(44, 217, 86, 33);
		contentPane.add(lbl);
		
		btnBidali.addActionListener(this);
		btnFont.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		 Object o = e.getSource();
		 
		 if (o == btnBidali ) {
			 int Adina;
			 String texto = tfAdina.getText();
			 Adina = Integer.parseInt(texto);
			 if (Adina<18) {
				 lbl.setText("18 urte edo gehiago izan behar dituzu sartzeko.");
			 }
			 else {
				 lbl.setText("Bidalita");
			 }
		 }
		
		 if (o == btnFont ) {
			int opcion;
			Font nuevaFuente;
			JFontChooser fontChooser = new JFontChooser();
			nuevaFuente = lbl.getFont();
			fontChooser.setSelectedFont(nuevaFuente);
			opcion = fontChooser.showDialog(contentPane);
					        
			if (opcion == JFontChooser.OK_OPTION){
				nuevaFuente = fontChooser.getSelectedFont();
				lbl.setFont(nuevaFuente);
		    }
		 }
	}

}
