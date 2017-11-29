package base_de_datos;

public class InexsistenteException extends Exception{

	public InexsistenteException(String message){
		super(message);
		System.out.println(message);
	}
	public InexsistenteException(){
		super();
		
	}
}
