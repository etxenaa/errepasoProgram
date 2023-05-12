package AriketakUD3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.CardLayout;
import net.miginfocom.swing.MigLayout;
import com.jgoodies.forms.layout.FormSpecs;

public class Botones extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JButton btnHola,btnAdios,btnKaixo,btnAgur;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Botones frame = new Botones();
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
	public Botones() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		lblNewLabel = new JLabel("No hay mensaje");
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(lblNewLabel, BorderLayout.SOUTH);
		
		textField = new JTextField();
		contentPane.add(textField, BorderLayout.NORTH);
		textField.setColumns(10);
		
		JPanel panel = new JPanel();
		contentPane.add(panel);
		
		btnHola = new JButton("HOLA");
		panel.setLayout(new GridLayout(0, 2, 0, 0));
		panel.add(btnHola);
		
		btnAdios = new JButton("ADIOS");
		panel.add(btnAdios);
		
		btnKaixo = new JButton("KAIXO");
		panel.add(btnKaixo);
		
		btnAgur = new JButton("AGUR");
		panel.add(btnAgur);
		
		btnHola.addActionListener(this);
		btnAdios.addActionListener(this);
		btnKaixo.addActionListener(this);
		btnAgur.addActionListener(this);
		textField.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object o = e.getSource();
		if (o == textField) {
			lblNewLabel.setText(textField.getText());
		}
		else {
			String mezua="";
			mezua = ((JButton)o).getText();
			mezua = mezua + " " + textField.getText();
			lblNewLabel.setText(mezua);
		}
	}

}
