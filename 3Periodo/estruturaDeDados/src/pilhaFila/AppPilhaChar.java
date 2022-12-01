package pilhaFila;

import io.InOut;

/*
Usando essa classe PilhaChar e/ou FilaChar, escreva um programa que solicite
ao usu�rio uma sequ�ncia de caracteres sem limite de m�ximo de tamanho e verifique se
o texto � um pal�ndromo, ou seja, se a string � escrita da mesma maneira de frente para
tr�s e de tr�s para frente. Ignore espa�os e pontos.
Observa��o: Voc�s s� podem usar os m�todos de String para preencher a fila e/ou
pilha. Para verificar se � pal�ndromo ou n�o, deve-se usar pilha e/ou fila. Caso
contr�rio, o exerc�cio n�o ser� considerado. 
 */
public class AppPilhaChar {

	public static void main(String[] args) {
		PilhaChar pilha = new PilhaChar();

		preencher(pilha);
		verificar(pilha);

		boolean verificar = verificar(pilha);
		if (verificar) {
			InOut.msgDeInformacao("PAL�NDROMO", "\nA sequ�ncia dada � um palindromo.");
		}
		InOut.msgDeInformacao("PAL�NDROMO", "\nA sequ�ncia dada n�o � um pal�ndromo.");

	}

	private static PilhaChar preencher(PilhaChar pilha) {
		String caracteres = InOut.leString("Digite a sequ�ncia de caracteres: ");

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
