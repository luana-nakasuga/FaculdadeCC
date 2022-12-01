package pilhaFila;

import io.InOut;

/*
Usando essa classe PilhaChar e/ou FilaChar, escreva um programa que solicite
ao usuário uma sequência de caracteres sem limite de máximo de tamanho e verifique se
o texto é um palíndromo, ou seja, se a string é escrita da mesma maneira de frente para
trás e de trás para frente. Ignore espaços e pontos.
Observação: Vocês só podem usar os métodos de String para preencher a fila e/ou
pilha. Para verificar se é palíndromo ou não, deve-se usar pilha e/ou fila. Caso
contrário, o exercício não será considerado. 
 */
public class AppPilhaChar {

	public static void main(String[] args) {
		PilhaChar pilha = new PilhaChar();

		preencher(pilha);
		verificar(pilha);

		boolean verificar = verificar(pilha);
		if (verificar) {
			InOut.msgDeInformacao("PALÍNDROMO", "\nA sequência dada é um palindromo.");
		}
		InOut.msgDeInformacao("PALÍNDROMO", "\nA sequência dada não é um palíndromo.");

	}

	private static PilhaChar preencher(PilhaChar pilha) {
		String caracteres = InOut.leString("Digite a sequência de caracteres: ");

		for (int i = 0; i < caracteres.length(); i++) {
			pilha.push(caracteres.charAt(i));
		}
		return pilha;
	}

	private static boolean verificar(PilhaChar pilha) {
		PilhaChar pilhaInvertida = new PilhaChar();
		NoChar aux = pilha.top();

		String caractere = "";
		String caractereAux = "";
		while (aux != null) {
			char info = pilha.pop().getInfo();
			caractere += info;
			pilhaInvertida.push(info);
			aux = pilha.top();
		}
		aux = pilhaInvertida.top();
		while (aux != null) {
			caractereAux += pilhaInvertida.pop().getInfo();
			aux = pilhaInvertida.top();
		}

		if (!caractere.equalsIgnoreCase(caractereAux)) {
			return false;
		}
		return true;
	}

}
