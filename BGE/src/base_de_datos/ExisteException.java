package base_de_datos;

public class ExisteException extends Exception{
	
	public ExisteException(){
			super();
		}
	public ExisteException(String message){
		super(message);
		System.out.println(message);
	}
	
}
