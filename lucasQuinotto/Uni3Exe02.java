import java.util.Scanner;

public class Uni3Exe02 {

        public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double valorDesconto = 12;

        System.out.print("Informe o valor do sapato: ");
        double valorSapato = teclado.nextDouble();

        System.out.println("----- desconto de 12% -----");
        System.out.println("\nO valor do desconto é de R$" + valorSapato * (valorDesconto / 100));
        System.out.println("O preço do par de sapatos com desconto é R$" + valorSapato * ((100 - valorDesconto) / 100));

    }
}
