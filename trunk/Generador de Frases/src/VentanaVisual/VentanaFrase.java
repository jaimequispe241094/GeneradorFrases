package VentanaVisual;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Toolkit;

import javax.swing.UIManager;

@SuppressWarnings("serial")
public class VentanaFrase extends JFrame{

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaFrase frame = new VentanaFrase();
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
	public VentanaFrase() {
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaFrase.class.getResource("/imagenes/Logo_Frases_2.jpg")));
		setTitle("Frases");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400, 120, 456, 353);
		contentPane = new JPanel();
		contentPane.setFont(UIManager.getFont("TextField.font"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton volverVentanaAnterior = new JButton("Volver atras");
		volverVentanaAnterior.setIcon(new ImageIcon(VentanaFrase.class.getResource("/imagenes/bart-solo2.png")));
		volverVentanaAnterior.setFont(new Font("Segoe UI", Font.ITALIC, 12));
		volverVentanaAnterior.setBackground(Color.WHITE);
		volverVentanaAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				VentanaPrincipal.getFrame().setVisible(true);	// se regresa ala pantalla principal , sacando de escena la ventana de frases
				VentanaFrase.this.dispose();
			}
		});
		volverVentanaAnterior.setBounds(294, 277, 134, 37);
		contentPane.add(volverVentanaAnterior);
	
	}
	
	public void mostrarVentanaConFrases(TextArea texto){
		getContentPane().add(texto);
		setVisible(true);
	}
}
