/*
7 Un programa que pida el precio real de un producto,
el precio rebajado y muestre el descuento realizado (M)
 */
public class ej7 {
    public static double descuentoRealizado(double precioReal, double precioRebajado) {
        //variables
        double descuento;
        //calcular descuento
        descuento = (precioReal - precioRebajado) / precioReal * 100;
        return descuento;
    }

    public static void main(String[] args) {
        //variables
        double precioReal;
        double precioRebajado;
        double descuento;

        precioReal = Utilidades.leerDoble("Introduce el precio: ");

        precioRebajado = Utilidades.leerDoble("Introduce el precio rebajado: ");

        descuento = descuentoRealizado(precioReal, precioRebajado);

        //resultado
        System.out.println("El descuento es de: " + descuento);
    }
}

