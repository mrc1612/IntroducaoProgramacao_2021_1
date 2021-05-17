package atividadeforwhile;

import java.util.Scanner;

public class Atividade17 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double mediaAltura = 0;
		double maiorAltura = 0, menorAltura = 999999999;
		int maiorCandidato = 0, menorCandidato = 0;
		int i = 0, candidato = -1;
		
	
		
		while(candidato != 0) {
			
			System.out.println("Informe o codigo do candidato: ");
			
			 candidato = input.nextInt();
				
				System.out.println("Informe a altura do candidato: ");
				
				double altura = input.nextDouble();
				
				if(altura > maiorAltura && candidato != 0) {
					
					maiorCandidato = candidato;
					maiorAltura = altura;
					
				}if(altura <menorAltura && candidato != 0) {
					
					menorAltura = altura;
					menorCandidato = candidato;
				
				}
			
				i++;
				
				mediaAltura += altura;
		}
		
		System.out.println("Media Altura: "+ mediaAltura / i++);
		
		System.out.println("\n");
		
		
		System.out.printf("Maior Altura: Candidato: %d / Altura: %f", maiorCandidato, maiorAltura);
		
		System.out.println("\n");
		
		System.out.printf("Menor Altura: Candidato: %d / Altura: %f", menorCandidato, menorAltura);
		
		System.out.println("\n");
		
		input.close();
		
	
	}

}
