package Recursividade;

import java.util.Scanner;

/*	Crie uma função recursiva que exiba o resultado do fatorial de um número (Pela limitação da
	recursividade, o número de entrada deverá ser baixo para não dar estouro(limite de entrada = 12)):
	O código deve trazer como comentários:
	A condição de parada
	Como escrever a função para o termo n em função do termo anterior */

public class Exerc03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um valor: ");
		int num = sc.nextInt();

		sc.close();

		System.out.printf("O resultado do fatorial de %d é: %d", num, rec(num));
	}

	static int rec(int num) {
		if (num < 1) {
			return 1;
			// Vai retornar o valor que está no else.
		} else {
			return num * rec(num - 1);
			// Vai receber um número digitado pelo usuário e em seguida fará a multiplicação n-1.
		}
	}
}
