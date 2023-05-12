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

public class ShowOptionDialog extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JLabel lbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowOptionDialog frame = new ShowOptionDialog();
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
	public ShowOptionDialog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl = new JLabel("Ez duzu aukeratu");
		lbl.setBounds(138, 101, 183, 14);
		contentPane.add(lbl);
		
		JButton btn = new JButton("Sakatu");
		btn.setBounds(147, 166, 89, 23);
		contentPane.add(btn);
		
		btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String[] opciones = {"1AS3", "2AS3", "1DW3", "2DW3", "1SM2", "2SM2"};
		int opcion = JOptionPane.showOptionDialog(this,"Prueba de Cuadros de Diálogo","Cuadro de Diálogo con OpcionesPersonalizadas",
				JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,opciones,opciones[2]);
		if (opcion==0) {
			lbl.setText("1AS3 aukeratu duzu");
		}
		else if (opcion==1) {
			lbl.setText("2AS3 aukeratu duzu");
		}
		else if (opcion==2) {
			lbl.setText("1DW3 aukeratu duzu");
		}
		else if (opcion==3) {
			lbl.setText("2DW3 aukeratu duzu");
		}
		else if (opcion==4) {
			lbl.setText("1SM2 aukeratu duzu");
		}
		else if (opcion==5) {
			lbl.setText("2SM2 aukeratu duzu");
		}
		else  {
			lbl.setText("Ez duzu botoirik sakatu");
		}
	}

}
