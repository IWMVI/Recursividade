package Recursividade;

import java.util.Scanner;

/*	Criar uma aplicação em Java que tenha uma função recursiva que calcule o somatório do N primeiros
	número NATURAIS (a função deve retornar zero para números negativos)
	O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
	O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada dos passos */

public class Exerc01 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe um valor: ");
		int num = sc.nextInt();

		sc.close();

		System.out.printf("A somatória dos %d primeiros números naturais é: %d", num, rec(num));
	}

	static int rec(int num) {
		if (num < 1) {
			return 0;
		} else { 
			/* O num é carregado com o valor que o usuário informou, faz a primeira soma que é o próprio valor em seguida,
			 * ele retorna o valor somado para a função rec e se não for menor que 1, ela vai implementar o resultado da soma
			 * subtraindo 1 do valor informado pelo usuário.
			 */
			return num + rec(num - 1);
		}
	}
}
