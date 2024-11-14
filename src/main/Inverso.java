import java.util.Arrays;

public class Inverso {

    public static int[] Alreves(int[] numeros){
        int[] inverso = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++){
            inverso[numeros.length -i - 1] = numeros[i];
        }
        return inverso;
    }


    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6};


        System.out.println(Arrays.toString(Alreves(numeros)));
    }
}
