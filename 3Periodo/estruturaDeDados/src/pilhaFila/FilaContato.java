package pilhaFila;

/*
 * Verificar se a fila está vazia (isEmpty)
 * Enfileirar (enqueue): Inserir um elemento no final da fila
 * Desenfileirar (dequeue): Remover o elemento do início da fila
 * Retornar o tamanho da fila (size)
 * Retorna o elemento do início da fila (peek)
 */
public class FilaContato {
	private int nElem;
	private NoContato head, tail;

	public boolean isEmpty() {
		if (nElem == 0) {
			return true;
		}
		return false;
	}

	public int size() {
		return nElem;
	}

	public NoContato peek() {
		return head;
	}

	public void enqueue(Contato info) { // inserir
		NoContato aux = new NoContato(info);

		if (this.isEmpty()) {
			this.head = aux;
			this.tail = aux;
		}
		this.tail.setProx(aux);
		this.tail = aux;
		nElem++;
	}

	public NoContato dequeue() { // retirar
		NoContato aux;

		if (this.isEmpty()) {
			return null;
		} else if (this.nElem == 1) {
			aux = this.head;
			this.head = null;
			this.tail = null;
		}
		aux = this.head;
		this.head = this.head.getProx();
		nElem--;
		return aux;
	}

}
