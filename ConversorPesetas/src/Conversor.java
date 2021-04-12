import java.util.*;
public class Conversor {


	public static void main(String[] args) {
		Scanner leer =new Scanner(System.in);
		double valorPeseta = 166.386;
		double cantidad, resultadoEuro;
		
		System.out.println("Introduzca la cantidad de Euros que desea convertir a pesetas:");
		cantidad = leer.nextInt();
		
		resultadoEuro = cantidad* valorPeseta;
		System.out.println("El valor en Pesetas de la cantidad introducida es:" +resultadoEuro);
	}

}
