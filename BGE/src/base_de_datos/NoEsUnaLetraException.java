package base_de_datos;

public class NoEsUnaLetraException extends Exception{

	public NoEsUnaLetraException(String message){
		super(message);
		System.out.println(message);
	}
	public NoEsUnaLetraException(){
		super();
	}
}
