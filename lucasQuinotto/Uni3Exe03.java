import java.util.Scanner;

public class Uni3Exe03 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.print("Informe o preço da gasolina: ");
        double precoGasolina = teclado.nextDouble();

        System.out.print("quantia de dinheiro para abastecer o tanque: ");
        double quantidadeDinheiro = teclado.nextDouble();

        System.out.println("Litros abastecidos: " + (quantidadeDinheiro / precoGasolina));

    }
}
