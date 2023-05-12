package AriketakUD3;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;

public class ShowConfirmDialog extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowConfirmDialog frame = new ShowConfirmDialog();
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
	public ShowConfirmDialog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl = new JLabel("Ez da botoirik sakatu");
		lbl.setBounds(148, 84, 160, 14);
		contentPane.add(lbl);
		
		JButton btn = new JButton("Sakatu");
		btn.setBounds(150, 167, 89, 23);
		contentPane.add(btn);
		
		btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String[] opciones = {"BAI", "EZ", "Irten"};
		int opcion = JOptionPane.showOptionDialog(this,"Prueba de Cuadros de Diálogo","Cuadro de Diálogo de Confirmación",
				JOptionPane.DEFAULT_OPTION,JOptionPane.INFORMATION_MESSAGE,null,opciones,opciones[2]);
		
		if (opcion==0) {
			lbl.setText("Bai sakatu duzu");
		}
		else if (opcion==1) {
			lbl.setText("Ez sakatu duzu");
		}
		else if (opcion==2) {
			lbl.setText("Irten sakatu duzu");
		}
		else  {
			lbl.setText("Ez duzu botoirik sakatu");
		}
		
	}
}
