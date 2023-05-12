package AriketakUD3;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JRadioButton;

public class RadioButton extends JFrame implements ChangeListener,ActionListener {

	private JPanel contentPane;
	private JCheckBox chbxCursiva,chbxNegrita;
	private JLabel lbl;
	private JRadioButton rdbtnGorria,rdbtnBeltza,rdbtnUrdina;
	private ButtonGroup btgColores;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButton frame = new RadioButton();
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
	public RadioButton() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl = new JLabel("Proba testua");
		lbl.setBounds(147, 30, 102, 14);
		contentPane.add(lbl);
		
		chbxCursiva = new JCheckBox("Cursiva");
		chbxCursiva.setBounds(70, 86, 97, 23);
		contentPane.add(chbxCursiva);
		
		chbxNegrita = new JCheckBox("Negrita");
		chbxNegrita.setBounds(70, 168, 97, 23);
		contentPane.add(chbxNegrita);
		
		rdbtnGorria = new JRadioButton("Gorria");
		rdbtnGorria.setBounds(235, 86, 109, 23);
		rdbtnGorria.setForeground(Color.RED);
		contentPane.add(rdbtnGorria);
		
		rdbtnBeltza = new JRadioButton("Beltza");
		rdbtnBeltza.setBounds(235, 128, 109, 23);
		rdbtnBeltza.setForeground(Color.BLACK);
		contentPane.add(rdbtnBeltza);
		
		rdbtnUrdina = new JRadioButton("Urdina");
		rdbtnUrdina.setBounds(235, 168, 109, 23);
		rdbtnUrdina.setForeground(Color.BLUE);
		contentPane.add(rdbtnUrdina);
		
		//buttongroup botoi bat bakarrik sakatuta egoteko
		btgColores = new ButtonGroup();
		btgColores.add(rdbtnBeltza);
		btgColores.add(rdbtnGorria);
		btgColores.add(rdbtnUrdina);
		
		chbxCursiva.addChangeListener(this);
		chbxNegrita.addChangeListener(this);
		
		rdbtnGorria.addActionListener(this);
		rdbtnBeltza.addActionListener(this);
		rdbtnUrdina.addActionListener(this);

	}

	@Override
	public void stateChanged(ChangeEvent e) {

		Font FontBerria = this.lbl.getFont();
		int formatua = 0;
		
		if (this.chbxCursiva.isSelected()) {
			formatua = formatua + Font.ITALIC;
		}
		if (this.chbxNegrita.isSelected()) {
			formatua = formatua + Font.BOLD;
		}
		
		this.lbl.setFont(new Font(FontBerria.getFamily(), formatua, FontBerria.getSize()));
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object o = e.getSource();
		 if (o == this.rdbtnBeltza){
			 this.lbl.setForeground(Color.BLACK);
		 }
		 else if (o == this.rdbtnGorria){
			 this.lbl.setForeground(Color.RED);
		 }
		 else if (o == this.rdbtnUrdina){
			 this.lbl.setForeground(Color.BLUE);
		 }

		
	}
}
