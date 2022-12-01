package pilhaFila;

import io.InOut;

public class AppLerRemoverPilha {
	/*
	 * Faça um programa que leia 10 números inteiros e armazene-o em uma pilha.
	 * retire os valores maiores que 10 desta pilha. Você deve fazer pelo menos dois
	 * métodos: Um para ler e empilhar os números e outro para fazer a remoção dos
	 * números maiores que 10.
	 */
	public static void main(String[] args) {
		PilhaInt pilha = new PilhaInt();

		ler(pilha);
		InOut.msgDeInformacao("PILHA DE ENTRADA", "Esse são os valores inseridos: " + "\n" + pilha);
		remover(pilha);
		InOut.msgDeInformacao("PILHA COM REMOVIDOS", "Esses são os valores removidos: " + "\n" + pilha);

	}

	private static void ler(PilhaInt pilha) {
		int tamanho = 10;

		for (int i = 0; i < tamanho; i++) {
			int valor = InOut.leInt("Entre com um número inteiro: ");
			pilha.push(valor);
		}

	}

	private static void remover(PilhaInt pilha) {
		PilhaInt auxPilhaInt = new PilhaInt();
		int num;

		while (!pilha.isEmpty()) {
			num = pilha.pop().getInfo();
			if (num >= 10) {
				auxPilhaInt.push(num);
			}
		}
		while (!auxPilhaInt.isEmpty()) {
			pilha.push(auxPilhaInt.pop().getInfo());
		}

	}

}
