package base_de_datos;

public class VaciaException extends Exception{

	public VaciaException(String mesage){
		super(mesage);
		System.out.println(mesage);
	}
	public VaciaException(){
		super();
	}
}
