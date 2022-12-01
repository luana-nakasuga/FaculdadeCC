package pilhaFila;

public class PilhaChar {
	private NoChar top;
	private char nElem;

//isEmpty: verificar se a pilha está vazia	
	public boolean isEmpty() {
		if (nElem == 0) {
			return true;
		}
		return false;
	}

//push(empilhar): inserir um elemento no topo da pilha
	public void push(char carac) {
		NoChar nodo = new NoChar(carac);

		if (!this.isEmpty()) {
			nodo.setProx(this.top);
		}
		this.top = nodo;
		this.nElem++;
	}

//pop(desempilhar): remover o elemento do topo da pilha
	public NoChar pop() {
		NoChar aux = this.top;
		if (!this.isEmpty()) {
			this.top = aux.getProx();
			aux.setProx(null);
			nElem--;
		}
		return aux;
	}

//size: retornar o tamanho da pilha
	public char size() {
		return nElem;
	}

//top: retornar o elemento do topo da pilha
	public NoChar top() {
		return top;
	}

	public String toString() {
		String str = "";
		NoChar aux = this.top;
		for (char i = 0; i < this.nElem; i++) {
			str = str + aux.getInfo() + "  |  ";
			aux = aux.getProx();
		}
		return str;
	}
}
