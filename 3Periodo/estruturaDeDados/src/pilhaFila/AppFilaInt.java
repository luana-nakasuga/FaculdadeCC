package pilhaFila;

import io.InOut;
import listaSimplesmenteEncadeada.NoInt;

public class AppFilaInt {
	/*
	 * Aplicativo para armazenar na fila v�rios valores inteiros (o programa deve
	 * parar de armazenar quando o usu�rio digitar 0 � zero) depois o programa deve
	 * mostrar o valor que est� no in�cio da fila, remover todos os elementos da
	 * fila e, em seguida, mostrar na tela todos os elementos removidos.
	 */
	public static void main(String[] args) {
		FilaInt fila = new FilaInt();

		preencher(fila);
		mostrarInicio(fila);
		remover(fila);

	}

	private static void preencher(FilaInt fila) {
		int valor;
		valor = InOut.leInt("Digite um valor inteiro ou digite 0 para terminar:");
		while (valor != 0) {
			fila.enqueue(valor);
			valor = InOut.leInt("Digite um valor inteiro ou digite 0 para terminar:");
		}

	}

	private static void mostrarInicio(FilaInt fila) {
		if (fila.isEmpty()) {
			InOut.msgDeInformacao("FILA", "A fila est� vazia.");
		}
		InOut.msgDeInformacao("FILA", "In�cio(valor): " + fila.peek().getInfo());

	}

	private static void remover(FilaInt fila) {
		NoInt aux;
		String str = "";

		if (fila.isEmpty()) {
			InOut.msgDeInformacao("FILA", "A fila est� vazia.");
		}
		while (!fila.isEmpty()) {
			aux = fila.dequeue();
			str += aux.getInfo() + "   ";
		}
		InOut.msgDeInformacao("FILA", "Foram removidos: " + str);
	}

}
