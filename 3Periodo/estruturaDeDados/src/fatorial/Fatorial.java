package fatorial;
import io.InOut;

public class Fatorial {

	public static void main(String[] args) {
		
		int num = InOut.leInt("Insira o número que deseja fatoriar: ");
		int fat = 1;
		
		for (int i=1; i<=num; i++) {
			fat = fat*i;
		}
		
		System.out.printf("Fatorial de "+num+ " : " + fat);
	}
}