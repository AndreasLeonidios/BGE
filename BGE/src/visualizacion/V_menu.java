package visualizacion;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import base_de_datos.Sonido;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class V_menu extends JFrame {

	private JPanel contentPane;
	Sonido sonido;

	public V_menu(Sonido sonido) {
		this.sonido = sonido;
		JFrame frame =this;
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	    frame.setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1205, 800);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton button = new JButton("Salir");
		button.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
			button.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 50));
			}
			public void mouseExited(MouseEvent e) {
			button.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 40));
			}
		});
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				sonido.stop();
			}
		});
		button.setForeground(new Color(255, 255, 255));
		button.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 40));
		button.setContentAreaFilled(false);
		button.setBounds(1065, 705, 168, 61);
		button.setBorderPainted(false);
		contentPane.add(button);
		
		JLabel lblMenu = new JLabel("Saik\u014D no g\u0113mu");
		lblMenu.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 60));
		lblMenu.setBounds(146, 54, 476, 70);
		contentPane.add(lblMenu);
		
		JButton btnJugarOnline = new JButton("Jugar online");
		btnJugarOnline.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
			btnJugarOnline.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 45));
			}
			public void mouseExited(MouseEvent e) {
			btnJugarOnline.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 40));
			}
		});
		btnJugarOnline.setBackground(new Color(255, 250, 250));
		btnJugarOnline.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 40));
		btnJugarOnline.setBounds(196, 177, 330, 79);
		btnJugarOnline.setContentAreaFilled(false);
		btnJugarOnline.setBorderPainted(false);

		contentPane.add(btnJugarOnline);
		
		JButton btnVs = new JButton("1 vs 1 offline");
		btnVs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				V_uno n = new V_uno(sonido);
				n.setVisible(true);
				dispose();
			}
		});
		btnVs.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
			btnVs.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 45));
			}
			public void mouseExited(MouseEvent e) {
			btnVs.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 40));
			}
		});
		btnVs.setBackground(new Color(255, 250, 250));
		btnVs.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 40));
		btnVs.setBounds(196, 266, 330, 70);
		btnVs.setContentAreaFilled(false);
		btnVs.setBorderPainted(false);
		contentPane.add(btnVs);
		
		JButton btnOpciones = new JButton("Opciones");
		btnOpciones.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
			btnOpciones.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 45));
			}
			public void mouseExited(MouseEvent e) {
			btnOpciones.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 40));
			}
		});
		btnOpciones.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 40));
		btnOpciones.setBackground(new Color(255, 250, 250));
		btnOpciones.setBounds(196, 435, 330, 68);
		btnOpciones.setContentAreaFilled(false);
		btnOpciones.setBorderPainted(false);
		contentPane.add(btnOpciones);
		
		JButton btnHeroes = new JButton("Heroes");
		btnHeroes.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
			btnHeroes.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 45));
			}
			public void mouseExited(MouseEvent e) {
			btnHeroes.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 40));
			}
		});
		btnHeroes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				V_heroes n = new V_heroes();
				n.setVisible(true);
				dispose();
			}
		});
		btnHeroes.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 40));
		btnHeroes.setBackground(new Color(255, 250, 250));
		btnHeroes.setBounds(196, 347, 330, 77);
		btnHeroes.setContentAreaFilled(false);
		btnHeroes.setBorderPainted(false);
		contentPane.add(btnHeroes);
		
		JButton btnCambiarUsuario = new JButton("Cambiar usuario");
		btnCambiarUsuario.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
			btnCambiarUsuario.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 35));
			}
			public void mouseExited(MouseEvent e) {
			btnCambiarUsuario.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 30));
			}
		});
		btnCambiarUsuario.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 30));
		btnCambiarUsuario.setBackground(new Color(255, 250, 250));
		btnCambiarUsuario.setBounds(188, 515, 353, 68);
		btnCambiarUsuario.setContentAreaFilled(false);
		btnCambiarUsuario.setBorderPainted(false);
		contentPane.add(btnCambiarUsuario);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon("C:\\Users\\Andreas Le\u00F3n\\Downloads\\narutoMenu.jpg"));
		label.setBounds(0, 0, 1307, 812);
		contentPane.add(label);
	}
}
