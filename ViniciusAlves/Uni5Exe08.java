import java.util.Scanner;


public class Uni5Exe08 {
public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
	System.out.println("Digite N");
	int num = scanner.nextInt();
	int menorNegativo = 1000000;
	int menor = 1000000;
	int total = 0;
	float media = 0;
	int MaioresTotal = 0;
	int coeficiente = 0;
	int teste = 0;
	int i;

	for(i = 0; i < num; i++) {
	System.out.println("Digite um inteiro");
	teste = scanner.nextInt();
	total += teste;

    if(teste <= menorNegativo){
        menorNegativo = teste;
    }
	if(teste <= menor){
        menor = teste;
    }
	MaioresTotal = total - menor;
	coeficiente = num - 1;
	media = MaioresTotal / coeficiente;
    }
	System.out.println("Média:" + media);
	System.out.println("O menor Número é:" + menorNegativo * -1);
}
}