/*
2 EsTriangulo.java Si te dan tres palitos, puedes o no ser capaz de organizarlos en un triángulo.
Por ejemplo, si uno de los palos mide 12 cm de largo y los otros dos
tienen un cm de largo, no podrás hacer que los palitos cortos se encuentren en el medio.
Para tres longitudes, hay una prueba simple para ver si es posible formar un triángulo:
Si cualquiera de las tres longitudes es mayor que la suma de las otras dos,
no puedes formar un triángulo Escribe un método llamado esTriangulo que toma tres enteros como argumentos y devuelve
true o false, dependiendo de si puede o no formar un triángulo a partir de palitos con las longitudes dadas.
 */

public class ej2 {
    public static boolean esTriangulo(int palo1, int palo2, int palo3) {


        if ((palo3 > palo1 + palo2)
            || (palo2 > palo1 + palo3)
            || (palo1 > palo2 + palo3)) {
        return false;
        }else{
            return true;
        }
    }
    public static void main(String[] args) {
        int palo1 = Utilidades.leerEntero("Longitud del primer palito");
        int palo2 = Utilidades.leerEntero("Longitud del primer palito");
        int palo3 = Utilidades.leerEntero("Longitud del primer palito");

       if (esTriangulo(palo1, palo2, palo3)) {
           System.out.println("Si puedo");
       }else {
           System.out.println("No puedo");
       }
    }
}
