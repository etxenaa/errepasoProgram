package AriketakUD3;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.SwingConstants;
import java.awt.Font;

public class AriketaList extends JFrame implements ListSelectionListener{

    private JPanel contentPane;
    private JLabel lblTexto;
    private JList<String> lstGrupos;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    AriketaList frame = new AriketaList();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        );
    }

    public AriketaList() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));
        
        lblTexto = new JLabel("No se ha seleccionado nada");
        lblTexto.setFont(new Font("Tahoma", Font.PLAIN, 17));
        lblTexto.setHorizontalAlignment(SwingConstants.CENTER);
        contentPane.add(lblTexto, BorderLayout.NORTH);
                
        String[] opciones = { "1AS3", "2AS3", "1DW3", "2DW3" };
        lstGrupos = new JList<String>(opciones);
        lstGrupos.addListSelectionListener(this);
        contentPane.add(lstGrupos, BorderLayout.WEST);
       
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        // TODO Auto-generated method stub
        String seleccion = (String) this.lstGrupos.getSelectedValue();
        this.lblTexto.setText(seleccion);
       }
    }