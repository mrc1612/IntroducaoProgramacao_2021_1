import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int num1 = teclado.nextInt();

        System.out.print("Informe um número: ");
        int num2 = teclado.nextInt();

        System.out.println("Escolha: ");
        System.out.println("1 - Soma de dois números");
        System.out.println("2 - Diferença entre dois números");
        System.out.println("3 - Produto entre dois números");
        System.out.println("4 - Divisão entre dois números");
        int escolha = teclado.nextInt();

        switch (escolha) {
        case 1:
            System.out.println(num1 + num2);
            break;
        case 2:
            System.out.println("Diferença é: " + (num1 - num2));
            break;
        case 3:
        System.out.println(num1 * num2);
            break;
        case 4:
        if (num2 != 0) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("O denominador não pode ser zero");
        }
            break;
        default:
        System.out.println("Erro");
            break;
        }

        teclado.close();
    }
}
