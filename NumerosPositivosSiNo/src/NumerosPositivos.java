import java.util.*;
public class NumerosPositivos {



	public static void main(String[] args) {
		Scanner leer =new Scanner(System.in);
		int num1, num2, resultado;
		
			System.out.println("Introduzca el primer numero:");
			num1 = leer.nextInt();
			
			System.out.println("Introduzca el segundo numero:");
			num2 = leer.nextInt();
			
		if(num1 > 0 && num2> 0) {
			resultado = num1 + num2;
			System.out.println("La suma de los dos numeros es:"+resultado);
		}else if(num1<0 && num2<0) {
			System.out.println("Los dos numeros son negativos.");
		}
		else if(num1<0 || num2<0) {
			System.out.println("NEGATIVO.");
		}

			
	}

}
