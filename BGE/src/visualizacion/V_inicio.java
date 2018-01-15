package visualizacion;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import base_de_datos.Sonido;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.*;

public class V_inicio extends Thread {

	Sonido sonido = new Sonido();
	private JFrame frame;
	public Icon fondo;
	private JTextField textField;
	private JPasswordField passwordField;

	public static void main(String[] args) throws IOException {

		Sonido sonido = new Sonido();

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					V_inicio window = new V_inicio();
					window.frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

	public V_inicio() throws IOException {
		sonido.start();
		initialize();
		run();

	}

	private void initialize() throws IOException {

		frame = new JFrame();
		frame.setBounds(0, 0, 2000, 2000);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		// JInicio
		JLabel lblNombreDeUsuario = new JLabel("Nombre de usuario:");
		lblNombreDeUsuario.setBounds(182, 381, 432, 78);
		lblNombreDeUsuario.setForeground(Color.WHITE);
		lblNombreDeUsuario.setFont(new Font("Magneto", Font.BOLD | Font.ITALIC, 40));
		frame.getContentPane().add(lblNombreDeUsuario);

		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(343, 457, 271, 78);
		lblContrasea.setForeground(Color.WHITE);
		lblContrasea.setFont(new Font("Magneto", Font.BOLD | Font.ITALIC, 40));
		frame.getContentPane().add(lblContrasea);

		textField = new JTextField();
		textField.setBounds(624, 398, 330, 43);
		textField.setForeground(Color.BLACK);
		textField.setFont(new Font("Magneto", Font.BOLD | Font.ITALIC, 40));
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(406, 568, 248, 43);
		btnRegistrarse.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				V_registrarse n = new V_registrarse(sonido);
				n.setVisible(true);
				frame.dispose();

			}
		});
		btnRegistrarse.setBackground(Color.BLACK);
		btnRegistrarse.setForeground(Color.WHITE);
		btnRegistrarse.setFont(new Font("Magneto", Font.BOLD | Font.ITALIC, 30));
		frame.getContentPane().add(btnRegistrarse);

		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.setBounds(675, 568, 248, 43);
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				V_menu n = new V_menu(sonido);
				n.setVisible(true);

				frame.dispose();
			}
		});
		btnIniciar.setForeground(Color.WHITE);
		btnIniciar.setFont(new Font("Magneto", Font.BOLD | Font.ITALIC, 40));
		btnIniciar.setBackground(Color.BLACK);
		frame.getContentPane().add(btnIniciar);

		passwordField = new JPasswordField();
		passwordField.setForeground(Color.BLACK);
		passwordField.setFont(new Font("Microsoft JhengHei", Font.BOLD | Font.ITALIC, 40));
		passwordField.setBounds(624, 474, 330, 43);
		frame.getContentPane().add(passwordField);

		JLabel lblBge = new JLabel("Saik\u014D no g\u0113mu");
		lblBge.setBounds(376, 122, 721, 181);
		lblBge.setForeground(new Color(255, 165, 0));
		lblBge.setFont(new Font("Wide Latin", Font.BOLD | Font.ITALIC, 99));
		frame.getContentPane().add(lblBge);

		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sonido.stop();
				frame.dispose();

			}
		});
		btnSalir.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 30));
		btnSalir.setBounds(1136, 681, 114, 36);
		frame.getContentPane().add(btnSalir);

		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setBounds(0, 0, 1300, 856);
		lblNewLabel.setFont(new Font("Gill Sans MT Ext Condensed Bold", Font.BOLD | Font.ITALIC, 99));
		lblNewLabel.setIcon(new ImageIcon("fondo.gif"));
		frame.getContentPane().add(lblNewLabel);

	}
}
