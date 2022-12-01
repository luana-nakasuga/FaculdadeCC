package avaliacaoDiagnostica;

import io.InOut;

public class AppEmpresa {
	private static VetVendedor vet;

	public static void main(String[] args) {
		vet = new VetVendedor();

		menu();
	}

	private static void menu() {
		String menu = "1 - Cadastrar vendedor.\n2 - Imprimir folha de pagamento.\n3 - Imprimir Média de Vendas por Categoria.\n4 - Sair.";
		int opcao;
		do {
			opcao = InOut.leInt(menu);
			switch (opcao) {
			case 1:
				cadastrarVendedor();
				break;
			case 2:
				folhaPagamento();
				break;
			case 3:
				mediaVendasPorCategoria();
				break;
			case 4:
				InOut.msgDeInformacao("FECHANDO", "Fechando o programa.");
				break;
			default:
				System.out.println("Opcao invalida. Tente novamente.");
			}
		} while (opcao != 4);
	}

	private static void cadastrarVendedor() {
		char continuar = 's';
		String nome;
		int tempoServico;
		double quantidadeVendas;

		do {
			nome = InOut.leString("Nome: ");
			tempoServico = InOut.leInt("Tempo de servico: ");
			quantidadeVendas = InOut.leDouble("Vendas: ");

			Vendedor vendedor = new Vendedor(nome, tempoServico, quantidadeVendas);

			if (vet.insert(vendedor) != -1) {
				continuar = InOut.leChar("Deseja continuar? (s/n)");
			} else {
				InOut.msgDeAviso("VETOR CHEIO", "Nao e possivel cadastrar mais funcionarios.");
				continuar = 'n';
			}

		} while (continuar != 'n');

	}

	private static void folhaPagamento() {
		double soma = 0;

		for (int i = 0; i < vet.getnElem(); i++) {

			Vendedor vendedor = vet.getVendedor(i);

			InOut.msgDeInformacao("FOLHA DE PAGAMENTO", vendedor.getNome() + "\nSalario: R$" + vendedor.salario());

			soma += vendedor.salario();
		}
		InOut.msgDeInformacao("FOLHA DE PAGAMENTO", "Total de salarios: \n" + "R$ " + soma);
	}

	private static void mediaVendasPorCategoria() {

		InOut.msgDeInformacao("M�DIA DE VENDAS", "CATEGORIA A: R$ " + vet.mediaVendas('A') + "\nCATEGORIA B: R$ "
				+ vet.mediaVendas('B') + "\nCATEGORIA C: R$ " + vet.mediaVendas('C'));
	}

}
