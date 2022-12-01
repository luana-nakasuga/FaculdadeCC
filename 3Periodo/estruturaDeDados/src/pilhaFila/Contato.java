package pilhaFila;

import io.InOut;

public class Contato {
	static private FilaContato fila = new FilaContato();

	public Contato(String nome, String cpf, String celular) {
	}

	public static void main(String[] args) {

		menu();

	}

	private static void menu() {
		String enunciado = "CALL CENTER\n1 - Inserir contato.\n2 - Iniciar atendimento.\n3 - Sair.";
		int casos = 0; // começa do 0

		do {
			casos = InOut.leInt(enunciado);

			switch (casos) {
			case 1:
				inserirContato();
				break;
			case 2:
				efetuarContato();
				break;
			default:
				break;
			}
		} while (casos != 3);
	}

	private static void inserirContato() {
		// inserir nome, cpf e celular em uma objeto;
		// inserir a objeto na fila
		Contato contato = null;
		String nome = InOut.leString("Insira seu nome: ");
		String cpf = InOut.leString("Insira seu CPF: ");
		String celular = InOut.leString("Insira seu número de celular: ");

		contato = new Contato(nome, cpf, celular);
		fila.enqueue(contato);
	}

	private static Contato pegarContato() {
		// pegar o contato da fila, tirando ele da fila
		if (fila.isEmpty()) {
			return null;
		}
		return fila.dequeue().getInfo();

	}

	private static void efetuarContato() {
		// mostrar o contato na tela
		Contato contato = pegarContato();
		if (contato != null) {
			InOut.msgDeInformacao("Atendimento", "O próximo cliente:" + contato.toString());
		}
		InOut.msgDeAviso("Atendimento", "Não há mais clientes a serem atendidos. ");
	}

}
