/**
*	Calcula el valor de un factorial
* 	CREANDO COMMIT DE PRUEBA "MANUEL GUERRERO"
*/

public class Factorial {

	public int calcularFactorial(int i){
	if (i>0)
		return i + calcularFactorial(i + 1);	
	}else{
		return 1;
	}
}
