public class Duplicados {
    public static String duplicados(int[] num1) {
            String numDuplicados = "";
            for (int i = 0; i < num1.length; i++) {
                for (int j = i + 1; j < num1.length; j++) {
                    if (num1[i] == num1[i + 1]) {
                        numDuplicados += num1[i] + " ";
                        break;
                    }
                }
            }
            return numDuplicados;
    }
    public static void main(String[] args) {
        int[] anArray = {1, 2, 2, 3, 4, 5, 6, 6};
        String duplicados = duplicados(anArray);
        System.out.println(duplicados);
    }
}
