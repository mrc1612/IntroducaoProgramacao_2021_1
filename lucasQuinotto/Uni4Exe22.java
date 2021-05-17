import java.util.Scanner;

public class Uni4Ex22 {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);

        int n;

        System.out.println("Informe o curso escolhido:");
        System.out.println("(1 – Ciência da Computação, 2 – Licenciatura da Computação e 3 – Sistemas de Informação)");
        n = teclado.nextInt();

        switch (n) {
            case (1):
                System.out.println("Você se tornará Bacharel em ciência da computação");
            break;

            case (2):
                System.out.println("Você se tornará Licenciado em computação");
            break;

            case (3):
                System.out.println("Você se tornará Bacharel em sistemas de informação");
            break;

            default:
                System.out.println("Opção inválida");
            break;

        }

        teclado.close();
    }
}
