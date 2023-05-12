package AriketakUD3;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import say.swing.JFontChooser;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;

public class VentanasSeleccion extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JButton btnArchivo, btnFuente, btnColor;
    private JLabel lblNewLabel;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VentanasSeleccion frame = new VentanasSeleccion();
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
    public VentanasSeleccion() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(null);
       
        lblNewLabel = new JLabel("Prueba de ventanas de seleccion");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(0, 101, 434, 48);
        contentPane.add(lblNewLabel);
       
        btnArchivo = new JButton("Archivo");
        btnArchivo.setBounds(82, 175, 89, 23);
        contentPane.add(btnArchivo);
       
        btnColor = new JButton("Color");
        btnColor.setBounds(181, 175, 89, 23);
        contentPane.add(btnColor);
       
        btnFuente = new JButton("Fuente");
        btnFuente.setBounds(280, 175, 89, 23);
        contentPane.add(btnFuente);
       
        btnArchivo.addActionListener(this);
        btnColor.addActionListener(this);
        btnFuente.addActionListener(this);
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        Object o = e.getSource();
       
        if(o == btnArchivo) {
            JFileChooser fileChooser = new JFileChooser();
            int opcion = fileChooser.showOpenDialog(this);
            if (opcion == JFileChooser.APPROVE_OPTION) {
                lblNewLabel.setText(fileChooser.getSelectedFile()+" fitxategia aukeratu duzu");
            }
        }
        else if(o == btnColor) {
                Color nuevoColor = JColorChooser.showDialog(this, "Elija un Color ...", contentPane.getForeground());
                lblNewLabel.setForeground(nuevoColor);
        }
        else if (o == btnFuente ) {
        	int opcion;
	        Font nuevaFuente;
	        JFontChooser fontChooser = new JFontChooser();
	        nuevaFuente = lblNewLabel.getFont();
	        fontChooser.setSelectedFont(nuevaFuente);
	        opcion = fontChooser.showDialog(contentPane);
	        
	        if (opcion == JFontChooser.OK_OPTION){
	        nuevaFuente = fontChooser.getSelectedFont();
	        lblNewLabel.setFont(nuevaFuente);
	        lblNewLabel.setText("La fuente ha sido cambiada.");
	        }
        
        }
    }
}