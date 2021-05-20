package atividadeforwhile;

import java.util.Scanner;

public class Atividade19 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int compra = -1, valorDesconto = 0, armazenador = 0;
		
		while(compra != 0) {
			
			System.out.println("Informe o valor da compra: ");
			
			compra = input.nextInt();
			
			if(compra > 500) {
				
				valorDesconto = (compra * 20) / 100;
				System.out.println("O valor do desconto nessa compra é: " + (compra - valorDesconto));
				armazenador += compra;
				
			} else if(compra <= 500) {
				
				valorDesconto = (compra * 20) / 100;
				System.out.println("O valor do desconto nessa compra é: " + (compra - valorDesconto ));
				armazenador += compra;
				
			}
			
			
			
		}
		
		System.out.println("O valor total feito pela loja no dia, foi de: " + armazenador);
		
		input.close();

		
		
	}

}
