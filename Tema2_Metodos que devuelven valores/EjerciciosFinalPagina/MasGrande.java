/*

//Diseña un algoritmo que lea dos valores y muestre el más grande de ellos.
public class MasGrande {
	public static int masgrande(int a, int b) {

		if (a > b) {
			return a;
		} else {
			return b;
		}
	}package metodos;

	//Diseña un algoritmo que lea un valor numérico
//entero correspondiente a la nota de un examen y muestre su valor en letra
	public class ValorNotaMain {
		public static void main(String argv[]) {
			int nota = Utilidades.leerEntero("Introduce el valor de la nota entera:");

			// Si las condiciones son mutuamente excluyentes, se usa if .. else if ...
			if ((nota < 0) || (nota > 10)) {
				System.out.println("Nota inválida");
			}else if (nota < 3) {
				System.out.println("Muy deficiente");
			}else if (nota < 5 ) {
				// No hace falta que comprobemos que es mayor que 3, porque si lo fuera
				// habría entrado por el if (nota < 3) {
				System.out.println("Insuficiente");
			}else if (nota < 6 ) {
				System.out.println("Suficiente");
			}else if (nota < 7 ) {
				System.out.println("bien");
			}else if (nota < 9 ) {
				System.out.println("Notable");
			}else {
				System.out.println("Sobresaliente");
			}

		}
	}
		public static void main(String argv[]) {
				int numero = Utilidades.leerEntero("Introduce un número entero:");
				int numero2 = Utilidades.leerEntero("Introduce otro número entero:");

	}
}
*/