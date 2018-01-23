package visualizacion;

import java.awt.Rectangle;

import base_de_datos.Sonido;

public class SegundoHilo extends Thread {


	public boolean funciona;

	public boolean funcionas=true;
	public SegundoHilo(boolean funciona) {
		funciona = this.funciona;
	}

	public void comprobarChoqueUP2() {

		V_uno o = new V_uno();
		boolean choca = false;

		for (int i = 0; i < o.isListaPanel().size(); i++) {

			Rectangle result = new Rectangle(x2, y2, 32, 32);
			int xP = o.isListaPanel().get(i).getX();
			int yP = o.isListaPanel().get(i).getY();
			int hP = o.isListaPanel().get(i).getHeight();
			int wP = o.isListaPanel().get(i).getWidth();

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
	}

	public void run() {
		
		V_uno p = new V_uno();

		while (funcionas == true) {
		
		
		 if (funcionas == true) {
			 System.out.println(12);
		 p.comprobarChoqueUP2();
		 p.repaint();
		
		 } else if (p.isS() == true) {
		 p.comprobarChoqueDOWN1();
		 } else if (p.isD() == true) {
		 p.comprobarChoqueRIGHT1();
		 } else if (p.isA() == true) {
		 p.comprobarChoqueLEFT1();
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
