import java.util.Scanner;


public class Uni5Exe07 {
public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
	int num = scanner.nextInt();
	int maior = 0;
	int menor = 1000000;
    System.out.println("Digite N");

	for(int i = 0; i < num; i++) {
	
	System.out.println("Digite um inteiro");
	int teste = scanner.nextInt();
	
	if(teste >= maior){
		maior = teste;

	}
    if(teste <= menor){
        menor = teste;
    }
    }
	System.out.println("O maior Número é: " + maior);
	System.out.println("O menor Número é:" + menor);
}
}