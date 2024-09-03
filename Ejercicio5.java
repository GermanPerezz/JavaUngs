package Ungs;

import java.util.Scanner;

public class Ejercicio5 {
	
	public static int Promedio(int x, int y) {
		return (x+y)/2;
	}

	public static void main(String[] args) {		
		Scanner scan = new Scanner (System.in);
				
		System.out.println("ingrese el primer término");
		int PrimerNumero = scan.nextInt();
		System.out.println("ingrese el segundo término");
		int SegundoNumero = scan.nextInt();
		
		System.out.println("el promedio de la suma de los dos números ingresados es:" + Promedio(PrimerNumero,SegundoNumero));
	}

}
