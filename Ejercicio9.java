package Ungs;
 /* Escribir un metodo static void imprimirFecha(int dia, int mes, int anio) que imprime la
 fecha pasada como parametro en formato del estilo 5 de Julio de 2030 . */
import java.util.Scanner;

public class Ejercicio9 {

    public static void imprimirFecha(int dia, int mes, int anio) {
        String nombreMes = "";

        if (mes == 1) nombreMes = "enero";
        else if (mes == 2) nombreMes = "febrero";
        else if (mes == 3) nombreMes = "marzo";
        else if (mes == 4) nombreMes = "abril";
        else if (mes == 5) nombreMes = "mayo";
        else if (mes == 6) nombreMes = "junio";
        else if (mes == 7) nombreMes = "julio";
        else if (mes == 8) nombreMes = "agosto";
        else if (mes == 9) nombreMes = "septiembre";
        else if (mes == 10) nombreMes = "octubre";
        else if (mes == 11) nombreMes = "noviembre";
        else if (mes == 12) nombreMes = "diciembre";
        else {
            System.out.println("Número de mes incorrecto");
            return; // Salir del método si el mes es incorrecto
        }

        // Imprimir la fecha en el formato requerido
        System.out.println(dia + " de " + nombreMes + " del " + anio);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Indique el día:");
        int day = scan.nextInt();
        System.out.println("Indique el mes:");
        int month = scan.nextInt();
        System.out.println("Indique el año:");
        int year = scan.nextInt();

        imprimirFecha(day, month, year);  // Llamada al método corregida
        scan.close();  // Es una buena práctica cerrar el Scanner
    }
}
