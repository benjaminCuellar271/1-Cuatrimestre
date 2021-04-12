import java.util.*;
public class SumaRestaMultiplicacion {


	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int num1, num2, resultado, respuesta;
		
			System.out.println("Introduzca el valor del primer numero:");
			num1 = leer.nextInt();
			
			System.out.println("Introduzca el valor del segundo numero:");
			num2 = leer.nextInt();
			
			
			System.out.println("Que desea hacer con estos valores?");
			System.out.println("Introduzca la opcion que desee hacer:");
			System.out.println("1.-Suma 2.-Resta 3.-Multiplicacion ");
			respuesta=leer.nextInt();
			
switch(respuesta){
			
			case 1:
				resultado=num1+num2;
				System.out.println("La suma es igual a:" +resultado);
				break;
			
			case 2:
				resultado=num1-num2;
				System.out.println("La resta es igual a:" +resultado);
				break;
				
			case 3:
				resultado=num1*num2;
				System.out.println("La multiplicacion es igual a:" +resultado);
				break;
			}
			
	}

}
