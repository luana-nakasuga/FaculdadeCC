package aprovacaoAluno;

import io.InOut;

public class AppAluno {
	/*
	 * Faça um programa em Java que leia o nome de 5 alunos, a média deles e o
	 * número de faltas. Depois, escreva na tela se o aluno está aprovado, reprovado
	 * por falta ou reprovado por nota. O aluno está reprovado por falta se tiver
	 * mais que 20 faltas e reprovado por nota se tiver menos que 20 faltas e nota
	 * abaixo de 5. Escreva também o aluno com maior média.
	 */
	public static void main(String[] args) {
		Aluno[] vetAluno = new Aluno[5];

		// ler os dados
		// imprimir alunos na tela
		// imprimir aluno com maior media

		cadastrar(vetAluno);
		imprimirDados(vetAluno);
		maiorMedia(vetAluno);
	}

//inserir dados do aluno
//variaveis nome, media falta e aluno 
//inserir esses dados em aluno de acordo com i	 
	private static void cadastrar(Aluno[] vetAluno) {
		String nome;
		double media;
		int falta;
		Aluno aluno;
		for (int i = 0; i < vetAluno.length; i++) {
			nome = InOut.leString("Entre com o nome do aluno" + (i + 1));
			media = InOut.leDouble("Entre com a media de " + nome);
			falta = InOut.leInt("Entre com as faltas de " + nome);
			aluno = new Aluno(nome, media, falta);
			vetAluno[i] = aluno;
		}
	}

//se o aluno tiver >20 faltas, imprimir reprovado por falta 
//se o aluno tiver media>=5, imprimir aprovado
//se o aluno tiver falta<20 mas media<5, imprimir reprovado por nota
	private static void imprimirDados(Aluno[] vetAluno) {
		for (int i = 0; i < vetAluno.length; i++) {
			System.out.print(vetAluno[i].getNome() + "  esta   ");

			if (vetAluno[i].getFalta() > 20) {
				System.out.println("REPROVADO POR FALTA");

			} else if (vetAluno[i].getMedia() >= 5) {
				System.out.println("APROVADO");

			} else {
				System.out.println("REPROVADO POR NOTA");

			}
		}
	}

//procurar maior media um por um usar um aux; 
//se a media do i > aux 
//inserir a maior media no "aux" 
//imprimir a maior média
	private static void maiorMedia(Aluno[] vetAluno) {
		int posMaior = 0;
		for (int i = 1; i < vetAluno.length; i++) {
			if (vetAluno[i].getMedia() > vetAluno[posMaior].getMedia()) {
				posMaior = i;
			}
		}
		System.out.println("MAIOR MEDIA = " + vetAluno[posMaior].getMedia() + "   ALUNOS");
		for (int i = posMaior; i < vetAluno.length; i++) {
			if (vetAluno[i].getMedia() == vetAluno[posMaior].getMedia()) {
				System.out.println(vetAluno[i].getNome());
			}
		}
	}
}
