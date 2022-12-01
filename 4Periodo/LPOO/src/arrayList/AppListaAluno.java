package arrayList;

import java.util.ArrayList;

import io.InOut;

public class AppListaAluno {

	public static void main(String[] args) {

		ArrayList<Aluno> alunos = new ArrayList<Aluno>();
		String menu = "1 - Inserir aluno\n2 - Remover aluno\n3 - Alterar nota\n4 - Visualizar aluno\n5 - Imprimir alunos\n6 - Sair";
		int opcao = 0;

		do {
			opcao = InOut.leInt(menu);

			switch (opcao) {
			case 1:
				inserirAluno(alunos);
				break;
			case 2:
				removerAluno(alunos);
				break;
			case 3:
				alterarNota(alunos);
				break;
			case 4:
				mostrarAluno(alunos);
				break;
			case 5:
				imprimirTodos(alunos);
				break;
			case 6:
				break;
			default:
				InOut.msgDeErro("ERRO", "Op��o inv�lida!");
			}
		} while (opcao != 6);
	}

	private static void inserirAluno(ArrayList<Aluno> alunos) {
		String nome = InOut.leString("Nome do aluno: ");
		int matricula = InOut.leInt("Matricula do aluno: ");
		double nota1 = InOut.leDouble("Nota 1: ");
		double nota2 = InOut.leDouble("Nota 2: ");

		alunos.add(new Aluno(nome, matricula, nota1, nota2));

	}

	public static Aluno pesquisar(ArrayList<Aluno> alunos, String nome) {

		for (Aluno i : alunos) {
			if (i.getNome().equalsIgnoreCase(nome)) {
				return i;
			}
		}
		return null;
	}

	private static void removerAluno(ArrayList<Aluno> alunos) {
		String nomeAluno = InOut.leString("Nome do aluno a ser removido: ");
		Aluno aluno = pesquisar(alunos, nomeAluno);

		if (aluno != null) {
			alunos.remove(aluno);
			InOut.msgDeInformacao("REMO��O DE ALUNO", "Remo��o do aluno " + nomeAluno + " efetuado com sucesso.");
		} else {
			InOut.msgDeErro("ERRO", "O aluno " + nomeAluno + " n�o est� cadastrado.");
		}
	}

	private static void alterarNota(ArrayList<Aluno> alunos) {
		String nomeAluno = InOut.leString("Nome do aluno a ter as notas alteradas: ");
		Aluno aluno = pesquisar(alunos, nomeAluno);

		if (aluno != null) {
			double nota1 = InOut.leDouble("Nova nota 1: ");
			double nota2 = InOut.leDouble("Nova nota 2: ");
			aluno.setNota1(nota1);
			aluno.setNota2(nota2);
			InOut.msgDeInformacao("ALTERA��O DAS NOTAS", "Altera��o das notas efetuadas com sucesso.");
		} else {
			InOut.msgDeErro("ERRO", "O aluno " + nomeAluno + " n�o est� cadastrado.");
		}
	}

	private static void mostrarAluno(ArrayList<Aluno> alunos) {
		String nomeAluno = InOut.leString("Nome do aluno a ser visualizado: ");
		Aluno aluno = pesquisar(alunos, nomeAluno);
		if (aluno != null) {
			InOut.msgDeInformacao("VISUALIZA��O DOS DADOS DO ALUNO", aluno.toString());
		} else {
			InOut.msgDeErro("ERRO", "O aluno " + nomeAluno + " n�o est� cadastrado.");
		}

	}

	private static void imprimirTodos(ArrayList<Aluno> alunos) {
		for (Aluno aluno : alunos) {
			InOut.msgDeInformacao("ALUNOS CADASTRADOS", aluno.getNome() + "\n");
		}
	}

}
