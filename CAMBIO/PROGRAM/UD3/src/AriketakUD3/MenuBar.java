package AriketakUD3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import java.awt.BorderLayout;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MenuBar extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JMenuItem mntm1,mntm2,mntm3,mntmCopy,mntmPaste,mntmCut;
	private JLabel lbl1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuBar frame = new MenuBar();
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
	public MenuBar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivo = new JMenu("Archivo");
		menuBar.add(mnArchivo);
		
		mntm1 = new JMenuItem("Berria");
		mntm1.setIcon(new ImageIcon("C:\\Users\\ikaslea\\Desktop\\eclipse-workspace\\UD3\\src\\Eclipse-Icons\\Menu1\\icons8-nuevo-20.png"));
		mntm1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_DOWN_MASK));
		mnArchivo.add(mntm1);
		
		mntm2 = new JMenuItem("Gorde");
		mntm2.setIcon(new ImageIcon("C:\\Users\\ikaslea\\Desktop\\eclipse-workspace\\UD3\\src\\Eclipse-Icons\\Menu1\\icons8-guardar-20.png"));
		mntm2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		mnArchivo.add(mntm2);
		
		mntm3 = new JMenuItem("Irten");
		mntm3.setIcon(new ImageIcon("C:\\Users\\ikaslea\\Desktop\\eclipse-workspace\\UD3\\src\\Eclipse-Icons\\Menu1\\icons8-salir-redondeado-20.png"));
		mntm3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));
		mnArchivo.add(mntm3);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		mntmCopy = new JMenuItem("Copy");
		mntmCopy.setIcon(new ImageIcon("C:\\Users\\ikaslea\\Desktop\\eclipse-workspace\\UD3\\src\\Eclipse-Icons\\Menu1\\icons8-copiar-20.png"));
		mntmCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		mnEdit.add(mntmCopy);
		
		mntmPaste = new JMenuItem("Paste");
		mntmPaste.setIcon(new ImageIcon("C:\\Users\\ikaslea\\Desktop\\eclipse-workspace\\UD3\\src\\Eclipse-Icons\\Menu1\\icons8-pegar-20.png"));
		mntmPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		mnEdit.add(mntmPaste);
		
		mntmCut = new JMenuItem("Cut");
		mntmCut.setIcon(new ImageIcon("C:\\Users\\ikaslea\\Desktop\\eclipse-workspace\\UD3\\src\\Eclipse-Icons\\Menu1\\icons8-cortar-20.png"));
		mntmCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.CTRL_DOWN_MASK));
		mnEdit.add(mntmCut);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		lbl1 = new JLabel(" ");
		contentPane.add(lbl1, BorderLayout.CENTER);
		
		mntm1.addActionListener(this);
		mntm2.addActionListener(this);
		mntm3.addActionListener(this);
		mntmCopy.addActionListener(this);
		mntmPaste.addActionListener(this);
		mntmCut.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object o = e.getSource();
		
		if (o == mntm1) {
			lbl1.setText("Fitxategi berria sortu duzu.");
		}
		else if (o == mntm2) {
			lbl1.setText("Fitxategia gorde egin da.");
		}
		else if (o == mntm3) {
			System.exit(0);
		}
		else if (o == mntmCopy) {
			lbl1.setText("Fitxategia copiatu egin da.");
		}
		else if (o == mntmPaste) {
			lbl1.setText("Fitxategia pegatu egin da.");
		}
		else if (o == mntmCut) {
			lbl1.setText("Fitxategia moztu egin da.");
		}
	}
}
