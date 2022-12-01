package listaDuplamenteEncadeada;

/*
 *
pesquisa: retorna o nó que contém o valor a ser pesquisado ou Null se não encontrar

pesquisaAoContrario: faz a pesquisa do fim para o início
remove: remove o nó que contém o valor passado. Retorna true se a remoção foi bem sucedida e false caso contrário


 */
public class LdeInt {
	private NoDuplaInt prim, ult;
	private int nElem;

	/**
	 * 
	 */
	public LdeInt() {
		super();
	}

	public NoDuplaInt getPrim() {
		return prim;
	}

	public void setPrim(NoDuplaInt prim) {
		this.prim = prim;
	}

	public NoDuplaInt getUlt() {
		return ult;
	}

	public void setUlt(NoDuplaInt ult) {
		this.ult = ult;
	}

	public int getnElem() {
		return nElem;
	}

	// eVazia: retorna true se a lista estiver vazia e false caso contrário
	public boolean eVazia() {
		if (this.nElem == 0) {
			return true;
		} else {
			return false;
		}
	}
	// insereInicio: insere um No no início da lista
	public void insereInicio (int info) {
		NoDuplaInt novo = new NoDuplaInt(info);
		if (this.eVazia()) {
			this.ult = novo;
		} else {
			// prox do novo recebe prim
			// ant do prim recebe novo
			novo.setProx(this.prim);
			this.prim.setAnt(novo);
			
		}
		// prim recebe novo
		this.prim = novo;
		this.nElem++;
	}
	//insereUltimo: insere um No no final da lista
	public void insereFinal (int info) {
		NoDuplaInt novo = new NoDuplaInt(info);
		if (this.eVazia()) {
			this.prim = novo;
		} else {
			// prox do ult recebe novo
			// ant do novo recebe ult
			this.ult.setProx(novo);
			novo.setAnt(this.ult);
		}
		// ut recebe novo
		this.ult = novo;
		this.nElem++;
	}
	// pesquisa: retorna o nó que contém o valor a ser 
	//           pesquisado ou Null se não encontrar
	
	public NoDuplaInt pesquisa (int info) {
		NoDuplaInt aux = this.prim;
		 while (aux != null && aux.getInfo()!=info) {
			 aux = aux.getProx();
		 }
		 return aux;
	}
	
	// pesquisaAoContrario: faz a pesquisa do fim para o início
	public NoDuplaInt pesquisaAoContrario (int info) {
		NoDuplaInt aux = this.ult;
		 while (aux != null && aux.getInfo()!=info) {
			 aux = aux.getAnt();
		 }
		 return aux;
	}
	
	// remove: remove o nó que contém o valor passado. Retorna true se a 
	//         remoção foi bem sucedida e false caso contrário
	public boolean remove (int info) {
		NoDuplaInt aux = this.pesquisa(info);
		if (aux==null) {
			return false;
		} else if (this.nElem==1) {
			this.prim = null;
			this.ult = null;
		} else if (aux == this.prim){
			this.prim = this.prim.getProx();
			aux = aux.getProx();
			aux.setAnt(null);
		} else if (aux == this.ult){
			this.ult = this.ult.getAnt();
			aux = aux.getAnt();
			aux.setProx(null);			
		} else {
			NoDuplaInt ant;
			ant = aux.getAnt();
			aux = aux.getProx();
			ant.setProx(aux);
			aux.setAnt(ant);
		}
		this.nElem--;
		return true;
	}

	public String toString() {
		String temp = "";
		NoDuplaInt atual = this.prim;
		while (atual!= null) {
			temp += atual.toString()+"   ";
			atual = atual.getProx();
		}
		return temp;
	}
	// Escreva um método, na classe LdeInt, para inserir um novo nó na k-ésima posição 
	// de uma lista duplamente encadeada.
	public boolean inserir (int num, int pos) {
		if (pos<0 || pos>nElem) {
			return false;
		}
		if (pos==0) {
			insereInicio(num);
		}else if (pos==nElem) {
			insereFinal(num);
		}else {
			NoDuplaInt atual = this.getNo(pos);
			NoDuplaInt ant = atual.getAnt();
			NoDuplaInt novoNo  = new NoDuplaInt(num);
			ant.setProx(novoNo);
			novoNo.setAnt(ant);
			novoNo.setProx(atual);
			atual.setAnt(novoNo);
			this.nElem++;
		}
		return true;
	}
	
	// Escreva um método na classe LdeInt para remover o k-ésimo nó de 
	// uma lista encadeada.
	public boolean removePosicao (int pos) {
		NoDuplaInt aux = this.getNo(pos);
		if (aux==null) {
			return false;
		}else {
			this.remove(aux.getInfo());
			return true;
		}
	}
	
	// acessar o no da posicao k
	public NoDuplaInt getNo (int pos) {
		if (pos<0 || pos >= nElem) {
			return null;
		}
		NoDuplaInt aux = this.prim;
		for (int i=0; i<pos; i++) {
			aux = aux.getProx();
		}
		return aux;
	}

	// Escreva um método na classe LdeInt, que recebe uma Lista Duplamente Encadeada 
	// (L1) e concatena esta lista no final da lista chamadora (objeto do método).
	public void concatena (LdeInt lista1) {
		if (!lista1.eVazia()) {
			if (this.eVazia()) {
				this.prim = lista1.prim;
				this.ult = lista1.ult;
				this.nElem = lista1.nElem;
			} else {
				this.ult.setProx(lista1.prim);
				lista1.prim.setAnt(this.ult);
				this.ult = lista1.ult;
				this.nElem += lista1.nElem;
			}
		}
	}
	// Escreva um método na classe LdeInt, que recebe duas Listas 
	// Duplamente Encadeadas (L1 com vários nós e L2 vazia), dividir 
	// L1 ao meio, ou seja, metade dos elementos permanece em L1 e a 
	// segunda metade em L2.
	public void divide (LdeInt l1, LdeInt l2) {
		int pos = l1.nElem/2;
		NoDuplaInt aux = l1.getNo(pos);
		l2.prim = aux;
		l2.ult = l1.ult;
		aux = aux.getAnt();
		l1.ult = aux;
		l1.ult.setProx(null);
		l2.prim.setAnt(null);
		// atualiza o nElem
		l2.nElem = l1.nElem-(pos+1);
		l1.nElem = pos+1;
	}

}
