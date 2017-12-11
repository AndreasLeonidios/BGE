package visualizacion;

import java.awt.EventQueue;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class V_uno extends JFrame{


	private JFrame frame;
	private int x = 346;
	private int y = 102;
	private int x2 = 0;
	private int y2 = 0;
	public JLabel l1 = new JLabel("");
	public JLabel l7 = new JLabel("");
	int u =0;
	int d =0;
	int r =0;
	int l =0;


	JLabel lblJugador = new JLabel("jugador1");
	
	private ArrayList<JLabel> listaPanel = new ArrayList<JLabel>();
	
	public V_uno() {
		initialize();
	
	}

	private void initialize() {
		
		frame = this;
		frame.setBounds(0, 0, 1700, 1188);
		frame.setUndecorated(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);	
	

		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Andreas Le\u00F3n\\Downloads\\mapa1vs1editadoyTama\u00F1oEditado.png"));
		
		
		lblJugador.setIcon(new ImageIcon("C:\\Users\\Andreas Le\u00F3n\\Downloads\\corea.jpg"));
		lblJugador.setForeground(Color.RED);
		lblJugador.setBackground(Color.ORANGE);
		lblJugador.setBounds(346, 102, 32, 32);
		getContentPane().add(lblJugador);
		
		l1.setBounds(290, 0, 44, 800);
		getContentPane().add(l1);
		
		JLabel l2 = new JLabel("");
		l2.setBounds(290, 0, 700, 24);
		getContentPane().add(l2);
		
		JLabel l3 = new JLabel("");
		l3.setBounds(290, 744, 700, 22);
		getContentPane().add(l3);
		
		JLabel l4 = new JLabel("");
		l4.setBounds(912, 0, 78, 800);
		getContentPane().add(l4);
		
		JLabel l5 = new JLabel("");
		l5.setBounds(290, 0, 171, 87);
		getContentPane().add(l5);
		
		JLabel l6 = new JLabel("");
		l6.setBounds(464, 0, 174, 71);
		getContentPane().add(l6);
		
		l7.setBounds(649, 44, 120, 118);
		getContentPane().add(l7);
		
		añadirA(lblJugador.getX(),lblJugador.getY());
		
		lblNewLabel.setBounds(290, 0, 700, 800);
		frame.getContentPane().add(lblNewLabel);
		
       
        frame.setFocusable(true);
 
        frame.addKeyListener(new KeyListener(){
            public void keyTyped(KeyEvent e){
              
            }
            public void keyPressed(KeyEvent e){
                if(e.getKeyCode()==KeyEvent.VK_UP){
                	añadirA(lblJugador.getX(),lblJugador.getY());
                	if(d==1) {
                		y=y-10;
                    	lblJugador.setBounds(x, y, 32, 32);
                	}
                	
                }
                if(e.getKeyCode()==KeyEvent.VK_DOWN){
                	añadirA(lblJugador.getX(),lblJugador.getY());

                	if(u==1) {
                		y=y+10;
                    	lblJugador.setBounds(x, y, 32, 32);
                	}
                	
                }
                if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                	añadirA(lblJugador.getX(),lblJugador.getY());

                	if(l==1) {
                		x=x+10;
                		lblJugador.setBounds(x, y, 32, 32);
                	}
                	
                }                	
                if(e.getKeyCode()==KeyEvent.VK_LEFT){
                	
                	añadirA(lblJugador.getX(),lblJugador.getY());

                	if(r==1) {
                	x=x-10;
                	lblJugador.setBounds(x, y, 32, 32);
                	}
                }
                if(e.getKeyCode()==KeyEvent.VK_ESCAPE){
                   
                    frame.dispose();
                }
            }
            public void keyReleased(KeyEvent e){
               
            }
        });
		
	}
	
	public void añadirA(int x,int y) {
		listaPanel.add(l7);
		
	
		for(int i=0;i<1;i++) {
			
			int xP =listaPanel.get(i).getX();
			int yP = listaPanel.get(i).getY();
			int hP = listaPanel.get(i).getHeight();
			int wP= listaPanel.get(i).getWidth();
			
			
			u=0;
			d=0;
			r=0;
			l=0;
			
			if (y>=yP+wP+10 || x>=xP+hP || x<= xP || y<=yP) {
				d++;
			}else {
				y=yP+wP;
				lblJugador.setBounds(x, y, 32, 32);
				
			}
			
			if(x>=xP+hP+10 || y>=yP+wP || y<=yP || x<= xP) {
				r++;
			}else {
				x=xP+hP;
				lblJugador.setBounds(x, y, 32, 32);
				
			}
			
			if (y<=yP-10 || x>=xP+hP || x<= xP || y>=yP+wP) {
				u++;
			}else {
				y=yP;
				lblJugador.setBounds(x, y, 32, 32);
				
			}
			
			if(x<=xP-10 || y>=yP+wP || y<=yP || x>= xP+hP) {
				l++;
			}else {
				x=xP;
				lblJugador.setBounds(x, y, 32, 32);
				
			}
			
		}
	}
	
	public boolean comprobarChoque() {
		listaPanel.add(l7);

		Rectangle result;
		
		int xP =listaPanel.get(0).getX();
		int yP = listaPanel.get(0).getY();
		int hP = listaPanel.get(0).getHeight();
		int wP= listaPanel.get(0).getWidth();
		result = SwingUtilities.computeIntersection(xP, yP, hP, wP, lblJugador.getBounds());
		
		return (result.getWidth() > 0 && result.getHeight() > 0);
	}
	
	
	
	
	
	
	
	
	public boolean l1_1(int x, int y) {
		
		if(x>334+10) {
			return true;
		}else {
			lblJugador.setBounds(334, y, 32, 32);
			x=334;
			return false;
		}
	}
	
	public boolean l2_1(int x, int y) {
		
		if (y>34) {
			return true;
		}else {
			lblJugador.setBounds(x, 24, 32, 32);
			y=24;
			return false;
		}
	}
	
	public boolean l3_1(int x, int y){
		
		if(y<746) {
			return true;
		}else {
			lblJugador.setBounds(x, 746, 32, 32);
			y=746;
			return false;
		}
	}
	
	public boolean l4_1(int x, int y) {
		
		if(x<902) {
			return true;
		}else {
			x=912;
			lblJugador.setBounds(x, y, 32, 32);
			return false;
		}
		
	}
	
	public boolean l5_1y(int x, int y) {
		
		if (y>97 || x>=461) {
			return true;
		}else {
			lblJugador.setBounds(x, 87, 32, 32);
			y=87;
			return false;
		}
	}
	
	public boolean l5_1x(int x, int y) {
		
		if(x>471 || y>=87) {
			return true;
		}else {
			lblJugador.setBounds(461, y, 32, 32);
			x=461;
			return false;
		}
	}
	
	public boolean l6_1y(int x, int y) {
		
		if (y>81 || x>=638) {
			return true;
		}else {
			lblJugador.setBounds(x, 71, 32, 32);
			y=71;
			return false;
		}
	}
	
	public boolean l6_1x(int x, int y) {
		
		if(x>648 || y>=71) {
			return true;
		}else {
			lblJugador.setBounds(638, y, 32, 32);
			x=638;
			return false;
		}
	}
	
	public boolean l7_1yd(int x, int y) {
		
		if (y>162+10 || x>=769 || x<= 649 || y<=44) {
			return true;
		}else {
			y=162;
			lblJugador.setBounds(x, y, 32, 32);
			
			return false;
		}
	}
	
	public boolean l7_1xr(int x, int y) {
		
		if(x>769+10 || y>=162 || y<=44 || x<= 649) {
			return true;
		}else {
			x=769;
			lblJugador.setBounds(x, y, 32, 32);
			
			return false;
		}
	}
	
	public boolean l7_1yu(int x, int y) {
		
		if (y<44-10 || x>=769 || x<= 649 || y>=162) {
			return true;
		}else {
			y=44;
			lblJugador.setBounds(x, y, 32, 32);
			
			return false;
		}
	}
	
	public boolean l7_1xl(int x, int y) {
		
		if(x<649-10 || y>=162 || y<=44 || x>= 769) {
			return true;
		}else {
			x=649;
			lblJugador.setBounds(x, y, 32, 32);
			
			return false;
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
