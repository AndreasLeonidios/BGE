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

	private int imgup=0;
	public boolean juegoEnMarcha = true;
	public boolean funciona = true;
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

	SegundoHilo pq = new SegundoHilo(funciona);
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

		generarManzana();
		 hilo1 = new Thread(this);
		 hilo1.start();
		 

	}

	private void initialize() {

		frame = this;
		frame.setBounds(0, 0, 1700, 1188);
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		lblJugador1.setIcon(new ImageIcon("naruto_down1s.png"));
		lblJugador1.setForeground(Color.RED);
		lblJugador1.setBackground(Color.ORANGE);
		lblJugador1.setBounds(352, 106, 32, 32);
		getContentPane().add(lblJugador1);

		

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
		labelKunai.setIcon(new ImageIcon("kunai.gif"));

		
		getContentPane().add(labelKunai);
		labelKunai.setVisible(true);

		JLabel labelFondo = new JLabel("");
		labelFondo.setIcon(new ImageIcon("mapa1vs1FINAL.png"));

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
		isListaPanel().add(l1);
		isListaPanel().add(l2);
		isListaPanel().add(l3);
		isListaPanel().add(l4);
		isListaPanel().add(l5);
		isListaPanel().add(l6);
		isListaPanel().add(l7);
		isListaPanel().add(l8);
		isListaPanel().add(l9);
		isListaPanel().add(l10);
		isListaPanel().add(l11);
		isListaPanel().add(l12);
		isListaPanel().add(l13);
		isListaPanel().add(l14);
		isListaPanel().add(l15);
		isListaPanel().add(l16);
		isListaPanel().add(l17);
		isListaPanel().add(l18);
		isListaPanel().add(l19);
		isListaPanel().add(l20);
		isListaPanel().add(l21);
		isListaPanel().add(l22);
		isListaPanel().add(l23);
		isListaPanel().add(l24);
		isListaPanel().add(l25);
		isListaPanel().add(l26);
		isListaPanel().add(l27);
		isListaPanel().add(l28);
		isListaPanel().add(l29);
		isListaPanel().add(l30);
		isListaPanel().add(l31);
		isListaPanel().add(l32);
		isListaPanel().add(l33);
		isListaPanel().add(l34);
		isListaPanel().add(l35);
		isListaPanel().add(l36);
		isListaPanel().add(l37);

	}

	public void ataqueUP1() throws InterruptedException {

		boolean choca = false;
		labelKunai.setVisible(true);

		for (int i = 0; i < isListaPanel().size(); i++) {

			Rectangle result = new Rectangle(x1, y1, 20, 20);
			int xP = isListaPanel().get(i).getX();
			int yP = isListaPanel().get(i).getY();
			int hP = isListaPanel().get(i).getHeight();
			int wP = isListaPanel().get(i).getWidth();

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

		for (int i = 0; i < isListaPanel().size(); i++) {

			Rectangle result = new Rectangle(x1, y1, 32, 32);
			int xP = isListaPanel().get(i).getX();
			int yP = isListaPanel().get(i).getY();
			int hP = isListaPanel().get(i).getHeight();
			int wP = isListaPanel().get(i).getWidth();

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
		if( imgup>=0 && imgup<3) {
			imgup++;
			lblJugador1.setIcon(new ImageIcon("naruto_up1s.png"));
			repaint();
		}
		else if( imgup>=3 && imgup<6) {
			imgup++;
			lblJugador1.setIcon(new ImageIcon("naruto_up2s.png"));
		}
		
		else if( imgup>=6 && imgup<9) {
			imgup++;
			lblJugador1.setIcon(new ImageIcon("naruto_up1s.png"));
			repaint();
		}
		else if( imgup>=9) {
			imgup=0;
			lblJugador1.setIcon(new ImageIcon("naruto_up3s.png"));
			repaint();
		}
		Rectangle result = new Rectangle(x1, y1, 32, 32);
		if(result.intersects(labelKunai.getX(), labelKunai.getY(), 20, 20)) {
			generarManzana();
		}
		repaint();

		
	}

	public void comprobarChoqueDOWN1() {

		boolean choca = false;

		for (int i = 0; i < isListaPanel().size(); i++) {

			Rectangle result = new Rectangle(x1, y1, 32, 32);
			int xP = isListaPanel().get(i).getX();
			int yP = isListaPanel().get(i).getY();
			int hP = isListaPanel().get(i).getHeight();
			int wP = isListaPanel().get(i).getWidth();

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
		if( imgup>=0 && imgup<3) {
			imgup++;
			lblJugador1.setIcon(new ImageIcon("naruto_down1s.png"));
			repaint();
		}
		else if( imgup>=3 && imgup<6) {
			imgup++;
			lblJugador1.setIcon(new ImageIcon("naruto_down2s.png"));
		}
		
		else if( imgup>=6 && imgup<9) {
			imgup++;
			lblJugador1.setIcon(new ImageIcon("naruto_down1s.png"));
			repaint();
		}
		else if( imgup>=9) {
			imgup=0;
			lblJugador1.setIcon(new ImageIcon("naruto_down3s.png"));
			repaint();
		}
		repaint();
	}

	public void comprobarChoqueLEFT1() {

		boolean choca = false;

		for (int i = 0; i < isListaPanel().size(); i++) {

			Rectangle result = new Rectangle(x1, y1, 32, 32);
			int xP = isListaPanel().get(i).getX();
			int yP = isListaPanel().get(i).getY();
			int hP = isListaPanel().get(i).getHeight();
			int wP = isListaPanel().get(i).getWidth();

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
		if( imgup>=0 && imgup<3) {
			imgup++;
			lblJugador1.setIcon(new ImageIcon("naruto_left1s.png"));
			repaint();
		}
		else if( imgup>=3 && imgup<6) {
			imgup++;
			lblJugador1.setIcon(new ImageIcon("naruto_left2s.png"));
		}
		
		else if( imgup>=6 && imgup<9) {
			imgup++;
			lblJugador1.setIcon(new ImageIcon("naruto_left1s.png"));
			repaint();
		}
		else if( imgup>=9) {
			imgup=0;
			lblJugador1.setIcon(new ImageIcon("naruto_left3s.png"));
			repaint();
		}
		Rectangle result = new Rectangle(x1, y1, 32, 32);
		if(result.intersects(labelKunai.getX(), labelKunai.getY(), 20, 20)) {
			generarManzana();
		}
		repaint();
	}

	public void comprobarChoqueRIGHT1() {

		boolean choca = false;

		for (int i = 0; i < isListaPanel().size(); i++) {

			Rectangle result = new Rectangle(x1, y1, 32, 32);
			int xP = isListaPanel().get(i).getX();
			int yP = isListaPanel().get(i).getY();
			int hP = isListaPanel().get(i).getHeight();
			int wP = isListaPanel().get(i).getWidth();

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
		if( imgup>=0 && imgup<3) {
			imgup++;
			lblJugador1.setIcon(new ImageIcon("naruto_right1s.png"));
			repaint();
		}
		else if( imgup>=3 && imgup<6) {
			imgup++;
			lblJugador1.setIcon(new ImageIcon("naruto_right2s.png"));
		}
		
		else if( imgup>=6 && imgup<9) {
			imgup++;
			lblJugador1.setIcon(new ImageIcon("naruto_right1s.png"));
			repaint();
		}
		else if( imgup>=9) {
			imgup=0;
			lblJugador1.setIcon(new ImageIcon("naruto_right2s.png"));
			repaint();
		}
		Rectangle result = new Rectangle(x1, y1, 32, 32);
		if(result.intersects(labelKunai.getX(), labelKunai.getY(), 20, 20)) {
			generarManzana();
		}
		repaint();
		
	}

	public void comprobarChoqueUP2() {

		boolean choca = false;

		for (int i = 0; i < isListaPanel().size(); i++) {

			Rectangle result = new Rectangle(x2, y2, 32, 32);
			int xP = isListaPanel().get(i).getX();
			int yP = isListaPanel().get(i).getY();
			int hP = isListaPanel().get(i).getHeight();
			int wP = isListaPanel().get(i).getWidth();

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
		Rectangle result = new Rectangle(x1, y1, 32, 32);
		if(result.intersects(labelKunai.getX(), labelKunai.getY(), 20, 20)) {
			generarManzana();
		}
		repaint();
	}

	public int getX1() {
		return x1;
	}

	public void setX1(int x1) {
		this.x1 = x1;
	}

	public int getY1() {
		return y1;
	}

	public void setY1(int y1) {
		this.y1 = y1;
	}

	public int getX2() {
		return x2;
	}

	public void setX2(int x2) {
		this.x2 = x2;
	}

	public int getY2() {
		return y2;
	}

	public void setY2(int y2) {
		this.y2 = y2;
	}

	public boolean isFunciona() {
		return funciona;
	}

	public void setFunciona(boolean funciona) {
		this.funciona = funciona;
	}

	public JLabel getLblJugador1() {
		return lblJugador1;
	}

	public JLabel getLblJugador2() {
		return lblJugador2;
	}

	public void comprobarChoqueDOWN2() {

		boolean choca = false;

		for (int i = 0; i < isListaPanel().size(); i++) {

			Rectangle result = new Rectangle(x2, y2, 32, 32);
			int xP = isListaPanel().get(i).getX();
			int yP = isListaPanel().get(i).getY();
			int hP = isListaPanel().get(i).getHeight();
			int wP = isListaPanel().get(i).getWidth();

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

		for (int i = 0; i < isListaPanel().size(); i++) {

			Rectangle result = new Rectangle(x2, y2, 32, 32);
			int xP = isListaPanel().get(i).getX();
			int yP = isListaPanel().get(i).getY();
			int hP = isListaPanel().get(i).getHeight();
			int wP = isListaPanel().get(i).getWidth();

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

		for (int i = 0; i < isListaPanel().size(); i++) {

			Rectangle result = new Rectangle(x2, y2, 32, 32);
			int xP = isListaPanel().get(i).getX();
			int yP = isListaPanel().get(i).getY();
			int hP = isListaPanel().get(i).getHeight();
			int wP = isListaPanel().get(i).getWidth();

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
				Thread.sleep(30);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public boolean isUp() {
		return up;
	}

	public void setUp(boolean up) {
		this.up = up;
	}

	public boolean isDown() {
		return down;
	}

	public void setDown(boolean down) {
		this.down = down;
	}

	public boolean isLeft() {
		return left;
	}

	public void setLeft(boolean left) {
		this.left = left;
	}

	public boolean isRight() {
		return right;
	}

	public void setRight(boolean right) {
		this.right = right;
	}

	public boolean isW() {
		return w;
	}

	public void setW(boolean w) {
		this.w = w;
	}

	public boolean isS() {
		return s;
	}

	public void setS(boolean s) {
		this.s = s;
	}

	public boolean isA() {
		return a;
	}

	public void setA(boolean a) {
		this.a = a;
	}

	public boolean isD() {
		return d;
	}

	public void setD(boolean d) {
		this.d = d;
	}

	public boolean isB() {
		return b;
	}

	public void setB(boolean b) {
		this.b = b;
	}

	public boolean isP() {
		return p;
	}

	public void setP(boolean p) {
		this.p = p;
	}

	public boolean isJuegoEnMarcha() {
		return juegoEnMarcha;
	}

	public void setJuegoEnMarcha(boolean juegoEnMarcha) {
		this.juegoEnMarcha = juegoEnMarcha;
	}

	public ArrayList<JLabel> isListaPanel() {
		return listaPanel;
	}
	public void generarManzana() {
		boolean estaBien=false;
		while(estaBien==false) {
			double x=Math.random()*700+290;
			double y=Math.random()*800+0;
			int choca = 0;
			labelKunai.setBounds((int)x, (int)y, 20, 20);
			
			for (int i = 0; i < isListaPanel().size(); i++) {

				Rectangle result = new Rectangle((int)x,(int)y,20, 20);
				int xP = isListaPanel().get(i).getX();
				int yP = isListaPanel().get(i).getY();
				int hP = isListaPanel().get(i).getHeight();
				int wP = isListaPanel().get(i).getWidth();

				if (result.intersects(xP, yP, wP, hP) == true) {
					choca =-1;
				}
				}
			if(choca==0) {
				estaBien=true;
				labelKunai.setVisible(true);
			}
		}
	}
}
