import java.util.Scanner;

public class Uni3Exe08 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto dolarés você gostaria de trocar?");
        double dolar = sc.nextDouble();

        double cotacao = 5.76;

        double total = cotacao * dolar;

        System.out.println("Você receberá em reais R$" +total);

        sc.close();
        
    }
}
