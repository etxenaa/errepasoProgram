package AriketakUD3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class ToolBar extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnBerria,btnGorde,btnCopy,btnPaste,btnCut,btnIrten;
	private JLabel lbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ToolBar frame = new ToolBar();
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
	public ToolBar() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setBounds(10, 11, 221, 29);
		contentPane.add(toolBar);
		
		btnBerria = new JButton("");
		btnBerria.setIcon(new ImageIcon("C:\\Users\\ikaslea\\Desktop\\eclipse-workspace\\UD3\\src\\Eclipse-Icons\\Menu1\\icons8-nuevo-20.png"));
		toolBar.add(btnBerria);
		
		btnGorde = new JButton("");
		btnGorde.setIcon(new ImageIcon("C:\\Users\\ikaslea\\Desktop\\eclipse-workspace\\UD3\\src\\Eclipse-Icons\\Menu1\\icons8-guardar-20.png"));
		toolBar.add(btnGorde);
		
		btnCopy = new JButton("");
		btnCopy.setIcon(new ImageIcon("C:\\Users\\ikaslea\\Desktop\\eclipse-workspace\\UD3\\src\\Eclipse-Icons\\Menu1\\icons8-copiar-20.png"));
		toolBar.add(btnCopy);
		
		btnPaste = new JButton("");
		btnPaste.setIcon(new ImageIcon("C:\\Users\\ikaslea\\Desktop\\eclipse-workspace\\UD3\\src\\Eclipse-Icons\\Menu1\\icons8-pegar-20.png"));
		toolBar.add(btnPaste);
		
		btnCut = new JButton("");
		btnCut.setIcon(new ImageIcon("C:\\Users\\ikaslea\\Desktop\\eclipse-workspace\\UD3\\src\\Eclipse-Icons\\Menu1\\icons8-cortar-20.png"));
		toolBar.add(btnCut);
		
		btnIrten = new JButton("");
		btnIrten.setIcon(new ImageIcon("C:\\Users\\ikaslea\\Desktop\\eclipse-workspace\\UD3\\src\\Eclipse-Icons\\Menu1\\icons8-salir-redondeado-20.png"));
		toolBar.add(btnIrten);
		
		lbl = new JLabel(" ");
		lbl.setBounds(100, 100, 194, 85);
		contentPane.add(lbl);
		
		btnBerria.addActionListener(this);
		btnGorde.addActionListener(this);
		btnIrten.addActionListener(this);
		btnCopy.addActionListener(this);
		btnPaste.addActionListener(this);
		btnCut.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		
		if (o == btnBerria) {
			lbl.setText("Fitxategi berria sortu duzu.");
		}
		else if (o == btnGorde) {
			lbl.setText("Fitxategia gorde egin da.");
		}
		else if (o == btnIrten) {
			System.exit(0);
		}
		else if (o == btnCopy) {
			lbl.setText("Fitxategia copiatu egin da.");
		}
		else if (o == btnPaste) {
			lbl.setText("Fitxategia pegatu egin da.");
		}
		else if (o == btnCut) {
			lbl.setText("Fitxategia moztu egin da.");
		}
	}
}
