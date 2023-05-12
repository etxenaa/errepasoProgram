package azterketa1;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Azterketa1Botoiak extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tfZenbakia;
	private JButton btnBakBik,btnLehena;
	private JLabel lbl;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Azterketa1Botoiak frame = new Azterketa1Botoiak();
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
	public Azterketa1Botoiak() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		tfZenbakia = new JTextField();
		contentPane.add(tfZenbakia, BorderLayout.NORTH);
		tfZenbakia.setColumns(10);
		
		lbl = new JLabel(" ");
		contentPane.add(lbl, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		btnLehena = new JButton("Lehena");
		btnLehena.setBounds(0, 0, 424, 109);
		panel.add(btnLehena);
		
		btnBakBik = new JButton("Bakoitia/Bikoitia");
		btnBakBik.setBounds(0, 107, 424, 110);
		panel.add(btnBakBik);
		
		btnLehena.addActionListener(this);
		btnBakBik.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		Object o = e.getSource();
		
		int znbk;
		String zenbakia = tfZenbakia.getText();
		znbk = Integer.parseInt(zenbakia);
		
		if(o == btnLehena) {
			
			int kont=0;
			String mezua;
			
			 znbk=Integer.parseInt(tfZenbakia.getText());
			 
		        for(int i = 1; i <= znbk; i++)
		        {
		            if((znbk % i) == 0)
		            {
		                kont++;
		            }
		        }
		 
		        if(kont <= 2) {
		            mezua= "Zenbakia lehena da";
		        }
		        else {
		           mezua="Zenbakia ez da lehena";
		        }
		       
		        lbl.setText(mezua);
			
		}
		
		if(o == btnBakBik) {
			if (znbk%2==0) {
				lbl.setText(znbk+" Bikoitia da.");
			}
			else {
				lbl.setText(znbk+" Bakoitia da.");
			}
		}
	}

}
