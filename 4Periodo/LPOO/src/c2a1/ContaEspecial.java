package c2a1;

public class ContaEspecial extends Conta {

	private double limite;

	public ContaEspecial(String nome, String cpf, int numero, double valorConta, double limite) {
		super(nome, cpf, numero, valorConta);
		this.limite = limite;
	}

	public double getLimite() {
		return limite;
	}

	@Override
	public double saldo() {
		return getValorConta() + limite;
	}

}
