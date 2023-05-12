package Jokoa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import java.awt.Font;

public class Wordle extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField txtField;
	private JButton btnOk;
	private JLabel lbl, lbl1, lbl2, lbl3, lbl4, lbl5, lbl2_1, lbl2_2, lbl2_3, lbl2_4, lbl2_5, lbl3_1, lbl3_2, lbl3_3,
			lbl3_4, lbl3_5, lbl4_1, lbl4_2, lbl4_3, lbl4_4, lbl4_5, lbl5_1, lbl5_2, lbl5_3, lbl5_4, lbl5_5;
	private int saiakera = -1;
	private String[] array = { "ZURIA", "PUREA", "EZTIA", "ASMOA", "OLIOA", "ASTOA", "AITOR", "ASIER", "LUKEN", "SARTU", "KATUA", "SAGUA", "GORDE", "AIMAR", "LEIRE", "KAIXO", "SEXUA", "MAHIA", "SUGEA", "BOTAK", "FRUTA", "AGURE", "MOREA" };
	private int numero = (int) (Math.random() * array.length);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Wordle frame = new Wordle();
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
	public Wordle() {
		setTitle("-WORDLE-");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		txtField = new JTextField();
		txtField.setBackground(new Color(255, 255, 255));
		txtField.setToolTipText("");
		txtField.setBounds(10, 216, 209, 34);
		contentPane.add(txtField);
		txtField.setColumns(10);

		btnOk = new JButton("OK!");
		btnOk.setBounds(221, 216, 203, 34);
		contentPane.add(btnOk);

		JPanel panel1 = new JPanel();
		panel1.setBackground(Color.LIGHT_GRAY);
		panel1.setBounds(24, 11, 370, 34);
		contentPane.add(panel1);

		lbl1 = new JLabel("|__|");
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl1.setForeground(new Color(0, 0, 0));
		lbl1.setBackground(new Color(0, 0, 0));
		panel1.add(lbl1);

		lbl2 = new JLabel("|__|");
		lbl2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl2.setBackground(new Color(255, 255, 255));
		panel1.add(lbl2);

		lbl3 = new JLabel("|__|");
		lbl3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl3.setBackground(new Color(255, 255, 255));
		panel1.add(lbl3);

		lbl4 = new JLabel("|__|");
		lbl4.setForeground(Color.BLACK);
		lbl4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl4.setBackground(new Color(255, 255, 255));
		panel1.add(lbl4);

		lbl5 = new JLabel("|__|");
		lbl5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl5.setBackground(new Color(255, 255, 255));
		panel1.add(lbl5);

		JPanel panel2 = new JPanel();
		panel2.setBackground(Color.LIGHT_GRAY);
		panel2.setBounds(24, 48, 370, 34);
		contentPane.add(panel2);

		lbl2_1 = new JLabel("|__|");
		lbl2_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl2_1.setForeground(Color.BLACK);
		panel2.add(lbl2_1);

		lbl2_2 = new JLabel("|__|");
		lbl2_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl2_2.setBackground(Color.WHITE);
		panel2.add(lbl2_2);

		lbl2_3 = new JLabel("|__|");
		lbl2_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl2_3.setBackground(Color.WHITE);
		panel2.add(lbl2_3);

		lbl2_4 = new JLabel("|__|");
		lbl2_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl2_4.setBackground(Color.WHITE);
		panel2.add(lbl2_4);

		lbl2_5 = new JLabel("|__|");
		lbl2_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl2_5.setBackground(Color.WHITE);
		panel2.add(lbl2_5);

		JPanel panel3 = new JPanel();
		panel3.setBackground(Color.LIGHT_GRAY);
		panel3.setBounds(24, 86, 370, 34);
		contentPane.add(panel3);

		lbl3_1 = new JLabel("|__|");
		lbl3_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl3_1.setForeground(Color.BLACK);
		lbl3_1.setBackground(Color.BLACK);
		panel3.add(lbl3_1);

		lbl3_2 = new JLabel("|__|");
		lbl3_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl3_2.setBackground(Color.WHITE);
		panel3.add(lbl3_2);

		lbl3_3 = new JLabel("|__|");
		lbl3_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl3_3.setBackground(Color.WHITE);
		panel3.add(lbl3_3);

		lbl3_4 = new JLabel("|__|");
		lbl3_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl3_4.setBackground(Color.WHITE);
		panel3.add(lbl3_4);

		lbl3_5 = new JLabel("|__|");
		lbl3_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl3_5.setBackground(Color.WHITE);
		panel3.add(lbl3_5);

		JPanel panel4 = new JPanel();
		panel4.setBackground(Color.LIGHT_GRAY);
		panel4.setBounds(24, 126, 370, 34);
		contentPane.add(panel4);

		lbl4_1 = new JLabel("|__|");
		lbl4_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl4_1.setForeground(Color.BLACK);
		lbl4_1.setBackground(Color.BLACK);
		panel4.add(lbl4_1);

		lbl4_2 = new JLabel("|__|");
		lbl4_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl4_2.setBackground(Color.WHITE);
		panel4.add(lbl4_2);

		lbl4_3 = new JLabel("|__|");
		lbl4_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl4_3.setBackground(Color.WHITE);
		panel4.add(lbl4_3);

		lbl4_4 = new JLabel("|__|");
		lbl4_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl4_4.setBackground(Color.WHITE);
		panel4.add(lbl4_4);

		lbl4_5 = new JLabel("|__|");
		lbl4_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl4_5.setBackground(Color.WHITE);
		panel4.add(lbl4_5);

		lbl = new JLabel("");
		lbl.setBounds(10, 201, 414, 14);
		contentPane.add(lbl);

		JPanel panel4_1 = new JPanel();
		panel4_1.setBackground(Color.LIGHT_GRAY);
		panel4_1.setBounds(24, 164, 370, 34);
		contentPane.add(panel4_1);

		lbl5_1 = new JLabel("|__|");
		lbl5_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl5_1.setForeground(Color.BLACK);
		lbl5_1.setBackground(Color.BLACK);
		panel4_1.add(lbl5_1);

		lbl5_2 = new JLabel("|__|");
		lbl5_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl5_2.setBackground(Color.WHITE);
		panel4_1.add(lbl5_2);

		lbl5_3 = new JLabel("|__|");
		lbl5_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl5_3.setBackground(Color.WHITE);
		panel4_1.add(lbl5_3);

		lbl5_4 = new JLabel("|__|");
		lbl5_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl5_4.setBackground(Color.WHITE);
		panel4_1.add(lbl5_4);

		lbl5_5 = new JLabel("|__|");
		lbl5_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lbl5_5.setBackground(Color.WHITE);
		panel4_1.add(lbl5_5);
		
		JOptionPane.showMessageDialog(this,(String)"ARAUAK:\n- 5 letrako hitza asmatu behar duzu.\n- Letra laranja bada letra hitz barnean dago.\n- Letra berde jar ezkero, letra hitzaren posizio horretan doa.", "Ongi etorri WORDLE-ra",JOptionPane.INFORMATION_MESSAGE,null);

		btnOk.addActionListener(this);
		txtField.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Scanner sc = new Scanner(System.in);
		Object o = e.getSource();
		JLabel Jlbl1[][] = new JLabel[5][5];
		Jlbl1[0][0] = lbl1;
		Jlbl1[0][1] = lbl2;
		Jlbl1[0][2] = lbl3;
		Jlbl1[0][3] = lbl4;
		Jlbl1[0][4] = lbl5;

		Jlbl1[1][0] = lbl2_1;
		Jlbl1[1][1] = lbl2_2;
		Jlbl1[1][2] = lbl2_3;
		Jlbl1[1][3] = lbl2_4;
		Jlbl1[1][4] = lbl2_5;

		Jlbl1[2][0] = lbl3_1;
		Jlbl1[2][1] = lbl3_2;
		Jlbl1[2][2] = lbl3_3;
		Jlbl1[2][3] = lbl3_4;
		Jlbl1[2][4] = lbl3_5;

		Jlbl1[3][0] = lbl4_1;
		Jlbl1[3][1] = lbl4_2;
		Jlbl1[3][2] = lbl4_3;
		Jlbl1[3][3] = lbl4_4;
		Jlbl1[3][4] = lbl4_5;

		Jlbl1[4][0] = lbl5_1;
		Jlbl1[4][1] = lbl5_2;
		Jlbl1[4][2] = lbl5_3;
		Jlbl1[4][3] = lbl5_4;
		Jlbl1[4][4] = lbl5_5;
		
		
		if (o == btnOk || o == txtField) {
			int tramposo=0; 
			for (int k = 0; k < array[numero].length(); k++) { 
				if (txtField.getText().charAt(k)=='a' || txtField.getText().charAt(k)=='e' || txtField.getText().charAt(k)=='i' || txtField.getText().charAt(k)=='o' || txtField.getText().charAt(k)=='u'){ 
					tramposo++; 
					} 
				}
			
			if (txtField.getText().length() != 5 || tramposo==5) {
				lbl.setText("Bost karaktere izan behar ditu. Eta bokalak bakarrik jartzea ez du balio.");
				txtField.setText("");
			} else {
				saiakera++;
				txtField.setText(txtField.getText().toUpperCase());
				for (int i = 0; i < array[numero].length(); i++) {
					Jlbl1[saiakera][i].setText("[ " + txtField.getText().charAt(i) + " ]");
					
					for (int j = 0; j < array[numero].length(); j++) {
						if (txtField.getText().charAt(i) == array[numero].charAt(j)) {
							Jlbl1[saiakera][i].setForeground(Color.yellow);
						
						}
					}
					if (txtField.getText().charAt(i) == array[numero].charAt(i)) {
						Jlbl1[saiakera][i].setForeground(Color.green);
					}
				}

				if (saiakera == 4 && !txtField.getText().equalsIgnoreCase(array[numero])) {
					JOptionPane.showMessageDialog(this, (String) "Saiakerak amaitu zaizkizu :(\n"+array[numero]+" zen hitza.", "GAME OVER",
							JOptionPane.ERROR_MESSAGE, null);
					this.setVisible(false);
					this.dispose();
					
				} else if (txtField.getText().equalsIgnoreCase(array[numero])) {
					JOptionPane.showMessageDialog(this, (String) "Oso ondo :)", "IRABAZI DUZU",
							JOptionPane.WARNING_MESSAGE, null);
					this.setVisible(false);
					this.dispose();
					Menua v2 = new Menua();
					v2.setVisible(true);
					this.setVisible(false);
					this.dispose();
				}
				txtField.setText("");
			}
		}
	}
}
