/*
17 Realiza un programa que pida al usuario un mes e
imprima el número de días que tiene. (F)
 */

import java.util.Scanner;

public class ej17 {
    public static int diasMes(int mes){
        switch (mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                return 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        //variables
        int mes;
        int dias;
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un mes: ");
        mes = entrada.nextInt();
        dias = diasMes(mes);
        if (dias == -1){
            System.out.println("El mes no existe");
        }else {
            System.out.println("El mes tiene: " + dias + " dias");
        }
    }
}
