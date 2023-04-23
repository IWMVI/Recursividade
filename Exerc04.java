package Recursividade;

public class Exerc04 {
	public static void main(String[] args) {
		int[] vetor = { 3, -2, 1, 0, -5, 2, -4 };
		int negativos = contarNegativos(vetor, vetor.length);
		System.out.printf("O vetor possui %d números negativos.\n", negativos);
	}

	static int contarNegativos(int[] vetor, int n) {
		if (n == 0) { // Condição de parada: vetor vazio
			return 0;
		} else {
			int ant = contarNegativos(vetor, n - 1);
			int atual = vetor[n - 1] < 0 ? 1 : 0;
			return ant + atual; // Termo n em função do termo anterior
		}
	}
}
