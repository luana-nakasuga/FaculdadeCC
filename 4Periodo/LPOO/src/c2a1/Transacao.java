package c2a1;

public interface Transacao {

	public void deposito(double valor);

	public boolean saque(double valor);

	public double saldo();

	public boolean transferencia(double valor, Conta outraConta);
}
