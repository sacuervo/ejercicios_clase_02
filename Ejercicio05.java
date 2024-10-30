/*
 El videojuego en el ordenador está viviendo una nueva época de oro con un montón de juegos exclusivos. Para comprarte un PC Gamer deberás fijarte principalmente en el procesador, la tarjeta gráfica, la memoria RAM... pero sobre todo en los accesorios como el teclado y ratón.

Estás interesado en comprarte un nuevo PC y en la tienda de tu barrio cuesta 660€ con todos los accesorios incluidos. Sin embargo, el vendedor te descuenta el 10% por pronto pago ¿Cuánto tienes que pagar en total por el ordenador con todos los accesorios?
 */

import java.text.DecimalFormat;

public class Ejercicio05 {

    public static void main(String[] args) {

        var costoComputador = 660;
        var descuento = 0.10;
        var precioTotal = costoComputador * (1 - descuento);

        var df = new DecimalFormat("#.00");

        System.out.printf("El computador me costará €%s.", df.format(precioTotal));

    }

}
