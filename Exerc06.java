package Recursividade;

import java.util.Scanner;

public class Exerc06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Leitura do número de 10 a 999999
		int num;
		do {
			System.out.print("Digite um número inteiro de 10 a 999999: ");
			num = sc.nextInt();
		} while (num < 10 || num > 999999);

		// Leitura do número de 0 a 9
		int digito;
		do {
			System.out.print("Digite um número inteiro de 0 a 9: ");
			digito = sc.nextInt();
		} while (digito < 0 || digito > 9);

		sc.close();

		int qtd = contarDigitos(num, digito);
		System.out.printf("O número: %d aparece: %d vezes no número %d.\n", digito, qtd, num);
	}

	static int contarDigitos(int num, int digito) {
		// Condição de parada: número tem apenas um dígito e é igual ao dígito desejado
		if (num == digito) {
			return 1;
		} else if (num < 10) { // Condição de parada: número tem apenas um dígito e é diferente do dígito
								// desejado
			return 0;
		} else {
			int ant = contarDigitos(num / 10, digito);
			// Termo n em função do termo anterior:
			// se o último dígito do número é igual ao dígito desejado, soma 1 ao termo
			// anterior
			// senão, mantém o valor do termo anterior
			return ant + ((num % 10 == digito) ? 1 : 0);
		}
	}

}