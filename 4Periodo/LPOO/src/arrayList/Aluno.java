package arrayList;

public class Aluno {
	private String nome;
	private int matricula;
	private double nota1, nota2;
	private double media;
	
	public Aluno(String nome, int matricula, double nota1, double nota2) {
		this.nome = nome;
		this.matricula = matricula;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.setMedia();
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
		this.setMedia();
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
		this.setMedia();
	}

	public double getMedia() {
		return this.media;
	}

	private void setMedia() {
		this.media = (nota1 + nota2)/2;
	}

	public double compareTo(Aluno novo){
		return (this.getNome().compareToIgnoreCase(novo.getNome()));
		
	}
	@Override
	public String toString() {
		return "Aluno: " + nome + "\nMatricula: " + matricula + "\nNota 1: " + nota1 + "\nNota 2: " + nota2 + "\nMedia: "
				+ media;
	}
}
