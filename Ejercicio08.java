/*
Crea un programa que calcule el área y el perímetro de un rectángulo. Solicita al usuario la longitud y el ancho del rectángulo.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        System.out.print("Ingrese el largo: ");
        var largo = Double.parseDouble(sc.nextLine());

        System.out.print("Ingrese el ancho: ");
        var ancho = Double.parseDouble(sc.nextLine());

        var df = new DecimalFormat("#.####"); // Máximo 4 decimales de ser necesario

        System.out.printf("Área del rectángulo: %s%n", df.format(largo * ancho));

        sc.close();
    }
}
