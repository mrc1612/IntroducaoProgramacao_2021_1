package atividadeforwhile;

import java.util.Scanner;

public class Atividade12 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number = 1;
		
		System.out.println("Informe o numero: ");
		int numeroDigitado = input.nextInt();
		
			for(int linha = 1; linha <=numeroDigitado; linha++ ) {
				
				for(int coluna = 1; coluna <=linha; coluna++) {
					
					System.out.printf("%d", number);
					
					number++;
					
					
				}
				
				System.out.printf("\n");
				
				
			}
		
		
		
		input.close();
		
	}

}
