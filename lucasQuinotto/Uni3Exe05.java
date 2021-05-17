import java.util.Scanner;

public class Uni3Exe05 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantidade de Frangos na granja: ");
        int quantidadeFrangos = teclado.nextInt();

        System.out.println("O valor total dos chips é de R$" + quantidadeFrangos * (4 + (2 * 3.50)));
    }
}
