package AriketakUD3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class VentanaJPasswordField extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_2;
	String up="1dw3";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaJPasswordField frame = new VentanaJPasswordField();
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
	public VentanaJPasswordField() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Izena:");
		lblNewLabel.setBounds(122, 41, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Pasahitza:");
		lblNewLabel_1.setBounds(122, 89, 72, 14);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(147, 192, 133, 14);
		contentPane.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				 textField.select(0, textField.getText().length());
			}
			@Override
			public void focusLost(FocusEvent e) {
				textField.select(0, 0);

			}
		});
		textField.setBounds(194, 38, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.addFocusListener(new FocusAdapter() {
			@Override
			public void focusGained(FocusEvent e) {
				passwordField.setSelectionStart(0);
				 String contrasena = new String(passwordField.getPassword());
				 passwordField.setSelectionEnd(contrasena.length());
			}
			@Override
			public void focusLost(FocusEvent e) {
				passwordField.select(0, 0);

			}
		});
		passwordField.setBounds(194, 86, 86, 20);
		contentPane.add(passwordField);
		
		
		JButton btnNewButton = new JButton("Onartu");
		btnNewButton.setBounds(163, 139, 89, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton.addActionListener(this);
		textField.addActionListener(this);
		passwordField.addActionListener(this);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String pasahitza = new String(passwordField.getPassword());
		if ((textField.getText().equals(up)) && (pasahitza.equals(up))) {
			VentanaHola vh = new VentanaHola();
			vh.setTitle("Ongi etorri "+textField.getText());
			vh.setVisible(true);
			this.setVisible(false);
			this.dispose();
			
		} else {
			lblNewLabel_2.setText("");
		}
	}
}
