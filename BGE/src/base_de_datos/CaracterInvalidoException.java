package base_de_datos;

public class CaracterInvalidoException extends Exception{

	public CaracterInvalidoException(String message){
		super(message);
		System.out.println(message);
	}
	public CaracterInvalidoException(){
		super();
	}
}
