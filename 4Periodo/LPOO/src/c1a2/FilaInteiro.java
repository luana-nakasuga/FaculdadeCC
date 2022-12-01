package c1a2;

import java.util.LinkedList;

public class FilaInteiro {

	private LinkedList<Integer> fila;

	public FilaInteiro() {
		fila = new LinkedList<Integer>();
	}

	public boolean isEmpty() {
		return fila.isEmpty();
	}

	public void enqueue(Integer elem) {
		fila.addLast(elem);
	}

	public Integer dequeue() {
		return fila.removeFirst();
	}

	public Integer size() {
		return fila.size();
	}

	public Integer peek() {
		return fila.getFirst();
	}
}
