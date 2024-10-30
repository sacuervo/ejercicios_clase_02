/*
Crea un programa que calcule la media aritmética de tres números introducidos por el usuario.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);
        var df = new DecimalFormat("#.####");

        System.out.print("Ingrese el primer número: ");
        var primerNumero = Double.parseDouble(sc.nextLine());

        System.out.print("Ingrese el segundo número: ");
        var segundoNumero = Double.parseDouble(sc.nextLine());

        System.out.print("Ingrese el tercer número: ");
        var tercerNumero = Double.parseDouble(sc.nextLine());

        var mediaAritmetica = (primerNumero + segundoNumero + tercerNumero) / 3;

        System.out.printf("Media aritmética = %s", df.format(mediaAritmetica));

        sc.close();

    }
}
