package Ungs;
// Escribir un programa que tepregunte por dos numeros,y a continuacion imprima un mensaje
//del estilo La suma es: y el valor de la suma de ambos numeros.
import java.util.Scanner;

public class Ejercicio3 {
	
	public static int sumaNumeros(int x, int y){
		return x+y;
	}	
		
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("ingrese el primer número");
		int PrimerNumero = scan.nextInt();
		System.out.println("ingrese el segundo número");
		int SegundoNumero = scan.nextInt();
		System.out.println("la suma de los dos números ingresados es:" + sumaNumeros(PrimerNumero,SegundoNumero));
	}

}
