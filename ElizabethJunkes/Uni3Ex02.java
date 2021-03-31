import java.util.*;

public class Uni3Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double desconto_sapato;
        double valor_sapato;
        System.out.print("Valor do sapato: ");
        valor_sapato = input.nextDouble();
        double desconto = valor_sapato * 12/100;
        System.out.println("O valor do desconto é de R$" + desconto);
        double valor_total = valor_sapato * 0.88;
        System.out.println("O preço do par de sapatos com desconto é de R$" + valor_total);
    }
}