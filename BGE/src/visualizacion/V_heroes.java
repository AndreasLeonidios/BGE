package visualizacion;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

import base_de_datos.BaseDeDatos;
import base_de_datos.Sonido;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class V_heroes extends JFrame{

	private JPanel contentPane;
	private JTextField textField;
	Sonido sonido;
	BaseDeDatos o = new BaseDeDatos();

	public V_heroes(Sonido sonido) {
		sonido=this.sonido;
		initialize();
	}

	
	private void initialize() {
		JFrame frame = this;
		getContentPane().setLayout(null);
		
		JLabel lblHeroes = new JLabel("Heroes");
		lblHeroes.setForeground(new Color(255, 255, 255));
		lblHeroes.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 70));
		lblHeroes.setBounds(325, 56, 266, 88);
		getContentPane().add(lblHeroes);
		
		JButton btnMostrarHeroes = new JButton("Mostrar Heroes");
		btnMostrarHeroes.setForeground(Color.WHITE);
		btnMostrarHeroes.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 40));
		btnMostrarHeroes.setContentAreaFilled(false);
		btnMostrarHeroes.setBorderPainted(false);
		btnMostrarHeroes.setBackground(new Color(255, 250, 250));
		btnMostrarHeroes.setBounds(61, 155, 403, 79);
		getContentPane().add(btnMostrarHeroes);
		
		JButton btnEliminarHeroes = new JButton("Eliminar Heroes");
		btnEliminarHeroes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

			
			
			
			}
		});
		btnEliminarHeroes.setForeground(Color.WHITE);
		btnEliminarHeroes.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 40));
		btnEliminarHeroes.setContentAreaFilled(false);
		btnEliminarHeroes.setBorderPainted(false);
		btnEliminarHeroes.setBackground(new Color(255, 250, 250));
		btnEliminarHeroes.setBounds(770, 487, 403, 79);
		getContentPane().add(btnEliminarHeroes);
		
		textField = new JTextField();
		textField.setBounds(61, 245, 519, 506);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnMenuPrincipal = new JButton("Menu principal");
		btnMenuPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				V_menu n = new V_menu(sonido);
				n.setVisible(true);

				dispose();
			}
		});
		btnMenuPrincipal.setForeground(Color.WHITE);
		btnMenuPrincipal.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 40));
		btnMenuPrincipal.setContentAreaFilled(false);
		btnMenuPrincipal.setBorderPainted(false);
		btnMenuPrincipal.setBackground(new Color(255, 250, 250));
		btnMenuPrincipal.setBounds(770, 608, 403, 79);
		getContentPane().add(btnMenuPrincipal);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Andreas Le\u00F3n\\Downloads\\crearHeroe.png"));
		label_1.setBounds(0, 0, 1305, 913);
		getContentPane().add(label_1);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	    frame.setUndecorated(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
