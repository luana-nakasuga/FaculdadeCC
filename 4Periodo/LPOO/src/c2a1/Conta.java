package c2a1;

public class Conta implements Transacao {

	private String nome;
	private String cpf;
	private int numero;
	private double valorConta;

	public Conta(String nome, String cpf, int numero, double valorConta) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.numero = numero;
		this.valorConta = valorConta;
	}

	public Conta() {
		super();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getValorConta() {
		return valorConta;
	}

	public void setValorConta(double valorConta) {
		this.valorConta = valorConta;
	}

	@Override
	public String toString() {
		return "Conta [nome=" + nome + ", cpf=" + cpf + ", numero=" + numero + ", valorConta=" + valorConta + "]";
	}

	@Override
	public void deposito(double valor) {
		if (valor > 0) {
			valorConta += valor;
		}
	}

	@Override
	public double saldo() {
		return valorConta;
	}

	@Override
	public boolean saque(double valor) {
		if (valorConta >= valor) {
			valorConta -= valor;
			return true;
		}
		return false;
	}

	@Override
	public boolean transferencia(double valor, Conta outraConta) {
		if (valorConta >= valor) {
			saque(valor);
			outraConta.deposito(valor);
			return true;
		}
		return false;
	}

}
