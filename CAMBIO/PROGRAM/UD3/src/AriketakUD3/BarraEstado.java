package AriketakUD3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.SpringLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormSpecs;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.ImageIcon;

public class BarraEstado extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textAbizena,textAdina,textIzena;
	private JLabel Izena1,Izena2,Abizena1,Abizena2,Adina1,Adina2,Estado,lblInfo;
	private JButton btnZabaldu,btnGorde,btnInfo,btnBidali;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BarraEstado frame = new BarraEstado();
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
	public BarraEstado() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JToolBar toolBar = new JToolBar();
		contentPane.add(toolBar, BorderLayout.NORTH);
		
		btnZabaldu = new JButton("");
		btnZabaldu.setIcon(new ImageIcon("C:\\Users\\ikaslea\\Desktop\\eclipse-workspace\\UD3\\src\\Eclipse-Icons\\iconos\\abrir.gif"));
		toolBar.add(btnZabaldu);
		
		btnGorde = new JButton("");
		btnGorde.setIcon(new ImageIcon("C:\\Users\\ikaslea\\Desktop\\eclipse-workspace\\UD3\\src\\Eclipse-Icons\\iconos\\guardar.gif"));
		toolBar.add(btnGorde);
		
		btnInfo = new JButton("");
		btnInfo.setIcon(new ImageIcon("C:\\Users\\ikaslea\\Desktop\\eclipse-workspace\\UD3\\src\\Eclipse-Icons\\iconos\\acercade.gif"));
		toolBar.add(btnInfo);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Izena1 = new JLabel("Izena:");
		Izena1.setBounds(23, 30, 46, 14);
		panel.add(Izena1);
		
		Abizena1 = new JLabel("Abizena:");
		Abizena1.setBounds(23, 78, 46, 14);
		panel.add(Abizena1);
		
		Adina1 = new JLabel("Adina:");
		Adina1.setBounds(23, 124, 46, 14);
		panel.add(Adina1);
		
		textIzena = new JTextField();
		textIzena.setBounds(92, 27, 86, 20);
		panel.add(textIzena);
		textIzena.setColumns(10);
		
		textAbizena = new JTextField();
		textAbizena.setBounds(92, 75, 86, 20);
		panel.add(textAbizena);
		textAbizena.setColumns(10);
		
		textAdina = new JTextField();
		textAdina.setBounds(92, 121, 86, 20);
		panel.add(textAdina);
		textAdina.setColumns(10);
		
		lblInfo = new JLabel(" ");
		lblInfo.setBounds(235, 27, 189, 116);
		panel.add(lblInfo);
		
		btnBidali = new JButton("Bidali");
		btnBidali.setBounds(46, 156, 89, 23);
		panel.add(btnBidali);
		
		JPanel BarraEstado = new JPanel();
		contentPane.add(BarraEstado, BorderLayout.SOUTH);
		BarraEstado.setLayout(new GridLayout(0, 4, 0, 0));
		
		Izena2 = new JLabel(" ");
		BarraEstado.add(Izena2);
		
		Abizena2 = new JLabel(" ");
		BarraEstado.add(Abizena2);
		
		Adina2 = new JLabel(" ");
		BarraEstado.add(Adina2);
		
		Estado = new JLabel("Geldi");
		BarraEstado.add(Estado);
		
		btnZabaldu.addActionListener(this);
		btnGorde.addActionListener(this);
		btnInfo.addActionListener(this);
		btnBidali.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		
		if (o == btnZabaldu) {
			Estado.setText("Fitxategia zabaltzen...");
		}
		else if (o == btnGorde) {
			Estado.setText("Fitxategia gordetzen...");
		}
		else if (o == btnInfo) {
			Estado.setText("Informazioa");
			lblInfo.setText("Zure datuak sartu.");
		}
		else if (o == btnBidali) {
			Estado.setText("Datuak");
			Izena2.setText(textIzena.getText());
			Abizena2.setText(textAbizena.getText());
			Adina2.setText(textAdina.getText());
		}
	}
}
