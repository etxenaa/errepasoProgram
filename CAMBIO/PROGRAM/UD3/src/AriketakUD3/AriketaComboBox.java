package AriketakUD3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class AriketaComboBox extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JComboBox<String> cmbGrupos;
	private JLabel lbl;
	private JLabel lbl1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AriketaComboBox frame = new AriketaComboBox();
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
	public AriketaComboBox() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		
		 cmbGrupos = new JComboBox<String>();
		 cmbGrupos.addItem("1AS3");
		 cmbGrupos.addItem("2AS3");
		 cmbGrupos.addItem("1DW3");
		 cmbGrupos.addItem("2DW3");
		 
		 lbl = new JLabel("AUKERATU");
		 contentPane.add(lbl);
		 cmbGrupos.setSelectedIndex(0);
		 contentPane.add(cmbGrupos, BorderLayout.WEST);
		 
		 lbl1 = new JLabel(" ");
		 contentPane.add(lbl1);
		 
		 cmbGrupos.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String seleccion = (String) this.cmbGrupos.getSelectedItem();
		this.lbl1.setText(seleccion);

	}

}
