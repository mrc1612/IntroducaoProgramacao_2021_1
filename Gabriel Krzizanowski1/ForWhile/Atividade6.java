package atividadeforwhile;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		
		double altura = 0;
		double soma = 0;
		
		Scanner sc = new Scanner(System.in);
		
		for(int i = 1; i <=20; i++) {
			
			altura = sc.nextDouble();
			
			 soma += altura;
			 
			
		}
		
		System.out.println(soma/20);
		
		sc.close();

	}

}
