package base_de_datos;

public class LargoException extends Exception{

	public LargoException(String message){
		super(message);
		System.out.println(message);
	}
	public LargoException(){
		super();
	}
}
