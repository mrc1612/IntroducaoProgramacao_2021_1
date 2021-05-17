import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        double dolar, cotacao, valorfinal;
        System.out.println("Quantos dólares você gostaria de trocar?");
dolar = ler.nextDouble();
cotacao = 5.75;
valorfinal = (dolar * cotacao);
System.out.println("Você receberá em reais R$" + valorfinal);
    }
}
