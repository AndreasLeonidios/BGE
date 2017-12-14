package base_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDeDatos {

 Statement statement = null;
	
	private Connection initBD() {
	
		Connection connection = null;
		 try {
			Class.forName("org.sqlite.JDBC");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    try {
  
			connection = DriverManager.getConnection("jdbc:sqlite:BD");
			statement = connection.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}
	
	public void crearTablas() throws SQLException {
	

		statement.executeUpdate("CREATE TABLE IF NOT EXISTS USUARIOS(NOMBRE VARCHAR(20),"
				+ " CONTRASENYA VARCHAR(20))");
		
		statement.executeUpdate("CREATE TABLE IF NOT EXISTS HEROES(nombre varchar(20), nombreHeroe VARCHAR(20) not null primary key, puntuacion number(3), velocidad number(2), ataque number(2), vida number(2))");

	}
	
	public void anyadirUsuario(String nombre, String contrasenya) throws SQLException {
		
		statement.executeUpdate("INSERT INTO USUARIOS VALUES('"+nombre+"', '"+contrasenya+"')");
		
	}
	
	public String mostrarUsuarios() throws SQLException{
		 
		String lista="";
		statement = initBD().createStatement();
		ResultSet rs = statement.executeQuery("select nombre from Usuarios");
		 while(rs.next())
	      {
	        lista=lista+rs.getString(1)+" ";
	      }
	      return lista;
	      
	}
	
	public String mostrarHeroes(String nombre) throws SQLException{
		 
		String lista="";
		statement = initBD().createStatement();
		ResultSet rs = statement.executeQuery("select nombreheroe from HEROES where(nombre='"+nombre+"')");
		 while(rs.next())
	      {
	        lista=lista+rs.getString(1)+" ";
	      }
		 System.out.println(lista);
	      return lista;
	      
	}
	
	
	
	public void eliminarUsuario(String nombre) throws SQLException{
		
		statement.executeUpdate("delete from Usuarios where(nombre='"+nombre+"')");

	}
	
	public void eliminarHeroe(String nombre, String heroe) throws SQLException {
		statement.executeUpdate("delete from HEROES where(nombre='"+nombre+"' and nombreHeroe='"+heroe+"')");
	}
	
	public void anyadirHeroe(String nombreUsuario, String nombreHeroe, int puntuacion, int velocidad, int ataque, int vida) throws SQLException{
		
		 
		 statement.executeUpdate("insert into HEROES values('"+nombreUsuario+"', '"+nombreHeroe+"', "+puntuacion+", "+velocidad+", "+ataque+", "+vida+")");			
	}
	
	
	public static void main (String[] args ) throws SQLException {
		BaseDeDatos b = new BaseDeDatos();
		b.initBD();
		b.crearTablas();
		b.anyadirUsuario(";DROP TABLE USUARIOS;", "maider");
		System.out.println(b.mostrarUsuarios());
//		b.anyadirHeroe("aa", "pxcgbqofyi",3,3,3,3);
//		b.anyadirHeroe("aa", "ygnhqffrrrrri",3,4,3,3);
//		b.mostrarHeroes("aa");
//		b.mostrarUsuarios();
//		b.eliminarHeroe("aa", "pxcgbqofyi");
//		b.mostrarHeroes("aa");
//		b.eliminarUsuario("aa");
//		b.eliminarUsuario("aa");
		
		
	}
}
