import java.util.Arrays;
import java.util.Scanner;

public class Eliminar {
    public static int[] eliminarNumero(int[] numeros, int indice) {
        int elemento = numeros[indice];

        for (int i = indice; i < numeros.length -1; i++){
            numeros[i] = numeros[i+1];
            }
        numeros[numeros.length-1] = elemento;
        return numeros;
    }

    public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int[] numeros = {1, 2, 3, 4, 5};
            int indice = 2;


                System.out.println(Arrays.toString(eliminarNumero(numeros, indice)));

            }

        }
