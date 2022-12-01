package listaDuplamenteEncadeada;

import io.InOut;

public class AppLDE {
	public static void main(String[] args) {
		LdeInt lista = new LdeInt();
		int opcao;
		do{
			opcao = InOut.leInt("Escolha uma opcao:\n"
					+ "1. Inserir nodo final da lista\n"
					+ "2. Pesquisar um valor na lista\n"
					+ "3. Remover um no da lista\n"
					+ "4. Imprimir a lista\n"
					+ "5. Sair do programa");
			switch (opcao){
			case 1:
				inserir(lista);
				break;
			case 2:
				pesquisar(lista);
				break;
			case 3:
				remover(lista);
				break;
			case 4:
				InOut.msgDeInformacao("LISTA", lista.toString());
			case 5:
				InOut.msgDeAviso("", "FIM");
				break;
			default:
				InOut.msgDeErro("ERRO", "OPCAO INVALIDA");
			}
		}while (opcao!=4);
	}
	public static void inserir (LdeInt lde) {
		int valor = InOut.leInt("Digite um valor inteiro:");
		lde.insereFinal(valor);
		InOut.msgDeInformacao("OPERACAO REALIZADA COM SUCESSO!", lde.toString());
	}
	public static void pesquisar(LdeInt lde) {
		int valor;
		valor = InOut.leInt("Digite o valor inteiro a ser procurado "+
							"na lista:");
		if (lde.pesquisa(valor)!=null){
			InOut.msgDeInformacao("", "O VALOR "+valor+ " ESTA NA LISTA\n"+ lde.toString());
		}else{
			InOut.msgDeErro("", "O VALOR "+valor+ "  NAO ESTA NA LISTA\n"+ lde.toString());
		}

	}
	public static void remover(LdeInt lde) {
		int valor; 
		valor = InOut.leInt("Digite o valor inteiro a ser procurado "+
							"na lista:");
		if (lde.remove(valor)){
			InOut.msgDeInformacao("", "O VALOR "+valor+" FOI REMOVIDO COM SUCESSO!\n"+
									lde.toString());
		}else{
			InOut.msgDeErro("", "O VALOR "+valor+" NAO ESTA NA LISTA\n"+lde.toString());
		}

	}
}
