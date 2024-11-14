/*
1 EsDivisible.java
Escribe un método llamado esDivisible que toma dos enteros, n y m, y
devuelve verdadero si n es divisible por m, y falso en caso contrario.
 */

public class ej1 {
    public static boolean esDivisibleM(int num1, int num2) {
        if (num1 % num2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num1 = Utilidades.leerEntero("Introduce un número entero:");
        int num2 = Utilidades.leerEntero("Introduce un segundo número entero:");

        if (esDivisibleM(num1, num2)) {
            System.out.println("VERDADERO");
        } else {
            System.out.println("FALSO");
        }

    }
}
