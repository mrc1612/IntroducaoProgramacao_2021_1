package atividadeforwhile;

import java.util.Scanner;

public class Atividade16 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		char grupo = 0, feminino = 0;
		double somaAlturaGlobal = 0, somaAlturaMulheres = 0;
		
		System.out.println("Informe o Sexo da Pessoa: M ou F");
		
		char sexo = input.next().charAt(0);
		
		System.out.println("Informe a altura da pessoa: ");
		
		double altura = input.nextDouble();
		
		somaAlturaGlobal += altura;
		
		 if(sexo == 'M' || sexo == 'm') {
			
			 grupo++;
			
		 } else if(sexo == 'F' || sexo == 'f') {
			 
			 somaAlturaMulheres += altura;
			 
			 feminino++;
			 grupo++;
			 
		 }
		
		while(altura != 0 && (sexo != 'm' || sexo != 'M' || sexo != 'f' || sexo != 'F')) {
			
			System.out.println("Informe o Sexo da Pessoa: M ou F");
			
			 sexo = input.next().charAt(0);
			
			System.out.println("Informe a altura da pessoa: ");
			
			 altura = input.nextDouble();
			
			somaAlturaGlobal += altura;
			
			 if(sexo == 'M' || sexo == 'm') {
				
				 grupo++;
				
			 } else if(sexo == 'F' || sexo == 'f') {
				 
				 somaAlturaMulheres += altura;
				 
				 feminino++;
				 grupo++;
				 
			 }
			
		}
		
		System.out.println("A media de altura do grupo é: " + somaAlturaGlobal / grupo );
		System.out.println("A media de altura do grupo é: " + somaAlturaMulheres / feminino );
		
		input.close();
		
		
	}

}
