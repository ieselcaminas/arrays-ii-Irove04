
//Diseña un algoritmo que lea un valor numérico
//entero correspondiente a la nota de un examen y muestre su valor en letra
public class ValorNotaMain {
	public static String valorEnLetra(int nota) {

		// Si las condiciones son mutuamente excluyentes, se usa if .. else if ...
		if ((nota < 0) || (nota > 10)) {
			return "Nota inválida";
		} else if (nota < 3) {
			return "Muy deficiente";
		} else if (nota < 5) {
			// No hace falta que comprobemos que es mayor que 3, porque si lo fuera
			// habría entrado por el if (nota < 3) {
			return "Insuficiente";
		} else if (nota < 6) {
			return "Suficiente";
		} else if (nota < 7) {
			return "bien";
		} else if (nota < 9) {
			return "Notable";
		} else {
			return "Sobresaliente";
		}

	}

	public static void main(String[] argv) {
		int nota = Utilidades.leerEntero("Introduce el valor de una nota entera: ");
		String texto = valorEnLetra(nota);
		System.out.println(texto);

	}
}
