import java.util.Scanner;

public class Uni3Ex06 {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    double kg = 25;
    double peso = 0;
    double pagamento = 0;
    System.out.print("Peso em kg: ");
    peso = input.nextDouble();
    pagamento = peso * kg;
    System.out.println("O valor a pagar é de R$" + pagamento);
    }
}