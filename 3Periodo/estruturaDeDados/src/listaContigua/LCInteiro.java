package listaContigua;

public class LCInteiro {
	// atributo liscaCont(vetor, array inteiro, ent lista []) e nElem(int)
	private int[] listaCont;
	private int nElem;

	public LCInteiro(int tamanho) {
		this.listaCont = new int[tamanho];
		this.nElem = 0;
	}

	/*
	 * getNum (posicao) => retorna o elemento que esta na posicao (parametro). Caso
	 * a posicao n√£o seja valida, retorna null.
	 */
	public Integer getNum(int posicao) {
		if (posicao >= 0 && posicao < this.nElem) { // verifica se a posicao e valida
			return this.listaCont[posicao];
		} else {
			return null;
		}
	}

	/*
	 * getNElem() => retorna a quantidade de elementos da lista.
	 */
	public int getNElem() {
		return this.nElem;
	}

	/*
	 * tamanho () => retorna o tamanho do vetor
	 */
	public int tamanho() {
		return this.listaCont.length;
	}

	/*
	 * eVazio() => retorna verdadeiro se a lista estiver vazia e falso caso
	 * contr√°rio.
	 */
	public boolean eVazio() {
		if (this.nElem == 0) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * eCheio() => retorna verdadeiro se a lista estiver cheia e falso caso
	 * contr√°rio.
	 */
	public boolean eCheio() {
		if (this.nElem == this.tamanho()) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * pesquisa (num) => deve fazer uma pesquisa sequencial at√© encontrar num,
	 * retornando sua posi√ß√£o. Se ele n√£o existir, deve retornar -1
	 */
	public int pesquisa(int num) {
		for (int i = 0; i < this.nElem; i++) {
			if (this.listaCont[i] == num)
				return i;
		}
		return -1;
	}

	/*
	 * insere (num, posicao) => insere um n˙mero em uma posiÁ„o da lista deslocando
	 * todos os elementos que estiverem apÛs essa posiÁ„o para o Ìndice seguinte
	 * retornando 0 (zero). Se a lista estiver cheia, n„o deve inserir e deve
	 * retornar -1. Se a posiÁ„o for inv·lida, deve retornar -2.
	 */
	public int insere(int num, int posicao) {
		if (this.eCheio()) { // se tiver cheia nao add e retornar -1
			return -1;
		}
		if (posicao > this.listaCont.length && posicao < 0) { // posicao maior q a lista e posicao menor 0 È invalido,
																// retorna -2
			return -2;
		}

		for (int i = this.nElem - 1; i >= posicao; i--) { // vai comecar a mover os elementos do fim da lista
			listaCont[i + 1] = listaCont[i];
		}
		listaCont[posicao] = num; // em uma posicao da lista eu add um num
		this.nElem++; // informando q add um elem
		return 0;
	}

	/*
	 * insereFim (num) => insere um n˙mero no final da lista e retorna 0. Se ela
	 * estiver cheia, n„o deve inserir e deve retornar -1.
	 */
	public int insereFim(int num) {
		if (this.eCheio()) { // se tiver cheio n add e retorna -1
			return -1;
		}
		this.listaCont[nElem] = num; // no final add o num
		this.nElem++; // informando q add um elemento
		return 0;
	}

	/*
	 * deve remover um elemento da lista. Se conseguir, deve retornar true, se n√£o
	 * conseguir, retorna false.
	 */
	public boolean remove(int num) {
		int pos = this.pesquisa(num);
		if (pos == -1) {
			return false;
		} else {
			this.listaCont[pos] = this.listaCont[this.nElem - 1];
			this.nElem--;
			return true;
		}
	}

	/*
	 * retornar uma String contendo todos os elementos da lista, do primeiro at√© o
	 * √∫ltimo.
	 */
	public String toString() {
		String aux;
		if (this.eVazio()) {
			return "";
		} else {
			aux = "| ";
			for (int i = 0; i < this.nElem; i++) {
				aux += this.listaCont[i] + " | ";
			}
		}
		return aux;
	}

	public void divide(LCInteiro L2) {
		int metade = this.nElem / 2;
		LCInteiro aux = new LCInteiro(metade);
		for (int i = 0; i < metade; i++) {
			aux.insereFim(this.getNum(i));
		}
		L2 = new LCInteiro(metade + 1);
		for (int i = metade; i < this.nElem; i++) {
			L2.insereFim(this.getNum(i));
		}
		this.listaCont = aux.listaCont;
		this.nElem = aux.nElem;
	}

	public double media() {
		int soma = 0;
		for (int i = 0; i < this.getNElem(); i++) {
			soma += this.getNum(i);
		}
		return ((double) soma) / this.getNElem();
	}

	public boolean pertence(int elem) {
		int i = 0;
		while (i < this.nElem && this.getNum(i) != elem) {
			i++;
		}
		if (i == this.nElem) {
			return false;
		} else {
			return true;
		}
	}
}
