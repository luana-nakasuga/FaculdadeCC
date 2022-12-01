package pilhaFila;

import io.InOut;
import listaSimplesmenteEncadeada.NoInt;

public class AppRemoveItem {

	public static void main(String[] args) {
		PilhaInt pilha = new PilhaInt();

		preencher(pilha);
		System.out.println(pilha.toString());
		remover(pilha);
		System.out.println(pilha);

		// preencher a pilha
		// remover o elemento
		// imprimir a pilha
	}

	private static void preencher(PilhaInt pilha) {
		int tamanho = InOut.leInt("Qual o tamanho da pilha?");
		int num;

		for (int i = 0; i < tamanho; i++) {
			num = InOut.leInt("Entre com um inteiro");
			pilha.push(num);
		}

	}

	private static void remover(PilhaInt pilha) {
		PilhaInt auxPilha = new PilhaInt();
		int num = InOut.leInt("Qual o numero a ser removido?");
		boolean achou = false;
		NoInt no;

		while (!achou && !pilha.isEmpty()) {
			no = pilha.pop();
			if (no.getInfo() == num) {
				achou = true;
			} else {
				auxPilha.push(no.getInfo());
			}
		}
		if (achou) {
			InOut.msgDeInformacao("SUCESSO", "Elemento removido");
		} else {
			InOut.msgDeErro("ERRO", "Elemento nao encontrado");
		}
		while (!auxPilha.isEmpty()) {
			no = auxPilha.pop();
			pilha.push(no.getInfo());
		}
	}
}
