package uni3ex08;
import java.util.Scanner;

public class Uni3Ex08 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        double dolares, cotacao, conversao;
        System.out.print("Quantos dólares você deseja trocar? ");
        dolares = input.nextDouble();
        cotacao = 5.75;
        conversao = (dolares * cotacao);
        System.out.println("Você receberá R$" + conversao);
    }
}
