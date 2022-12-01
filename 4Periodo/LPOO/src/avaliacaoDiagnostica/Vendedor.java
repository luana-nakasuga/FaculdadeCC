package avaliacaoDiagnostica;

public class Vendedor {
	private String nome;
	private double salarioBase = 1500;
	private double totalVendas;
	private char categoria;
	private int tempoServico;

	public Vendedor(String nome, int tempoServico, double totalVendas) {
		this.nome = nome;
		this.tempoServico = tempoServico;
		this.setCategoria();
		this.totalVendas = totalVendas;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(int salarioBase) {
		this.salarioBase = salarioBase;
	}

	public double getTempoServico() {
		return tempoServico;
	}

	public void setTempoServico(int tempoServico) {
		this.tempoServico = tempoServico;
		this.setCategoria();
	}

	public char getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if (tempoServico > 60) {
			this.categoria = 'A';
		} else if (tempoServico > 30) {
			this.categoria = 'B';
		} else {
			this.categoria = 'C';
		}
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public void setTotalVendas(int totalVendas) {
		this.totalVendas = totalVendas;
	}

	@Override
	public String toString() {
		return "Vendedor [nome=" + nome + ", salarioBase=" + salarioBase + ", totalVendas=" + totalVendas
				+ ", categoria=" + categoria + ", tempoServico=" + tempoServico + "]";
	}

	public double comissao() {
		if (totalVendas > 20000) {
			return (0.2 * this.totalVendas);
		}
		if (totalVendas >= 10000) {
			return (0.15 * this.totalVendas);
		}
		return (0.05 * this.totalVendas);

	}

	public double gratificacao() {
		if (this.categoria == 'A') {
			return (0.15 * this.salarioBase);
		} else if (this.categoria == 'B') {
			return (0.075 * this.salarioBase);
		}
		return 0;

	}

	public double salario() {
		return this.getSalarioBase() + this.comissao() + this.gratificacao();

	}
}
