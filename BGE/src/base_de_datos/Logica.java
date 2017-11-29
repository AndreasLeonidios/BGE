package base_de_datos;

import java.sql.*;


public class Logica {
	
	public Logica(){}

	Statement statement = null;
	
	private static Connection initBD() {
	
		Connection connection = null;
		 try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
  
			connection = DriverManager.getConnection("jdbc:sqlite: BD");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}
	

	public void anyadirUsuarios(String nombre, String contrasenya) throws SQLException{
			
		if (nombre.length() > 20) {
			try {
				throw new LargoException("El nombre del heroe es demasiado largo");
			} catch (LargoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (nombre == "") {
			try {
				throw new VaciaException("No has puesto el nombre del heroe");
			} catch (VaciaException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else if (contieneCaracterInvalido(nombre) == true) {
			try {
				throw new CaracterInvalidoException("El nombre del heroe posee un caracter invalido");
			} catch (CaracterInvalidoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			
			statement = initBD().createStatement();
			statement.executeUpdate("CREATE TABLE IF NOT EXISTS USUARIOS(NOMBRE VARCHAR(20),"
						+ " CONTRASENYA VARCHAR(20))");
			
		}
			
	}
	
	public void eliminarUsuario(String nombre) throws SQLException{
		
		statement = initBD().createStatement();
		statement.executeUpdate("delete NOMBRE from Usuarios where(nombre='"+nombre+"'");
		
		
		
		
	}
	
	public void mostrarUsuarios() throws SQLException{
		 
		statement = initBD().createStatement();
		ResultSet rs = statement.executeQuery("select nombre from Usuarios");
		 while(rs.next())
	      {
	        System.out.println(rs.getString("nombre"));
	      }
	      
	}
	
	public void anyadirHeroe(String nombreUsuario, String nombreHeroe, int puntuacion, int velocidad, int ataque, int vida) throws SQLException{
		
		 statement = initBD().createStatement();
		 
		 statement.executeUpdate("CREATE TABLE IF NOT EXISTS "+nombreUsuario+"(nombreHeroe VARCHAR(20), puntuacion number(3), velocidad number(2), ataque number(2), vida number(2))");
		 statement.executeUpdate("insert into "+nombreUsuario+" values('"+nombreHeroe+"', '"+puntuacion+"', '"+velocidad+"', '"+ataque+"', '"+vida+"')");			
	}

	public void mostrarHeroes(String nombreUsuario) throws SQLException{
		 
		statement = initBD().createStatement();
		ResultSet rst = statement.executeQuery("select nombreHeroe from '"+nombreUsuario+"'");
		 while(rst.next())
	      {
	        System.out.println(rst.getString("nombreHeroe"));
	      }
	      
	}
	
	public boolean contieneCaracterInvalido(String w) {

		for (int i = 0; i < w.length(); i++) {
			char letra = w.charAt(i);

			if (letra != 'A' && letra != 'B' && letra != 'C' && letra != 'D' && letra != 'E' && letra != 'F'
					&& letra != 'G' && letra != 'H' && letra != 'I' && letra != 'J' && letra != 'K' && letra != 'L'
					&& letra != 'M' && letra != 'N' && letra != 'Ñ' && letra != 'O' && letra != 'P' && letra != 'Q'
					&& letra != 'R' && letra != 'S' && letra != 'T' && letra != 'U' && letra != 'V' && letra != 'W'
					&& letra != 'X' && letra != 'Y' && letra != 'Z' && letra != 'a' && letra != 'h' && letra != 'g'
					&& letra != 'f' && letra != 'e' && letra != 'd' && letra != 'c' && letra != 'b' && letra != 'i'
					&& letra != 'j' && letra != 'k' && letra != 'l' && letra != 'n' && letra != 'm' && letra != 'ñ'
					&& letra != 'o' && letra != 'p' && letra != 'q' && letra != 'r' && letra != 't' && letra != 's'
					&& letra != 'u' && letra != 'v' && letra != 'y' && letra != 'x' && letra != 'w' && letra != 'z'
					&& letra != '0' && letra != '1' && letra != '2' && letra != '3' && letra != '4' && letra != '5'
					&& letra != '6' && letra != '7' && letra != '8' && letra != '9') {
				return true;
			}
		}
		return false;
	}
	
}
