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

public class V_heroes extends JFrame{

	private JPanel contentPane;
	private JTextField textField;

	public V_heroes() {
		initialize();
	}

	
	private void initialize() {
		JFrame frame = this;
		getContentPane().setLayout(null);
		
		JLabel lblHeroes = new JLabel("Heroes");
		lblHeroes.setForeground(new Color(255, 255, 255));
		lblHeroes.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 60));
		lblHeroes.setBounds(138, 99, 239, 61);
		getContentPane().add(lblHeroes);
		
		JLabel label_1 = new JLabel("");
		label_1.setIcon(new ImageIcon("C:\\Users\\Andreas Le\u00F3n\\Downloads\\crearHeroe.png"));
		label_1.setBounds(0, 0, 1305, 913);
		getContentPane().add(label_1);
		
		textField = new JTextField();
		textField.setBounds(103, 278, 86, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	    frame.setUndecorated(true);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
