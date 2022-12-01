package pilhaFila;

import io.InOut;
import listaSimplesmenteEncadeada.NoInt;

public class AppLerRemoverFila {
	/*
	 * Fa�a um programa que leia 10 n�meros inteiros e armazene-o em uma fila. Em
	 * seguida, retire os valores maiores que 10 desta fila. Obs.: Voc� deve fazer
	 * pelo menos dois m�todos: Um para ler e enfileirar os n�meros e outro para
	 * fazer a remo��o dos n�meros maiores que 10.
	 */
	public static void main(String[] args) {
		FilaInt fila = new FilaInt();

		preencher(fila);
		InOut.msgDeInformacao("FILA", "Esse s�o os valores inseridos: " + "\n" + fila);
		remover(fila);
		InOut.msgDeInformacao("FILA", "Esses s�o os valores removidos: " + "\n" + fila);
	}

	private static void preencher(FilaInt fila) {
		int tamanho = 10;

		for (int i = 0; i < tamanho; i++) {
			int valor = InOut.leInt("Entre com um n�mero inteiro: ");
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
		InOut.msgDeInformacao("FILA", "Foram removidos os seguintes n�meros: " + str);

	}
}
