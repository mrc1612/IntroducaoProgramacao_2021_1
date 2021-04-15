import java.util.Scanner;

public class Uni4Exe05 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe uma cor ");
        String cor = teclado.nextLine();

        System.out.print("A cor é azul?");
        boolean resposta = teclado.nextBoolean();

        if (resposta) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }

        teclado.close();

    }
}
