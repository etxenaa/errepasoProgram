package AriketakUD3;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JLabel;
import javax.swing.JCheckBox;

public class CheckBox extends JFrame implements ChangeListener {

	private JPanel contentPane;
	private JCheckBox chbxCursiva,chbxNegrita;
	private JLabel lbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckBox frame = new CheckBox();
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
	public CheckBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl = new JLabel("Proba testua");
		lbl.setBounds(166, 11, 102, 14);
		contentPane.add(lbl);
		
		chbxCursiva = new JCheckBox("Cursiva");
		chbxCursiva.setBounds(70, 118, 97, 23);
		contentPane.add(chbxCursiva);
		
		chbxNegrita = new JCheckBox("Negrita");
		chbxNegrita.setBounds(237, 118, 97, 23);
		contentPane.add(chbxNegrita);
		
		chbxCursiva.addChangeListener(this);
		chbxNegrita.addChangeListener(this);
		
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
}
