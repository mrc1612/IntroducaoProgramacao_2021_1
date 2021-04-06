import java.util.*;

public class Ex02 {
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);
        double descontoSapato;
        double valorSapato;

        System.out.println("Valor do sapato: ");
        valorSapato = teclado.nextDouble();

        double desconto = valorSapato * 12/100;

        System.out.println("O valor do desconto: R$ " + desconto);

        double valorTotal = valorSapato * 0.88;

        System.out.println("O preco do par de sapatos com desconto: R$" + valorTotal);

    }
}