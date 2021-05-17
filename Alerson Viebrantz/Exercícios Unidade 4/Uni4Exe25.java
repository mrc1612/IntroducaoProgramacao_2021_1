import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int n1, n2, opcao;

        System.out.println("Informe o primeiro número:");
        n1 = teclado.nextInt();
        System.out.println("Informe o segundo número:");
        n2 = teclado.nextInt();

        System.out.println("Escolha uma opção: ");
        System.out.println("1 - Soma de dois números");
        System.out.println("2 - Diferença entre dois números");
        System.out.println("3 - Produto entre dois números");
        System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero)");
        opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
            System.out.println("A soma de "+n1+" e "+n2+" é " + (n1+n2));
            break;
            case 2:
            System.out.println("A diferença de "+n1+" e "+n2+" é " + (n1-n2));
            break;
            case 3:
            System.out.println("O produto de "+n1+" e "+n2+" é " + (n1*n2));
            break;
            case 4:
            System.out.println("A divisão de "+n1+" e "+n2+" é " + (n1/n2));
            break;
            default:
            System.out.println("Inválido!");

        }
        teclado.close();
    }
}
