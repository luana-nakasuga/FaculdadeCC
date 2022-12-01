package c1a2;

import io.InOut;

public class AppPilhaFila {

	public static void main(String[] args) {
		PilhaInteiro pilha = new PilhaInteiro();
		FilaInteiro fila = new FilaInteiro();
		Integer elemento;
		String msgFila;
		String msgPilha;

		elemento = InOut.leInt("Entre com um inteiro ou 0 para sair: ");

		while (elemento != 0) {

			if (elemento % 2 == 0) {
				pilha.push(elemento);
			} else {
				fila.enqueue(elemento);
			}
			elemento = InOut.leInt("Entre com um inteiro ou 0 para sair: ");
		}
		if (!pilha.isEmpty()) {
			msgPilha = "O numero que esta no topo da pilha:  " + pilha.top() + "  ";
		} else {
			msgPilha = "A pilha esta vazia.";
		}
		if (!fila.isEmpty()) {
			msgFila = "O numero que esta no inicio da fila:  " + fila.peek() + "  ";
		} else {
			msgFila = "A fila esta vazia.";
		}
		InOut.msgDeInformacao("IMPRESSAO", msgPilha + "\n\n" + msgFila);

	}

}
