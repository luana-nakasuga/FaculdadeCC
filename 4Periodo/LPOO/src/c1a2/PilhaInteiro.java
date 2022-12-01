package c1a2;

import java.util.LinkedList;

/*
 * Verificar se a pilha está vazia (isEmpty) 
 * Empilhar (push): Inserir um elemento no topo da pilha 
 * Desempilhar (pop): Remover o elemento do topo da pilha 
 * Retornar o tamanho da pilha (size) 
 * Retorna o elemento do topo da pilha (top)
 */
public class PilhaInteiro {

	private LinkedList<Integer> pilha;

	public PilhaInteiro() {
		pilha = new LinkedList<Integer>();
	}

	public boolean isEmpty() {
		return pilha.isEmpty();
	}

	public void push(Integer elem) {
		pilha.addLast(elem);
	}

	public Integer pop() {
		return pilha.pop();
	}

	public Integer size() {
		return pilha.size();
	}

	public Integer top() {
		return pilha.getLast();

	}

}
