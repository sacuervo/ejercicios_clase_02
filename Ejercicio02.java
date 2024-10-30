/*
 En el mercado, podemos encontrar que el precio del producto Pernil Iberic D'Engreix Llen. Azuaga en porción de 100 gramos cuesta 5,95€ y el vendedor nos dice que el precio por kilo cuesta 29,75€. ¿Crees que es correcto el precio?

En este reto tienes que hacer un programa que calcule correctamente el precio por kilo del producto.
 */

import java.text.DecimalFormat;

public class Ejercicio02 {
    public static void main(String[] args) {

        var precioCienGramos = 5.95f;
        var qDeCienGramos = 1000 / 100;

        var precioFinal = precioCienGramos * qDeCienGramos;
        var df = new DecimalFormat("#.00"); // El número pasa a ser cadena dejando dos decimales siempre

        System.out.printf("Precio final: €%s", df.format(precioFinal));

        /*
         * Asumiendo que no hay algún descuento por comprar por kilo, el
         * precio que da el vendedor es incorrecto.
         */

    }
}
