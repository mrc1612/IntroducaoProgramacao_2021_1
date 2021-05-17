package atividadeforwhile;

import java.util.Scanner;

public class Atividade15 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe o nome do Aluno: ");
		String name = input.next();
		
		System.out.println("Informe as duas notas do Aluno: ");
		double nota1 = input.nextDouble();
		double nota2 = input.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		System.out.printf("A média do Aluno: %s é "+media,name);
		
		System.out.println("\n");
		
		System.out.println("Deseja continuar?");
		
		String condicao = input.next();
		
		
		
		while(!condicao.equals("fim")) {
			
			System.out.println("Informe o nome do Aluno: ");
			 name = input.next();
			
			System.out.println("Informe as duas notas do Aluno: ");
			 nota1 = input.nextDouble();
			 nota2 = input.nextDouble();
			
			 media = (nota1 + nota2) / 2;
			
			System.out.printf("A média do Aluno: %s é "+media,name);
			
			System.out.println("\n");
			
			System.out.println("Deseja continuar?");
			
			 condicao = input.next();
			
		}
		
		System.out.println("Programa encerrado.");
		
		input.close();
		

	}

}
