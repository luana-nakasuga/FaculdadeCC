package pilhaFila;

public class FilaChar {
	private NoChar head, tail;
	private char nElem;

//isEmpty: verificar se está vazia	
	public boolean isEmpty() {
		if (nElem == 0) {
			return true;
		}
		return false;
	}

//enqueue(enfileirar): inserir um elemento no final da fila
	public void enqueue(char info) {
		NoChar aux = new NoChar(info);

		if (this.isEmpty()) {
			this.head = aux;
			this.tail = aux;
		}
		this.tail.setProx(aux);
		this.tail = aux;
		this.nElem++;
	}

//dequeue(desenfileirar): remover elemento do início da fila
	public NoChar dequeue() {
		NoChar aux;
		if (this.isEmpty()) {
			return null;
		}
		if (nElem == 1) {
			aux = this.head;
			this.head = null;
			this.tail = null;
		}
		aux = this.head;
		this.head = this.head.getProx();
		this.nElem--;
		return aux;
	}

//size: retornar o tamanho da fila
	public char size() {
		return nElem;
	}

//peek: retornar o elemento do início da fila
	public NoChar peek() {
		return head;
	}

	public String toString() {
		String str = "";
		NoChar aux = this.head;

		while (aux != null) {
			str += aux.getInfo() + "   ";
			aux = aux.getProx();
		}
		return str;
	}
}
