package atividadesifelse;
import java.util.Scanner;

public class Atividade25 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe dois valores: ");
		
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		
		System.out.println("Informe um numero de 1 a 4");
		
		int number = sc.nextInt();
		
		if(number >=1 && number <=4) {
			
			switch(number) {
			
			case 1 :
				
				System.out.println("Soma");
				System.out.println(n1 + n2);
				
				break;
				
			case 2:
				
				System.out.println("Diferença");
				System.out.println(n1 - n2);
				
				break;
				
			case 3:
				
				System.out.println("Produto");
				System.out.println(n1 * n2);
				
				break;
				
			case 4:
				
				System.out.println("Divisão");
				System.out.println(n1 / n2);
				
				break;
				
				default:
					
					System.out.println("Valores incorretos");
			
			} 
			
		} else {
			
			System.out.println("Valor informado não está entre 1 e 4");
			
		}
		
		sc.close();
		
	}

}
