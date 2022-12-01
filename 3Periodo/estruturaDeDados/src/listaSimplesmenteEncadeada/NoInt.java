package listaSimplesmenteEncadeada;

public class NoInt {
	private int info;
	NoInt prox;
	/**
	 * @param info
	 */
	public NoInt(int info) {
		this.info = info;
		this.prox = null;// nao precisa fazer
	}
	public int getInfo() {
		return info;
	}
	public void setInfo(int info) {
		this.info = info;
	}
	public NoInt getProx() {
		return prox;
	}
	public void setProx(NoInt prox) {
		this.prox = prox;
	}
	public String toString() {
		return this.info+"";
	}
	

}
