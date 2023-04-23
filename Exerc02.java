package Recursividade;

import java.util.Random;
import java.util.Scanner;

/*	Criar uma aplicação em Java que tenha uma função recursiva que, recebendo um vetor de inteiros, o
	tamanho do vetor e o valor da última posição do vetor como o primeiro menor valor, retorne o menor
	valor contido neste vetor.
	O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
	O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada dos passos;
*/

public class Exerc02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Informe o tamanho do vetor: ");
		int tam = sc.nextInt();
		int[] vet = new int[tam];

		// Preenche o vetor com valores aleatórios entre 0 e 100
		Random rand = new Random();
		for (int i = 0; i < tam; i++) {
			vet[i] = rand.nextInt(101);
		}

		for (int i = 0; i < tam; i++) {
			System.out.printf("%dª porsição: %d\n", i + 1, vet[i]);
		}

		// Chama a função recursiva passando o vetor e o tamanho
		int menor = rec(vet, tam);
		System.out.printf("\nO tamanho do vetor é %d e o menor número contido é: %d", tam, menor);

		sc.close();
	}

	// Função recursiva que retorna o menor valor contido no vetor
	static int rec(int[] vet, int tam) {
		// Condição de parada: se o vetor tem apenas um elemento, retorna esse elemento
		if (tam == 1) {
			return vet[0];
		} else {
			// Encontra o menor valor da sublista sem o último elemento
			int menor = rec(vet, tam - 1);
			// Compara o menor valor encontrado com o último elemento
			if (vet[tam - 1] < menor) {
				return vet[tam - 1];
			} else {
				return menor;
			}
		}
	}
}
