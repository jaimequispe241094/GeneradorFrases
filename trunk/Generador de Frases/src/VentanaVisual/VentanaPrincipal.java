package VentanaVisual;

import java.awt.EventQueue;

import javax.sound.sampled.Clip;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.UnsupportedLookAndFeelException;

import java.awt.FocusTraversalPolicy;
import java.awt.Font;
import java.awt.Color;
import java.awt.TextArea;
import java.awt.Component;

import javax.swing.Box;
import javax.swing.JPopupMenu;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;

import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowStateListener;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import ComposicionDeFrase.Frase;

import java.awt.Dimension;
import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JFrame;

@SuppressWarnings({ "unused", "serial" })
public class VentanaPrincipal extends JFrame {

	private static JFrame frmPrograma;
	private Frase frase;
	private VentanaFrase ventanaFrase = new VentanaFrase();
	private JButton botonHistorial;
	private JButton botonVerFrase;
	private JComboBox<String> cantidadFrases;
	private JComboBox<String> ListaTemas;
	private Sonido elReproductor = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			@SuppressWarnings("static-access")
			public void run() {
				try {
					VentanaPrincipal window = new VentanaPrincipal();
					window.frmPrograma.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public VentanaPrincipal() {
		JFrame.setDefaultLookAndFeelDecorated(true);
		JDialog.setDefaultLookAndFeelDecorated(true);
		try 
		{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} 
		catch (ClassNotFoundException | InstantiationException| IllegalAccessException | UnsupportedLookAndFeelException e1)
		{
			e1.printStackTrace();
		}
		
		initialize();
		
		try 
		{	
			reproducirMusicaDeFondo();
		} 
		
		catch (Exception e) 
		{		
			e.printStackTrace();
		}

	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void reproducirMusicaDeFondo() throws Exception {

		this.getContentPane().setLayout(null);
		this.setSize(new Dimension(400, 300));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		elReproductor = new Sonido("intro.mp3");
		elReproductor.start();
	}

	private void initialize() {

		frmPrograma = new JFrame();
		frmPrograma.setResizable(false);
		frmPrograma.addWindowStateListener(new WindowStateListener() {
			public void windowStateChanged(WindowEvent arg0) {
			}
		});
		frmPrograma.getContentPane().setBackground(new Color(102, 153, 204));
		frmPrograma.setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/imagenes/pizarra de bar.jpg")));
		frmPrograma.getContentPane().setFont(new Font("GeoSlab703 Md BT", Font.ITALIC, 19));
		frmPrograma.setBackground(Color.BLUE);
		frmPrograma.setForeground(new Color(255, 0, 0));
		frmPrograma.setTitle("Generating Sentences");
		frmPrograma.setFont(new Font("SimSun", Font.ITALIC, 12));
		frmPrograma.getContentPane().setForeground(Color.WHITE);
		frmPrograma.setBounds(405, 160, 439, 273);
		frmPrograma.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPrograma.getContentPane().setLayout(null);

		Component glue = Box.createGlue();
		glue.setBounds(115, 151, 97, -19);
		frmPrograma.getContentPane().add(glue);

		final TextArea campoEscritura = new TextArea();
		campoEscritura.setEditable(false);
		campoEscritura.setFont(new Font("Arno Pro Smbd Caption", Font.BOLD | Font.ITALIC, 17));
		campoEscritura.setForeground(new Color(255, 255, 255));
		campoEscritura.setBackground(new Color(0, 153, 0));
		campoEscritura.setBounds(0, 0, 450, 338);

		JPanel panel = new JPanel();
		panel.setBackground(new Color(30, 144, 255));
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 4, true));
		panel.setBounds(10, 0, 414, 236);
		frmPrograma.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblGeneradorDeFrases = new JLabel("Generador de Frases");
		lblGeneradorDeFrases.setBounds(101, 11, 224, 43);
		panel.add(lblGeneradorDeFrases);
		lblGeneradorDeFrases.setForeground(Color.WHITE);
		lblGeneradorDeFrases.setFont(new Font("Segoe Print", Font.ITALIC, 20));
		
		ListaTemas = new JComboBox<String>();
		ListaTemas.setBounds(209, 67, 139, 26);
		panel.add(ListaTemas);
		ListaTemas.setFont(new Font("Georgia", Font.ITALIC, 11));
		ListaTemas.setForeground(Color.BLACK);
		ListaTemas.setModel(new DefaultComboBoxModel<String>(new String[] {"Amor", "Deportes", "Animales", "Musica", "Tecnologia" }));

		JLabel lblNewLabel = new JLabel("Seleccionar tema");
		lblNewLabel.setBounds(74, 70, 106, 20);
		panel.add(lblNewLabel);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Georgia", Font.ITALIC, 11));
		ListaTemas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {}
		});
		
		JLabel lblCantidadDeFrases = new JLabel("Cantidad de frases");
		lblCantidadDeFrases.setBounds(74, 121, 106, 24);
		panel.add(lblCantidadDeFrases);
		lblCantidadDeFrases.setForeground(Color.WHITE);
		lblCantidadDeFrases.setBackground(Color.WHITE);
		lblCantidadDeFrases.setFont(new Font("Georgia", Font.ITALIC, 11));
		
		cantidadFrases = new JComboBox<String>();
		cantidadFrases.setBounds(209, 120, 136, 27);
		panel.add(cantidadFrases);
		cantidadFrases.setForeground(Color.BLACK);
		cantidadFrases.setModel(new DefaultComboBoxModel<String>(new String[] {
				"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12","13", "14", "15", "16", "17", "18", "19", "20", "21", "22",
				"23", "24", "25", "26", "27", "28", "29", "30", "31", "32","33", "34", "35", "36", "37", "38", "39", "40", "41", "42",
				"43", "44", "45", "46", "47", "48", "49", "50", "51", "52","53", "54", "55", "56", "57", "58", "59", "60", "61", "62",
				"63", "64", "65", "66", "67", "68", "69", "70", "71", "72","73", "74", "75", "76", "77", "78", "79", "80", "81", "82",
				"83", "84", "85", "86", "87", "88", "89", "90", "91", "92","93", "94", "95", "96", "97", "98", "99", "100" }));

		botonVerFrase = new JButton("Ver Frases");
		botonVerFrase.setFont(new Font("Times New Roman", Font.ITALIC, 17));
		botonVerFrase.setBounds(74, 176, 125, 34);
		panel.add(botonVerFrase);
		botonVerFrase.setForeground(new Color(0, 0, 255));

		botonVerFrase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				campoEscritura.setText("");
				String nuevaFrase = "";	
				String auxiliar = campoEscritura.getText();
				String temaSeleccionado = (String) ListaTemas.getSelectedItem();
				int numeroDeFrases = Integer.parseInt((String) cantidadFrases.getSelectedItem());
				frase = new Frase(temaSeleccionado);

				for (int i = 0; i < numeroDeFrases; i++) {
					nuevaFrase = frase.getFrase();
					auxiliar = auxiliar + "\n" + nuevaFrase;			// en este String se van concatenando la cantidad de frases pedidas
					frase.guardarFrase(nuevaFrase);
				}
				
				campoEscritura.setText(auxiliar);
				ventanaFrase.mostrarVentanaConFrases(campoEscritura);
				quitarPantallaPrincipal();
			}
		});

		botonHistorial = new JButton("Historial");
		botonHistorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frase = new Frase("");	
				campoEscritura.setText(frase.historialDeFrases() + "");
				ventanaFrase.mostrarVentanaConFrases(campoEscritura);
				quitarPantallaPrincipal();
				
			}
		});
		botonHistorial.setForeground(Color.BLUE);
		botonHistorial.setFont(new Font("Times New Roman", Font.ITALIC, 17));
		botonHistorial.setBounds(220, 176, 125, 34);
		panel.add(botonHistorial);

	}

	@SuppressWarnings("static-access")
	public void quitarPantallaPrincipal(){
		VentanaPrincipal.this.frmPrograma.dispose();
	}
	
	public static JFrame getFrame(){
		return frmPrograma;
	}
	
	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}

}