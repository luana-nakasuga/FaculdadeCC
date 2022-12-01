package listaDuplamenteEncadeada;
/*Leia duas LDE e construa uma terceira LDE com os elementos
 * que são aparecem nas duas, mas sem repetição
 */
import io.InOut;

public class AppDeListasDuplamenteEscadeadas {
	public static void main(String[] args) {
		LdeInt lista1 = leLdeInt();
		LdeInt lista2 = leLdeInt();
		
		InOut.msgDeInformacao("Lista 1: ", lista1.toString());
		InOut.msgDeInformacao("Lista 2: ", lista2.toString());
		InOut.msgDeInformacao("Lista de elementos em comum: ", elementosComuns(lista1, lista2).toString());
		InOut.msgDeInformacao("União das duas listas: ", uniaoListas(lista1, lista2).toString());
	}
	
	private static LdeInt leLdeInt() {
		int tamanho = InOut.leInt("Informe o tamanho da lista .");
		LdeInt lde = new LdeInt();
		
		for (int i=0; i<tamanho; i++) {
			lde.insereFinal(InOut.leInt("Informe o valor da posição " + (i + 1) + " na lista."));
		}
		return lde;
	}
	public static LdeInt elementosComuns(LdeInt lista1, LdeInt lista2) {
		LdeInt lista3 = new LdeInt();
		
		NoDuplaInt aux = lista1.getPrim();
		while(aux != null) {
			NoDuplaInt pesquisa = lista2.pesquisa(aux.getInfo());
			if(pesquisa != null) {
				lista3.insereFinal(aux.getInfo());
			}
			aux = aux.getProx();
		}
		return lista3;
	}
	public static LdeInt uniaoListas(LdeInt lista1, LdeInt lista2) {
		LdeInt lista4 = new LdeInt();
		
		NoDuplaInt aux1 = lista1.getPrim();
		NoDuplaInt aux2 = lista2.getPrim();
		
		while (aux1 != null && aux2 != null) {
			
			lista4.insereFinal(aux1.getInfo());
			lista4.insereFinal(aux2.getInfo());
			aux1 = aux1.getProx();
			aux2 = aux2.getProx();
		}
		return lista4;
	}
}
