package base_de_datos;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class Sonido extends Thread{
	
	public Sonido() {
		
	}

	public void run() {
		File file = new File("Ikimono Gakari - Hotaru No Hikari OST Naruto Lyrics.mp3");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		BufferedInputStream bis = new BufferedInputStream(fis);
		try {
			Player player = new Player(bis);
			player.play();
		} catch (JavaLayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
	
		}
	}
	
	
	
}
