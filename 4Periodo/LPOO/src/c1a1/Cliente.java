package c1a1;

public class Cliente {
	private static int senhaGeral = 0;
	private static int geradorDeSenha = 1;
	private int senha;
	private String nome;

	public Cliente(String nome) {
		super();
		this.senha = geradorDeSenha;
		this.nome = nome;
		geradorDeSenha++;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public static int getSenhaGeral() {
		return senhaGeral;
	}

	public int getSenha() {
		return senha;
	}
	public static void proximo() {
		if (Cliente.senhaGeral == 999) {
			Cliente.senhaGeral = 1;
		}
		Cliente.senhaGeral++;
		
	}

	@Override
	public String toString() {
		return "Nome: " + nome + "\nsenha: " + senha;
	}

}
