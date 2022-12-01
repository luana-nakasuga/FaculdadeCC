package aprovacaoAluno;

public class Aluno {
	private String nome;
	private double media;
	private int falta;
	/**
	 * @param nome
	 * @param media
	 * @param falta
	 */
	public Aluno(String nome, double media, int falta) {
		this.nome = nome;
		this.media = media;
		this.falta = falta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(double media) {
		this.media = media;
	}
	public int getFalta() {
		return falta;
	}
	public void setFalta(int falta) {
		this.falta = falta;
	}
	@Override
	public String toString() {
		return "nome=" + nome + ", media=" + media + ", falta=" + falta;
	}
}
