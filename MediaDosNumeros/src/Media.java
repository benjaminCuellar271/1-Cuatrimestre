import java.util.*;
public class Media {


	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int num1, num2, resultado;
		float media;
		
		System.out.println("Introduzca el valor del pimer numero:");
		num1= leer.nextInt();
		
		System.out.println("Introduzca el valor del segundo numero:");
		num2 = leer.nextInt();
		
		resultado = num1 + num2;
		
		media = resultado/2;
		System.out.println("La media de los dos numeros introducidos es:"+media);
	}

}
