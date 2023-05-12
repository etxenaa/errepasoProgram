package AriketakUD3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.KeyStroke;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class AriketaVentanas2 extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JMenuItem mntm1,mntm2,mntm3,mntmCopy,mntmPaste,mntmHelpC,mntmInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AriketaVentanas2 frame = new AriketaVentanas2();
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
	public AriketaVentanas2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		mntm1 = new JMenuItem("Berria");
		mntm1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_T, InputEvent.CTRL_DOWN_MASK));
		mnFile.add(mntm1);
		
		mntm2 = new JMenuItem("Zabaldu");
		mntm2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		mnFile.add(mntm2);
		
		mntm3 = new JMenuItem("Irten");
		mntm3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));
		mnFile.add(mntm3);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		mntmCopy = new JMenuItem("Copy");
		mntmCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, InputEvent.CTRL_DOWN_MASK));
		mnEdit.add(mntmCopy);
		
		mntmPaste = new JMenuItem("Paste");
		mntmPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, InputEvent.CTRL_DOWN_MASK));
		mnEdit.add(mntmPaste);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		mntmHelpC = new JMenuItem("Help Contents");
		mnHelp.add(mntmHelpC);
		
		mntmInfo = new JMenuItem("More info");
		mnHelp.add(mntmInfo);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		

		mntm2.addActionListener(this);
		mntm3.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		
		if (o == mntm2) {
			AriketaVentanas3 v3 = new AriketaVentanas3();
			v3.setTitle("Open");
			v3.setVisible(true);
			this.setVisible(false);
			this.dispose();
		}
		else if (o == mntm3) {
			System.exit(0);
		}
		else if (o == mntmInfo) {
			AriketaVentanas4 v4 = new AriketaVentanas4();
			v4.setTitle("Open");
			v4.setVisible(true);
			this.setVisible(false);
			this.dispose();
		}
	}

}
