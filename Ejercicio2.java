package Ungs;
/*Escribir un programa que pregunte tu nombre e imprima: Hola "nombre" */
import java.util.Scanner;

public class Ejercicio2 {
	
	public static String PedirNombre() {
		Scanner scan = new Scanner (System.in);
		System.out.println("Escribí tu nombre");
		return scan.nextLine();
	}

	public static void main(String[] args) {
		System.out.println("Hola"+ PedirNombre());

	}

}
