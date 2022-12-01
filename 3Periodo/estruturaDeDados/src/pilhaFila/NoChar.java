package pilhaFila;

public class NoChar {
	private char info;
	NoChar prox;

	public NoChar(char info) {
		this.info = info;
	}

	public char getInfo() {
		return info;
	}

	public void setInfo(char info) {
		this.info = info;
	}

	public NoChar getProx() {
		return prox;
	}

	public void setProx(NoChar prox) {
		this.prox = prox;
	}

	public String toString() {
		return this.info + "";
	}
}
