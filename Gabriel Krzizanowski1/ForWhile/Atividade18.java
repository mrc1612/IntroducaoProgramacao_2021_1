package atividadeforwhile;

import java.util.Scanner;

public class Atividade18 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int canal = -1, numeroPessoas = 0;
		double quatro = 0, cinco = 0, nove = 0, doze = 0;
		double armazenador = 0;
		double valorFinalQuatro = 0,valorFinalCinco = 0, valorFinalNove = 0, valorFinalDoze = 0;
		
		
		while(canal != 0) {
			
			System.out.println("Informe o canal assistido pela familia: ");
			
			 canal = input.nextInt();
			 
			System.out.println("Informe o numero de pessoas assistindo o canal informado acima: ");
			
			numeroPessoas = input.nextInt();
			
			switch(canal) {
			
			case 4: 
				
				quatro += numeroPessoas;
				armazenador += quatro;
				
				
				break;
				
			case 5:
				
				cinco += numeroPessoas;
				armazenador += cinco;
				
				break;
				
			case 9:
				
				nove += numeroPessoas;
				armazenador += nove;
				
				break;
				
			case 12:
				
				doze += numeroPessoas;
				armazenador += doze;
				
				break;
				
				default:
					
					System.out.println("Informação inválida");
			
			}
			
			valorFinalQuatro = (quatro / armazenador) * 100;
			valorFinalCinco  = (cinco / armazenador) * 100;
			valorFinalNove  = (nove / armazenador) * 100;
			valorFinalDoze = (doze / armazenador) * 100;
					
			
		}
		
		 System.out.printf("O percentual de audiência do canal 4 é igual: " + valorFinalQuatro,0.1);
		 System.out.println("");
		 System.out.printf("O percentual de audiência do canal 5 é igual: " + valorFinalCinco,0.1);
		 System.out.println("");
		 System.out.printf("O percentual de audiência do canal 9 é igual: " + valorFinalNove,0.1);
		 System.out.println("");
		 System.out.printf("O percentual de audiência do canal 12 é igual: " + valorFinalDoze,0.1);
		 System.out.println("");
		 System.out.println("Valor total de ouvintes: " + armazenador);
		
		input.close();
		

	}

}
