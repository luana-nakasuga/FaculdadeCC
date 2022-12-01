package pilhaFila;

/* Last In First Out
 * eVazia
 * eCheia - 
 * tam
 * push(elemento) empilhar elem no topo
 * pop() desempilhar elemento do topo
 * 
 */
public class PilhaIntCont {
	private int nElem;
	private int[] lista;

	public PilhaIntCont(int tamanho) {
		this.lista = new int[tamanho];
		nElem = 0;
	}

	public boolean eVazia() {
		if (nElem == 0) {
			return true;
		}
		return false;
	}

	public boolean eCheia() {
		if (nElem == this.lista.length) {
			return true;
		}
		return false;
	}

	public int tam() {
		return nElem;
	}

	public int topo() {
		return lista[nElem];
	}

	public void push(int elem) {
		if (eCheia()) {
			return;
		}
		lista[nElem] = elem;
		nElem++;

	}

	public int pop() {
		if (eVazia()) {
			return 1111111111;
		}
		int desempilhar = lista[nElem - 1];
		nElem--;
		return desempilhar;
	}
}
