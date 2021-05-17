import java.util.Scanner;

public class Uni4Exe25 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor 1");
        float valor1 = teclado.nextFloat();

        System.out.println("Digite o valor 2");
        float valor2 = teclado.nextFloat();

        System.out.println("Escolha uma opção:");
        System.out.println(" 1 - Soma de dois números.");
        System.out.println("2 - Diferença entre dois números.");
        System.out.println("3 - Produto entre dois números.");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");
        int opcao = teclado.nextInt();

        

        switch (opcao) {
            case 1:
                float resultado1 = valor1 + valor2;
                System.out.println(resultado1);
                break;
            case 2:
                float resultado2 = valor1 - valor2;
                System.out.println(resultado2);
                break;
            case 3:
                float resultado3 = valor1 * valor2;
                System.out.println(resultado3);
                break;
            case 4:
            if (valor1 == 0){
                System.out.println("Opção inválida");
            } else {
                float resultado4 = valor1 / valor2;
                System.out.println(resultado4);
                }
                break;
            default:
            System.out.println("Opção inválida");
                break;
                
        }
	}
}