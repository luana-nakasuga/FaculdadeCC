package pilhaFila;

/*First In First Out
 * eVazia
 * eCheia - 
 * tam
 * head
 * tail
 * enqueue(elemento) inserir elemento na fila
 * dequeue() remover elemento do inicio da fila
 */

public class FilaIntCont {
	private int nElem;
	private int[] lista;

	public FilaIntCont(int tamanho) {
		this.lista = new int[10];
		nElem = 0;
	}

	public boolean eVazio() {
		if (nElem == 0) {
			return true;
		}
		return false;
	}

	public boolean eCheio() {
		if (this.nElem == this.lista.length) {
			return true;
		}
		return false;
	}

	public int tam() {
		return nElem;
	}

	public int head() {
		return lista[0];
	}

	public int tail() {
		return lista[nElem];
	}

	public void enqueue(int elem) {
		if (eCheio()) {
			return;
		}
		if (!eVazio()) {
			for (int i = nElem; i >= 0; i--) {
				lista[i + 1] = lista[i];
			}
		}
		lista[0] = elem;
		nElem++;
	}

	public int dequeue() {
		if (eVazio()) {
			return 111111111;
		}
		int tail = tail();
		nElem--;
		return tail;
	}

}
