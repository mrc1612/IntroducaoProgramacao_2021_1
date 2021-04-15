import java.util.Scanner;

public class Uni4Exe22 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print(
                "Escolha um dos três: 1 – Ciência da Computação, 2 – Licenciatura da Computação e 3 – Sistemas de Informação ");
        int escolha = teclado.nextInt();

        switch (escolha) {
        case 1:
            System.out.println("Bacharel em Ciência da Computação");
            break;
        case 2:
            System.out.println("Licenciado em Computação");
            break;
        case 3:
            System.out.println("Bacharel em Sistemas de Informação");
            break;
        }

        teclado.close();
    }
}
