package c1a1;

import io.InOut;

public class AppClienteII {
	static Cliente[] vetor = new Cliente[10];

	public static void main(String[] args) {
		menu(vetor);
	}

	public static void menu(Cliente[] vetor) {
		String menu = "1 - Gerar senha\n\n2 - Atendimento\n\n3 - Sair";
		int opcao = 0;

		do {
			opcao = InOut.leInt(menu);

			switch (opcao) {
			case 1:
				gerarSenha(vetor);
				break;
			case 2:
				atendimento(vetor);
				break;
			case 3:
				break;
			}
		} while (opcao != 3);
	}

	/*
	 * Gerar senha => vai pedir ao usuário seu nome, instanciar o objeto Cliente e
	 * colocá-lo no vetor
	 */
	@SuppressWarnings("unused")
	private static void gerarSenha(Cliente[] vetor) {
		String nome = InOut.leString("Insira seu nome: ");
		Cliente cliente = null;
		boolean salvou = false;
		int i;

		for (i = 0; i < vetor.length; i++) {
			cliente = new Cliente(nome);
			vetor[i] = cliente;
			salvou = true;
			break;
		}
		if (salvou) {
			InOut.msgDeInformacao("SENHA", cliente.getSenha() + "");
		} else {
			InOut.msgDeAviso("AVISO", "Não é possível salvar mais clientes.");
		}
	}

	/*
	 * Atendimento => vai passar para a próxima senha, mostrar na tela a senha que
	 * será atendida e retirar o Cliente do vetor. Esse método deve usar os métodos
	 * da classe Cliente
	 */
	private static void atendimento(Cliente[] vetor) {
		Cliente.proximo();
		boolean existe = false;

		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == null) {
				continue;
			}
			if (vetor[i].getSenha() == Cliente.getSenhaGeral()) {
				existe = true;
				Cliente cliente = vetor[i];
				vetor[i] = null;
				InOut.msgDeInformacao("ATENDIMENTO", "O próximo cliente a ser atendido:\n" + cliente.toString());
				break;
			}
		}
		if (!existe) {
			InOut.msgDeAviso("AVISO", "Não existe cliente para ser atendido.");
		}

	}

}
