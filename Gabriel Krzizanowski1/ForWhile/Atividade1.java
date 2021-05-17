package atividadeforwhile;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de vezes que o programa irá rodar: ");
		
		int qtd = sc.nextInt();
		 
		 	for(int i= 1; i <=qtd; i++ ) {
		
				 int number = sc.nextInt();
				 
				 	if(number % 2 == 0) {
					 
					 System.out.println(number+" Par");
					 
				 	} else {
					 
				 		System.out.println(number+" Impar");
					 
				 	}
			 
		 	}	
		 	
		 	
		
		sc.close();
	

	}

}
