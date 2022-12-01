package listaSimplesmenteEncadeada;

/*
 *  Implemente uma classe LSE que contém os atributos
 *  prim, ult: objetos da classe No
 *  nElem: armazena a quantidade de Nós da Lista
 */
public class MeuLseInt {
	private NoInt prim, ult;
	private int nElem;
	
	public MeuLseInt() {
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
	//eVazia: retorna true se a lista estiver vazia e false caso contrário
	public boolean eVazia() {
		if (this.nElem==0) {
			return true;
		}
		return false;
	}
	//insereUltimo: insere um No no final da lista
	public void insereUltimo(int info) {
		NoInt novo = new NoInt(info);
		
		if (this.eVazia()) {
			this.prim = novo;
			this.ult = novo;
		}
		this.ult.setProx(novo);
		this.ult = novo;
		nElem++;
	}
	/*
	 * insereInicio: insere um No no inicio da lista
	 */
	public void insereInicio(int info) {
		NoInt novo = new NoInt(info);
		
		if (this.eVazia()) {
			this.prim = novo;
			this.ult = novo;
		}
		novo.setProx(this.prim);
		this.prim = novo;
		nElem++;
	}
	
}
