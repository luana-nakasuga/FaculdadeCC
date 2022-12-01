package listaSimplesmenteEncadeada;

public class AppLseInteiro {

	public static void main(String[] args) {
		LseInt Q = new LseInt();
		Q.insereUltimo(12);
		Q.insereUltimo(25);
		Q.insereUltimo(15);
		System.out.println(Q.toString());
		Q.getUlt().setInfo(21);
		System.out.println(Q.toString());
	}

}
