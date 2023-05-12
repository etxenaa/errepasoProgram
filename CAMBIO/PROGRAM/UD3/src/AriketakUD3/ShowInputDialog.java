package AriketakUD3;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;

public class ShowInputDialog extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JLabel lbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ShowInputDialog frame = new ShowInputDialog();
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
	public ShowInputDialog() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lbl = new JLabel("Anonimo");
		lbl.setBounds(118, 76, 269, 14);
		contentPane.add(lbl);
		
		JButton btn = new JButton("Eman izena");
		btn.setBounds(138, 151, 126, 23);
		contentPane.add(btn);
		
		btn.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String respuesta = (String)JOptionPane.showInputDialog(this,(String)"Sartu izena: ","Sartu datuak",JOptionPane.QUESTION_MESSAGE,null, null, "Izen barik");
		
		if (respuesta==null) {
			lbl.setText("ERROR no se ha introducido ningun dato");
		} else if (respuesta.equals("")){
			lbl.setText("ERROR no se ha introducido ningun dato");
		} else {
			lbl.setText("Hola "+respuesta);
		}
		
	}

}
