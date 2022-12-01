package fatorial;
import io.InOut;

public class FatorialRecursivo {

	public static void main(String[] args) {
		
		int num = InOut.leInt("Insira o valor inteiro:");
		
		for(int i=0; i<=num;i++) { 
			System.out.println(i + "! = " + fatorial(i)); 
			
			}
		} 
	
	public static int fatorial(int num) { 	
		if (num == 0 ) { 
			return 1; 
		}
		int fat;
		fat = num * fatorial(num - 1);
		return fat; 
	}

}
