package visualizacion;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import base_de_datos.Sonido;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V_opcion extends JFrame{

	private JFrame frame;
	private JPanel contentPane;

Sonido sonido;
private JTextField txtElJuegoConsiste;
private JLabel lblElJuegoConsiste;
private JLabel label_1;
private JLabel label_2;
private JLabel label_3;
private JLabel label_4;
private JButton btnSalir;
	public V_opcion(Sonido sonido) {
		this.sonido=sonido;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = this;
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	    frame.setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1205, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		lblElJuegoConsiste = new JLabel("El juego consiste en atrapar");
		lblElJuegoConsiste.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
		lblElJuegoConsiste.setBounds(222, 252, 588, 46);
		contentPane.add(lblElJuegoConsiste);
		
		label_1 = new JLabel("el kunai lo mas rapido posible,");
		label_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
		label_1.setBounds(222, 309, 606, 46);
		contentPane.add(label_1);
		
		label_2 = new JLabel("cuantos mas cunais atrapes,");
		label_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
		label_2.setBounds(222, 368, 588, 46);
		contentPane.add(label_2);
		
		label_3 = new JLabel("mas puntos optendras y estaras");
		label_3.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
		label_3.setBounds(222, 434, 655, 46);
		contentPane.add(label_3);
		
		label_4 = new JLabel("mas arriba en la clasificacion");
		label_4.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 38));
		label_4.setBounds(222, 491, 554, 46);
		contentPane.add(label_4);
		
		JButton btnMenuPrincipal = new JButton("Menu principal");
		btnMenuPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				V_menu n = new V_menu(sonido);
				n.setVisible(true);

				dispose();
			}
		});
		btnMenuPrincipal.setForeground(Color.WHITE);
		btnMenuPrincipal.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 40));
		btnMenuPrincipal.setBackground(Color.BLACK);
		btnMenuPrincipal.setBounds(860, 109, 335, 43);
		contentPane.add(btnMenuPrincipal);
		
		btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sonido.stop();
				dispose();
			}
		});
		btnSalir.setForeground(Color.WHITE);
		btnSalir.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 40));
		btnSalir.setBackground(Color.BLACK);
		btnSalir.setBounds(930, 589, 220, 43);
		contentPane.add(btnSalir);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("naruto fondo crear usuario.jpg"));
		label.setBounds(0, 0, 1307, 812);
		contentPane.add(label);
	}
}
