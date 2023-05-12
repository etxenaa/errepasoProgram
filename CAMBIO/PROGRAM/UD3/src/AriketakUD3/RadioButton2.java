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

public class RadioButton2 extends JFrame implements ChangeListener,ActionListener {

	private JPanel contentPane;
	private JCheckBox chbxCursiva,chbxNegrita;
	private JLabel lbl;
	private JRadioButton rdbtnGorria,rdbtnBeltza,rdbtnUrdina,rdbtn12,rdbtn14,rdbtn16;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioButton2 frame = new RadioButton2();
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
	public RadioButton2() {
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
		rdbtnGorria.setBounds(186, 86, 78, 23);
		rdbtnGorria.setForeground(Color.RED);
		contentPane.add(rdbtnGorria);
		
		rdbtnBeltza = new JRadioButton("Beltza");
		rdbtnBeltza.setBounds(186, 127, 78, 23);
		rdbtnBeltza.setForeground(Color.BLACK);
		contentPane.add(rdbtnBeltza);
		
		rdbtnUrdina = new JRadioButton("Urdina");
		rdbtnUrdina.setBounds(186, 168, 78, 23);
		rdbtnUrdina.setForeground(Color.BLUE);
		contentPane.add(rdbtnUrdina);
		
		//buttongroup botoi bat bakarrik sakatuta egoteko
		ButtonGroup btgColores = new ButtonGroup();
		btgColores.add(rdbtnBeltza);
		btgColores.add(rdbtnGorria);
		btgColores.add(rdbtnUrdina);
		
		//beste buttongroup bat
		ButtonGroup btgNeurria = new ButtonGroup();
		btgNeurria.add(rdbtn12);
		btgNeurria.add(rdbtn14);
		btgNeurria.add(rdbtn16);
		
		rdbtn12 = new JRadioButton("12");
		btgNeurria.add(rdbtn12);
		rdbtn12.setBounds(282, 86, 109, 23);
		contentPane.add(rdbtn12);
		
		rdbtn14 = new JRadioButton("14");
		btgNeurria.add(rdbtn14);
		rdbtn14.setBounds(282, 127, 109, 23);
		contentPane.add(rdbtn14);
		
		rdbtn16 = new JRadioButton("16");
		btgNeurria.add(rdbtn16);
		rdbtn16.setBounds(282, 168, 109, 23);
		contentPane.add(rdbtn16);
		
		chbxCursiva.addChangeListener(this);
		chbxNegrita.addChangeListener(this);
		
		rdbtnGorria.addActionListener(this);
		rdbtnBeltza.addActionListener(this);
		rdbtnUrdina.addActionListener(this);
		
		rdbtn12.addActionListener(this);
		rdbtn14.addActionListener(this);
		rdbtn16.addActionListener(this);

	}

	@Override
	public void stateChanged(ChangeEvent e) {

		Font FontBerria = this.lbl.getFont();
		int formatua=0;
		
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

		 if (o == this.rdbtn12 || o == this.rdbtn14 || o == this.rdbtn16){
			 //CAMBIAR DE STRING A INT
			 //DE INT A STRING 
			 //int numEntero = 4;    
			 //String numCadena= String.valueOf(numEntero);
			 //o
			 //String numCadena= Integer.toString(numEntero);
			 int size;
			 String texto = ((JRadioButton)o).getText();
			 size = Integer.parseInt(texto);
			 Font FontBerria = this.lbl.getFont();
			 this.lbl.setFont(new Font(FontBerria.getFamily(), FontBerria.getStyle(), size));
		 }
	}
}
