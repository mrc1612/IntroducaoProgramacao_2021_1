package atividadeforwhile;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int armazen = 0;
		int negativo = 999999999;
		
		System.out.println("Informe a quantidade de vezes que você quer que rode: ");
		
		int n = sc.nextInt();
		
		for(int i =1; i <=n; i++) {
			
			 int numbers = sc.nextInt();
			 
			 if(numbers > armazen) {
				
				 armazen = numbers;
				 
				 
			 } else if(numbers < negativo) {
				 
				 negativo = numbers;
				 
				 
			 }
			 
			
			
		}
		
		 System.out.println(armazen+" Maior");
		 System.out.println(negativo+" Menor");
		
		sc.close();
		

	}

}
