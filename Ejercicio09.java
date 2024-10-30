/*
Escribe un programa que convierta una temperatura dada en grados Celsius a grados Fahrenheit y Kelvin. Usa las siguientes fórmulas:

Fahrenheit = Celsius * 9/5 + 32
Kelvin = Celsius + 273.15
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio09 {
    public static void main(String[] args) {

        var sc = new Scanner(System.in);

        System.out.print("Ingrese temperatura en °C: ");
        var tempCentigrados = Double.parseDouble(sc.nextLine());

        var df = new DecimalFormat("#.00"); // Máximo 4 decimales de ser necesario

        System.out.printf("°K: %s%n", df.format(tempCentigrados + 273.15));

        System.out.printf("°F: %s%n", df.format(tempCentigrados * 9 / 5 + 32));

        sc.close();

    }
}
