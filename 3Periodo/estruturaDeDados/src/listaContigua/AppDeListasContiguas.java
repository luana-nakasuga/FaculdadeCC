package listaContigua;

import io.InOut;

public class AppDeListasContiguas {

	public static void main(String[] args) {

		LCInteiro l1 = leLCInteiro();
		LCInteiro l2 = leLCInteiro();

		boolean comparaIguais = comparaIguais(l1, l2);
		if (comparaIguais) {
			InOut.msgDeInformacao("Exibir lista", l1.toString() + "\n" + l2.toString() + "\nAs listas são iguais.");
		} else {
			InOut.msgDeInformacao("Exibir lista", l1.toString() + "\n" + l2.toString() + "\nAs listas não são iguais.");
		}

		InOut.msgDeInformacao("Lista concatenada", concatenar(l1, l2).toString());
	}

	public static LCInteiro leLCInteiro() {
		int tam = InOut.leInt("Informe o tamanho da lista que deseja inserir.");
		LCInteiro listaC = new LCInteiro(tam);

		for (int i = 0; i < tam; i++) {
			listaC.insereFim(InOut.leInt("Informe o valor da posição " + (i + 1) + " da lista."));
		}

		return listaC;
	}

	public static boolean comparaIguais(LCInteiro l1, LCInteiro l2) {

		if (l1.getNElem() == l2.getNElem()) {

			for (int i = 0; i < l1.getNElem(); i++) {

				if (l1.getNum(i) != l2.getNum(i)) {
					return false;
				}

			}
			return true;
		}
		return false;
	}

	public static LCInteiro concatenar(LCInteiro l1, LCInteiro l2) {
		int soma = l1.getNElem() + l2.getNElem();
		LCInteiro l3 = new LCInteiro(soma);

		for (int i = 0; i < l1.getNElem(); i++) {
			l3.insereFim(l1.getNum(i));
		}
		for (int i = 0; i < l2.getNElem(); i++) {
			l3.insereFim(l2.getNum(i));
		}
		return l3;
	}

}
