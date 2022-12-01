package pilhaFila;

import listaSimplesmenteEncadeada.NoInt;

public class PilhaInt {
	private NoInt top;
	private int nElem;

	/*
	 * Verificar se a pilha está vazia (isEmpty) Empilhar (push): Inserir um
	 * elemento no topo da pilha Desempilhar (pop): Remover o elemento do topo da
	 * pilha Retornar o tamanho da pilha (size) Retorna o elemento do topo da pilha
	 * (top)
	 */
	public boolean isEmpty() {
		if (nElem == 0) {
			return true;
		}
		return false;
	}

	public void push(int num) {
		NoInt nodo = new NoInt(num);

		if (!this.isEmpty()) {
			nodo.setProx(this.top);
		}
		this.top = nodo;
		this.nElem++;
	}

	public NoInt pop() {
		NoInt aux = this.top;
		if (!this.isEmpty()) {
			this.top = aux.getProx();
			aux.setProx(null);
			this.nElem--;
		}
		return aux;
	}

	public int size() {
		return nElem;
	}

	public NoInt top() {
		return top;
	}

	public String toString() {
		String str = "";
		NoInt aux = this.top;
		for (int i = 0; i < this.nElem; i++) {
			str = str + aux.getInfo() + "  |  ";
			aux = aux.getProx();
		}
		return str;
	}
}
