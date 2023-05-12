package AriketakUD3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.CardLayout;
import javax.swing.BoxLayout;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import javax.swing.SpringLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class Kalkuladora2 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0;
	private JButton btnPunto,btnGehi,btnKen,btnBider,btnZati,btnBerdin,btnCE;
	private JPanel panel_1;
	private JLabel lbl_1;
	private JLabel lblNewLabel_1;
	private JLabel label;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkuladora2 frame = new Kalkuladora2();
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
	public Kalkuladora2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		panel.setLayout(new GridLayout(0, 8, 0, 0));
		
		btn1 = new JButton("1");
		panel.add(btn1);
		
		btn2 = new JButton("2");
		panel.add(btn2);
		
		btn3 = new JButton("3");
		panel.add(btn3);
		
		btn4 = new JButton("4");
		panel.add(btn4);
		
		btn5 = new JButton("5");
		panel.add(btn5);
		
		btnKen = new JButton("-");
		panel.add(btnKen);
		
		btnPunto = new JButton(".");
		panel.add(btnPunto);
		
		btnBerdin = new JButton("=");
		panel.add(btnBerdin);
		
		btn6 = new JButton("6");
		panel.add(btn6);
		
		btn7 = new JButton("7");
		panel.add(btn7);
		
		btn8 = new JButton("8");
		panel.add(btn8);
		
		btn9 = new JButton("9");
		panel.add(btn9);
		
		btn0 = new JButton("0");
		panel.add(btn0);
		
		btnZati = new JButton("/");
		panel.add(btnZati);
		
		btnBider = new JButton("*");
		btnBider.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnBider);
		
		btnGehi = new JButton("+");
		panel.add(btnGehi);
		
		btnCE = new JButton("CE");
		contentPane.add(btnCE, BorderLayout.EAST);
		
		panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.NORTH);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		lbl_1 = new JLabel("0");
		panel_1.add(lbl_1);
		
		lblNewLabel_1 = new JLabel("New label");
		panel_1.add(lblNewLabel_1);
		
		label = new JLabel("");
		contentPane.add(label, BorderLayout.WEST);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		btn0.addActionListener(this);
		btnPunto.addActionListener(this);
		btnBerdin.addActionListener(this);
		btnGehi.addActionListener(this);
		btnKen.addActionListener(this);
		btnBider.addActionListener(this);
		btnZati.addActionListener(this);
		btnCE.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
