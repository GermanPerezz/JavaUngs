package Ungs;
/* Escribir un metodo static void ponerNota(double x, double y) que toma dos numeros de
cimales y los promedia. En caso que el promedio sea mayor o igual a 7, debera imprimir
 Promocionado , si es mayor o igual a 4 pero menor que 7, imprime Aprobado y si es menor
 que 4 imprime Debe recuperar . Probarla llamandola desde el main con distintos numeros.
 Luego, pedirle ambos numeros al usuario (usando nextFloat() del Scanner) para pasarselos a
 ponerNota **/
import java.util.Scanner;

public class Ejercicio8 {

	public static void Promedio() {
		Scanner scan = new Scanner (System.in); 
		
		System.out.println("ingrese el primer término decimal");
		double PrimerTermino = scan.nextDouble();
		System.out.println("ingrese el segundo término decimal");
		double SegundoTermino = scan.nextDouble();
		
		double prom = (PrimerTermino+SegundoTermino)/2;
		
		if(prom>=7) {
			System.out.println("Promocionado");
		}
		else if(prom>=4 && prom <7) {
			System.out.println("Aprobado");
		}
		else {
			System.out.println("Desaprobado");
		}
			scan.close();	
	}
	
	public static void main(String[] args) {
		Promedio();

	}

}
