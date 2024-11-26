public class SumaIgual {
    public static String sumaIgual(int[] numeroSumados, int suma) {
        String resultado = "";
        for (int i = 0; i < numeroSumados.length; i++) {
            for (int j = i + 1; j < numeroSumados.length; j++) {
                if (numeroSumados[i] + numeroSumados[j] == suma) {
                    resultado += "[" + numeroSumados[i] + " + " + numeroSumados[j] + "] ";
                }
            }
        }
        return resultado;
    }


        public static void main(String[] args) {
            int[] numeros = {1, 2, 3, 4, 5, 6};
            int suma = 8;

            String resultado = sumaIgual(numeros, suma);

                    System.out.println("Los pares con suma igual a: " + suma + " = " + resultado);
        }
    }
