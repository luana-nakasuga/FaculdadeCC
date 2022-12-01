package listaContigua;

import io.InOut;

public class AppLCInteiro {
	public static void main(String[] args) {
		LCInteiro lista1 = new LCInteiro(5);
		LCInteiro lista2 = new LCInteiro(5);
		char continuar1;
		char continuar2;
		int num1;
		int num2;

		do {
			num1 = InOut.leInt("Digite um número na lista1:");
			lista1.insereFim(num1);
			continuar1 = InOut.leChar("Deseja continuar na lista1?");
		} while (continuar1 == 'S' && continuar1 == 's');
		System.out.println(lista1.toString());

		do {
			num2 = InOut.leInt("Digite um número na lista2:");
			lista2.insereFim(num2);
			continuar2 = InOut.leChar("Deseja continuar preenchendo a lista2?");
		} while (continuar2 == 'S' && continuar2 == 's');
		System.out.println(lista2.toString());
	}

}
