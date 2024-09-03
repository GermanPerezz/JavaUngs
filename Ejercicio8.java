package Ungs;

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
