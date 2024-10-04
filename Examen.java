package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen {
    public void ejercicio1(){
        double nota1 = 0; // Creo las variables para que no den error en el try chatch
        double nota2 = 0;
        double nota3 = 0;
        double notaMedia = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Ejercicio 1 ----");
        try {
            System.out.println("Ingrese la nota del primer trimestre (0-10): "); // Pido las 3 notas
            nota1 = sc.nextInt();
            System.out.println("Ingrese la nota del segundo trimestre(0-10): ");
            nota2 = sc.nextInt();
            System.out.println("Ingrese la nota del tercer trimestre(0-10): ");
            nota3 = sc.nextInt();
            while (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10) { // Verifica si alguna nota no esta en el valor correcto
                System.out.println("Nota fuera del rango (0-10). Vuelve a introducirlas ...");
                System.out.println("Ingrese la nota del primer trimestre (0-10): ");
                nota1 = sc.nextInt();
                System.out.println("Ingrese la nota del segundo trimestre(0-10): ");
                nota2 = sc.nextInt();
                System.out.println("Ingrese la nota del tercer trimestre(0-10): ");
                nota3 = sc.nextInt();
            }
            notaMedia = (nota1+nota2+nota3)/3; // El calculo de la nota media
            System.out.println("La nota media es: " + notaMedia);
            if (notaMedia >=5) // Si la nota es mayor o igual a cinco muestra aprobado
                System.out.println("APROBADO");
            else // Y sino suspendido
                System.out.println("SUSPENSO");
        } catch (Exception e) {
            System.out.println("Valor incorrecto"); // Por si introduces algun valor que de error como una letra
        }
    }
    public void ejercicio2(){
        Scanner sc = new Scanner(System.in);
        int num = 0; // Creo la variable y le doy un valor por defecto para que no de error con el try catch
        System.out.println("---- Ejercicio 2 ----");
        try {
            System.out.println("Introduce un numero: "); // Pido numero
            num = sc.nextInt();
        } catch (NumberFormatException | InputMismatchException e) { // Si introduzco algo que no sea un entero muestra el siguente error
            System.out.println("ERROR. Introduce un valor valido ... ");
        }
        if (num < 0) // Si numero es menor que cero lo multiplico por -1 para pasarlo a positivo
        {
            num = num * -1;
        }
        System.out.println("El valor absoluto es: " + num); // Muestro el numero
    }
}
