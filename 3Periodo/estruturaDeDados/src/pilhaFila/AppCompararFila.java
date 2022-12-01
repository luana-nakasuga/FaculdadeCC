package pilhaFila;

import io.InOut;

public class AppCompararFila {
	/*
	 * Programa que testa se duas filas são ou não iguais. Ao final da execução, as
	 * duas filas devem estar no mesmo estado em que estavam no início
	 */
	public static void main(String[] args) {
		FilaInt fila1 = new FilaInt();
		FilaInt fila2 = new FilaInt();

		preencher(fila1);
		preencher(fila2);

		if (comparar(fila1, fila2)) {
			InOut.msgDeInformacao("COMPARAÇÃO", fila1.toString() + "\n" + fila2.toString() + "\nAs filas são iguais. ");
		} else {
			InOut.msgDeInformacao("COMPARAÇÃO",
					fila1.toString() + "\n" + fila2.toString() + "\nAs filas são diferentes. ");
		}

	}

	private static void preencher(FilaInt fila1) {
		int valor = InOut.leInt("Entre com um valor inteiro ou para sair: ");

		while (valor != 0) {
			fila1.enqueue(valor);
			valor = InOut.leInt("Entre com um valor inteiro ou para sair: ");
		}

	}

	private static boolean comparar(FilaInt fila1, FilaInt fila2) {
		FilaInt auxFila1 = new FilaInt();
		FilaInt auxFila2 = new FilaInt();
		boolean filasIguais = true;

		if (fila1.size() != fila2.size()) {
			return false;
		}

		while (!fila1.isEmpty() && filasIguais) {
			if (fila1.peek().getInfo() != fila2.peek().getInfo()) {
				return false;
			}
			auxFila1.enqueue(fila1.dequeue().getInfo());
			auxFila2.enqueue(fila2.dequeue().getInfo());
		}
		while (!auxFila1.isEmpty()) {
			fila1.enqueue(auxFila1.dequeue().getInfo());
			fila2.enqueue(auxFila2.dequeue().getInfo());

		}

		return false;
	}

}
