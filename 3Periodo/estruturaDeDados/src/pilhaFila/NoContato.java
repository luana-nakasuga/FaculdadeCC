package pilhaFila;

/*
 * Programa que administra uma fila de contatos para um call center.
 * É necessário uma classe Contato que modela um objeto 
 * com o nome, cpf e celular da pessoa
 */
public class NoContato {
	private Contato info;
	NoContato prox;

	public NoContato getProx() {
		return prox;
	}

	public void setProx(NoContato prox) {
		this.prox = prox;
	}

	public NoContato() {
		super();
	}

	public NoContato(Contato info) {
		this.info = info;
	}

	public Contato getInfo() {
		return info;
	}

	public void setInfo(Contato info) {
		this.info = info;
	}
}
