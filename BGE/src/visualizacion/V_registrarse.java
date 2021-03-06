package visualizacion;

import java.awt.EventQueue;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Rectangle;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import base_de_datos.BaseDeDatos;
import base_de_datos.Sonido;

public class V_registrarse extends JFrame {
	private final JButton btnJugar = new JButton("Jugar con este usuario");
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	Sonido sonido;

	BaseDeDatos o = new BaseDeDatos();
	
	public V_registrarse(Sonido sonido) {
	
		this.sonido = sonido;
		JFrame frame = this;
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	    frame.setUndecorated(true);
		frame.getContentPane().setBounds(0, 0, 20300, 20300);
		getContentPane().setLayout(null);
		btnJugar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
			}
		});
		btnJugar.setBackground(new Color(255, 140, 0));
		btnJugar.setForeground(new Color(255, 255, 255));
		btnJugar.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
			btnJugar.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 43));
			}
			public void mouseExited(MouseEvent e) {
			btnJugar.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 40));
			}
		});
		btnJugar.setBounds(112, 652, 530, 50);
		
		
		
		btnJugar.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 40));
		getContentPane().add(btnJugar);
		
		JLabel lblRegistrarse = new JLabel("Registrarse");
		lblRegistrarse.setBounds(266, 73, 429, 97);
		lblRegistrarse.setForeground(new Color(255, 140, 0));
		lblRegistrarse.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 72));
		frame.getContentPane().add(lblRegistrarse);
		
		JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario:");
		lblNombreDeUsuario.setForeground(new Color(255, 140, 0));
		lblNombreDeUsuario.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 40));
		lblNombreDeUsuario.setBounds(62, 244, 412, 50);
		getContentPane().add(lblNombreDeUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:\r\n");
		lblContrasea.setForeground(new Color(255, 140, 0));
		lblContrasea.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 40));
		lblContrasea.setBounds(62, 342, 255, 50);
		getContentPane().add(lblContrasea);
		
		JLabel lblRepetirContrasea = new JLabel("Repetir contrase\u00F1a:");
		lblRepetirContrasea.setForeground(new Color(255, 140, 0));
		lblRepetirContrasea.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 40));
		lblRepetirContrasea.setBounds(62, 417, 412, 50);
		getContentPane().add(lblRepetirContrasea);
		
		textField = new JTextField();
		textField.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 40));
		textField.setBounds(472, 244, 372, 50);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 40));
		textField_1.setColumns(10);
		textField_1.setBounds(472, 342, 372, 50);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 40));
		textField_2.setColumns(10);
		textField_2.setBounds(472, 417, 372, 50);
		getContentPane().add(textField_2);
		
		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				o.crearTablas();
			} catch (SQLException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
			}
				if(textField_1.getText().equals(textField_2.getText())) {
				try {
					o.anyadirUsuario(textField.getText(), textField_2.getText());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				}else {
					System.out.println("Error");
				}
			}
		});
		btnRegistrarse.setForeground(Color.WHITE);
		btnRegistrarse.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 40));
		btnRegistrarse.setBackground(new Color(255, 140, 0));
		btnRegistrarse.setBounds(557, 501, 287, 55);
		btnRegistrarse.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
			btnRegistrarse.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 43));
			}
			public void mouseExited(MouseEvent e) {
			btnRegistrarse.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 40));
			}
		});
		getContentPane().add(btnRegistrarse);
		
		JButton btnMostrarContrasea = new JButton("Mostrar contrase\u00F1a");
		btnMostrarContrasea.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnMostrarContrasea.setForeground(Color.WHITE);
		btnMostrarContrasea.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 10));
		btnMostrarContrasea.setBackground(new Color(255, 140, 0));
		btnMostrarContrasea.setBounds(313, 357, 144, 27);
		btnMostrarContrasea.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
			btnMostrarContrasea.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 11));
			}
			public void mouseExited(MouseEvent e) {
			btnMostrarContrasea.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 10));
			}
		});
		getContentPane().add(btnMostrarContrasea);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				sonido.stop();
			}
		});
		btnSalir.setBackground(new Color(255, 228, 196));
		btnSalir.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 40));
		btnSalir.setBounds(1059, 723, 144, 50);
		btnSalir.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
			btnSalir.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 45));
			}
			public void mouseExited(MouseEvent e) {
			btnSalir.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 40));
			}
		});
		getContentPane().add(btnSalir);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("3.jpg"));
		label.setBounds(-35, 0, 1324, 800);
		getContentPane().add(label);
	

		
	  
	}
}
