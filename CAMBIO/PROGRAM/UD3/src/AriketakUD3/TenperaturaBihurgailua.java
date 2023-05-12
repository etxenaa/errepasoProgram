package AriketakUD3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;

public class TenperaturaBihurgailua extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textC,textF,textK;
	private JMenuItem mntmC,mntmCF,mntmCK,mntmInfo,mntmIrten;
	private JLabel BarraEstado;
	private JButton btnClean,btnF,btnK;
	double a=0;
	String b="";


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TenperaturaBihurgailua frame = new TenperaturaBihurgailua();
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
	public TenperaturaBihurgailua() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAukerak = new JMenu("Aukerak");
		menuBar.add(mnAukerak);
		
		mntmC = new JMenuItem("Clean");
		mntmC.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
		mnAukerak.add(mntmC);
		
		mntmCF = new JMenuItem("Convert to F");
		mntmCF.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, InputEvent.CTRL_DOWN_MASK));
		mnAukerak.add(mntmCF);
		
		mntmCK = new JMenuItem("Convert to K");
		mntmCK.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
		mnAukerak.add(mntmCK);
		
		JMenu mnMore = new JMenu("More");
		menuBar.add(mnMore);
		
		mntmInfo = new JMenuItem("More Info");
		mntmInfo.setIcon(new ImageIcon("C:\\Users\\ikaslea\\Desktop\\eclipse-workspace\\UD3\\src\\Eclipse-Icons\\iconos\\acercade.gif"));
		mnMore.add(mntmInfo);
		
		mntmIrten = new JMenuItem("Irten");
		mntmIrten.setIcon(new ImageIcon("C:\\Users\\ikaslea\\Desktop\\eclipse-workspace\\UD3\\src\\Eclipse-Icons\\iconos\\salir.gif"));
		mnMore.add(mntmIrten);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);
		
		BarraEstado = new JLabel("Please intro the ºC");
		panel.add(BarraEstado);
		
		JPanel panel_1 = new JPanel();
		contentPane.add(panel_1, BorderLayout.CENTER);
		panel_1.setLayout(null);
		
		JLabel lbl1 = new JLabel("Graduak ºC ->");
		lbl1.setBounds(51, 59, 89, 14);
		panel_1.add(lbl1);
		
		textC = new JTextField();
		textC.setBounds(150, 56, 86, 20);
		panel_1.add(textC);
		textC.setColumns(10);
		
		btnClean = new JButton("Clean");
		btnClean.setBounds(283, 55, 89, 23);
		panel_1.add(btnClean);
		
		btnF = new JButton("Convert to F");
		btnF.setBounds(40, 108, 104, 23);
		panel_1.add(btnF);
		
		btnK = new JButton("Convert to K");
		btnK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnK.setBounds(249, 108, 104, 23);
		panel_1.add(btnK);
		
		textF = new JTextField();
		textF.setBounds(40, 157, 104, 20);
		panel_1.add(textF);
		textF.setColumns(10);
		
		textK = new JTextField();
		textK.setBounds(249, 157, 104, 20);
		panel_1.add(textK);
		textK.setColumns(10);
		
		btnK.addActionListener(this);
		btnF.addActionListener(this);
		btnClean.addActionListener(this);
		mntmCK.addActionListener(this);
		mntmCF.addActionListener(this);
		mntmC.addActionListener(this);
		mntmInfo.addActionListener(this);
		mntmIrten.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object o = e.getSource();

		if (o == btnK || o == mntmCK) {
			if (textC.getText().length()==0) {
				BarraEstado.setText("ADD Cº");
			} else {
			a = Double.parseDouble(textC.getText());
			a = (a+273.15);
			b = String.valueOf(a);
			textK.setText(b+"K");
			BarraEstado.setText("DONE");
			}
		}
		else if (o == btnF || o == mntmCF) {
			if (textC.getText().length()==0) {
				BarraEstado.setText("ADD Cº");
			} else {
			a = Double.parseDouble(textC.getText());
			a = ((a*9/5)+32);
			b = String.valueOf(a);
			textF.setText(b+"F");
			BarraEstado.setText("DONE");
			}
			
		}
		else if (o == btnClean || o == mntmC) {
			BarraEstado.setText("Clean");
			textK.setText("");
			textF.setText("");
			textC.setText("");
		}
		else if (o == mntmInfo) {
			BarraEstado.setText("ADD Cº AND PRESS A BUTTON");
		}
		else if (o == mntmIrten) {
			System.exit(0);
		}
	}
}
