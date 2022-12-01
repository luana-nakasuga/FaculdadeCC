package listaSimplesmenteEncadeada;

public class LseIntV2 {
	private int nElem;
	private NoInt prim, ult;
	
	public LseIntV2(){
		this.nElem = 0;
		this.prim = null;
		this.ult = null;
	}

	public NoInt getPrim() {
		return prim;
	}

	public void setPrim(NoInt prim) {
		this.prim = prim;
	}

	public NoInt getUlt() {
		return ult;
	}

	public void setUlt(NoInt ult) {
		this.ult = ult;
	}

	public int getnElem() {
		return nElem;
	}
	/*
	 * eVazia: retorna true se a lista estiver vazia 
	 * e false caso contrario
	 */
	public boolean eVazia(){
		if (this.nElem==0){
			return true;
		}else{
			return false;
		}
	}
	/*
	 * insereUltimo: insere um No no final da lista
	 */
	public void insereUltimo (int info){
		NoInt novo = new NoInt(info); // instanciar o novo No
		if (eVazia()){
			this.prim = novo;
		}else{
			this.ult.setProx(novo);
		}
		this.ult = novo;
		this.nElem++;
	}
	/*
	 * insereInicio: insere um No no inicio da lista
	 */
	public void insereInicio (int info){
		NoInt novo = new NoInt(info); // instanciar o novo No
		if (eVazia()){
			this.ult = novo;
		}else{
			novo.setProx(this.prim);
		}
		this.prim = novo;
		this.nElem++;
	}
	/*
	 * pesquisa: retorna o no que contem o valor a ser pesquisado ou 
	 * Null se nao encontrar
	 */
	public NoInt pesquisa (int info)
	{
		NoInt aux = prim;
		
		while (aux != null && aux.getInfo()!=info){
			aux = aux.getProx();// vai para o proximo
		}
		return aux;
	}
	/*
	 * remove: remove o no que contem o valor passado. Retorna true 
	 * se a remocao foi bem sucedida e false caso contrario
	 */
	public boolean remove (int info){
		NoInt ant;
		NoInt atual = prim;
		if (eVazia()){
			return false;
		}else if (prim.getInfo()==info){
			prim = prim.getProx();
			if (this.nElem==1){
				ult = null;
			}
			this.nElem--;
			return true;
		}
		//situacao 2 -> remover do meio
		//situacao 3 -> remover o ultimo
		ant = prim;
		atual = prim.getProx();
		// percorre a lista
		while (atual!=null) {
			if (atual.getInfo()==info) {
				ant.setProx(atual.getProx());
				if (atual.getProx()==null) {
					// situacao 3: remover o ultimo
					this.ult = ant;
				}
				this.nElem--; 
				return true;
			}
			// atualizar ant e atual
			ant = atual;
			atual = atual.getProx();
		}
		return false;
	}
	public String toString() {
		String temp = "";
		NoInt atual = this.prim;
		while (atual!= null) {
			temp += atual.toString()+"   ";
			atual = atual.getProx();
		}
		return temp;
	}
	// Exercicio 01
	public NoInt ElementoPosicao (int pos) {
		int i=0;
		NoInt atual;
		if (pos<0 || pos>= this.nElem)
			return null;
		atual = this.getPrim();
		while (i!=pos) {
			atual = atual.getProx();
			i++;
		}
		return atual;
	}
	// Exercicio 02
	public boolean inserirPosicao (int valor, int pos) {
		NoInt ant, atual, novo;
		int i;
		if (pos<0 || pos>this.getnElem()) {
			return false;
		}
		if (pos ==0) {
			this.insereInicio(valor);
		} else if (pos==this.getnElem()) {
			this.insereUltimo(valor);
		}else {
			// percorrer a lista até a posicao desejada
			atual = this.getPrim();
			ant = atual;
			// para chegar na posicao
			for (i=0; i!=pos; i++){
				ant = atual;
				atual = atual.getProx();
			}
			novo = new NoInt(valor);
			ant.setProx(novo);
			novo.setProx(atual);
			this.nElem++;
		}
		return true;
	}
	// Exercicio 03
	public boolean removerPosicao (int pos) {
		NoInt atual;
		if (pos<0 || pos>=this.getnElem()) {
			return false;
		}
		atual = ElementoPosicao(pos);
		if (atual==null) {
			return false;
		}else {
			this.remove(atual.getInfo());
			return true;
		}
	}
	public boolean removerPosicaoV2 (int pos) {
		NoInt atual, ant;
		if (pos<0 || pos>=this.getnElem()) {
			return false;
		}
		if (pos==0) {
			this.prim = this.prim.getProx();
			this.nElem--;
		}else {
			atual = this.prim.getProx();
			ant = this.prim;
			for (int i=1; i<pos; i++) {
				ant = atual; 
				atual = atual.getProx();
			}
			ant.setProx(atual.getProx());
			this.nElem--;
		}
		return true;
	}
	// exercicio 04
	public void divide (LseIntV2 l1, LseIntV2 l2) {
		int pos = l1.getnElem()/2;
		NoInt ant = l1.ElementoPosicao(pos-1);
		NoInt atual = ant.getProx();
		l2.prim = atual;
		l2.ult = l1.getUlt();
		l2.nElem = l1.getnElem()-pos;
		l1.ult = ant;
		l1.ult.setProx(null);
		l1.nElem = pos;
	}
	// Exercicio 06
	public double media () {
		int soma=0;
		NoInt aux = this.getPrim();
		while (aux!=null) {
			soma += aux.getInfo();
			aux = aux.getProx();
		}
		return ((double) soma) / this.getnElem(); 
	}
	// Exercicio 08
	public boolean pertence (int elem) {
		if (this.pesquisa(elem)==null) {
			return false;
		}
		return true;
	}
}
