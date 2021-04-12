import java.util.*;
public class Monedas {


	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		//VALORES Y DECLARACION
		double cantidad, resultadoYen, resultadoDolar, resultadoWon;
		int respuesta, respuestaSeguir, respuestaSeguirConvirtiendo;
		double valorDolares =1.19;
		double valorYen =124.27;
		double valorWon =1.338;
		
		//PEDIMOS LA CANTIDAD DE EUROS QUE EL USUARIO DESEA CONVERTIR
				System.out.println("***BIENVENIDO A NUESTRO CONVERSOR DE MONEDAS***");
				System.out.println("Que cantidad de Euros desea convertir:");
				cantidad =leer.nextDouble();
		

		
		//MENU DE LAS CONVERSIONES
		System.out.println("1.-Convertir EUROS a DOLARES.");
		System.out.println("2.-Convertir EUROS a YENES.");
		System.out.println("3.-Convertir Euros a Wones.");
		respuesta=leer.nextInt();
		
		switch(respuesta) {
		case 1:
			resultadoDolar = cantidad * valorDolares;
			System.out.println("El valor de la cantidad introducida en Dolares es:"+resultadoDolar);
			break;
		
		case 2:
			resultadoYen = cantidad * valorYen;
			System.out.println("El valor de la cantidad introducida en Yenes es:"+resultadoYen);
			break;
			
		case 3:
			resultadoWon = cantidad * valorWon;
			System.out.println("El valor de la cantidad introducida en Wones es:"+resultadoWon);
			break;
			
			}
		
		
		System.out.println("Desea seguir convirtiendo?");
		System.out.println("Introduzca 1.-Si 2.-No:");
		respuestaSeguirConvirtiendo = leer.nextInt();
		
		
		if(respuestaSeguirConvirtiendo == 1) {
		
		do {
		System.out.println("Que cantidad de Euros desea convertir:");
		cantidad =leer.nextDouble();
		System.out.println("1.-Convertir EUROS a DOLARES.");
		System.out.println("2.-Convertir EUROS a YENES.");
		System.out.println("3.-Convertir Euros a Wones.");
		System.out.println("4.-Salir.");
		respuestaSeguir = leer.nextInt();
			
			switch(respuestaSeguir) {
			case 1:
				resultadoDolar = cantidad * valorDolares;
				System.out.println("El valor de la cantidad introducida en Dolares es:"+resultadoDolar);
				System.out.println("-Si desea desea seguir convirtiendo pulse 1.");
				//A�ADIDO DESPUES
				System.out.println("-Si desea salir pulse 4.");
				respuestaSeguir = leer.nextInt();
				//System.out.println("Gracias por utilizar nuestro conversor");
		
				break;
			case 2:
				resultadoYen = cantidad * valorYen;
				System.out.println("El valor de la cantidad introducida en Yenes es:"+resultadoYen);
				System.out.println("-Si desea desea seguir convirtiendo pulse 1.");
				//A�ADIDO DESPUES
				System.out.println("-Si desea salir pulse 4.");
				respuestaSeguir = leer.nextInt();
				//System.out.println("Gracias por utilizar nuestro conversor");
				
				break;
			case 3:
				resultadoWon = cantidad * valorWon;
				System.out.println("El valor de la cantidad introducida en Wones es:"+resultadoWon);
				System.out.println("-Si desea desea seguir convirtiendo pulse 1.");
				//A�ADIDO DESPUES
				System.out.println("-Si desea salir pulse 4.");
				respuestaSeguir = leer.nextInt();
				//System.out.println("Gracias por utilizar nuestro conversor");
				
			    break;
			case 4:
				System.out.println("Gracias por usar nuestro conversor.");
				break;
				
			}
		}while(respuestaSeguir  != 4);
		
		
		
		}else if(respuestaSeguirConvirtiendo == 2){
			System.out.println("Gracias por usar nuestro conversor.");
		}

		
		

	}
}


