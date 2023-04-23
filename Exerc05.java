package Recursividade;

import java.util.Scanner;

public class Exerc05 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Informe um valor: ");
		int num = sc.nextInt();
		sc.close();

		int digitos = contarDigitos(num);
		System.out.printf("O número %d possui %d dígitos.\n", num, digitos);
	}

	static int contarDigitos(int num) {
		if (num < 10) { // Condição de parada: o número tem apenas um dígito
			return 1;
		} else {
			int ant = contarDigitos(num / 10);
			return ant + 1; // Termo n em função do termo anterior
		}
	}

}