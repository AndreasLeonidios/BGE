package base_de_datos;

import java.sql.SQLException;
import java.sql.*;

public class main {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Logica l = new Logica();
		
		l.anyadirUsuarios("andreasleon", "francisco");
		l.eliminarUsuario("andreasleon");

		
	}

}
