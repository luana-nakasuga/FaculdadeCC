package pilhaFila;

import io.InOut;

public class AppChar {

	static private PilhaChar pilha = new PilhaChar();
	static private FilaChar fila = new FilaChar();

	public static void main(String[] args) {

		lerSequencia();
		boolean isPalindromo = verificaPalindromo();

		System.out.println(isPalindromo);

	}

	private static void lerSequencia() {
		String string = InOut.leString("Informe a sequencia de caracteres que deseja");

		for (int i = 0; i < string.length(); i++) {
			pilha.push(string.charAt(i));
			fila.enqueue(string.charAt(i));
		}

	}

	private static boolean verificaPalindromo() {

		if (pilha.pop().getInfo() != fila.dequeue().getInfo())
			return false;

		return true;
	}

}
