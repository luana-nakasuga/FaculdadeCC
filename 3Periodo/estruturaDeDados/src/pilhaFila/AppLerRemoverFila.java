package pilhaFila;

import io.InOut;
import listaSimplesmenteEncadeada.NoInt;

public class AppLerRemoverFila {
	/*
	 * Faça um programa que leia 10 números inteiros e armazene-o em uma fila. Em
	 * seguida, retire os valores maiores que 10 desta fila. Obs.: Você deve fazer
	 * pelo menos dois métodos: Um para ler e enfileirar os números e outro para
	 * fazer a remoção dos números maiores que 10.
	 */
	public static void main(String[] args) {
		FilaInt fila = new FilaInt();

		preencher(fila);
		InOut.msgDeInformacao("FILA", "Esse são os valores inseridos: " + "\n" + fila);
		remover(fila);
		InOut.msgDeInformacao("FILA", "Esses são os valores removidos: " + "\n" + fila);
	}

	private static void preencher(FilaInt fila) {
		int tamanho = 10;

		for (int i = 0; i < tamanho; i++) {
			int valor = InOut.leInt("Entre com um número inteiro: ");
			fila.enqueue(valor);
		}

	}

	private static void remover(FilaInt fila) {
		NoInt no;
		String str = "";

		while (!fila.isEmpty()) {
			no = fila.dequeue();
			if (no.getInfo() > 10) {
				str += no.getInfo() + "  ";
			}
		}
		InOut.msgDeInformacao("FILA", "Foram removidos os seguintes números: " + str);

	}
}
