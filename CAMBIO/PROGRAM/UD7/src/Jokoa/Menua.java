package Jokoa;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Menua extends JFrame implements ActionListener{

	private JPanel contentPane;
	private JButton btnWordle, btnMakilak, btnBarkuak;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menua frame = new Menua();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * si pues hace eso
	 * @author luken
	 * @param lados
	 * @return diametro
	 * Create the frame.
	 */
	public Menua() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTituloa = new JLabel("JOKOAK");
		lblTituloa.setBackground(new Color(255, 255, 255));
		lblTituloa.setForeground(new Color(255, 128, 0));
		lblTituloa.setFont(new Font("Wide Latin", Font.BOLD, 25));
		lblTituloa.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloa.setBounds(98, 11, 224, 50);
		contentPane.add(lblTituloa);
		
		btnWordle = new JButton("Wordle");
		btnWordle.setForeground(new Color(255, 255, 0));
		btnWordle.setBackground(new Color(0, 128, 64));
		btnWordle.setFont(new Font("Verdana", Font.BOLD, 20));
		btnWordle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnWordle.setBounds(57, 94, 120, 50);
		contentPane.add(btnWordle);
		
		btnBarkuak = new JButton("Hundir la flota");
		btnBarkuak.setBackground(new Color(0, 128, 255));
		btnBarkuak.setForeground(new Color(0, 0, 160));
		btnBarkuak.setFont(new Font("Verdana", Font.BOLD, 20));
		btnBarkuak.setBounds(110, 167, 200, 50);
		contentPane.add(btnBarkuak);
		
		btnMakilak = new JButton("Makilak");
		btnMakilak.setForeground(new Color(128, 128, 255));
		btnMakilak.setBackground(new Color(128, 0, 64));
		btnMakilak.setFont(new Font("Verdana", Font.BOLD, 20));
		btnMakilak.setBounds(240, 94, 120, 50);
		contentPane.add(btnMakilak);
		
		btnWordle.addActionListener(this);
		btnMakilak.addActionListener(this);
		btnBarkuak.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object o = e.getSource();
		
		if (o == btnWordle) {
			Wordle v2 = new Wordle();
			v2.setVisible(true);
			this.setVisible(false);
			this.dispose();
		}
		
		if (o == btnMakilak) {
			Makilak v3 = new Makilak();
			v3.setVisible(true);
			this.setVisible(false);
			this.dispose();
		}
		
		if (o == btnBarkuak) {
			JOptionPane.showMessageDialog(this,(String)"COMING SOON...", "I+D",JOptionPane.WARNING_MESSAGE,null);
			/*
			 * HundirFlota v4 = new HundirFlota();
			 * v4.setVisible(true);
			 */
		}
	}
}
