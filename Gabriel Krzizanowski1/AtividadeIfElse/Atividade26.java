package atividadesifelse;

import java.util.Scanner;

public class Atividade26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Informe uma letra entre T,Q,R,C");
		
		String x = sc.next();
		
		char p = x.charAt(0);
		
		switch (p) {
		
		 case 'T':
			 
			 double n1 = sc.nextDouble();
			 
			 double n2 = sc.nextDouble();
			 
			 double area = (n1 * n2) /2;
			 
			 System.out.println("A area do triangulo é igual a: ");
			 
			 System.out.println(area);
			 
			 break;
			 
		 case 'Q':
			 
			  n1 = sc.nextDouble();
			  
			  double areaQuadrado = n1 * n1 * n1 *n1;
			  
			  System.out.println("A area do quadrado é igual a: ");
			  
			  System.out.println(areaQuadrado);
			  
			  break;
			  
		 case 'R':
			 
			 n1 = sc.nextDouble();
			 
			 n2 = sc.nextDouble();
			 
			 double areaRetangulo = n1 * n2;
			 
			 System.out.println("A area do retangulo é igual a: ");
			 
			 System.out.println(areaRetangulo);
			 
			 break;
			 
		 case 'C':
			 
			 n1 = sc.nextDouble();
			 
			 double pi = 3.14;
			 
			 double areaCirculo = (n1 * n1) * pi;
			 
			 System.out.println("A area do circulo é igual a: ");
			 
			 System.out.println(areaCirculo);
			 
			 default:
				 
				 System.out.println("Valor não encontrado");
		
		}
		
		sc.close();

	}

}
