package pilhaFila;

import io.InOut;

public class AppLerRemoverPilha {
	/*
	 * Fa�a um programa que leia 10 n�meros inteiros e armazene-o em uma pilha.
	 * retire os valores maiores que 10 desta pilha. Voc� deve fazer pelo menos dois
	 * m�todos: Um para ler e empilhar os n�meros e outro para fazer a remo��o dos
	 * n�meros maiores que 10.
	 */
	public static void main(String[] args) {
		PilhaInt pilha = new PilhaInt();

		ler(pilha);
		InOut.msgDeInformacao("PILHA DE ENTRADA", "Esse s�o os valores inseridos: " + "\n" + pilha);
		remover(pilha);
		InOut.msgDeInformacao("PILHA COM REMOVIDOS", "Esses s�o os valores removidos: " + "\n" + pilha);

	}

	private static void ler(PilhaInt pilha) {
		int tamanho = 10;

		for (int i = 0; i < tamanho; i++) {
			int valor = InOut.leInt("Entre com um n�mero inteiro: ");
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
