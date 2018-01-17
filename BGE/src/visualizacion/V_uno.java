package visualizacion;

import java.awt.Rectangle;
import javax.swing.JFrame;
import javax.swing.JLabel;

import base_de_datos.Sonido;

import javax.swing.ImageIcon;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.Color;

public class V_uno extends JFrame implements Runnable {

	private JFrame frame;
	Sonido sonido;
	private int x1 = 346;
	private int y1 = 102;
	private int x2 = 344;
	private int y2 = 731;

	public boolean juegoEnMarcha = true;
	public boolean up;
	private boolean down = false;
	private boolean left = false;
	private boolean right = false;
	private boolean w = false;
	private boolean s = false;
	private boolean a = false;
	private boolean d = false;
	private boolean b = false;
	private boolean p = false;

	private Thread hilo1;

	private final JLabel lblJugador1 = new JLabel("");
	private final JLabel lblJugador2 = new JLabel("");
	private final ArrayList<JLabel> listaPanel = new ArrayList<JLabel>();

	private final JLabel l1 = new JLabel("");
	private final JLabel l2 = new JLabel("");
	private final JLabel l3 = new JLabel("");
	private final JLabel l4 = new JLabel("");
	private final JLabel l5 = new JLabel("");
	private final JLabel l6 = new JLabel("");
	private final JLabel l7 = new JLabel("");
	private final JLabel l8 = new JLabel("");
	private final JLabel l9 = new JLabel("");
	private final JLabel l10 = new JLabel("");
	private final JLabel l11 = new JLabel("");
	private final JLabel l12 = new JLabel("");
	private final JLabel l13 = new JLabel("");
	private final JLabel l14 = new JLabel("");
	private final JLabel l15 = new JLabel("");
	private final JLabel l16 = new JLabel("");
	private final JLabel l17 = new JLabel("");
	private final JLabel l18 = new JLabel("");
	private final JLabel l19 = new JLabel("");
	private final JLabel l21 = new JLabel("");
	private final JLabel l20 = new JLabel("");
	private final JLabel l22 = new JLabel("");
	private final JLabel l23 = new JLabel("");
	private final JLabel l24 = new JLabel("");
	private final JLabel l25 = new JLabel("");
	private final JLabel l26 = new JLabel("");
	private final JLabel l27 = new JLabel("");
	private final JLabel l28 = new JLabel("");
	private final JLabel l29 = new JLabel("");
	private final JLabel l30 = new JLabel("");
	private final JLabel l31 = new JLabel("");
	private final JLabel l32 = new JLabel("");
	private final JLabel l33 = new JLabel("");
	private final JLabel l34 = new JLabel("");
	private final JLabel l35 = new JLabel("");
	private final JLabel l36 = new JLabel("");
	private final JLabel l37 = new JLabel("");

	private final JLabel labelKunai = new JLabel("");

	public V_uno(Sonido sonido) {
		this.sonido = sonido;
		initialize();
		añadirPanel();

		hilo1 = new Thread(this);
		Hilo2 hilo2 = new Hilo2();
		hilo2.start();
		hilo1.start();
		

	}

	private void initialize() {

		frame = this;
		frame.setBounds(0, 0, 1700, 1188);
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblJugador1.setIcon(new ImageIcon("C:\\Users\\Andreas Le\u00F3n\\Downloads\\corea.jpg"));
		lblJugador1.setForeground(Color.RED);
		lblJugador1.setBackground(Color.ORANGE);
		lblJugador1.setBounds(352, 106, 32, 32);
		getContentPane().add(lblJugador1);

		lblJugador2.setIcon(new ImageIcon("C:\\Users\\Andreas Le\u00F3n\\Desktop\\32 2.jpg"));
		lblJugador2.setBounds(344, 731, 32, 32);
		getContentPane().add(lblJugador2);

		l1.setBounds(290, 0, 44, 800);
		getContentPane().add(l1);

		l2.setBounds(640, 0, 350, 17);
		getContentPane().add(l2);

		l3.setBounds(290, 778, 700, 22);
		getContentPane().add(l3);

		l4.setBounds(946, 0, 44, 800);
		getContentPane().add(l4);

		l5.setBounds(290, 0, 171, 87);
		getContentPane().add(l5);

		l6.setBounds(464, 0, 174, 67);
		getContentPane().add(l6);

		l7.setBounds(682, 76, 87, 80);
		getContentPane().add(l7);

		l8.setBounds(581, 128, 104, 28);
		getContentPane().add(l8);
		l9.setBounds(855, 63, 87, 30);

		getContentPane().add(l9);
		l10.setBounds(682, 192, 171, 30);

		getContentPane().add(l10);
		l11.setBounds(682, 217, 87, 30);

		getContentPane().add(l11);
		l12.setBounds(811, 140, 87, 54);

		getContentPane().add(l12);
		l13.setBounds(420, 752, 522, 22);

		getContentPane().add(l13);
		l14.setBounds(638, 581, 87, 104);

		getContentPane().add(l14);
		l15.setBounds(377, 549, 87, 106);

		getContentPane().add(l15);
		l16.setBounds(769, 625, 85, 30);

		getContentPane().add(l16);
		l17.setBounds(638, 446, 87, 54);

		getContentPane().add(l17);
		l18.setBounds(769, 473, 85, 104);

		getContentPane().add(l18);
		l19.setBounds(725, 473, 44, 30);

		getContentPane().add(l19);
		l20.setBounds(766, 192, 44, 30);

		getContentPane().add(l20);
		l21.setBounds(330, 473, 44, 30);

		getContentPane().add(l21);
		l22.setBounds(550, 241, 44, 30);

		getContentPane().add(l22);
		l23.setBounds(330, 217, 44, 30);

		getContentPane().add(l23);
		l24.setBounds(420, 267, 44, 30);

		getContentPane().add(l24);
		l25.setBounds(898, 241, 44, 30);

		getContentPane().add(l25);
		l26.setBounds(377, 321, 44, 80);

		getContentPane().add(l26);
		l27.setBounds(550, 267, 88, 30);

		getContentPane().add(l27);
		l28.setBounds(550, 267, 88, 30);

		getContentPane().add(l28);
		l29.setBounds(420, 295, 522, 54);

		getContentPane().add(l29);
		l30.setBounds(811, 267, 125, 30);

		getContentPane().add(l30);
		l31.setBounds(509, 345, 427, 30);

		getContentPane().add(l31);
		l32.setBounds(509, 375, 85, 202);

		getContentPane().add(l32);
		l33.setBounds(333, 446, 128, 30);

		getContentPane().add(l33);
		l34.setBounds(377, 653, 261, 30);

		getContentPane().add(l34);
		l35.setBounds(509, 678, 171, 89);

		getContentPane().add(l35);
		l36.setBounds(397, 678, 104, 83);

		getContentPane().add(l36);
		l37.setBounds(330, 166, 87, 54);

		getContentPane().add(l37);
		labelKunai.setIcon(new ImageIcon("C:\\Users\\Andreas Le\u00F3n\\Downloads\\20.jpg"));

		labelKunai.setBounds(420, 142, 20, 20);
		getContentPane().add(labelKunai);
		labelKunai.setVisible(false);

		JLabel labelFondo = new JLabel("");
		labelFondo.setIcon(new ImageIcon("C:\\Users\\Andreas Le\u00F3n\\Downloads\\mapa1vs1FINAL.png"));

		labelFondo.setBounds(290, 0, 700, 800);
		frame.getContentPane().add(labelFondo);

		frame.setFocusable(true);

		frame.addKeyListener(new KeyListener() {
			public void keyTyped(KeyEvent e) {

			}

			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_UP) {

					up = true;
				}
				if (e.getKeyCode() == KeyEvent.VK_DOWN) {

					down = true;
				}
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

					right = true;
				}
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {

					left = true;
				}
				if (e.getKeyCode() == KeyEvent.VK_W) {

					w = true;
				}
				if (e.getKeyCode() == KeyEvent.VK_S) {

					s = true;
				}
				if (e.getKeyCode() == KeyEvent.VK_D) {

					d = true;
				}
				if (e.getKeyCode() == KeyEvent.VK_A) {

					a = true;
				}
				if (e.getKeyCode() == KeyEvent.VK_B) {

					b = true;

				}
				if (e.getKeyCode() == KeyEvent.VK_P) {

					p = true;

				}
				if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {

					frame.dispose();
					sonido.stop();

				}
			}

			public void keyReleased(KeyEvent e) {

				if (e.getKeyCode() == KeyEvent.VK_UP) {
					up = false;
					repaint();

				}
				if (e.getKeyCode() == KeyEvent.VK_DOWN) {

					down = false;
				}
				if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

					right = false;
				}
				if (e.getKeyCode() == KeyEvent.VK_LEFT) {

					left = false;
				}
				if (e.getKeyCode() == KeyEvent.VK_W) {

					w = false;
				}
				if (e.getKeyCode() == KeyEvent.VK_S) {

					s = false;
				}
				if (e.getKeyCode() == KeyEvent.VK_D) {

					d = false;
				}
				if (e.getKeyCode() == KeyEvent.VK_A) {

					a = false;
				}
				if (e.getKeyCode() == KeyEvent.VK_B) {

					b = false;

				}
				if (e.getKeyCode() == KeyEvent.VK_P) {

					p = false;

				}
			}
		});

	}

	public void añadirPanel() {
		listaPanel.add(l1);
		listaPanel.add(l2);
		listaPanel.add(l3);
		listaPanel.add(l4);
		listaPanel.add(l5);
		listaPanel.add(l6);
		listaPanel.add(l7);
		listaPanel.add(l8);
		listaPanel.add(l9);
		listaPanel.add(l10);
		listaPanel.add(l11);
		listaPanel.add(l12);
		listaPanel.add(l13);
		listaPanel.add(l14);
		listaPanel.add(l15);
		listaPanel.add(l16);
		listaPanel.add(l17);
		listaPanel.add(l18);
		listaPanel.add(l19);
		listaPanel.add(l20);
		listaPanel.add(l21);
		listaPanel.add(l22);
		listaPanel.add(l23);
		listaPanel.add(l24);
		listaPanel.add(l25);
		listaPanel.add(l26);
		listaPanel.add(l27);
		listaPanel.add(l28);
		listaPanel.add(l29);
		listaPanel.add(l30);
		listaPanel.add(l31);
		listaPanel.add(l32);
		listaPanel.add(l33);
		listaPanel.add(l34);
		listaPanel.add(l35);
		listaPanel.add(l36);
		listaPanel.add(l37);

	}

	public void ataqueUP1() throws InterruptedException {

		boolean choca = false;
		labelKunai.setVisible(true);

		for (int i = 0; i < listaPanel.size(); i++) {

			Rectangle result = new Rectangle(x1, y1, 20, 20);
			int xP = listaPanel.get(i).getX();
			int yP = listaPanel.get(i).getY();
			int hP = listaPanel.get(i).getHeight();
			int wP = listaPanel.get(i).getWidth();

			if (result.intersects(xP, yP, wP, hP + 5) == true) {
				y1 = yP + hP;
				labelKunai.setBounds(x1, y1, 20, 20);
				choca = true;
				i = 1000;

			}

		}
		if (choca == false) {

			y1 = y1 - 5;
			labelKunai.setBounds(x1, y1, 32, 32);

		}

	}

	public void comprobarChoqueUP1() {

		boolean choca = false;

		for (int i = 0; i < listaPanel.size(); i++) {

			Rectangle result = new Rectangle(x1, y1, 32, 32);
			int xP = listaPanel.get(i).getX();
			int yP = listaPanel.get(i).getY();
			int hP = listaPanel.get(i).getHeight();
			int wP = listaPanel.get(i).getWidth();

			if (result.intersects(xP, yP, wP, hP + 10) == true) {
				y1 = yP + hP;
				lblJugador1.setBounds(x1, y1, 32, 32);
				choca = true;
				i = 1000;

			}

		}
		if (choca == false) {
			y1 = y1 - 10;
			lblJugador1.setBounds(x1, y1, 32, 32);

		}
		repaint();
	}

	public void comprobarChoqueDOWN1() {

		boolean choca = false;

		for (int i = 0; i < listaPanel.size(); i++) {

			Rectangle result = new Rectangle(x1, y1, 32, 32);
			int xP = listaPanel.get(i).getX();
			int yP = listaPanel.get(i).getY();
			int hP = listaPanel.get(i).getHeight();
			int wP = listaPanel.get(i).getWidth();

			if (result.intersects(xP, yP - 10, wP, hP + 10) == true) {
				y1 = yP - 1 - 32;
				lblJugador1.setBounds(x1, y1, 32, 32);
				choca = true;
				i = 1000;

			}

		}

		if (choca == false) {
			y1 = y1 + 10;
			lblJugador1.setBounds(x1, y1, 32, 32);

		}
		repaint();
	}

	public void comprobarChoqueLEFT1() {

		boolean choca = false;

		for (int i = 0; i < listaPanel.size(); i++) {

			Rectangle result = new Rectangle(x1, y1, 32, 32);
			int xP = listaPanel.get(i).getX();
			int yP = listaPanel.get(i).getY();
			int hP = listaPanel.get(i).getHeight();
			int wP = listaPanel.get(i).getWidth();

			if (result.intersects(xP, yP, wP + 10, hP) == true) {
				x1 = xP + wP + 1;
				lblJugador1.setBounds(x1, y1, 32, 32);
				choca = true;
				i = 1000;

			}

		}

		if (choca == false) {
			x1 = x1 - 10;
			lblJugador1.setBounds(x1, y1, 32, 32);

		}
		repaint();
	}

	public void comprobarChoqueRIGHT1() {

		boolean choca = false;

		for (int i = 0; i < listaPanel.size(); i++) {

			Rectangle result = new Rectangle(x1, y1, 32, 32);
			int xP = listaPanel.get(i).getX();
			int yP = listaPanel.get(i).getY();
			int hP = listaPanel.get(i).getHeight();
			int wP = listaPanel.get(i).getWidth();

			if (result.intersects(xP - 10, yP, wP + 10, hP) == true) {
				x1 = xP - 1 - 32;
				lblJugador1.setBounds(x1, y1, 32, 32);
				choca = true;
				i = 1000;

			}

		}

		if (choca == false) {
			x1 = x1 + 10;
			lblJugador1.setBounds(x1, y1, 32, 32);

		}
		repaint();
	}

	public void comprobarChoqueUP2() {

		boolean choca = false;

		for (int i = 0; i < listaPanel.size(); i++) {

			Rectangle result = new Rectangle(x2, y2, 32, 32);
			int xP = listaPanel.get(i).getX();
			int yP = listaPanel.get(i).getY();
			int hP = listaPanel.get(i).getHeight();
			int wP = listaPanel.get(i).getWidth();

			if (result.intersects(xP, yP, wP, hP + 10) == true) {
				y2 = yP + hP;
				lblJugador2.setBounds(x2, y2, 32, 32);
				choca = true;
				i = 1000;

			}

		}
		if (choca == false) {
			y2 = y2 - 10;
			lblJugador2.setBounds(x2, y2, 32, 32);

		}
		repaint();
	}

	public void comprobarChoqueDOWN2() {

		boolean choca = false;

		for (int i = 0; i < listaPanel.size(); i++) {

			Rectangle result = new Rectangle(x2, y2, 32, 32);
			int xP = listaPanel.get(i).getX();
			int yP = listaPanel.get(i).getY();
			int hP = listaPanel.get(i).getHeight();
			int wP = listaPanel.get(i).getWidth();

			if (result.intersects(xP, yP - 10, wP, hP + 10) == true) {
				y2 = yP - 1 - 32;
				lblJugador2.setBounds(x2, y2, 32, 32);
				choca = true;
				i = 1000;

			}

		}

		if (choca == false) {
			y2 = y2 + 10;
			lblJugador2.setBounds(x2, y2, 32, 32);

		}
		repaint();
	}

	public void comprobarChoqueLEFT2() {

		boolean choca = false;

		for (int i = 0; i < listaPanel.size(); i++) {

			Rectangle result = new Rectangle(x2, y2, 32, 32);
			int xP = listaPanel.get(i).getX();
			int yP = listaPanel.get(i).getY();
			int hP = listaPanel.get(i).getHeight();
			int wP = listaPanel.get(i).getWidth();

			if (result.intersects(xP, yP, wP + 10, hP) == true) {
				x2 = xP + wP + 1;
				lblJugador2.setBounds(x2, y2, 32, 32);
				choca = true;
				i = 1000;

			}

		}

		if (choca == false) {
			x2 = x2 - 10;
			lblJugador2.setBounds(x2, y2, 32, 32);

		}
		repaint();
	}

	public void comprobarChoqueRIGHT2() {

		boolean choca = false;

		for (int i = 0; i < listaPanel.size(); i++) {

			Rectangle result = new Rectangle(x2, y2, 32, 32);
			int xP = listaPanel.get(i).getX();
			int yP = listaPanel.get(i).getY();
			int hP = listaPanel.get(i).getHeight();
			int wP = listaPanel.get(i).getWidth();

			if (result.intersects(xP - 10, yP, wP + 10, hP) == true) {
				x2 = xP - 1 - 32;
				lblJugador2.setBounds(x2, y2, 32, 32);
				choca = true;
				i = 1000;

			}

		}

		if (choca == false) {
			x2 = x2 + 10;
			lblJugador2.setBounds(x2, y2, 32, 32);

		}
		repaint();
	}

	public boolean devuelveW() {
		return w;
	}
	public void run() {

		while (juegoEnMarcha == true) {
			if (up == true) {
				comprobarChoqueUP1();

			} else if (down == true) {
				comprobarChoqueDOWN1();
			} else if (right == true) {
				comprobarChoqueRIGHT1();
			} else if (left == true) {
				comprobarChoqueLEFT1();
			}

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}


class Hilo2 extends Thread {
	public void run(int i) {

		V_uno u = new V_uno(sonido);
		while (juegoEnMarcha == true) {
			if (u.devuelveW() == true) {
				comprobarChoqueUP2();

			} else if (u.down == true) {
				comprobarChoqueDOWN1();
			} else if (right == true) {
				comprobarChoqueRIGHT1();
			} else if (left == true) {
				comprobarChoqueLEFT1();
			}

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	}
}
