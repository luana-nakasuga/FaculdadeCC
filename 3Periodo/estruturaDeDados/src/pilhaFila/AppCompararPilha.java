package pilhaFila;

import io.InOut;

public class AppCompararPilha {
	/*
	 * Programa que testa se duas pilhas s�o ou n�o iguais. Ao final da execu��o, as
	 * duas pilhas devem estar no mesmo estado em que estavam no in�cio.
	 */
	public static void main(String[] args) {
		PilhaInt pilha1 = new PilhaInt();
		PilhaInt pilha2 = new PilhaInt();

		preencher(pilha1);
		preencher(pilha2);

		if (comparar(pilha1, pilha2)) {
			InOut.msgDeInformacao("COMPARA��O",
					pilha1.toString() + "\n" + pilha2.toString() + "\n As pilhas s�o iguais. ");
		} else {
			InOut.msgDeInformacao("COMPARA��O",
					pilha1.toString() + "\n" + pilha2.toString() + "\n As pilhas s�o diferentes. ");
		}
	}

	public static void preencher(PilhaInt pilha1) {
		int valor = InOut.leInt("Entre com um n�mero inteiro ou 0 para sair: ");
		while (valor != 0) {
			pilha1.push(valor);
			valor = InOut.leInt("Entre com um n�mero inteiro ou 0 para sair: ");
		}
	}

	public static boolean comparar(PilhaInt pilha1, PilhaInt pilha2) {
		PilhaInt auxPilha1 = new PilhaInt();
		PilhaInt auxPilha2 = new PilhaInt();
		boolean pilhasIguais = true;

		if (pilha1.size() != pilha2.size()) {
			return false;
		}
		while (!pilha1.isEmpty() && pilhasIguais) {
			if (pilha1.top().getInfo() != pilha2.top().getInfo()) {
				pilhasIguais = false;
			}
			auxPilha1.push(pilha1.pop().getInfo());
			auxPilha2.push(pilha2.pop().getInfo());
		}

		while (!auxPilha1.isEmpty()) {
			pilha1.push(auxPilha1.pop().getInfo());
			pilha2.push(auxPilha2.pop().getInfo());
		}
		return pilhasIguais;
	}
}
