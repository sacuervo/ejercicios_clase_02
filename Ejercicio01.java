/*
En este reto deberás programar la operación matemática "6 / 2 ( 1 + 2 )" utilizando las instrucciones necesarias.

¿Cuál es el resultado correcto de la operación? ¿1 ó 9?
Explique por que la otra calculadora genera un resultado diferente.
 */

public class Ejercicio01 {
    public static void main(String[] args) {

        System.out.println("6 / 2 (1 + 2) = " + 6 / 2 * (1 + 2)); // Java elimina la ambigüedad de la expresión al
                                                                  // forzar la inclusión de '*'
        System.out.println("6 / (2 (1 + 2)) = " + 6 / (2 * (1 + 2)));

        /*
         * Justificacion:
         * El resultado correcto de esta operación es 1 por el orden de operaciones
         * predeterminado
         * que Java sigue.
         * 1. En primer lugar, Java resuelve lo que hay en paréntesis (nivel de
         * precedencia 16) de adentro hacia afuera. El resultado es 6 / 2 (3), que es
         * igual a 6 / 2 * 3
         * 2. Después, Java divide 6 entre 2, (/ y * comparten nivel de precedencia 12 y
         * se ejecutan de izquierda a derecha).
         * Esto da como resultado 3 * 3.
         * 3. Finalmente, se hace la operación 3 * 3, que da como resultado 9.
         *
         * Recurso: https://introcs.cs.princeton.edu/java/11precedence/
         * 
         * La razón por la cuál en la segunda calculadora el resultado es 1, es que
         * trata la expresión directamente como una fracción, es decir 6 / (2(1 + 2)).
         * Se asume la existencia de un paréntesis extra que no es explícito.
         * 
         */

    }
}