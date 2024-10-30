/*
Escribe un programa que solicite al usuario dos números y luego realice las operaciones de suma, resta, multiplicación y división con esos números. Muestra los resultados en la consola.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ejercicio07 {
        public static void main(String[] args) {

                var sc = new Scanner(System.in);

                System.out.print("Ingrese el primer número: ");
                var primerNumero = Double.parseDouble(sc.nextLine());

                System.out.print("Ingrese el segundo número: ");
                var segundoNumero = Double.parseDouble(sc.nextLine());

                var df = new DecimalFormat("#.####"); // Máximo 4 decimales de ser necesario

                // SUMA
                System.out.printf("%s + %s = %s%n", df.format(primerNumero), df.format(segundoNumero),
                                df.format(primerNumero + segundoNumero));

                // RESTA
                System.out.printf("%s - %s = %s%n", df.format(primerNumero), df.format(segundoNumero),
                                df.format(primerNumero - segundoNumero));

                // MULTIPLICACIÓN
                System.out.printf("%s * %s = %s%n", df.format(primerNumero), df.format(segundoNumero),
                                df.format(primerNumero * segundoNumero));

                // DIVISIÓN
                System.out.printf("%s / %s = %s%n", df.format(primerNumero), df.format(segundoNumero),
                                df.format(primerNumero / segundoNumero));

                sc.close();
        }
}
