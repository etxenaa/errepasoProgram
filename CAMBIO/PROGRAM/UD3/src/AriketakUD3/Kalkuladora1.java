package AriketakUD3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Kalkuladora1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField textField;
	private JButton btnSigno,btnX2,btnX3,btnEK,btn1ZatiX,btnCE;
	double a=0;
	String b="";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkuladora1 frame = new Kalkuladora1();
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
	public Kalkuladora1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(0, 3, 0, 0));
		
		btnSigno = new JButton("-");
		btnSigno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		panel.add(btnSigno);
		
		btnX2 = new JButton("X2");
		panel.add(btnX2);
		
		btnX3 = new JButton("X3");
		panel.add(btnX3);
		
		btnEK = new JButton("Erro Karratua");
		panel.add(btnEK);
		
		btn1ZatiX = new JButton("1/X");
		panel.add(btn1ZatiX);
		
		btnCE = new JButton("CE");
		panel.add(btnCE);
		
		
		btnSigno.addActionListener(this);
		btnX2.addActionListener(this);
		btnX3.addActionListener(this);
		btnEK.addActionListener(this);
		btn1ZatiX.addActionListener(this);
		btnCE.addActionListener(this);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		a = Double.parseDouble(textField.getText());
		Object o = e.getSource();
		if (o == btnSigno) {
			a = (a*-1);
			b = String.valueOf(a);
			textField.setText(b);
		}
		else if (o == btnX2) {
			a = (a*a);
			b = String.valueOf(a);
			textField.setText(b);
		}
		else if (o == btnX3) {
			a = (a*a*a);
			b = String.valueOf(a);
			textField.setText(b);
		}
		else if (o == btnEK) {
			a = Math.sqrt(a);
			b = String.valueOf(a);
			textField.setText(b);
		}
		else if (o == btn1ZatiX) {
			a = (1/a);
			b = String.valueOf(a);
			textField.setText(b);
		}
		else if (o == btnCE) {
			a = 0;
			b = String.valueOf(a);
			textField.setText(b);
		}
	}

}
