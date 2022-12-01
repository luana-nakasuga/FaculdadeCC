package listaSimplesmenteEncadeada;

public class LseInt {
	private int nElem;
	private NoInt prim, ult;
	
	public LseInt(){
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
}
