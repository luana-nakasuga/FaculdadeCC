package listaSimplesmenteEncadeada;

import io.InOut;

public class AppDeListasSimplesmenteEncadeadas {

	public static void main(String[] args) {

		LseIntV2 l1 = leLCInteiro();
		LseIntV2 l2 = leLCInteiro();

		boolean comparaLseInt = comparaLseInt(l1, l2);
		if (comparaLseInt) {
			InOut.msgDeInformacao("Exibir lista" , l1.toString() + "\n" + l2.toString() + "\nAs listas são iguais." );
		} else {
			InOut.msgDeInformacao("Exibir lista" , l1.toString() + "\n" + l2.toString() + "\nAs listas não são iguais." );
		}
		
		InOut.msgDeInformacao("Lista concatenada", concat(l1, l2).toString());

	}

	public static LseIntV2 leLCInteiro() {
		int tam = InOut.leInt("Informe o tamanho da lista que deseja inserir.");

		LseIntV2 lse = new LseIntV2();

		for (int i = 0; i < tam; i++) {
			lse.inserirPosicao(InOut.leInt("Informe o valor da posição " + (i + 1) + " da lista."), lse.getnElem());
		}

		return lse;
	}

	public static boolean comparaLseInt(LseIntV2 l1, LseIntV2 l2) {
		if (l1.getnElem() != l2.getnElem()) {
			return false;
		}
		NoInt aux1 = l1.getPrim();
		NoInt aux2 = l2.getPrim();
		while (aux1 != null) {
			if (aux1.getInfo() != aux2.getInfo()) {
				return false;
			}
			aux1 = aux1.getProx();
			aux2 = aux2.getProx();
		}
		return true;
	}

	public static LseIntV2 concat(LseIntV2 l1, LseIntV2 l2) {
		LseIntV2 l3 = new LseIntV2();
		l3.setPrim(l1.getPrim());
		l1.getUlt().setProx(l2.getPrim());
		l3.setUlt(l2.getUlt());

		return l3;
	}

}
