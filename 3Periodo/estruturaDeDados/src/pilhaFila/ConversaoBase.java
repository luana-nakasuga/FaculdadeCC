package pilhaFila;

import io.InOut;

public class ConversaoBase {
	/*
	 * Programa, usando PilhaInt, para converter um numero da base 10 para a base 2.
	 */
	public static void main(String[] args) {
		PilhaInt pilha = new PilhaInt();
		int num = InOut.leInt("Entre com um número inteiro");
		int div, resto;
		String str = "";

		div = num;
		while (div > 1) {
			resto = div % 2;
			pilha.push(resto);
			div = div / 2;
		}
		pilha.push(div);

		while (!pilha.isEmpty()) {
			str += pilha.pop();
		}
		InOut.msgDeInformacao("Conversao", "Decimal = " + num + "\nBinário = " + str);

	}

}
