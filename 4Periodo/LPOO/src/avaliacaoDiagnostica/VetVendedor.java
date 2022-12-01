package avaliacaoDiagnostica;

public class VetVendedor {
	private Vendedor[] vet;
	private int nElem;

	public VetVendedor() {
		this.vet = new Vendedor[5];
		this.nElem = 0;
	}

	public int getnElem() {
		return this.nElem;
	}

	public boolean isEmpty() {
		if (this.nElem == 0) {
			return true;
		}
		return false;
	}

	public boolean isFull() {
		if (this.nElem == this.vet.length) {
			return true;
		}
		return false;
	}

	public Vendedor getVendedor(int posicao) {
		if (posicao >= 0 && posicao < this.nElem) {
			return this.vet[posicao];
		}
		return null;
	}

	public int search(String nomeVendedor) {
		for (int i = 0; i < this.nElem; i++) {
			if (this.vet[i].getNome().equalsIgnoreCase(nomeVendedor)) {
				return i;
			}
		}
		return -1;
	}

	public int insert(Vendedor vendedor) {
		int posicao = this.search(vendedor.getNome());
		if (this.isFull()) {
			return -1;
		} else if (this.nElem == posicao) {
			return -2;
		}
		this.vet[this.nElem] = vendedor;
		this.nElem++;
		return 0;
	}

	public boolean remove(Vendedor nomeVendedor) {
		int posicao = this.search(nomeVendedor.getNome());
		if (posicao == -1) {
			return false;
		}
		this.vet[posicao] = this.vet[this.nElem - 1];
		this.nElem--;
		return true;
	}

	/*
	 * totalVendas que recebe uma determinada categoria, soma e retorna o total das
	 * vendas de todos os vendedores desta categoria.
	 */

	public double totalVendas(char categoria) {
		double soma = 0;

		for (int i = 0; i < this.nElem; i++) {
			if (this.vet[i].getCategoria() == categoria) {
				soma += this.vet[i].getTotalVendas();

			}
		}
		return soma;
	}

	/*
	 * quantVendedor que recebe uma determinada categoria e retorna a quantidade de
	 * Vendedores desta categoria.
	 */
	public int quantVendedor(char categoria) {
		int quantidade = 0;

		for (int i = 0; i < this.nElem; i++) {
			if (this.vet[i].getCategoria() == categoria)
				quantidade++;
		}
		return quantidade;

	}

	/*
	 * MediaVendas que recebe uma determinada categoria, calcula e retorna a m�dia
	 * das vendas desta categoria (total das vendas/quantidade de vendedores).
	 */
	public double mediaVendas(char categoria) {
		double quantidade = this.quantVendedor(categoria);
		
		if (quantidade != 0) {
			return this.totalVendas(categoria) / quantidade;
		}
		return 0;
	}
}
